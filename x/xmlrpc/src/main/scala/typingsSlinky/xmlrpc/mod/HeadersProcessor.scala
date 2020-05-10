package typingsSlinky.xmlrpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeadersProcessor extends js.Object {
  def composeRequest(headers: Headers): Unit = js.native
  def parseResponse(headers: Headers): Unit = js.native
}

object HeadersProcessor {
  @scala.inline
  def apply(composeRequest: Headers => Unit, parseResponse: Headers => Unit): HeadersProcessor = {
    val __obj = js.Dynamic.literal(composeRequest = js.Any.fromFunction1(composeRequest), parseResponse = js.Any.fromFunction1(parseResponse))
    __obj.asInstanceOf[HeadersProcessor]
  }
  @scala.inline
  implicit class HeadersProcessorOps[Self <: HeadersProcessor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComposeRequest(value: Headers => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composeRequest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParseResponse(value: Headers => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseResponse")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

