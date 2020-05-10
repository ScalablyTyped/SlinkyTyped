package typingsSlinky.tensorflowTfjsLayers.initializersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TruncatedNormalArgs extends js.Object {
  /** Mean of the random values to generate. */
  var mean: js.UndefOr[Double] = js.native
  /** Used to seed the random generator. */
  var seed: js.UndefOr[Double] = js.native
  /** Standard deviation of the random values to generate. */
  var stddev: js.UndefOr[Double] = js.native
}

object TruncatedNormalArgs {
  @scala.inline
  def apply(): TruncatedNormalArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TruncatedNormalArgs]
  }
  @scala.inline
  implicit class TruncatedNormalArgsOps[Self <: TruncatedNormalArgs] (val x: Self) extends AnyVal {
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

