package typingsSlinky.simplecrawler.crawlerMod

import typingsSlinky.node.httpMod.Agent
import typingsSlinky.simplecrawler.AnonDictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var agent: Agent | typingsSlinky.node.httpsMod.Agent
  var headers: AnonDictkey
  var host: String
  var method: HTTPMethods
  var port: js.UndefOr[Double] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    agent: Agent | typingsSlinky.node.httpsMod.Agent,
    headers: AnonDictkey,
    host: String,
    method: HTTPMethods,
    port: Int | Double = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

