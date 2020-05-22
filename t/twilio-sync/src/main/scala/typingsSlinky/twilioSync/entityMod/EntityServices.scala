package typingsSlinky.twilioSync.entityMod

import typingsSlinky.twilioSync.servicesMod.Network
import typingsSlinky.twilioSync.servicesMod.Router
import typingsSlinky.twilioSync.servicesMod.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityServices extends js.Object {
  var network: Network
  var router: Router
  var storage: Storage
}

object EntityServices {
  @scala.inline
  def apply(network: Network, router: Router, storage: Storage): EntityServices = {
    val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityServices]
  }
}

