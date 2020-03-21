package typingsSlinky.tensorflowTfjsNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDateSaved extends js.Object {
  var dateSaved: js.Date
  var modelTopologyBytes: Double
  var modelTopologyType: String
  var weightDataBytes: Double
  var weightSpecsBytes: Double
}

object AnonDateSaved {
  @scala.inline
  def apply(
    dateSaved: js.Date,
    modelTopologyBytes: Double,
    modelTopologyType: String,
    weightDataBytes: Double,
    weightSpecsBytes: Double
  ): AnonDateSaved = {
    val __obj = js.Dynamic.literal(dateSaved = dateSaved.asInstanceOf[js.Any], modelTopologyBytes = modelTopologyBytes.asInstanceOf[js.Any], modelTopologyType = modelTopologyType.asInstanceOf[js.Any], weightDataBytes = weightDataBytes.asInstanceOf[js.Any], weightSpecsBytes = weightSpecsBytes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDateSaved]
  }
}

