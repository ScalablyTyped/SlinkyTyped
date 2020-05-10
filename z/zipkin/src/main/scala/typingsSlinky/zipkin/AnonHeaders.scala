package typingsSlinky.zipkin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHeaders[H] extends js.Object {
  var headers: H with AnonXB3Flags = js.native
}

object AnonHeaders {
  @scala.inline
  def apply[H](headers: H with AnonXB3Flags): AnonHeaders[H] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeaders[H]]
  }
  @scala.inline
  implicit class AnonHeadersOps[Self[h] <: AnonHeaders[h], H] (val x: Self[H]) extends AnyVal {
    @scala.inline
    def duplicate: Self[H] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[H]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[H] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[H] with Other]
    @scala.inline
    def withHeaders(value: H with AnonXB3Flags): Self[H] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

