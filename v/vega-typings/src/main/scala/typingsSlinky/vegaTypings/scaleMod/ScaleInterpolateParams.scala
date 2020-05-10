package typingsSlinky.vegaTypings.scaleMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.vegaTypingsStrings.`cubehelix-long`
import typingsSlinky.vegaTypings.vegaTypingsStrings.cubehelix
import typingsSlinky.vegaTypings.vegaTypingsStrings.rgb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleInterpolateParams extends ScaleInterpolate {
  var gamma: js.UndefOr[Double | SignalRef] = js.native
  var `type`: rgb | cubehelix | `cubehelix-long` | SignalRef = js.native
}

object ScaleInterpolateParams {
  @scala.inline
  def apply(`type`: rgb | cubehelix | `cubehelix-long` | SignalRef): ScaleInterpolateParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleInterpolateParams]
  }
  @scala.inline
  implicit class ScaleInterpolateParamsOps[Self <: ScaleInterpolateParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: rgb | cubehelix | `cubehelix-long` | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGamma(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamma")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGamma: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamma")(js.undefined)
        ret
    }
  }
  
}

