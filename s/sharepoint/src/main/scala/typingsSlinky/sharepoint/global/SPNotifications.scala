package typingsSlinky.sharepoint.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SPNotifications")
@js.native
object SPNotifications extends js.Object {
  
  @js.native
  object ContainerID extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SPNotifications.ContainerID with Double] = js.native
    
    /* 0 */ val Basic: typingsSlinky.sharepoint.SPNotifications.ContainerID.Basic with Double = js.native
    
    /* 1 */ val Status: typingsSlinky.sharepoint.SPNotifications.ContainerID.Status with Double = js.native
  }
  
  @js.native
  object EventID extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SPNotifications.EventID with Double] = js.native
    
    /* 2 */ val OnDisplayNotification: typingsSlinky.sharepoint.SPNotifications.EventID.OnDisplayNotification with Double = js.native
    
    /* 1 */ val OnHide: typingsSlinky.sharepoint.SPNotifications.EventID.OnHide with Double = js.native
    
    /* 4 */ val OnNotificationCountChanged: typingsSlinky.sharepoint.SPNotifications.EventID.OnNotificationCountChanged with Double = js.native
    
    /* 3 */ val OnRemoveNotification: typingsSlinky.sharepoint.SPNotifications.EventID.OnRemoveNotification with Double = js.native
    
    /* 0 */ val OnShow: typingsSlinky.sharepoint.SPNotifications.EventID.OnShow with Double = js.native
  }
}
