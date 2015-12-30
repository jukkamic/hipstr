(ns hipstr.models.connection
  (:require [environ.core :refer [env]]))

(def db-spec {:classname   "org.postgresql.Driver"
              :subprotocol "postgresql"
              :subname     "postgres"
              :user        "hipstr"
              :password    "hipstr"})
