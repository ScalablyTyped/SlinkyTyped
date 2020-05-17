package typingsSlinky.slonik.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripComments extends js.Object {
  var stripComments: js.UndefOr[Boolean] = js.native
}

object StripComments {
  @scala.inline
  def apply(): StripComments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StripComments]
  }
  @scala.inline
  implicit class StripCommentsOps[Self <: StripComments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStripComments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripComments")(js.undefined)
        ret
    }
  }
  
}

