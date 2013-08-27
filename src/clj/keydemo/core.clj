(ns keydemo.core)
(import 'my.DemoMap)

(def c (my.DemoMap/examine (my.DemoMap. {:mykey "myval"})))

(println (first c))



