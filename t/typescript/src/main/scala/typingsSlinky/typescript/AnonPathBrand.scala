package typingsSlinky.typescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPathBrand extends js.Object {
  var __pathBrand: js.Any = js.native
}

object AnonPathBrand {
  @scala.inline
  def apply(__pathBrand: js.Any): AnonPathBrand = {
    val __obj = js.Dynamic.literal(__pathBrand = __pathBrand.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPathBrand]
  }
  @scala.inline
  implicit class AnonPathBrandOps[Self <: AnonPathBrand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__pathBrand(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__pathBrand")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

