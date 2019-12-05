package typingsSlinky.atTensorflowTfjsDashCore.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PixelData extends js.Object {
  var data: scala.scalajs.js.typedarray.Uint8Array
  var height: Double
  var width: Double
}

object PixelData {
  @scala.inline
  def apply(data: scala.scalajs.js.typedarray.Uint8Array, height: Double, width: Double): PixelData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PixelData]
  }
}

