package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.completionItemSlashresolve
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient", "CompletionResolveRequest")
@js.native
object CompletionResolveRequest extends js.Object {
  
  val method: completionItemSlashresolve = js.native
  
  val `type`: ProtocolRequestType[
    typingsSlinky.vscodeLanguageserverTypes.mod.CompletionItem, 
    typingsSlinky.vscodeLanguageserverTypes.mod.CompletionItem, 
    scala.Nothing, 
    Unit, 
    Unit
  ] = js.native
}
