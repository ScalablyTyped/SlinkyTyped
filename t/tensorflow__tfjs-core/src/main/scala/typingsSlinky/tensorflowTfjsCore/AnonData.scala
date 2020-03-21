package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.typesMod.WeightsManifestEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: scala.scalajs.js.typedarray.ArrayBuffer
  var specs: js.Array[WeightsManifestEntry]
}

object AnonData {
  @scala.inline
  def apply(data: scala.scalajs.js.typedarray.ArrayBuffer, specs: js.Array[WeightsManifestEntry]): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], specs = specs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonData]
  }
}

