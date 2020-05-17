package typingsSlinky.winrtUwp.Windows.UI.Notifications

import typingsSlinky.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the visual content and timing for a single, non-recurring scheduled update to a tile. */
@js.native
trait ScheduledTileNotification extends js.Object {
  /** Gets the XML description of the content of the scheduled tile update. */
  var content: XmlDocument = js.native
  /** Gets the time at which the tile is scheduled to be updated. */
  var deliveryTime: js.Date = js.native
  /** Gets or sets the time after which the tile notification should no longer be shown. By default, a tile notification does not expire. It is a best practice to explicitly set an expiration time to avoid stale content. */
  var expirationTime: js.Date = js.native
  /** Gets or sets the unique ID that is used to identify the scheduled tile in the schedule. */
  var id: String = js.native
  /** Gets or sets a string that Windows can use to prevent duplicate notification content from appearing in the queue. */
  var tag: String = js.native
}

object ScheduledTileNotification {
  @scala.inline
  def apply(content: XmlDocument, deliveryTime: js.Date, expirationTime: js.Date, id: String, tag: String): ScheduledTileNotification = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], deliveryTime = deliveryTime.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledTileNotification]
  }
  @scala.inline
  implicit class ScheduledTileNotificationOps[Self <: ScheduledTileNotification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: XmlDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeliveryTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpirationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

