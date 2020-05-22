package typingsSlinky.winrt.global.Windows.Networking

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Networking.PushNotifications.PushNotificationType
import typingsSlinky.winrt.Windows.UI.Notifications.BadgeNotification
import typingsSlinky.winrt.Windows.UI.Notifications.TileNotification
import typingsSlinky.winrt.Windows.UI.Notifications.ToastNotification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.PushNotifications")
@js.native
object PushNotifications extends js.Object {
  @js.native
  class PushNotificationChannel ()
    extends typingsSlinky.winrt.Windows.Networking.PushNotifications.PushNotificationChannel {
    /* CompleteClass */
    override var expirationTime: js.Date = js.native
    /* CompleteClass */
    override var onpushnotificationreceived: js.Any = js.native
    /* CompleteClass */
    override var uri: String = js.native
    /* CompleteClass */
    override def close(): Unit = js.native
  }
  
  @js.native
  class PushNotificationChannelManager ()
    extends typingsSlinky.winrt.Windows.Networking.PushNotifications.PushNotificationChannelManager
  
  @js.native
  class PushNotificationReceivedEventArgs ()
    extends typingsSlinky.winrt.Windows.Networking.PushNotifications.PushNotificationReceivedEventArgs {
    /* CompleteClass */
    override var badgeNotification: BadgeNotification = js.native
    /* CompleteClass */
    override var cancel: Boolean = js.native
    /* CompleteClass */
    override var notificationType: PushNotificationType = js.native
    /* CompleteClass */
    override var rawNotification: typingsSlinky.winrt.Windows.Networking.PushNotifications.RawNotification = js.native
    /* CompleteClass */
    override var tileNotification: TileNotification = js.native
    /* CompleteClass */
    override var toastNotification: ToastNotification = js.native
  }
  
  @js.native
  class RawNotification ()
    extends typingsSlinky.winrt.Windows.Networking.PushNotifications.RawNotification {
    /* CompleteClass */
    override var content: String = js.native
  }
  
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

