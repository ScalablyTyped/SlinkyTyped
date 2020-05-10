package typingsSlinky.vegaTypings.transformMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.vegaTypingsStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionNormal extends Distribution {
  var function: normal = js.native
  var mean: js.UndefOr[Double | SignalRef] = js.native
  var stdev: js.UndefOr[Double | SignalRef] = js.native
}

object DistributionNormal {
  @scala.inline
  def apply(function: normal): DistributionNormal = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionNormal]
  }
  @scala.inline
  implicit class DistributionNormalOps[Self <: DistributionNormal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFunction(value: normal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("function")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMean(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mean")(js.undefined)
        ret
    }
    @scala.inline
    def withStdev(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdev")(js.undefined)
        ret
    }
  }
  
}

