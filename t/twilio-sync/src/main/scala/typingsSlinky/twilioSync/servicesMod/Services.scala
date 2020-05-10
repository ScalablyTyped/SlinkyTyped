package typingsSlinky.twilioSync.servicesMod

import typingsSlinky.twilioSync.subscriptionsMod.Subscriptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Services extends js.Object {
  var config: Configuration = js.native
  var network: Network = js.native
  var notifications: Notifications = js.native
  var router: typingsSlinky.twilioSync.routerMod.Router = js.native
  var storage: Storage = js.native
  var subscriptions: Subscriptions = js.native
  var twilsock: typingsSlinky.twilsock.mod.Twilsock = js.native
}

object Services {
  @scala.inline
  def apply(
    config: Configuration,
    network: Network,
    notifications: Notifications,
    router: typingsSlinky.twilioSync.routerMod.Router,
    storage: Storage,
    subscriptions: Subscriptions,
    twilsock: typingsSlinky.twilsock.mod.Twilsock
  ): Services = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], twilsock = twilsock.asInstanceOf[js.Any])
    __obj.asInstanceOf[Services]
  }
  @scala.inline
  implicit class ServicesOps[Self <: Services] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: Configuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetwork(value: Network): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotifications(value: Notifications): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRouter(value: typingsSlinky.twilioSync.routerMod.Router): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("router")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorage(value: Storage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriptions(value: Subscriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwilsock(value: typingsSlinky.twilsock.mod.Twilsock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twilsock")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

