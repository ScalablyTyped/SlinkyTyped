package typingsSlinky.vscodeLanguageserverProtocol.protocolFoldingRangeMod

import typingsSlinky.vscodeJsonrpc.mod.ProgressType
import typingsSlinky.vscodeJsonrpc.mod.RequestHandler
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashfoldingRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol/lib/protocol.foldingRange", "FoldingRangeRequest")
@js.native
object FoldingRangeRequest extends js.Object {
  
  val method: textDocumentSlashfoldingRange = js.native
  
  /** @deprecated Use FoldingRangeRequest.type */
  val resultType: ProgressType[js.Array[FoldingRange]] = js.native
  
  val `type`: ProtocolRequestType[
    FoldingRangeParams, 
    js.Array[FoldingRange] | Null, 
    js.Array[FoldingRange], 
    js.Any, 
    FoldingRangeRegistrationOptions
  ] = js.native
  
  type HandlerSignature = RequestHandler[FoldingRangeParams, js.Array[FoldingRange] | Null, Unit]
}
