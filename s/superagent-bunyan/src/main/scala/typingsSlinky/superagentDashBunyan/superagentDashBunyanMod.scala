package typingsSlinky.superagentDashBunyan

import typingsSlinky.bunyan.bunyanMod.^
import typingsSlinky.superagent.superagentMod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superagent-bunyan", JSImport.Namespace)
@js.native
object superagentDashBunyanMod extends js.Object {
  def apply(logger: ^): Plugin = js.native
  def apply(logger: ^, requestId: String): Plugin = js.native
  def apply(logger: ^, requestId: String, extra: js.Object): Plugin = js.native
}

