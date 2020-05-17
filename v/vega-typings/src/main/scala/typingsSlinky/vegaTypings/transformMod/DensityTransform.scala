package typingsSlinky.vegaTypings.transformMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.utilMod.Vector2
import typingsSlinky.vegaTypings.vegaTypingsStrings.density
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DensityTransform extends Transforms {
  var as: js.UndefOr[(Vector2[String | SignalRef]) | SignalRef] = js.native
  var distribution: js.UndefOr[Distribution | SignalRef] = js.native
  var extent: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.native
  var maxsteps: js.UndefOr[Double | SignalRef] = js.native
  var method: js.UndefOr[DensityMethod | SignalRef] = js.native
  var minsteps: js.UndefOr[Double | SignalRef] = js.native
  var steps: js.UndefOr[Double | SignalRef] = js.native
  var `type`: density = js.native
}

object DensityTransform {
  @scala.inline
  def apply(`type`: density): DensityTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DensityTransform]
  }
  @scala.inline
  implicit class DensityTransformOps[Self <: DensityTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: density): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAs(value: (Vector2[String | SignalRef]) | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.undefined)
        ret
    }
    @scala.inline
    def withDistribution(value: Distribution | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distribution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistribution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distribution")(js.undefined)
        ret
    }
    @scala.inline
    def withExtent(value: (Vector2[Double | SignalRef]) | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxsteps(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxsteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxsteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxsteps")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: DensityMethod | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withMinsteps(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minsteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinsteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minsteps")(js.undefined)
        ret
    }
    @scala.inline
    def withSteps(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(js.undefined)
        ret
    }
  }
  
}

