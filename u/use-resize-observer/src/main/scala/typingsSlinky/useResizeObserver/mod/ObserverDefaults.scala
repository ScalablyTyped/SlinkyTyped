package typingsSlinky.useResizeObserver.mod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
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
  def DefaultsWithoutResizeHandler[TElement](ref: ReactRef[TElement] = null): ObserverDefaults[TElement] = {
    val __obj = js.Dynamic.literal()
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserverDefaults[TElement]]
  }
  @scala.inline
  def DefaultsWithResizeHandler[TElement](onResize: /* newSize */ RefSize => Unit, ref: ReactRef[TElement] = null): ObserverDefaults[TElement] = {
    val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction1(onResize))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserverDefaults[TElement]]
  }
}

