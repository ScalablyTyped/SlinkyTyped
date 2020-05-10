package typingsSlinky.tensorflowTfjsLayers.initializersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrthogonalArgs extends SeedOnlyInitializerArgs {
  /**
    * Multiplicative factor to apply to the orthogonal matrix. Defaults to 1.
    */
  var gain: js.UndefOr[Double] = js.native
}

object OrthogonalArgs {
  @scala.inline
  def apply(): OrthogonalArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrthogonalArgs]
  }
  @scala.inline
  implicit class OrthogonalArgsOps[Self <: OrthogonalArgs] (val x: Self) extends AnyVal {
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

