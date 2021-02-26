package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentHighlightParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentHighlightRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdocumentHighlight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentHighlightRequest {
  
  @JSImport("vscode-languageserver-protocol", "DocumentHighlightRequest.method")
  @js.native
  val method: textDocumentSlashdocumentHighlight = js.native
  
  /** @deprecated Use DocumentHighlightRequest.type */
  @JSImport("vscode-languageserver-protocol", "DocumentHighlightRequest.resultType")
  @js.native
  val resultType: typingsSlinky.vscodeJsonrpc.mod.ProgressType[js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.DocumentHighlight]] = js.native
  
  @JSImport("vscode-languageserver-protocol", "DocumentHighlightRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    DocumentHighlightParams, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.DocumentHighlight] | Null, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.DocumentHighlight], 
    Unit, 
    DocumentHighlightRegistrationOptions
  ] = js.native
}
