package typingsSlinky.simplecrawler.crawlerMod

import typingsSlinky.node.httpMod.Agent
import typingsSlinky.simplecrawler.anon.Dictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestOptions extends js.Object {
  var agent: Agent | typingsSlinky.node.httpsMod.Agent = js.native
  var headers: Dictkey = js.native
  var host: String = js.native
  var method: HTTPMethods = js.native
  var port: js.UndefOr[Double] = js.native
}

object RequestOptions {
  @scala.inline
  def apply(
    agent: Agent | typingsSlinky.node.httpsMod.Agent,
    headers: Dictkey,
    host: String,
    method: HTTPMethods
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
  @scala.inline
  implicit class RequestOptionsOps[Self <: RequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgent(value: Agent | typingsSlinky.node.httpsMod.Agent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: Dictkey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: HTTPMethods): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
  }
  
}

