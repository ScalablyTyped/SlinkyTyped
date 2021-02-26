package typingsSlinky.winrt.Windows.UI.Notifications

import typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScheduledToastNotificationFactory extends StObject {
  
  def createScheduledToastNotification(content: XmlDocument, deliveryTime: js.Date): ScheduledToastNotification = js.native
  def createScheduledToastNotification(content: XmlDocument, deliveryTime: js.Date, snoozeInterval: Double, maximumSnoozeCount: Double): ScheduledToastNotification = js.native
}
