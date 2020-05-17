package typingsSlinky.typedoc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Begin extends js.Object {
  var begin: js.UndefOr[js.Any] = js.native
  var end: js.UndefOr[js.Any] = js.native
}

object Begin {
  @scala.inline
  def apply(): Begin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Begin]
  }
  @scala.inline
  implicit class BeginOps[Self <: Begin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBegin(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBegin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
  }
  
}

