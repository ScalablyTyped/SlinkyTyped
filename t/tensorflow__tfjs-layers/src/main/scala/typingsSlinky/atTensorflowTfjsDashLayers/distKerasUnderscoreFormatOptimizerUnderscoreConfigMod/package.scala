package typingsSlinky.atTensorflowTfjsDashLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distKerasUnderscoreFormatOptimizerUnderscoreConfigMod {
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Adadelta
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Adagrad
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Adam
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Adamax
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Momentum
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.RMSProp
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.SGD
  import typingsSlinky.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTypesMod.BaseSerialization

  type AdadeltaSerialization = BaseSerialization[Adadelta, AdadeltaOptimizerConfig]
  type AdagradSerialization = BaseSerialization[Adagrad, AdagradOptimizerConfig]
  type AdamSerialization = BaseSerialization[Adam, AdamOptimizerConfig]
  type AdamaxSerialization = BaseSerialization[Adamax, AdamaxOptimizerConfig]
  type MomentumSerialization = BaseSerialization[Momentum, MomentumOptimizerConfig]
  type OptimizerClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/optimizer_config.OptimizerSerialization['class_name'] */ js.Any
  type OptimizerSerialization = AdadeltaSerialization | AdagradSerialization | AdamSerialization | AdamaxSerialization | MomentumSerialization | RMSPropSerialization | SGDSerialization
  type RMSPropSerialization = BaseSerialization[RMSProp, RMSPropOptimizerConfig]
  type SGDSerialization = BaseSerialization[SGD, SGDOptimizerConfig]
}
