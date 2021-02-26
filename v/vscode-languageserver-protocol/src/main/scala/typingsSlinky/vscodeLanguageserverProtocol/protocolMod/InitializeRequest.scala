package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFoldersInitializeParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InitializeRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "InitializeRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    _InitializeParams with WorkspaceFoldersInitializeParams with WorkDoneProgressParams, 
    InitializeResult[js.Any], 
    scala.Nothing, 
    InitializeError, 
    Unit
  ] = js.native
}
