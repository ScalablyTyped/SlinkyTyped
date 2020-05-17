package typingsSlinky.zipkin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Headers[H] extends js.Object {
  var headers: H with XB3Flags = js.native
}

object Headers {
  @scala.inline
  def apply[H](headers: H with XB3Flags): Headers[H] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers[H]]
  }
  @scala.inline
  implicit class HeadersOps[Self[h] <: Headers[h], H] (val x: Self[H]) extends AnyVal {
    @scala.inline
    def duplicate: Self[H] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[H]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[H] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[H] with Other]
    @scala.inline
    def withHeaders(value: H with XB3Flags): Self[H] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

