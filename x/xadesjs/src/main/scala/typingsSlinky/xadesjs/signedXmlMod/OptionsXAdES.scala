package typingsSlinky.xadesjs.signedXmlMod

import typingsSlinky.xmldsigjs.signedXmlMod.OptionsSign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsXAdES extends OptionsSign {
  var policy: js.UndefOr[OptionsPolicyId | Boolean] = js.native
  var productionPlace: js.UndefOr[OptionsProductionPlace] = js.native
  var signerRole: js.UndefOr[OptionsSignerRole] = js.native
  /**
    * Sets a certificate of signer for signature. Optional
    *
    * @type {string} base64 string of X509 certificate
    * @memberOf OptionsXAdES
    */
  var signingCertificate: js.UndefOr[String] = js.native
  /**
    * Sets signing time options
    */
  var signingTime: js.UndefOr[OptionsSigningTime] = js.native
}

object OptionsXAdES {
  @scala.inline
  def apply(): OptionsXAdES = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsXAdES]
  }
  @scala.inline
  implicit class OptionsXAdESOps[Self <: OptionsXAdES] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicy(value: OptionsPolicyId | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(js.undefined)
        ret
    }
    @scala.inline
    def withProductionPlace(value: OptionsProductionPlace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productionPlace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductionPlace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productionPlace")(js.undefined)
        ret
    }
    @scala.inline
    def withSignerRole(value: OptionsSignerRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signerRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignerRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signerRole")(js.undefined)
        ret
    }
    @scala.inline
    def withSigningCertificate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigningCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingCertificate")(js.undefined)
        ret
    }
    @scala.inline
    def withSigningTime(value: OptionsSigningTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigningTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingTime")(js.undefined)
        ret
    }
  }
  
}

