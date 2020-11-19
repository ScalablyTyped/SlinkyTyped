package typingsSlinky.vscodeLanguageserverProtocol.protocolImplementationMod

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImplementationRegistrationOptions
  extends TextDocumentRegistrationOptions
     with WorkDoneProgressOptions
     with StaticRegistrationOptions
object ImplementationRegistrationOptions {
  
  @scala.inline
  def apply(): ImplementationRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImplementationRegistrationOptions]
  }
}
