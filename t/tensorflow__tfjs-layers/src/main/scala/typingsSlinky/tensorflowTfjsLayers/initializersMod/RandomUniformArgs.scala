package typingsSlinky.tensorflowTfjsLayers.initializersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandomUniformArgs extends js.Object {
  /** Upper bound of the range of random values to generate. */
  var maxval: js.UndefOr[Double] = js.native
  /** Lower bound of the range of random values to generate. */
  var minval: js.UndefOr[Double] = js.native
  /** Used to seed the random generator. */
  var seed: js.UndefOr[Double] = js.native
}

object RandomUniformArgs {
  @scala.inline
  def apply(): RandomUniformArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RandomUniformArgs]
  }
  @scala.inline
  implicit class RandomUniformArgsOps[Self <: RandomUniformArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxval")(js.undefined)
        ret
    }
    @scala.inline
    def withMinval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minval")(js.undefined)
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
  }
  
}

