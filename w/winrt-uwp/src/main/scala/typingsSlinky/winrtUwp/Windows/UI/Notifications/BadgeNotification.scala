package typingsSlinky.winrtUwp.Windows.UI.Notifications

import typingsSlinky.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines the content, associated metadata, and expiration time of an update to a tile's badge overlay. A badge can display a number from 1 to 99 or a status glyph. */
@js.native
trait BadgeNotification extends StObject {
  
  /** Gets the XML that defines the value or glyph used as the tile's badge. */
  var content: XmlDocument = js.native
  
  /** Gets or sets the time that Windows will remove the badge from the tile. By default, local badge notifications do not expire and push, periodic, and scheduled badge notifications expire after three days. It is a best practice to explicitly set an expiration time to avoid stale content. */
  var expirationTime: js.Date = js.native
}
object BadgeNotification {
  
  @scala.inline
  def apply(content: XmlDocument, expirationTime: js.Date): BadgeNotification = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeNotification]
  }
  
  @scala.inline
  implicit class BadgeNotificationMutableBuilder[Self <: BadgeNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: XmlDocument): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTime(value: js.Date): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
  }
}
