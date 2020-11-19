package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolColorProviderMod.ColorPresentationParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "ColorPresentationRequest")
@js.native
object ColorPresentationRequest extends js.Object {
  
  val `type`: ProtocolRequestType[
    ColorPresentationParams, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.ColorPresentation], 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.ColorPresentation], 
    Unit, 
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions with typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ] = js.native
}
