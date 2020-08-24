package typingsSlinky.useResizeObserver.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.useResizeObserver.mod.DefaultsWithoutResizeHandler[TElement]
  - typingsSlinky.useResizeObserver.mod.DefaultsWithResizeHandler[TElement]
*/
trait ObserverDefaults[TElement /* <: HTMLElement */] extends js.Object

object ObserverDefaults {
  @scala.inline
  def DefaultsWithoutResizeHandler[/* <: typingsSlinky.std.HTMLElement */ TElement](): ObserverDefaults[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObserverDefaults[TElement]]
  }
  @scala.inline
  def DefaultsWithResizeHandler[/* <: typingsSlinky.std.HTMLElement */ TElement](onResize: /* newSize */ RefSize => Unit): ObserverDefaults[TElement] = {
    val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction1(onResize))
    __obj.asInstanceOf[ObserverDefaults[TElement]]
  }
}

