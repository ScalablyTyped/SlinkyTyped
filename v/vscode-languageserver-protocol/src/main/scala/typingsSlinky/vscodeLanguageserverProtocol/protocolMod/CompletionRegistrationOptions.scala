package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompletionRegistrationOptions
  extends TextDocumentRegistrationOptions
     with CompletionOptions

object CompletionRegistrationOptions {
  @scala.inline
  def apply(): CompletionRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompletionRegistrationOptions]
  }
}

