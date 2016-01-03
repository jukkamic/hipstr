(ns hipstr.models.connection
  (:require [environ.core :refer [env]]))

(if (get (System/getenv) "DATABASE_URL")
	(def db-spec (get (System/getenv) "DATABASE_URL"))
	(def db-spec {
		:classname   "org.postgresql.Driver"
		:subprotocol "postgresql"
		:subname     "postgres"
		:user        "hipstr"
		:password    "hipstr"}
	)
)