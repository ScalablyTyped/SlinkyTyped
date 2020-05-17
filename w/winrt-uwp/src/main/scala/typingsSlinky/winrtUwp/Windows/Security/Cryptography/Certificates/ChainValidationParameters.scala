package typingsSlinky.winrtUwp.Windows.Security.Cryptography.Certificates

import typingsSlinky.winrtUwp.Windows.Networking.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents values to use when verifying a certificate chain. */
@js.native
trait ChainValidationParameters extends js.Object {
  /** Gets or sets the certificate chain policy to use when verifying the certificate chain. */
  var certificateChainPolicy: CertificateChainPolicy = js.native
  /** Gets or sets the server DNS name to use for SSL policy. */
  var serverDnsName: HostName = js.native
}

object ChainValidationParameters {
  @scala.inline
  def apply(certificateChainPolicy: CertificateChainPolicy, serverDnsName: HostName): ChainValidationParameters = {
    val __obj = js.Dynamic.literal(certificateChainPolicy = certificateChainPolicy.asInstanceOf[js.Any], serverDnsName = serverDnsName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChainValidationParameters]
  }
  @scala.inline
  implicit class ChainValidationParametersOps[Self <: ChainValidationParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateChainPolicy(value: CertificateChainPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateChainPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerDnsName(value: HostName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverDnsName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

