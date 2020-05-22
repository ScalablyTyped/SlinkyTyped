package typingsSlinky.sharepoint.global.CUI

import typingsSlinky.sharepoint.CUI.IModalController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CUI.MenuLauncher")
@js.native
class MenuLauncher protected ()
  extends typingsSlinky.sharepoint.CUI.Control
     with IModalController {
  def this(
    root: typingsSlinky.sharepoint.CUI.Root,
    id: String,
    properties: typingsSlinky.sharepoint.CUI.ControlProperties,
    menu: js.Any
  ) = this()
  /* CompleteClass */
  override def createComponentForDisplayMode(displayMode: String): js.Any = js.native
  //#region Methods
  /**
    * Releases resources held by an object that implements the Sys.IDisposable interface.
    * Implement the dispose method to close or release resources held by an object, or to prepare an object for reuse.
    */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  /* CompleteClass */
  override def get_enabled(): Boolean = js.native
  /* CompleteClass */
  override def get_id(): String = js.native
  /* CompleteClass */
  override def get_root(): typingsSlinky.sharepoint.CUI.Root = js.native
  /* CompleteClass */
  override def set_enabled(enabled: Boolean): Boolean = js.native
}

