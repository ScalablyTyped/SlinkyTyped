package typingsSlinky.winrt.global.Windows.UI.Notifications

import typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Notifications.TileUpdateManager")
@js.native
class TileUpdateManager ()
  extends typingsSlinky.winrt.Windows.UI.Notifications.TileUpdateManager

/* static members */
@JSGlobal("Windows.UI.Notifications.TileUpdateManager")
@js.native
object TileUpdateManager extends js.Object {
  def createTileUpdaterForApplication(): typingsSlinky.winrt.Windows.UI.Notifications.TileUpdater = js.native
  def createTileUpdaterForApplication(applicationId: String): typingsSlinky.winrt.Windows.UI.Notifications.TileUpdater = js.native
  def createTileUpdaterForSecondaryTile(tileId: String): typingsSlinky.winrt.Windows.UI.Notifications.TileUpdater = js.native
  def getTemplateContent(`type`: typingsSlinky.winrt.Windows.UI.Notifications.TileTemplateType): XmlDocument = js.native
}

