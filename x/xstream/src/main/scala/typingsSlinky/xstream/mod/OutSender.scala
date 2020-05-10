package typingsSlinky.xstream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutSender[T] extends js.Object {
  var out: Stream[T] = js.native
}

object OutSender {
  @scala.inline
  def apply[T](out: Stream[T]): OutSender[T] = {
    val __obj = js.Dynamic.literal(out = out.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutSender[T]]
  }
  @scala.inline
  implicit class OutSenderOps[Self[t] <: OutSender[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withOut(value: Stream[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

