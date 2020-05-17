package typingsSlinky.wrapAnsi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hard extends js.Object {
  var hard: js.UndefOr[Boolean] = js.native
  var trim: js.UndefOr[Boolean] = js.native
  var wordWrap: js.UndefOr[Boolean] = js.native
}

object Hard {
  @scala.inline
  def apply(): Hard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hard]
  }
  @scala.inline
  implicit class HardOps[Self <: Hard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hard")(js.undefined)
        ret
    }
    @scala.inline
    def withTrim(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(js.undefined)
        ret
    }
    @scala.inline
    def withWordWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrap")(js.undefined)
        ret
    }
  }
  
}

