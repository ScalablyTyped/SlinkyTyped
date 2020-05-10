package typingsSlinky.vueLs.mod.vueTypesVueAugmentingMod

import typingsSlinky.vueLs.mod.WebStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vue extends js.Object {
  @JSName("$ls")
  var $ls: WebStorage = js.native
}

object Vue {
  @scala.inline
  def apply($ls: WebStorage): Vue = {
    val __obj = js.Dynamic.literal($ls = $ls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vue]
  }
  @scala.inline
  implicit class VueOps[Self <: Vue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$ls(value: WebStorage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$ls")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

