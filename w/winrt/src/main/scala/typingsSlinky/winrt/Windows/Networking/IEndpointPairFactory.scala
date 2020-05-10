package typingsSlinky.winrt.Windows.Networking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEndpointPairFactory extends js.Object {
  def createEndpointPair(
    localHostName: HostName,
    localServiceName: String,
    remoteHostName: HostName,
    remoteServiceName: String
  ): EndpointPair = js.native
}

object IEndpointPairFactory {
  @scala.inline
  def apply(createEndpointPair: (HostName, String, HostName, String) => EndpointPair): IEndpointPairFactory = {
    val __obj = js.Dynamic.literal(createEndpointPair = js.Any.fromFunction4(createEndpointPair))
    __obj.asInstanceOf[IEndpointPairFactory]
  }
  @scala.inline
  implicit class IEndpointPairFactoryOps[Self <: IEndpointPairFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateEndpointPair(value: (HostName, String, HostName, String) => EndpointPair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createEndpointPair")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

