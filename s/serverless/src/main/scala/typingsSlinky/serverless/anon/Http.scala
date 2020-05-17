package typingsSlinky.serverless.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Http[T /* <: js.Object */] extends js.Object {
  var http: T | String = js.native
}

object Http {
  @scala.inline
  def apply[T](http: T | String): Http[T] = {
    val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any])
    __obj.asInstanceOf[Http[T]]
  }
  @scala.inline
  implicit class HttpOps[Self[t] <: Http[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withHttp(value: T | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

