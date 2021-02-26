package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashselectionRange
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolSelectionRangeMod.SelectionRangeParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolSelectionRangeMod.SelectionRangeRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectionRangeRequest {
  
  @JSImport("vscode-languageserver", "SelectionRangeRequest.method")
  @js.native
  val method: textDocumentSlashselectionRange = js.native
  
  /** @deprecated  Use SelectionRangeRequest.type */
  @JSImport("vscode-languageserver", "SelectionRangeRequest.resultType")
  @js.native
  val resultType: typingsSlinky.vscodeJsonrpc.mod.ProgressType[js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.SelectionRange]] = js.native
  
  @JSImport("vscode-languageserver", "SelectionRangeRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    SelectionRangeParams, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.SelectionRange] | Null, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.SelectionRange], 
    js.Any, 
    SelectionRangeRegistrationOptions
  ] = js.native
}
