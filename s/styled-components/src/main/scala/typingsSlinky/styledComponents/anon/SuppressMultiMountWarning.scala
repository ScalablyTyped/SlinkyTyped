package typingsSlinky.styledComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuppressMultiMountWarning extends js.Object {
  var suppressMultiMountWarning: js.UndefOr[Boolean] = js.native
}

object SuppressMultiMountWarning {
  @scala.inline
  def apply(): SuppressMultiMountWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuppressMultiMountWarning]
  }
  @scala.inline
  implicit class SuppressMultiMountWarningOps[Self <: SuppressMultiMountWarning] (val x: Self) extends AnyVal {
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

