package typingsSlinky.winrtUwp.global.Windows.UI.Notifications

import typingsSlinky.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines the visual content and timing for a single, non-recurring scheduled update to a tile. */
@JSGlobal("Windows.UI.Notifications.ScheduledTileNotification")
@js.native
class ScheduledTileNotification protected ()
  extends typingsSlinky.winrtUwp.Windows.UI.Notifications.ScheduledTileNotification {
  /**
    * Creates and initializes a new instance of the ScheduledTileNotification object for use with a TileUpdater .
    * @param content The object that provides the content for the tile notification.
    * @param deliveryTime The time at which the tile should be updated with the notification information.
    */
  def this(content: XmlDocument, deliveryTime: js.Date) = this()
}
