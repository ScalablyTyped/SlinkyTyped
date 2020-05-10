package typingsSlinky.slackMock.mod

import typingsSlinky.ws.mod.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RtmCall[T] extends js.Object {
  var message: T = js.native
  var rawMessage: Data = js.native
  var token: String = js.native
}

object RtmCall {
  @scala.inline
  def apply[T](message: T, rawMessage: Data, token: String): RtmCall[T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], rawMessage = rawMessage.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[RtmCall[T]]
  }
  @scala.inline
  implicit class RtmCallOps[Self[t] <: RtmCall[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withMessage(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawMessageArrayBuffer(value: js.typedarray.ArrayBuffer): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawMessage(value: Data): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

