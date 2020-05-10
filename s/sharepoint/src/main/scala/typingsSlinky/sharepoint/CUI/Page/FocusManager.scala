package typingsSlinky.sharepoint.CUI.Page

import typingsSlinky.sharepoint.CUI.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CUI.Page.FocusManager")
@js.native
class FocusManager ()
  extends CommandDispatcher
     with ICommandHandler {
  def getFocusedComponents(): js.Array[Component] = js.native
  def releaseAllFoci(): Boolean = js.native
  def releaseFocusFromComponent(component: Component): js.Any = js.native
  def requestFocusForComponent(component: Component): js.Any = js.native
}

