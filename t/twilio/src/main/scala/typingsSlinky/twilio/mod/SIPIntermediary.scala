package typingsSlinky.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SIPIntermediary extends js.Object {
  var credentialLists: CredentialListResource = js.native
  var domains: DomainResource = js.native
  var ipAccessControlLists: IPAccessControlListResource = js.native
}

object SIPIntermediary {
  @scala.inline
  def apply(
    credentialLists: CredentialListResource,
    domains: DomainResource,
    ipAccessControlLists: IPAccessControlListResource
  ): SIPIntermediary = {
    val __obj = js.Dynamic.literal(credentialLists = credentialLists.asInstanceOf[js.Any], domains = domains.asInstanceOf[js.Any], ipAccessControlLists = ipAccessControlLists.asInstanceOf[js.Any])
    __obj.asInstanceOf[SIPIntermediary]
  }
  @scala.inline
  implicit class SIPIntermediaryOps[Self <: SIPIntermediary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCredentialLists(value: CredentialListResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentialLists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomains(value: DomainResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpAccessControlLists(value: IPAccessControlListResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAccessControlLists")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

