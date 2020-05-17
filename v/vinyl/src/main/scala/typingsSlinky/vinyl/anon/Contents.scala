package typingsSlinky.vinyl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Contents extends js.Object {
  var contents: js.UndefOr[Boolean] = js.native
  var deep: js.UndefOr[Boolean] = js.native
}

object Contents {
  @scala.inline
  def apply(): Contents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contents]
  }
  @scala.inline
  implicit class ContentsOps[Self <: Contents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(js.undefined)
        ret
    }
    @scala.inline
    def withDeep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(js.undefined)
        ret
    }
  }
  
}

