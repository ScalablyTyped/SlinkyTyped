package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
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

@JSGlobal("IntersectionObserver")
@js.native
object IntersectionObserver
  extends Instantiable1[/* callback */ IntersectionObserverCallback, IntersectionObserver]
     with Instantiable2[
      /* callback */ IntersectionObserverCallback, 
      /* options */ IntersectionObserverInit, 
      IntersectionObserver
    ]

