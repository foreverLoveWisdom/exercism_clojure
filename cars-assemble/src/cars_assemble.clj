(ns cars-assemble)

(def default-rate 221)

(defn success-rate [speed]
  (cond
       (= 0 speed) 0.0
       (<= 1 speed 4) 1.0
       (<= 5 speed 8) 0.9
       (= 9 speed) 0.8
       (= 10 speed) 0.77))


(defn production-rate
  "Returns the assembly line's production rate per hour,
   taking into account its success rate"
  [speed]
  (* default-rate speed (success-rate speed)))

(defn working-items
  "Calculates how many working cars are produced per minute"
  [speed]
  (int (/ (production-rate speed) 60)))


