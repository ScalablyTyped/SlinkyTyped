package typingsSlinky.vegaTypings.transformMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.vegaTypingsStrings.force
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForceTransform extends _Transforms {
  var alpha: js.UndefOr[Double | SignalRef] = js.native
  var alphaMin: js.UndefOr[Double | SignalRef] = js.native
  var alphaTarget: js.UndefOr[Double | SignalRef] = js.native
  var forces: js.UndefOr[(js.Array[Force | SignalRef]) | SignalRef] = js.native
  var iterations: js.UndefOr[Double | SignalRef] = js.native
  var restart: js.UndefOr[Boolean | SignalRef] = js.native
  var signal: js.UndefOr[SignalName] = js.native
  var static: js.UndefOr[Boolean | SignalRef] = js.native
  var `type`: force = js.native
  var velocityDecay: js.UndefOr[Double | SignalRef] = js.native
}

object ForceTransform {
  @scala.inline
  def apply(`type`: force): ForceTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceTransform]
  }
  @scala.inline
  implicit class ForceTransformOps[Self <: ForceTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: force): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlpha(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(js.undefined)
        ret
    }
    @scala.inline
    def withAlphaMin(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlphaMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaMin")(js.undefined)
        ret
    }
    @scala.inline
    def withAlphaTarget(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlphaTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withForces(value: (js.Array[Force | SignalRef]) | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forces")(js.undefined)
        ret
    }
    @scala.inline
    def withIterations(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIterations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterations")(js.undefined)
        ret
    }
    @scala.inline
    def withRestart(value: Boolean | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restart")(js.undefined)
        ret
    }
    @scala.inline
    def withSignal(value: SignalName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(js.undefined)
        ret
    }
    @scala.inline
    def withStatic(value: Boolean | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(js.undefined)
        ret
    }
    @scala.inline
    def withVelocityDecay(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocityDecay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVelocityDecay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocityDecay")(js.undefined)
        ret
    }
  }
  
}

