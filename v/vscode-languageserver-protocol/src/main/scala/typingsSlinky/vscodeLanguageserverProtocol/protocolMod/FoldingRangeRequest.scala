package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeJsonrpc.mod.ProgressType
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRange
import typingsSlinky.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRangeParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRangeRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashfoldingRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FoldingRangeRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "FoldingRangeRequest.method")
  @js.native
  val method: textDocumentSlashfoldingRange = js.native
  
  /** @deprecated Use FoldingRangeRequest.type */
  @JSImport("vscode-languageserver-protocol/lib/protocol", "FoldingRangeRequest.resultType")
  @js.native
  val resultType: ProgressType[js.Array[FoldingRange]] = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "FoldingRangeRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    FoldingRangeParams, 
    js.Array[FoldingRange] | Null, 
    js.Array[FoldingRange], 
    js.Any, 
    FoldingRangeRegistrationOptions
  ] = js.native
}
