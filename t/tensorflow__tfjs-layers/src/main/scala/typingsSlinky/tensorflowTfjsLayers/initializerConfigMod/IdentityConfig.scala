package typingsSlinky.tensorflowTfjsLayers.initializerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityConfig extends js.Object {
  var gain: js.UndefOr[Double] = js.native
}

object IdentityConfig {
  @scala.inline
  def apply(): IdentityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityConfig]
  }
  @scala.inline
  implicit class IdentityConfigOps[Self <: IdentityConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGain(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gain")(js.undefined)
        ret
    }
  }
  
}

