package typingsSlinky.soap.wssecuritycertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWSSecurityCertOptions extends js.Object {
  var hasTimeStamp: js.UndefOr[Boolean] = js.native
  var signatureAlgorithm: js.UndefOr[String] = js.native
  var signatureTransformations: js.UndefOr[js.Array[String]] = js.native
  var signerOptions: js.UndefOr[IXmlSignerOptions] = js.native
}

object IWSSecurityCertOptions {
  @scala.inline
  def apply(): IWSSecurityCertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWSSecurityCertOptions]
  }
  @scala.inline
  implicit class IWSSecurityCertOptionsOps[Self <: IWSSecurityCertOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasTimeStamp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTimeStamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasTimeStamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTimeStamp")(js.undefined)
        ret
    }
    @scala.inline
    def withSignatureAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignatureAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withSignatureTransformations(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureTransformations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignatureTransformations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureTransformations")(js.undefined)
        ret
    }
    @scala.inline
    def withSignerOptions(value: IXmlSignerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignerOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signerOptions")(js.undefined)
        ret
    }
  }
  
}

