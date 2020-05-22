package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.std.IntersectionObserverEntryInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("IntersectionObserverEntry")
@js.native
class IntersectionObserverEntry protected ()
  extends typingsSlinky.std.IntersectionObserverEntry {
  def this(intersectionObserverEntryInit: IntersectionObserverEntryInit) = this()
  /* CompleteClass */
  override val boundingClientRect: typingsSlinky.std.DOMRectReadOnly = js.native
  /* CompleteClass */
  override val intersectionRatio: Double = js.native
  /* CompleteClass */
  override val intersectionRect: typingsSlinky.std.DOMRectReadOnly = js.native
  /* CompleteClass */
  override val isIntersecting: scala.Boolean = js.native
  /* CompleteClass */
  override val rootBounds: typingsSlinky.std.DOMRectReadOnly | Null = js.native
  /* CompleteClass */
  override val target: org.scalajs.dom.raw.Element = js.native
  /* CompleteClass */
  override val time: Double = js.native
}

@JSGlobal("IntersectionObserverEntry")
@js.native
object IntersectionObserverEntry
  extends Instantiable1[
      /* intersectionObserverEntryInit */ IntersectionObserverEntryInit, 
      typingsSlinky.std.IntersectionObserverEntry
    ]

