package typingsSlinky.sparkpost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Updatepublished extends js.Object {
  var update_published: js.UndefOr[Boolean] = js.native
}

object Updatepublished {
  @scala.inline
  def apply(): Updatepublished = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Updatepublished]
  }
  @scala.inline
  implicit class UpdatepublishedOps[Self <: Updatepublished] (val x: Self) extends AnyVal {
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

