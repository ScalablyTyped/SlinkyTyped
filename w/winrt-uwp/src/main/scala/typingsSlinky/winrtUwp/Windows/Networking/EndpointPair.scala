package typingsSlinky.winrtUwp.Windows.Networking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the local endpoint and remote endpoint for a network connection used by network apps. */
@js.native
trait EndpointPair extends js.Object {
  /** Get or set the local hostname for the EndpointPair object. */
  var localHostName: HostName = js.native
  /** Get or set the local service name for the EndpointPair object. */
  var localServiceName: String = js.native
  /** Get or set the remote hostname for the EndpointPair object. */
  var remoteHostName: HostName = js.native
  /** Get or set the remote service name for the EndpointPair object. */
  var remoteServiceName: String = js.native
}

object EndpointPair {
  @scala.inline
  def apply(
    localHostName: HostName,
    localServiceName: String,
    remoteHostName: HostName,
    remoteServiceName: String
  ): EndpointPair = {
    val __obj = js.Dynamic.literal(localHostName = localHostName.asInstanceOf[js.Any], localServiceName = localServiceName.asInstanceOf[js.Any], remoteHostName = remoteHostName.asInstanceOf[js.Any], remoteServiceName = remoteServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointPair]
  }
  @scala.inline
  implicit class EndpointPairOps[Self <: EndpointPair] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalHostName(value: HostName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localHostName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localServiceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteHostName(value: HostName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteHostName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteServiceName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

