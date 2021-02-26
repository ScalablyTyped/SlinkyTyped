package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashwillSaveWaitUntil
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WillSaveTextDocumentParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WillSaveTextDocumentWaitUntilRequest {
  
  @JSImport("vscode-languageclient", "WillSaveTextDocumentWaitUntilRequest.method")
  @js.native
  val method: textDocumentSlashwillSaveWaitUntil = js.native
  
  @JSImport("vscode-languageclient", "WillSaveTextDocumentWaitUntilRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    WillSaveTextDocumentParams, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.TextEdit] | Null, 
    scala.Nothing, 
    Unit, 
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ] = js.native
}
