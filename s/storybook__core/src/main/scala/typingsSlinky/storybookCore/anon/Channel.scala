package typingsSlinky.storybookCore.anon

import typingsSlinky.node.NodeModule
import typingsSlinky.storybookClientApi.mod.ConfigApi
import typingsSlinky.storybookCore.typesMod.Loadable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Channel extends js.Object {
  
  var channel: typingsSlinky.storybookAddons.mod.Channel = js.native
  
  var clientApi: typingsSlinky.storybookClientApi.mod.ClientApi = js.native
  
  var configApi: ConfigApi = js.native
  
  def configure(framework: String, loadable: Loadable, m: NodeModule): Unit = js.native
  def configure(framework: String, loadable: Loadable, m: NodeModule, showDeprecationWarning: Boolean): Unit = js.native
  
  def forceReRender(): Unit = js.native
}
