package typingsSlinky.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Allvoices extends js.Object {
  var all_voices: js.UndefOr[Boolean] = js.native
}

object Allvoices {
  @scala.inline
  def apply(): Allvoices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Allvoices]
  }
  @scala.inline
  implicit class AllvoicesOps[Self <: Allvoices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll_voices(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all_voices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAll_voices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all_voices")(js.undefined)
        ret
    }
  }
  
}

