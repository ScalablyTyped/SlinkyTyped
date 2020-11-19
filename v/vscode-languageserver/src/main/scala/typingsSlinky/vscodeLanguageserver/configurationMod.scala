package typingsSlinky.vscodeLanguageserver

import typingsSlinky.vscodeLanguageserver.mod.Feature
import typingsSlinky.vscodeLanguageserver.mod._RemoteWorkspace
import typingsSlinky.vscodeLanguageserverProtocol.protocolConfigurationMod.ConfigurationItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver/lib/configuration", JSImport.Namespace)
@js.native
object configurationMod extends js.Object {
  
  val ConfigurationFeature: Feature[_RemoteWorkspace, Configuration] = js.native
  
  @js.native
  trait Configuration extends js.Object {
    
    def getConfiguration(): js.Promise[_] = js.native
    def getConfiguration(items: js.Array[ConfigurationItem]): js.Promise[js.Array[_]] = js.native
    def getConfiguration(item: ConfigurationItem): js.Promise[_] = js.native
    def getConfiguration(section: String): js.Promise[_] = js.native
  }
}
