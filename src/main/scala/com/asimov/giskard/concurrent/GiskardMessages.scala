package com.asimov.giskard.concurrent

sealed trait GiskardMessages

case class NewSymbol(symbol: String) extends GiskardMessages
