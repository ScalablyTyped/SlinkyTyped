package typingsSlinky.xstate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoForward extends js.Object {
  var autoForward: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var sync: js.UndefOr[Boolean] = js.native
}

object AutoForward {
  @scala.inline
  def apply(): AutoForward = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoForward]
  }
  @scala.inline
  implicit class AutoForwardOps[Self <: AutoForward] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoForward(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoForward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoForward: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoForward")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(js.undefined)
        ret
    }
  }
  
}

