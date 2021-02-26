package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeJsonrpc.mod.ProgressType
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolSelectionRangeMod.SelectionRangeParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolSelectionRangeMod.SelectionRangeRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashselectionRange
import typingsSlinky.vscodeLanguageserverTypes.mod.SelectionRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectionRangeRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "SelectionRangeRequest.method")
  @js.native
  val method: textDocumentSlashselectionRange = js.native
  
  /** @deprecated  Use SelectionRangeRequest.type */
  @JSImport("vscode-languageserver-protocol/lib/protocol", "SelectionRangeRequest.resultType")
  @js.native
  val resultType: ProgressType[js.Array[SelectionRange]] = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "SelectionRangeRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    SelectionRangeParams, 
    js.Array[SelectionRange] | Null, 
    js.Array[SelectionRange], 
    js.Any, 
    SelectionRangeRegistrationOptions
  ] = js.native
}
