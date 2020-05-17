package typingsSlinky.winrt.global.Windows.Networking

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.PushNotifications")
@js.native
object PushNotifications extends js.Object {
  @js.native
  class PushNotificationChannel ()
    extends typingsSlinky.winrt.Windows.Networking.PushNotifications.PushNotificationChannel
  
  @js.native
  class PushNotificationChannelManager ()
    extends typingsSlinky.winrt.Windows.Networking.PushNotifications.PushNotificationChannelManager
  
  @js.native
  class PushNotificationReceivedEventArgs ()
    extends typingsSlinky.winrt.Windows.Networking.PushNotifications.PushNotificationReceivedEventArgs
  
  @js.native
  class RawNotification ()
    extends typingsSlinky.winrt.Windows.Networking.PushNotifications.RawNotification
  
  /* static members */
  @js.native
  object PushNotificationChannelManager extends js.Object {
    def createPushNotificationChannelForApplicationAsync(): IAsyncOperation[typingsSlinky.winrt.Windows.Networking.PushNotifications.PushNotificationChannel] = js.native
    def createPushNotificationChannelForApplicationAsync(applicationId: String): IAsyncOperation[typingsSlinky.winrt.Windows.Networking.PushNotifications.PushNotificationChannel] = js.native
    def createPushNotificationChannelForSecondaryTileAsync(tileId: String): IAsyncOperation[typingsSlinky.winrt.Windows.Networking.PushNotifications.PushNotificationChannel] = js.native
  }
  
  @js.native
  object PushNotificationType extends js.Object {
    /* 2 */ val badge: typingsSlinky.winrt.Windows.Networking.PushNotifications.PushNotificationType.badge with Double = js.native
    /* 3 */ val raw: typingsSlinky.winrt.Windows.Networking.PushNotifications.PushNotificationType.raw with Double = js.native
    /* 1 */ val tile: typingsSlinky.winrt.Windows.Networking.PushNotifications.PushNotificationType.tile with Double = js.native
    /* 0 */ val toast: typingsSlinky.winrt.Windows.Networking.PushNotifications.PushNotificationType.toast with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.Networking.PushNotifications.PushNotificationType with Double
      ] = js.native
  }
  
}

