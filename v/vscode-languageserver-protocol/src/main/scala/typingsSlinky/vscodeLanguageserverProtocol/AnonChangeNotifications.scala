package typingsSlinky.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChangeNotifications extends js.Object {
  /**
    * Whether the server wants to receive workspace folder
    * change notifications.
    *
    * If a strings is provided the string is treated as a ID
    * under which the notification is registed on the client
    * side. The ID can be used to unregister for these events
    * using the `client/unregisterCapability` request.
    */
  var changeNotifications: js.UndefOr[String | Boolean] = js.native
  /**
    * The Server has support for workspace folders
    */
  var supported: js.UndefOr[Boolean] = js.native
}

object AnonChangeNotifications {
  @scala.inline
  def apply(): AnonChangeNotifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonChangeNotifications]
  }
  @scala.inline
  implicit class AnonChangeNotificationsOps[Self <: AnonChangeNotifications] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeNotifications(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeNotifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeNotifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeNotifications")(js.undefined)
        ret
    }
    @scala.inline
    def withSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supported")(js.undefined)
        ret
    }
  }
  
}

