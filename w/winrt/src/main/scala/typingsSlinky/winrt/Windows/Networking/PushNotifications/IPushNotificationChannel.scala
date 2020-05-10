package typingsSlinky.winrt.Windows.Networking.PushNotifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPushNotificationChannel extends js.Object {
  var expirationTime: js.Date = js.native
  var onpushnotificationreceived: js.Any = js.native
  var uri: String = js.native
  def close(): Unit = js.native
}

object IPushNotificationChannel {
  @scala.inline
  def apply(close: () => Unit, expirationTime: js.Date, onpushnotificationreceived: js.Any, uri: String): IPushNotificationChannel = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), expirationTime = expirationTime.asInstanceOf[js.Any], onpushnotificationreceived = onpushnotificationreceived.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPushNotificationChannel]
  }
  @scala.inline
  implicit class IPushNotificationChannelOps[Self <: IPushNotificationChannel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExpirationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnpushnotificationreceived(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpushnotificationreceived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

