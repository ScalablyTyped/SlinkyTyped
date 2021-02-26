package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.InitializeResult
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod._InitializeParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFoldersInitializeParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InitializeRequest {
  
  @JSImport("vscode-languageclient/lib/client", "InitializeRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    _InitializeParams with WorkspaceFoldersInitializeParams with WorkDoneProgressParams, 
    InitializeResult[js.Any], 
    scala.Nothing, 
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.InitializeError, 
    Unit
  ] = js.native
}
