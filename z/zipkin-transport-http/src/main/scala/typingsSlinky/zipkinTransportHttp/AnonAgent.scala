package typingsSlinky.zipkinTransportHttp

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.urlMod.URL_
import typingsSlinky.zipkin.mod.JsonEncoder_
import typingsSlinky.zipkinTransportHttp.mod.Agent
import typingsSlinky.zipkinTransportHttp.mod.ErrorLogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAgent extends js.Object {
  var agent: js.UndefOr[Agent | (js.Function1[/* url */ URL_, Agent])] = js.native
  var endpoint: String = js.native
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  var httpInterval: js.UndefOr[Double] = js.native
  var jsonEncoder: js.UndefOr[JsonEncoder_] = js.native
  var log: js.UndefOr[ErrorLogger] = js.native
  var maxPayloadSize: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object AnonAgent {
  @scala.inline
  def apply(endpoint: String): AnonAgent = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAgent]
  }
  @scala.inline
  implicit class AnonAgentOps[Self <: AnonAgent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAgentFunction1(value: /* url */ URL_ => Agent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAgent(value: Agent | (js.Function1[/* url */ URL_, Agent])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withJsonEncoder(value: JsonEncoder_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonEncoder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonEncoder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonEncoder")(js.undefined)
        ret
    }
    @scala.inline
    def withLog(value: ErrorLogger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPayloadSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPayloadSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPayloadSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPayloadSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

