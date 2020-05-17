package typingsSlinky.winrtUwp.Windows.Networking.ServiceDiscovery.Dnssd

import typingsSlinky.winrtUwp.Windows.Networking.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates detailed information about the result of an attempt to register a service instance using DNS-SD. */
@js.native
trait DnssdRegistrationResult extends js.Object {
  /** Indicates whether the instance name was changed in the course of the registration process. */
  var hasInstanceNameChanged: Boolean = js.native
  /** The IP address of the successfully-created service instance. */
  var ipAddress: HostName = js.native
  /** An enumeration value indicating the result of a service instance registration attempt. */
  var status: DnssdRegistrationStatus = js.native
}

object DnssdRegistrationResult {
  @scala.inline
  def apply(hasInstanceNameChanged: Boolean, ipAddress: HostName, status: DnssdRegistrationStatus): DnssdRegistrationResult = {
    val __obj = js.Dynamic.literal(hasInstanceNameChanged = hasInstanceNameChanged.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DnssdRegistrationResult]
  }
  @scala.inline
  implicit class DnssdRegistrationResultOps[Self <: DnssdRegistrationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasInstanceNameChanged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasInstanceNameChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpAddress(value: HostName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: DnssdRegistrationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

