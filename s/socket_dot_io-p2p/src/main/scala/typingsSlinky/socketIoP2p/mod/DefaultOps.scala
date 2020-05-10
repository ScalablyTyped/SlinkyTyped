package typingsSlinky.socketIoP2p.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultOps extends js.Object {
  var autoUpgrade: Boolean = js.native
  var numClients: Double = js.native
}

object DefaultOps {
  @scala.inline
  def apply(autoUpgrade: Boolean, numClients: Double): DefaultOps = {
    val __obj = js.Dynamic.literal(autoUpgrade = autoUpgrade.asInstanceOf[js.Any], numClients = numClients.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultOps]
  }
  @scala.inline
  implicit class DefaultOpsOps[Self <: DefaultOps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoUpgrade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpgrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumClients(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numClients")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

