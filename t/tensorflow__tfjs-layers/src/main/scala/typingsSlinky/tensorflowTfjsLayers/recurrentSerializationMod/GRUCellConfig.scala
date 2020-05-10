package typingsSlinky.tensorflowTfjsLayers.recurrentSerializationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GRUCellConfig extends SimpleRNNCellConfig {
  var implementation: js.UndefOr[Double] = js.native
  var recurrent_activation: js.UndefOr[String] = js.native
}

object GRUCellConfig {
  @scala.inline
  def apply(units: Double): GRUCellConfig = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[GRUCellConfig]
  }
  @scala.inline
  implicit class GRUCellConfigOps[Self <: GRUCellConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImplementation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImplementation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementation")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurrent_activation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrent_activation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurrent_activation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrent_activation")(js.undefined)
        ret
    }
  }
  
}

