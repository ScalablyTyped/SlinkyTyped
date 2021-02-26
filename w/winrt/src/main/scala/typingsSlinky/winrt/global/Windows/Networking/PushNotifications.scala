package typingsSlinky.winrt.global.Windows.Networking

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PushNotifications {
  
  @JSGlobal("Windows.Networking.PushNotifications.PushNotificationChannel")
  @js.native
  class PushNotificationChannel ()
    extends typingsSlinky.winrt.Windows.Networking.PushNotifications.PushNotificationChannel
  
  @JSGlobal("Windows.Networking.PushNotifications.PushNotificationChannelManager")
  @js.native
  class PushNotificationChannelManager ()
    extends typingsSlinky.winrt.Windows.Networking.PushNotifications.PushNotificationChannelManager
  /* static members */
  object PushNotificationChannelManager {
    
    @JSGlobal("Windows.Networking.PushNotifications.PushNotificationChannelManager.createPushNotificationChannelForApplicationAsync")
    @js.native
    def createPushNotificationChannelForApplicationAsync(): IAsyncOperation[typingsSlinky.winrt.Windows.Networking.PushNotifications.PushNotificationChannel] = js.native
    @JSGlobal("Windows.Networking.PushNotifications.PushNotificationChannelManager.createPushNotificationChannelForApplicationAsync")
    @js.native
    def createPushNotificationChannelForApplicationAsync(applicationId: String): IAsyncOperation[typingsSlinky.winrt.Windows.Networking.PushNotifications.PushNotificationChannel] = js.native
    
    @JSGlobal("Windows.Networking.PushNotifications.PushNotificationChannelManager.createPushNotificationChannelForSecondaryTileAsync")
    @js.native
    def createPushNotificationChannelForSecondaryTileAsync(tileId: String): IAsyncOperation[typingsSlinky.winrt.Windows.Networking.PushNotifications.PushNotificationChannel] = js.native
  }
  
  @JSGlobal("Windows.Networking.PushNotifications.PushNotificationReceivedEventArgs")
  @js.native
  class PushNotificationReceivedEventArgs ()
    extends typingsSlinky.winrt.Windows.Networking.PushNotifications.PushNotificationReceivedEventArgs
  
  @JSGlobal("Windows.Networking.PushNotifications.PushNotificationType")
  @js.native
  object PushNotificationType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.Networking.PushNotifications.PushNotificationType with Double
      ] = js.native
    
    /* 2 */ val badge: typingsSlinky.winrt.Windows.Networking.PushNotifications.PushNotificationType.badge with Double = js.native
    
    /* 3 */ val raw: typingsSlinky.winrt.Windows.Networking.PushNotifications.PushNotificationType.raw with Double = js.native
    
    /* 1 */ val tile: typingsSlinky.winrt.Windows.Networking.PushNotifications.PushNotificationType.tile with Double = js.native
    
    /* 0 */ val toast: typingsSlinky.winrt.Windows.Networking.PushNotifications.PushNotificationType.toast with Double = js.native
  }
  
  @JSGlobal("Windows.Networking.PushNotifications.RawNotification")
  @js.native
  class RawNotification ()
    extends typingsSlinky.winrt.Windows.Networking.PushNotifications.RawNotification
}
