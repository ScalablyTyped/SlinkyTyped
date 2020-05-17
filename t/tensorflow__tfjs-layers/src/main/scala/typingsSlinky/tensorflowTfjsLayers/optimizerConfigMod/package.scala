package typingsSlinky.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object optimizerConfigMod {
  type AdadeltaSerialization = typingsSlinky.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adadelta, 
    typingsSlinky.tensorflowTfjsLayers.optimizerConfigMod.AdadeltaOptimizerConfig
  ]
  type AdagradSerialization = typingsSlinky.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adagrad, 
    typingsSlinky.tensorflowTfjsLayers.optimizerConfigMod.AdagradOptimizerConfig
  ]
  type AdamSerialization = typingsSlinky.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adam, 
    typingsSlinky.tensorflowTfjsLayers.optimizerConfigMod.AdamOptimizerConfig
  ]
  type AdamaxSerialization = typingsSlinky.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adamax, 
    typingsSlinky.tensorflowTfjsLayers.optimizerConfigMod.AdamaxOptimizerConfig
  ]
  type MomentumSerialization = typingsSlinky.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Momentum, 
    typingsSlinky.tensorflowTfjsLayers.optimizerConfigMod.MomentumOptimizerConfig
  ]
  type RMSPropSerialization = typingsSlinky.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RMSProp, 
    typingsSlinky.tensorflowTfjsLayers.optimizerConfigMod.RMSPropOptimizerConfig
  ]
  type SGDSerialization = typingsSlinky.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SGD, 
    typingsSlinky.tensorflowTfjsLayers.optimizerConfigMod.SGDOptimizerConfig
  ]
}
