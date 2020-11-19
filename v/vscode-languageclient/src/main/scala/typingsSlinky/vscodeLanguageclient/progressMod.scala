package typingsSlinky.vscodeLanguageclient

import typingsSlinky.vscodeLanguageclient.clientMod.BaseLanguageClient
import typingsSlinky.vscodeLanguageclient.clientMod.StaticFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/progress", JSImport.Namespace)
@js.native
object progressMod extends js.Object {
  
  @js.native
  class ProgressFeature protected () extends StaticFeature {
    def this(_client: BaseLanguageClient) = this()
    
    var _client: js.Any = js.native
    
    def initialize(): Unit = js.native
  }
}
