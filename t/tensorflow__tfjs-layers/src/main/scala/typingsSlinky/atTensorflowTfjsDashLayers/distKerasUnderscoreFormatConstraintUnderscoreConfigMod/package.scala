package typingsSlinky.atTensorflowTfjsDashLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distKerasUnderscoreFormatConstraintUnderscoreConfigMod {
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.MaxNorm
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.MinMaxNorm
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.NonNeg
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.UnitNorm
  import typingsSlinky.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTypesMod.BaseSerialization

  type ConstraintClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/constraint_config.ConstraintSerialization['class_name'] */ js.Any
  type ConstraintSerialization = MaxNormSerialization | NonNegSerialization | UnitNormSerialization | MinMaxNormSerialization
  type MaxNormSerialization = BaseSerialization[MaxNorm, MaxNormConfig]
  type MinMaxNormSerialization = BaseSerialization[MinMaxNorm, MinMaxNormConfig]
  type NonNegSerialization = BaseSerialization[NonNeg, Null]
  type UnitNormSerialization = BaseSerialization[UnitNorm, UnitNormConfig]
}
