package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides a way to asynchronously observe changes in the intersection of a target element with an ancestor element or with a top-level document's viewport. */
@js.native
trait IntersectionObserver extends js.Object {
  val root: org.scalajs.dom.raw.Element | Null = js.native
  val rootMargin: java.lang.String = js.native
  val thresholds: js.Array[Double] = js.native
  def disconnect(): Unit = js.native
  def observe(target: org.scalajs.dom.raw.Element): Unit = js.native
  def takeRecords(): js.Array[IntersectionObserverEntry] = js.native
  def unobserve(target: org.scalajs.dom.raw.Element): Unit = js.native
}

object IntersectionObserver {
  @scala.inline
  def apply(
    disconnect: () => Unit,
    observe: org.scalajs.dom.raw.Element => Unit,
    rootMargin: java.lang.String,
    takeRecords: () => js.Array[IntersectionObserverEntry],
    thresholds: js.Array[Double],
    unobserve: org.scalajs.dom.raw.Element => Unit
  ): IntersectionObserver = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), observe = js.Any.fromFunction1(observe), rootMargin = rootMargin.asInstanceOf[js.Any], takeRecords = js.Any.fromFunction0(takeRecords), thresholds = thresholds.asInstanceOf[js.Any], unobserve = js.Any.fromFunction1(unobserve))
    __obj.asInstanceOf[IntersectionObserver]
  }
  @scala.inline
  implicit class IntersectionObserverOps[Self <: IntersectionObserver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisconnect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withObserve(value: org.scalajs.dom.raw.Element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRootMargin(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTakeRecords(value: () => js.Array[IntersectionObserverEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("takeRecords")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withThresholds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thresholds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnobserve(value: org.scalajs.dom.raw.Element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unobserve")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRoot(value: org.scalajs.dom.raw.Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(null)
        ret
    }
  }
  
}

