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
  implicit def apply[TElement](value: DefaultsWithResizeHandler[TElement]): ObserverDefaults[TElement] = value.asInstanceOf[ObserverDefaults[TElement]]
  @scala.inline
  implicit def apply[TElement](value: DefaultsWithoutResizeHandler[TElement]): ObserverDefaults[TElement] = value.asInstanceOf[ObserverDefaults[TElement]]
}

