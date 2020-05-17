package typingsSlinky.tensorflowTfjsNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateSaved extends js.Object {
  var dateSaved: js.Date = js.native
  var modelTopologyBytes: Double = js.native
  var modelTopologyType: String = js.native
  var weightDataBytes: Double = js.native
  var weightSpecsBytes: Double = js.native
}

object DateSaved {
  @scala.inline
  def apply(
    dateSaved: js.Date,
    modelTopologyBytes: Double,
    modelTopologyType: String,
    weightDataBytes: Double,
    weightSpecsBytes: Double
  ): DateSaved = {
    val __obj = js.Dynamic.literal(dateSaved = dateSaved.asInstanceOf[js.Any], modelTopologyBytes = modelTopologyBytes.asInstanceOf[js.Any], modelTopologyType = modelTopologyType.asInstanceOf[js.Any], weightDataBytes = weightDataBytes.asInstanceOf[js.Any], weightSpecsBytes = weightSpecsBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateSaved]
  }
  @scala.inline
  implicit class DateSavedOps[Self <: DateSaved] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateSaved(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateSaved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelTopologyBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelTopologyBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelTopologyType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelTopologyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeightDataBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightDataBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeightSpecsBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightSpecsBytes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

