package typingsSlinky.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUpdatepublished extends js.Object {
  var update_published: js.UndefOr[Boolean] = js.native
}

object AnonUpdatepublished {
  @scala.inline
  def apply(): AnonUpdatepublished = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonUpdatepublished]
  }
  @scala.inline
  implicit class AnonUpdatepublishedOps[Self <: AnonUpdatepublished] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpdate_published(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update_published")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate_published: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update_published")(js.undefined)
        ret
    }
  }
  
}

