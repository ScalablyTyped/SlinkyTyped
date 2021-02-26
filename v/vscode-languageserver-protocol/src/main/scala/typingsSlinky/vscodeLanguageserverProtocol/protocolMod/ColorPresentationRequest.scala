package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolColorProviderMod.ColorPresentationParams
import typingsSlinky.vscodeLanguageserverTypes.mod.ColorPresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorPresentationRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "ColorPresentationRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    ColorPresentationParams, 
    js.Array[ColorPresentation], 
    js.Array[ColorPresentation], 
    Unit, 
    WorkDoneProgressOptions with TextDocumentRegistrationOptions
  ] = js.native
}
