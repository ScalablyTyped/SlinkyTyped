package typingsSlinky.winrt.Windows.UI.Notifications

import typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IToastNotificationFactory extends js.Object {
  
  def createToastNotification(content: XmlDocument): ToastNotification = js.native
}
object IToastNotificationFactory {
  
  @scala.inline
  def apply(createToastNotification: XmlDocument => ToastNotification): IToastNotificationFactory = {
    val __obj = js.Dynamic.literal(createToastNotification = js.Any.fromFunction1(createToastNotification))
    __obj.asInstanceOf[IToastNotificationFactory]
  }
  
  @scala.inline
  implicit class IToastNotificationFactoryOps[Self <: IToastNotificationFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateToastNotification(value: XmlDocument => ToastNotification): Self = this.set("createToastNotification", js.Any.fromFunction1(value))
  }
}
