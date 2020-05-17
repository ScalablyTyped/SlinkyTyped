package typingsSlinky.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsNeedRender extends js.Object {
  var isNeedRender: Boolean = js.native
}

object IsNeedRender {
  @scala.inline
  def apply(isNeedRender: Boolean): IsNeedRender = {
    val __obj = js.Dynamic.literal(isNeedRender = isNeedRender.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsNeedRender]
  }
  @scala.inline
  implicit class IsNeedRenderOps[Self <: IsNeedRender] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsNeedRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNeedRender")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

