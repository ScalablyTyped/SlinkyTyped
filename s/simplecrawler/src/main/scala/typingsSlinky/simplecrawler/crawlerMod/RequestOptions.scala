package typingsSlinky.simplecrawler.crawlerMod

import typingsSlinky.node.httpMod.Agent
import typingsSlinky.simplecrawler.anon.Dictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var agent: Agent | typingsSlinky.node.httpsMod.Agent
  var headers: Dictkey
  var host: String
  var method: HTTPMethods
  var port: js.UndefOr[Double] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    agent: Agent | typingsSlinky.node.httpsMod.Agent,
    headers: Dictkey,
    host: String,
    method: HTTPMethods,
    port: js.UndefOr[Double] = js.undefined
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

