package typingsSlinky.winjs.global.WinJS.UI

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("WinJS.UI.scopedSelect")
@js.native
object scopedSelect extends js.Object {
  
  /**
    * Walks the DOM tree from the given element to the root of the document. Whenever a selector scope is encountered, this method performs a lookup within that scope for the specified selector string. The first matching element is returned.
    * @param selector The selector string.
    * @param element The element to begin walking to the root of the document from.
    * @returns The target element, if found.
    **/
  def apply(selector: String, element: HTMLElement): HTMLElement = js.native
}
