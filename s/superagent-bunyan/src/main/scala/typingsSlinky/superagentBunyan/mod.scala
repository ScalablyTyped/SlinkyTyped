package typingsSlinky.superagentBunyan

import typingsSlinky.bunyan.mod.^
import typingsSlinky.superagent.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superagent-bunyan", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(logger: ^): Plugin = js.native
  def apply(logger: ^, requestId: js.UndefOr[scala.Nothing], extra: js.Object): Plugin = js.native
  def apply(logger: ^, requestId: String): Plugin = js.native
  def apply(logger: ^, requestId: String, extra: js.Object): Plugin = js.native
}
