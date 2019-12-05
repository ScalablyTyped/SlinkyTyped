package typingsSlinky.atTensorflowTfjsDashLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distKerasUnderscoreFormatTopologyUnderscoreConfigMod {
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.batch_input_shape
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.batch_size
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.dtype
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.input_dtype
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.input_shape
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.name
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.trainable
  import typingsSlinky.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTypesMod.PyJson
  import typingsSlinky.std.Extract

  type JsonLayer[C /* <: LayerConfig */] = C with LayerConfig with (PyJson[
    Extract[
      input_shape | batch_input_shape | batch_size | dtype | name | trainable | input_dtype | String, 
      String
    ]
  ])
}
