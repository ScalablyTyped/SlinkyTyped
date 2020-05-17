package typingsSlinky.vis.mod

import typingsSlinky.vis.anon.DrawThreshold
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsScaling extends js.Object {
  var customScalingFunction: js.UndefOr[
    js.Function4[
      /* min */ js.UndefOr[Double], 
      /* max */ js.UndefOr[Double], 
      /* total */ js.UndefOr[Double], 
      /* value */ js.UndefOr[Double], 
      Double
    ]
  ] = js.native
  var label: js.UndefOr[Boolean | DrawThreshold] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
}

object OptionsScaling {
  @scala.inline
  def apply(): OptionsScaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsScaling]
  }
  @scala.inline
  implicit class OptionsScalingOps[Self <: OptionsScaling] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomScalingFunction(
      value: (/* min */ js.UndefOr[Double], /* max */ js.UndefOr[Double], /* total */ js.UndefOr[Double], /* value */ js.UndefOr[Double]) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customScalingFunction")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutCustomScalingFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customScalingFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: Boolean | DrawThreshold): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
  }
  
}

