package typingsSlinky.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object advancedActivationSerializationMod {
  
  type AdvancedActivationLayerSerialization = typingsSlinky.tensorflowTfjsLayers.advancedActivationSerializationMod.ReLULayerSerialization | typingsSlinky.tensorflowTfjsLayers.advancedActivationSerializationMod.LeakyReLULayerSerialization | typingsSlinky.tensorflowTfjsLayers.advancedActivationSerializationMod.PReLULayerSerialization | typingsSlinky.tensorflowTfjsLayers.advancedActivationSerializationMod.ELULayerSerialization | typingsSlinky.tensorflowTfjsLayers.advancedActivationSerializationMod.ThresholdedReLULayerSerialization | typingsSlinky.tensorflowTfjsLayers.advancedActivationSerializationMod.SoftmaxLayerSerialization
  
  type ELULayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ELU, 
    typingsSlinky.tensorflowTfjsLayers.advancedActivationSerializationMod.ELULayerConfig
  ]
  
  type LeakyReLULayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LeakyReLU, 
    typingsSlinky.tensorflowTfjsLayers.advancedActivationSerializationMod.LeakyReLULayerConfig
  ]
  
  type PReLULayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.PReLU, 
    typingsSlinky.tensorflowTfjsLayers.advancedActivationSerializationMod.PReLULayerConfig
  ]
  
  type ReLULayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ReLU, 
    typingsSlinky.tensorflowTfjsLayers.advancedActivationSerializationMod.ReLULayerConfig
  ]
  
  type SoftmaxLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Softmax, 
    typingsSlinky.tensorflowTfjsLayers.advancedActivationSerializationMod.SoftmaxLayerConfig
  ]
  
  type ThresholdedReLULayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ThresholdedReLU, 
    typingsSlinky.tensorflowTfjsLayers.advancedActivationSerializationMod.ThresholdedReLULayerConfig
  ]
}
