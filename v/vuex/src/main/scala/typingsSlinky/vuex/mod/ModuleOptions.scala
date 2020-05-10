package typingsSlinky.vuex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleOptions extends js.Object {
  var preserveState: js.UndefOr[Boolean] = js.native
}

object ModuleOptions {
  @scala.inline
  def apply(): ModuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModuleOptions]
  }
  @scala.inline
  implicit class ModuleOptionsOps[Self <: ModuleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreserveState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveState")(js.undefined)
        ret
    }
  }
  
}

