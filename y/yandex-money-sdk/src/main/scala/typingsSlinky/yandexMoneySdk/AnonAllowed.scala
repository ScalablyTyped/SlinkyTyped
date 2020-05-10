package typingsSlinky.yandexMoneySdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllowed extends js.Object {
  var allowed: Boolean = js.native
}

object AnonAllowed {
  @scala.inline
  def apply(allowed: Boolean): AnonAllowed = {
    val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowed]
  }
  @scala.inline
  implicit class AnonAllowedOps[Self <: AnonAllowed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

