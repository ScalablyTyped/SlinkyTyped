package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides a way to asynchronously observe changes in the intersection of a target element with an ancestor element or with a top-level document's viewport. */
trait IntersectionObserver extends js.Object {
  val root: org.scalajs.dom.raw.Element | Null
  val rootMargin: java.lang.String
  val thresholds: js.Array[Double]
  def disconnect(): Unit
  def observe(target: org.scalajs.dom.raw.Element): Unit
  def takeRecords(): js.Array[IntersectionObserverEntry]
  def unobserve(target: org.scalajs.dom.raw.Element): Unit
}

object IntersectionObserver {
  @scala.inline
  def apply(
    disconnect: () => Unit,
    observe: org.scalajs.dom.raw.Element => Unit,
    rootMargin: java.lang.String,
    takeRecords: () => js.Array[IntersectionObserverEntry],
    thresholds: js.Array[Double],
    unobserve: org.scalajs.dom.raw.Element => Unit,
    root: org.scalajs.dom.raw.Element = null
  ): IntersectionObserver = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), observe = js.Any.fromFunction1(observe), rootMargin = rootMargin.asInstanceOf[js.Any], takeRecords = js.Any.fromFunction0(takeRecords), thresholds = thresholds.asInstanceOf[js.Any], unobserve = js.Any.fromFunction1(unobserve), root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectionObserver]
  }
}

