package typingsSlinky.winjs.winjsMod.UI

import typingsSlinky.winjs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("winjs", "UI.processAll")
@js.native
object processAll extends js.Object {
  /**
    * Applies declarative control binding to all elements, starting at the specified root element.
    * @param rootElement The element at which to start applying the binding. If this parameter is not specified, the binding is applied to the entire document.
    * @param skipRoot If true, the elements to be bound skip the specified root element and include only the children.
    * @returns A promise that is fulfilled when binding has been applied to all the controls.
    **/
  def apply(): typingsSlinky.winjs.WinJS.Promise[_] = js.native
  def apply(rootElement: Element): typingsSlinky.winjs.WinJS.Promise[_] = js.native
  def apply(rootElement: Element, skipRoot: Boolean): typingsSlinky.winjs.WinJS.Promise[_] = js.native
}

