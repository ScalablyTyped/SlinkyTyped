package typingsSlinky.twilioSync.entityMod

import typingsSlinky.twilioSync.servicesMod.Network
import typingsSlinky.twilioSync.servicesMod.Router
import typingsSlinky.twilioSync.servicesMod.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityServices extends js.Object {
  var network: Network = js.native
  var router: Router = js.native
  var storage: Storage = js.native
}

object EntityServices {
  @scala.inline
  def apply(network: Network, router: Router, storage: Storage): EntityServices = {
    val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityServices]
  }
  @scala.inline
  implicit class EntityServicesOps[Self <: EntityServices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetwork(value: Network): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRouter(value: Router): Self = {
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
  }
  
}

