package typingsSlinky.scrolltofixed

import org.scalajs.dom.raw.Element
import typingsSlinky.scrolltofixed.ScrollToFixed.ScrollToFixedOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends js.Object {
  
  def ScrollToFixed(el: js.Array[Element], options: ScrollToFixedOptions): JQuery = js.native
  def ScrollToFixed(el: js.Object, options: ScrollToFixedOptions): JQuery = js.native
  def ScrollToFixed(el: JQuery, options: ScrollToFixedOptions): JQuery = js.native
  def ScrollToFixed(el: Element, options: ScrollToFixedOptions): Unit = js.native
  @JSName("ScrollToFixed")
  def ScrollToFixed_JQuery(el: Element, options: ScrollToFixedOptions): JQuery = js.native
  
  def isScrollToFixed(el: js.Array[Element]): JQuery = js.native
  def isScrollToFixed(el: js.Object): JQuery = js.native
  def isScrollToFixed(el: JQuery): JQuery = js.native
  def isScrollToFixed(el: Element): JQuery = js.native
}
