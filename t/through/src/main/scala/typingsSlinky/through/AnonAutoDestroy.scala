package typingsSlinky.through

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAutoDestroy extends js.Object {
  var autoDestroy: Boolean = js.native
}

object AnonAutoDestroy {
  @scala.inline
  def apply(autoDestroy: Boolean): AnonAutoDestroy = {
    val __obj = js.Dynamic.literal(autoDestroy = autoDestroy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoDestroy]
  }
  @scala.inline
  implicit class AnonAutoDestroyOps[Self <: AnonAutoDestroy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoDestroy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDestroy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

