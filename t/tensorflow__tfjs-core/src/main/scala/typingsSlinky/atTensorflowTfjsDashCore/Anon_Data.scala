package typingsSlinky.atTensorflowTfjsDashCore

import typingsSlinky.atTensorflowTfjsDashCore.distIoTypesMod.WeightsManifestEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: scala.scalajs.js.typedarray.ArrayBuffer
  var specs: js.Array[WeightsManifestEntry]
}

object Anon_Data {
  @scala.inline
  def apply(data: scala.scalajs.js.typedarray.ArrayBuffer, specs: js.Array[WeightsManifestEntry]): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], specs = specs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Data]
  }
}

