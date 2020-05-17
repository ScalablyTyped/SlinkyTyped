package typingsSlinky.seen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InertiaBoolean extends js.Object {
  var inertia: js.UndefOr[Boolean] = js.native
}

object InertiaBoolean {
  @scala.inline
  def apply(): InertiaBoolean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InertiaBoolean]
  }
  @scala.inline
  implicit class InertiaBooleanOps[Self <: InertiaBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInertia(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInertia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertia")(js.undefined)
        ret
    }
  }
  
}

