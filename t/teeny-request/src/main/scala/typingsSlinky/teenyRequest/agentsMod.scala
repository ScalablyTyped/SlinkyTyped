package typingsSlinky.teenyRequest

import typingsSlinky.node.httpMod.Agent
import typingsSlinky.std.Map
import typingsSlinky.teenyRequest.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("teeny-request/build/src/agents", JSImport.Namespace)
@js.native
object agentsMod extends js.Object {
  val pool: Map[String, Agent] = js.native
  def getAgent(uri: String, reqOpts: Options): js.UndefOr[HttpAnyAgent] = js.native
  type HttpAnyAgent = Agent | typingsSlinky.node.httpsMod.Agent
}

