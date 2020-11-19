package typingsSlinky.wordpressDom.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.std.DOMRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/dom", "placeCaretAtVerticalEdge")
@js.native
object placeCaretAtVerticalEdge extends js.Object {
  
  def apply(container: js.UndefOr[scala.Nothing], isReverse: Boolean): Unit = js.native
  def apply(
    container: js.UndefOr[scala.Nothing],
    isReverse: Boolean,
    rect: js.UndefOr[scala.Nothing],
    mayUseScroll: Boolean
  ): Unit = js.native
  def apply(container: js.UndefOr[scala.Nothing], isReverse: Boolean, rect: DOMRect): Unit = js.native
  def apply(container: js.UndefOr[scala.Nothing], isReverse: Boolean, rect: DOMRect, mayUseScroll: Boolean): Unit = js.native
  def apply(container: HTMLElement, isReverse: Boolean): Unit = js.native
  def apply(container: HTMLElement, isReverse: Boolean, rect: js.UndefOr[scala.Nothing], mayUseScroll: Boolean): Unit = js.native
  def apply(container: HTMLElement, isReverse: Boolean, rect: DOMRect): Unit = js.native
  def apply(container: HTMLElement, isReverse: Boolean, rect: DOMRect, mayUseScroll: Boolean): Unit = js.native
}
