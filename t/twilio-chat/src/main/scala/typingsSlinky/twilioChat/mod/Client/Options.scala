package typingsSlinky.twilioChat.mod.Client

import typingsSlinky.twilioChat.transportMod.Transport
import typingsSlinky.twilioNotifications.mod.Notifications
import typingsSlinky.twilioSync.mod.SyncClient
import typingsSlinky.twilsock.mod.Twilsock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var Chat: js.UndefOr[js.Any] = js.native
  var Notification: js.UndefOr[js.Any] = js.native
  var Sync: js.UndefOr[js.Any] = js.native
  var Twilsock: js.UndefOr[js.Any] = js.native
  var backoffConfigOverride: js.UndefOr[js.Any] = js.native
  var consumptionReportIntervalOverride: js.UndefOr[String] = js.native
  var httpCacheIntervalOverride: js.UndefOr[String] = js.native
  var logLevel: js.UndefOr[LogLevel] = js.native
  var notificationsClient: js.UndefOr[Notifications] = js.native
  var productId: js.UndefOr[String] = js.native
  var region: js.UndefOr[String] = js.native
  var retryWhenThrottledOverride: js.UndefOr[Boolean] = js.native
  var syncClient: js.UndefOr[SyncClient] = js.native
  var transport: js.UndefOr[Transport] = js.native
  var twilsockClient: js.UndefOr[Twilsock] = js.native
  var typingIndicatorTimeoutOverride: js.UndefOr[Double] = js.native
  var userInfosToSubscribeOverride: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChat(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Chat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Chat")(js.undefined)
        ret
    }
    @scala.inline
    def withNotification(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Notification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Notification")(js.undefined)
        ret
    }
    @scala.inline
    def withSync(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sync")(js.undefined)
        ret
    }
    @scala.inline
    def withTwilsock(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Twilsock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTwilsock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Twilsock")(js.undefined)
        ret
    }
    @scala.inline
    def withBackoffConfigOverride(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backoffConfigOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackoffConfigOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backoffConfigOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withConsumptionReportIntervalOverride(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumptionReportIntervalOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsumptionReportIntervalOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumptionReportIntervalOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpCacheIntervalOverride(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpCacheIntervalOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpCacheIntervalOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpCacheIntervalOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withLogLevel(value: LogLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withLogLevelNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(null)
        ret
    }
    @scala.inline
    def withNotificationsClient(value: Notifications): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationsClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationsClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationsClient")(js.undefined)
        ret
    }
    @scala.inline
    def withProductId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryWhenThrottledOverride(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryWhenThrottledOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryWhenThrottledOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryWhenThrottledOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncClient(value: SyncClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncClient")(js.undefined)
        ret
    }
    @scala.inline
    def withTransport(value: Transport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(js.undefined)
        ret
    }
    @scala.inline
    def withTwilsockClient(value: Twilsock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twilsockClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTwilsockClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twilsockClient")(js.undefined)
        ret
    }
    @scala.inline
    def withTypingIndicatorTimeoutOverride(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typingIndicatorTimeoutOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypingIndicatorTimeoutOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typingIndicatorTimeoutOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withUserInfosToSubscribeOverride(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInfosToSubscribeOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserInfosToSubscribeOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInfosToSubscribeOverride")(js.undefined)
        ret
    }
  }
  
}

