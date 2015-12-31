(ns hipstr.models.connection
  (:require [environ.core :refer [env]]))

(def db-spec {:classname   "org.postgresql.Driver"
              :subprotocol "postgresql"
              :subname     "postgres"
              :user        (or (System/getenv "JDBC_DATABASE_USERNAME") "hipstr")
              :password    (or (System/getenv "JDBC_DATABASE_PASSWORD") "hipstr")})
