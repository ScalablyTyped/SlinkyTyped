package typingsSlinky.teenyDashRequest

import typingsSlinky.node.httpMod.Agent
import typingsSlinky.teenyDashRequest.teenyDashRequestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("teeny-request/build/src/agents", JSImport.Namespace)
@js.native
object buildSrcAgentsMod extends js.Object {
  def getAgent(uri: String, reqOpts: Options): js.UndefOr[Agent] = js.native
}

