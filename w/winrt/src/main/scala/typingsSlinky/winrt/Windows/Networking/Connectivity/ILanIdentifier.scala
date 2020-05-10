package typingsSlinky.winrt.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILanIdentifier extends js.Object {
  var infrastructureId: LanIdentifierData = js.native
  var networkAdapterId: String = js.native
  var portId: LanIdentifierData = js.native
}

object ILanIdentifier {
  @scala.inline
  def apply(infrastructureId: LanIdentifierData, networkAdapterId: String, portId: LanIdentifierData): ILanIdentifier = {
    val __obj = js.Dynamic.literal(infrastructureId = infrastructureId.asInstanceOf[js.Any], networkAdapterId = networkAdapterId.asInstanceOf[js.Any], portId = portId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanIdentifier]
  }
  @scala.inline
  implicit class ILanIdentifierOps[Self <: ILanIdentifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfrastructureId(value: LanIdentifierData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infrastructureId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkAdapterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkAdapterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortId(value: LanIdentifierData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

