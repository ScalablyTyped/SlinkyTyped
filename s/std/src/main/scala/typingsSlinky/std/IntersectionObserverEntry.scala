package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Intersection Observer API interface describes the intersection between the target element and its root container at a specific moment of transition. */
@js.native
trait IntersectionObserverEntry extends js.Object {
  val boundingClientRect: DOMRectReadOnly = js.native
  val intersectionRatio: Double = js.native
  val intersectionRect: DOMRectReadOnly = js.native
  val isIntersecting: scala.Boolean = js.native
  val rootBounds: DOMRectReadOnly | Null = js.native
  val target: org.scalajs.dom.raw.Element = js.native
  val time: Double = js.native
}

@JSGlobal("IntersectionObserverEntry")
@js.native
object IntersectionObserverEntry extends Instantiable1[
      /* intersectionObserverEntryInit */ IntersectionObserverEntryInit, 
      IntersectionObserverEntry
    ]

