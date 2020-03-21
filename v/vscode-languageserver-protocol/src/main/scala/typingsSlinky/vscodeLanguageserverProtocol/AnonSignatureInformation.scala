package typingsSlinky.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSignatureInformation extends js.Object {
  /**
    * Whether signature help supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  /**
    * The client supports the following `SignatureInformation`
    * specific properties.
    */
  var signatureInformation: js.UndefOr[AnonDocumentationFormat] = js.undefined
}

object AnonSignatureInformation {
  @scala.inline
  def apply(
    dynamicRegistration: js.UndefOr[Boolean] = js.undefined,
    signatureInformation: AnonDocumentationFormat = null
  ): AnonSignatureInformation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration.asInstanceOf[js.Any])
    if (signatureInformation != null) __obj.updateDynamic("signatureInformation")(signatureInformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSignatureInformation]
  }
}

