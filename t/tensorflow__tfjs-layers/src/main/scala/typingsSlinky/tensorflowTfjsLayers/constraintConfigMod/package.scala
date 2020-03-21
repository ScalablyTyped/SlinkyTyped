package typingsSlinky.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object constraintConfigMod {
  type ConstraintClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/constraint_config.ConstraintSerialization['class_name'] */ js.Any
  type ConstraintSerialization = typingsSlinky.tensorflowTfjsLayers.constraintConfigMod.MaxNormSerialization | typingsSlinky.tensorflowTfjsLayers.constraintConfigMod.NonNegSerialization | typingsSlinky.tensorflowTfjsLayers.constraintConfigMod.UnitNormSerialization | typingsSlinky.tensorflowTfjsLayers.constraintConfigMod.MinMaxNormSerialization
  type MaxNormSerialization = typingsSlinky.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxNorm, 
    typingsSlinky.tensorflowTfjsLayers.constraintConfigMod.MaxNormConfig
  ]
  type MinMaxNormSerialization = typingsSlinky.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MinMaxNorm, 
    typingsSlinky.tensorflowTfjsLayers.constraintConfigMod.MinMaxNormConfig
  ]
  type NonNegSerialization = typingsSlinky.tensorflowTfjsLayers.typesMod.BaseSerialization[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.NonNeg, scala.Null]
  type UnitNormSerialization = typingsSlinky.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UnitNorm, 
    typingsSlinky.tensorflowTfjsLayers.constraintConfigMod.UnitNormConfig
  ]
}
