package typingsSlinky.serverless

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHttp[T /* <: js.Object */] extends js.Object {
  var http: T | String = js.native
}

object AnonHttp {
  @scala.inline
  def apply[T](http: T | String): AnonHttp[T] = {
    val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHttp[T]]
  }
  @scala.inline
  implicit class AnonHttpOps[Self[t] <: AnonHttp[t], T] (val x: Self[T]) extends AnyVal {
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

