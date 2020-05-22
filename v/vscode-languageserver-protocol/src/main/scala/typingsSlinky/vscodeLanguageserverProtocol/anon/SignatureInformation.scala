package typingsSlinky.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureInformation extends js.Object {
  /**
    * Whether signature help supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  /**
    * The client supports the following `SignatureInformation`
    * specific properties.
    */
  var signatureInformation: js.UndefOr[DocumentationFormat] = js.undefined
}

object SignatureInformation {
  @scala.inline
  def apply(
    dynamicRegistration: js.UndefOr[Boolean] = js.undefined,
    signatureInformation: DocumentationFormat = null
  ): SignatureInformation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration.get.asInstanceOf[js.Any])
    if (signatureInformation != null) __obj.updateDynamic("signatureInformation")(signatureInformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureInformation]
  }
}

