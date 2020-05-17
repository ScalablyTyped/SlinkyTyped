package typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides info about a subject alternative name. */
@js.native
trait SubjectAlternativeNameInfo extends js.Object {
  /** Gets the distinguished name. */
  var distinguishedName: IVectorView[String] = js.native
  /** Gets the DNS name. */
  var dnsName: IVectorView[String] = js.native
  /** Gets the email name. */
  var emailName: IVectorView[String] = js.native
  /** Gets the IP address. */
  var ipAddress: IVectorView[String] = js.native
  /** Gets the principal name. */
  var principalName: IVectorView[String] = js.native
  /** Gets the URL. */
  var url: IVectorView[String] = js.native
}

object SubjectAlternativeNameInfo {
  @scala.inline
  def apply(
    distinguishedName: IVectorView[String],
    dnsName: IVectorView[String],
    emailName: IVectorView[String],
    ipAddress: IVectorView[String],
    principalName: IVectorView[String],
    url: IVectorView[String]
  ): SubjectAlternativeNameInfo = {
    val __obj = js.Dynamic.literal(distinguishedName = distinguishedName.asInstanceOf[js.Any], dnsName = dnsName.asInstanceOf[js.Any], emailName = emailName.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any], principalName = principalName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectAlternativeNameInfo]
  }
  @scala.inline
  implicit class SubjectAlternativeNameInfoOps[Self <: SubjectAlternativeNameInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistinguishedName(value: IVectorView[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distinguishedName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDnsName(value: IVectorView[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmailName(value: IVectorView[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpAddress(value: IVectorView[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrincipalName(value: IVectorView[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: IVectorView[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

