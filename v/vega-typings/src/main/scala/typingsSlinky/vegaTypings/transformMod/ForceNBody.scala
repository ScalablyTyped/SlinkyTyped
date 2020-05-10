package typingsSlinky.vegaTypings.transformMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.vegaTypingsStrings.nbody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForceNBody extends Force {
  var distanceMax: js.UndefOr[Double | SignalRef] = js.native
  var distanceMin: js.UndefOr[Double | SignalRef] = js.native
  var force: nbody = js.native
  var strength: js.UndefOr[Double | SignalRef] = js.native
  var theta: js.UndefOr[Double | SignalRef] = js.native
}

object ForceNBody {
  @scala.inline
  def apply(force: nbody): ForceNBody = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceNBody]
  }
  @scala.inline
  implicit class ForceNBodyOps[Self <: ForceNBody] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForce(value: nbody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistanceMax(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistanceMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceMax")(js.undefined)
        ret
    }
    @scala.inline
    def withDistanceMin(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistanceMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceMin")(js.undefined)
        ret
    }
    @scala.inline
    def withStrength(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strength")(js.undefined)
        ret
    }
    @scala.inline
    def withTheta(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theta")(js.undefined)
        ret
    }
  }
  
}

