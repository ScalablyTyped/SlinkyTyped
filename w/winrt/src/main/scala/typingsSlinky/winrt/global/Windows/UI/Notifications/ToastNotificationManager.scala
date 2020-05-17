package typingsSlinky.winrt.global.Windows.UI.Notifications

import typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Notifications.ToastNotificationManager")
@js.native
class ToastNotificationManager ()
  extends typingsSlinky.winrt.Windows.UI.Notifications.ToastNotificationManager

/* static members */
@JSGlobal("Windows.UI.Notifications.ToastNotificationManager")
@js.native
object ToastNotificationManager extends js.Object {
  def createToastNotifier(): typingsSlinky.winrt.Windows.UI.Notifications.ToastNotifier = js.native
  def createToastNotifier(applicationId: String): typingsSlinky.winrt.Windows.UI.Notifications.ToastNotifier = js.native
  def getTemplateContent(`type`: typingsSlinky.winrt.Windows.UI.Notifications.ToastTemplateType): XmlDocument = js.native
}

