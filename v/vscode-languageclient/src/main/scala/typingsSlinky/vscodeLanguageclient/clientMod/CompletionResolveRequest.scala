package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.completionItemSlashresolve
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CompletionResolveRequest {
  
  @JSImport("vscode-languageclient/lib/client", "CompletionResolveRequest.method")
  @js.native
  val method: completionItemSlashresolve = js.native
  
  @JSImport("vscode-languageclient/lib/client", "CompletionResolveRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    typingsSlinky.vscodeLanguageserverTypes.mod.CompletionItem, 
    typingsSlinky.vscodeLanguageserverTypes.mod.CompletionItem, 
    scala.Nothing, 
    Unit, 
    Unit
  ] = js.native
}
