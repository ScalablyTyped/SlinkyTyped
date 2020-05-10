package typingsSlinky.smoothScrollbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGet extends js.Object {
  def get(): js.Any = js.native
}

object AnonGet {
  @scala.inline
  def apply(get: () => js.Any): AnonGet = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get))
    __obj.asInstanceOf[AnonGet]
  }
  @scala.inline
  implicit class AnonGetOps[Self <: AnonGet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

