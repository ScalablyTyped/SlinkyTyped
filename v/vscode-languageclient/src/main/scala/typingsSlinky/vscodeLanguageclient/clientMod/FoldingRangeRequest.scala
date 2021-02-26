package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashfoldingRange
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRangeParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRangeRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FoldingRangeRequest {
  
  @JSImport("vscode-languageclient/lib/client", "FoldingRangeRequest.method")
  @js.native
  val method: textDocumentSlashfoldingRange = js.native
  
  /** @deprecated Use FoldingRangeRequest.type */
  @JSImport("vscode-languageclient/lib/client", "FoldingRangeRequest.resultType")
  @js.native
  val resultType: typingsSlinky.vscodeJsonrpc.mod.ProgressType[
    js.Array[typingsSlinky.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRange]
  ] = js.native
  
  @JSImport("vscode-languageclient/lib/client", "FoldingRangeRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    FoldingRangeParams, 
    js.Array[typingsSlinky.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRange] | Null, 
    js.Array[typingsSlinky.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRange], 
    js.Any, 
    FoldingRangeRegistrationOptions
  ] = js.native
}
