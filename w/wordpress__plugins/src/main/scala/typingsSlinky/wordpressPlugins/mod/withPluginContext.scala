package typingsSlinky.wordpressPlugins.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/plugins", "withPluginContext")
@js.native
object withPluginContext extends js.Object {
  
  def apply[CP, OP](mapContextToProps: js.Function2[/* context */ PluginContext, /* props */ OP, CP]): js.Function1[/* Component */ ReactComponentClass[CP with OP], ReactComponentClass[OP]] = js.native
}
