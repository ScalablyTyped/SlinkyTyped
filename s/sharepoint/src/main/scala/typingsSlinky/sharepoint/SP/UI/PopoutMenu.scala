package typingsSlinky.sharepoint.SP.UI

import typingsSlinky.microsoftAjax.Sys.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.PopoutMenu")
@js.native
class PopoutMenu protected () extends IDisposable {
  def this(
    launcherId: String,
    menuId: String,
    iconId: String,
    launcherOpenCssClass: String,
    textDirection: String,
    closeIconUrl: String,
    isClustered: Boolean,
    closeIconOffsetLeft: Double,
    closeIconOffsetTop: Double,
    closeIconHeight: Double,
    closeIconWidth: Double
  ) = this()
  def closeMenu(): Unit = js.native
  def launchMenu(): Unit = js.native
}

/* static members */
@JSGlobal("SP.UI.PopoutMenu")
@js.native
object PopoutMenu extends js.Object {
  def closeActivePopoutMenuInstance(): Unit = js.native
  def createPopoutMenuInstanceAndLaunch(
    anchorId: String,
    menuId: String,
    iconId: String,
    anchorOpenCss: String,
    textDirection: String,
    closeIconUrl: String,
    isClustered: Boolean,
    x: Double,
    y: Double,
    height: Double,
    width: Double
  ): Unit = js.native
}

