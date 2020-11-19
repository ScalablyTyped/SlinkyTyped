package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashwillSaveWaitUntil
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WillSaveTextDocumentParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "WillSaveTextDocumentWaitUntilRequest")
@js.native
object WillSaveTextDocumentWaitUntilRequest extends js.Object {
  
  val method: textDocumentSlashwillSaveWaitUntil = js.native
  
  val `type`: ProtocolRequestType[
    WillSaveTextDocumentParams, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.TextEdit] | Null, 
    scala.Nothing, 
    Unit, 
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ] = js.native
}
