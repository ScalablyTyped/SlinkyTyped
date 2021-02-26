package typingsSlinky.winrtUwp.Windows.UI.Notifications

import typingsSlinky.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the XML that defines the toast notification that will display at the scheduled time. */
@js.native
trait ScheduledToastNotification extends StObject {
  
  /** Gets the XML that defines this scheduled toast notification. */
  var content: XmlDocument = js.native
  
  /** Gets the time that this toast notification is scheduled to be displayed. */
  var deliveryTime: js.Date = js.native
  
  /** Gets or sets the group identifier for the notification. */
  var group: String = js.native
  
  /** Gets a developer-specified value used to identify a specific scheduled toast. */
  var id: String = js.native
  
  /** Gets the maximum number of times to display this notification. */
  var maximumSnoozeCount: Double = js.native
  
  /** Gets the amount of time between occurrences of the notification. */
  var snoozeInterval: Double = js.native
  
  /** Gets or sets whether a toast's pop-up UI is displayed on the Windows Phone 8.1 screen. */
  var suppressPopup: Boolean = js.native
  
  /** Gets or sets a string that uniquely identifies a toast notification inside a Group . */
  var tag: String = js.native
}
object ScheduledToastNotification {
  
  @scala.inline
  def apply(
    content: XmlDocument,
    deliveryTime: js.Date,
    group: String,
    id: String,
    maximumSnoozeCount: Double,
    snoozeInterval: Double,
    suppressPopup: Boolean,
    tag: String
  ): ScheduledToastNotification = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], deliveryTime = deliveryTime.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maximumSnoozeCount = maximumSnoozeCount.asInstanceOf[js.Any], snoozeInterval = snoozeInterval.asInstanceOf[js.Any], suppressPopup = suppressPopup.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledToastNotification]
  }
  
  @scala.inline
  implicit class ScheduledToastNotificationMutableBuilder[Self <: ScheduledToastNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: XmlDocument): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryTime(value: js.Date): Self = StObject.set(x, "deliveryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumSnoozeCount(value: Double): Self = StObject.set(x, "maximumSnoozeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnoozeInterval(value: Double): Self = StObject.set(x, "snoozeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressPopup(value: Boolean): Self = StObject.set(x, "suppressPopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
