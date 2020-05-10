package typingsSlinky.sharepoint.CUI

import typingsSlinky.microsoftAjax.Sys.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CUI.Control")
@js.native
class Control protected ()
  extends IDisposable
     with IMenuItem {
  def this(root: Root, id: String, properties: ControlProperties) = this()
  def createComponentForDisplayMode(displayMode: String): js.Any = js.native
  def get_enabled(): Boolean = js.native
  def get_id(): String = js.native
  def get_root(): Root = js.native
  def set_enabled(enabled: Boolean): Boolean = js.native
}

