package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeJsonrpc.mod.ProgressType
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdocumentHighlight
import typingsSlinky.vscodeLanguageserverTypes.mod.DocumentHighlight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentHighlightRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "DocumentHighlightRequest.method")
  @js.native
  val method: textDocumentSlashdocumentHighlight = js.native
  
  /** @deprecated Use DocumentHighlightRequest.type */
  @JSImport("vscode-languageserver-protocol/lib/protocol", "DocumentHighlightRequest.resultType")
  @js.native
  val resultType: ProgressType[js.Array[DocumentHighlight]] = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "DocumentHighlightRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    DocumentHighlightParams, 
    js.Array[DocumentHighlight] | Null, 
    js.Array[DocumentHighlight], 
    Unit, 
    DocumentHighlightRegistrationOptions
  ] = js.native
}
