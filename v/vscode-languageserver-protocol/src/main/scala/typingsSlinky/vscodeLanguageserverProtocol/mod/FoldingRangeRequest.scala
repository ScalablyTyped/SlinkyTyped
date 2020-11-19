package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRangeParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRangeRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashfoldingRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol", "FoldingRangeRequest")
@js.native
object FoldingRangeRequest extends js.Object {
  
  val method: textDocumentSlashfoldingRange = js.native
  
  /** @deprecated Use FoldingRangeRequest.type */
  val resultType: typingsSlinky.vscodeJsonrpc.mod.ProgressType[
    js.Array[typingsSlinky.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRange]
  ] = js.native
  
  val `type`: ProtocolRequestType[
    FoldingRangeParams, 
    js.Array[typingsSlinky.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRange] | Null, 
    js.Array[typingsSlinky.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRange], 
    js.Any, 
    FoldingRangeRegistrationOptions
  ] = js.native
}
