package typingsSlinky.winrtUwp.global.Windows.UI.Notifications

import typingsSlinky.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Creates BadgeUpdater objects that you use to manipulate a tile's badge overlay. This class also provides access to the XML content of the system-provided badge templates so that you can customize that content for use in updating your badges. */
@JSGlobal("Windows.UI.Notifications.BadgeUpdateManager")
@js.native
abstract class BadgeUpdateManager ()
  extends typingsSlinky.winrtUwp.Windows.UI.Notifications.BadgeUpdateManager
/* static members */
@JSGlobal("Windows.UI.Notifications.BadgeUpdateManager")
@js.native
object BadgeUpdateManager extends js.Object {
  
  /**
    * Creates and initializes a new instance of the BadgeUpdater , which lets you change the appearance or content of the badge on the calling app's tile.
    * @return The object you will use to send changes to the app tile's badge.
    */
  def createBadgeUpdaterForApplication(): typingsSlinky.winrtUwp.Windows.UI.Notifications.BadgeUpdater = js.native
  /**
    * Creates and initializes a new instance of the BadgeUpdater for a specified app tile's badge, usually the tile of another app in the package. The BadgeUpdater lets you change the appearance or content of that badge.
    * @param applicationId The unique ID of the tile whose badge you want to update.
    * @return The object you will use to send changes to the application tile's badge.
    */
  def createBadgeUpdaterForApplication(applicationId: String): typingsSlinky.winrtUwp.Windows.UI.Notifications.BadgeUpdater = js.native
  
  /**
    * Creates and initializes a new instance of the BadgeUpdater , which enables you to change the appearance or content of a badge on a secondary tile . The tile can belong to the calling app or any other app in the same package.
    * @param tileId The unique ID of the tile.
    * @return The object you will use to send badge updates to the tile identified by tileID.
    */
  def createBadgeUpdaterForSecondaryTile(tileId: String): typingsSlinky.winrtUwp.Windows.UI.Notifications.BadgeUpdater = js.native
  
  /**
    * Gets the XML content of one of the predefined badge templates so that you can customize it for a badge update.
    * @param type The type of badge template, either a glyph or a number.
    * @return The object that contains the template XML.
    */
  def getTemplateContent(`type`: typingsSlinky.winrtUwp.Windows.UI.Notifications.BadgeTemplateType): XmlDocument = js.native
}
