package typingsSlinky.tensorflowTfjsLayers.initializerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandomNormalConfig extends js.Object {
  var mean: js.UndefOr[Double] = js.native
  var seed: js.UndefOr[Double] = js.native
  var stddev: js.UndefOr[Double] = js.native
}

object RandomNormalConfig {
  @scala.inline
  def apply(): RandomNormalConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RandomNormalConfig]
  }
  @scala.inline
  implicit class RandomNormalConfigOps[Self <: RandomNormalConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMean(value: Double): Self = {
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
    def withSeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(js.undefined)
        ret
    }
    @scala.inline
    def withStddev(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stddev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStddev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stddev")(js.undefined)
        ret
    }
  }
  
}

