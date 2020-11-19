package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.InitializeResult
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod._InitializeParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFoldersInitializeParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "InitializeRequest")
@js.native
object InitializeRequest extends js.Object {
  
  val `type`: ProtocolRequestType[
    _InitializeParams with WorkspaceFoldersInitializeParams with WorkDoneProgressParams, 
    InitializeResult[js.Any], 
    scala.Nothing, 
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.InitializeError, 
    Unit
  ] = js.native
}
