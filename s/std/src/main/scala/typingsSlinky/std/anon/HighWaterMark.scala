package typingsSlinky.std.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighWaterMark extends js.Object {
  var highWaterMark: Double = js.native
}

object HighWaterMark {
  @scala.inline
  def apply(highWaterMark: Double): HighWaterMark = {
    val __obj = js.Dynamic.literal(highWaterMark = highWaterMark.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighWaterMark]
  }
  @scala.inline
  implicit class HighWaterMarkOps[Self <: HighWaterMark] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHighWaterMark(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highWaterMark")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

