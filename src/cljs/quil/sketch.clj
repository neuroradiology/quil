(ns cljs.quil.sketch)

(defmacro with-sketch [applet & body]
  `(binding [cljs.quil.sketch/*surface* ~applet]
     ~@body))


(defmacro defsketch
  [app-name & options]
  `(defn ^:export ~app-name []
     (cljs.quil.sketch/make-processing ~@options)))
