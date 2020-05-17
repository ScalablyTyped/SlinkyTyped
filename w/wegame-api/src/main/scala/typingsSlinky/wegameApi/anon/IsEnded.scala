package typingsSlinky.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsEnded extends js.Object {
  var isEnded: Boolean = js.native
}

object IsEnded {
  @scala.inline
  def apply(isEnded: Boolean): IsEnded = {
    val __obj = js.Dynamic.literal(isEnded = isEnded.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsEnded]
  }
  @scala.inline
  implicit class IsEndedOps[Self <: IsEnded] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsEnded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnded")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

