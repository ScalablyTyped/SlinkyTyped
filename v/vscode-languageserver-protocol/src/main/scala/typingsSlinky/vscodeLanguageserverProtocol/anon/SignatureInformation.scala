package typingsSlinky.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureInformation extends js.Object {
  /**
    * Whether signature help supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
  /**
    * The client supports the following `SignatureInformation`
    * specific properties.
    */
  var signatureInformation: js.UndefOr[DocumentationFormat] = js.native
}

object SignatureInformation {
  @scala.inline
  def apply(): SignatureInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureInformation]
  }
  @scala.inline
  implicit class SignatureInformationOps[Self <: SignatureInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDynamicRegistration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicRegistration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicRegistration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicRegistration")(js.undefined)
        ret
    }
    @scala.inline
    def withSignatureInformation(value: DocumentationFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignatureInformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureInformation")(js.undefined)
        ret
    }
  }
  
}

