package typingsSlinky.vscodeLanguageserverProtocol.protocolDeclarationMod

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclarationRegistrationOptions
  extends WorkDoneProgressOptions
     with TextDocumentRegistrationOptions
     with StaticRegistrationOptions

object DeclarationRegistrationOptions {
  @scala.inline
  def apply(): DeclarationRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeclarationRegistrationOptions]
  }
}

