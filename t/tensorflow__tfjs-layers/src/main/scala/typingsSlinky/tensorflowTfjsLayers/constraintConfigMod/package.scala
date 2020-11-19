package typingsSlinky.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object constraintConfigMod {
  
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
