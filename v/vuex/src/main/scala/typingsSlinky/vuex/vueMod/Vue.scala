package typingsSlinky.vuex.vueMod

import typingsSlinky.vuex.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vue extends js.Object {
  @JSName("$store")
  var $store: Store[_] = js.native
}

object Vue {
  @scala.inline
  def apply($store: Store[_]): Vue = {
    val __obj = js.Dynamic.literal($store = $store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vue]
  }
  @scala.inline
  implicit class VueOps[Self <: Vue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$store(value: Store[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$store")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

