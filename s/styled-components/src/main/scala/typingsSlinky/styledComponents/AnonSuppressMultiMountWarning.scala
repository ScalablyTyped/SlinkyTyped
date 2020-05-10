package typingsSlinky.styledComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSuppressMultiMountWarning extends js.Object {
  var suppressMultiMountWarning: js.UndefOr[Boolean] = js.native
}

object AnonSuppressMultiMountWarning {
  @scala.inline
  def apply(): AnonSuppressMultiMountWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonSuppressMultiMountWarning]
  }
  @scala.inline
  implicit class AnonSuppressMultiMountWarningOps[Self <: AnonSuppressMultiMountWarning] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuppressMultiMountWarning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressMultiMountWarning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressMultiMountWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressMultiMountWarning")(js.undefined)
        ret
    }
  }
  
}

