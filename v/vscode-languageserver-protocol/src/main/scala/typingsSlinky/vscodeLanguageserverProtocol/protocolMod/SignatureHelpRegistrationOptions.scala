package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureHelpRegistrationOptions
  extends TextDocumentRegistrationOptions
     with SignatureHelpOptions

object SignatureHelpRegistrationOptions {
  @scala.inline
  def apply(): SignatureHelpRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureHelpRegistrationOptions]
  }
}

