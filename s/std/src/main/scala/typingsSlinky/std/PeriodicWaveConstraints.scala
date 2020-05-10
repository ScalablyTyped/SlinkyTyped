package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeriodicWaveConstraints extends js.Object {
  var disableNormalization: js.UndefOr[scala.Boolean] = js.native
}

object PeriodicWaveConstraints {
  @scala.inline
  def apply(): PeriodicWaveConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeriodicWaveConstraints]
  }
  @scala.inline
  implicit class PeriodicWaveConstraintsOps[Self <: PeriodicWaveConstraints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableNormalization(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableNormalization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableNormalization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableNormalization")(js.undefined)
        ret
    }
  }
  
}

