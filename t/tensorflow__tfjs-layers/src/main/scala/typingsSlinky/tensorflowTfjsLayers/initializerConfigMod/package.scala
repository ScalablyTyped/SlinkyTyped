package typingsSlinky.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object initializerConfigMod {
  type ConstantSerialization = typingsSlinky.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Constant, 
    typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.ConstantConfig
  ]
  type IdentitySerialization = typingsSlinky.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Identity, 
    typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.IdentityConfig
  ]
  type InitializerClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/initializer_config.InitializerSerialization['class_name'] */ js.Any
  type InitializerSerialization = typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.ZerosSerialization | typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.OnesSerialization | typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.ConstantSerialization | typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.RandomUniformSerialization | typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.RandomNormalSerialization | typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.TruncatedNormalSerialization | typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.IdentitySerialization | typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.VarianceScalingSerialization | typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.OrthogonalSerialization
  type OnesSerialization = typingsSlinky.tensorflowTfjsLayers.typesMod.BaseSerialization[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Ones, js.Object]
  type OrthogonalSerialization = typingsSlinky.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Orthogonal, 
    typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.OrthogonalConfig
  ]
  type RandomNormalSerialization = typingsSlinky.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomNormal, 
    typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.RandomNormalConfig
  ]
  type RandomUniformSerialization = typingsSlinky.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomUniform, 
    typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.RandomUniformConfig
  ]
  type TruncatedNormalSerialization = typingsSlinky.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TruncatedNormal, 
    typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.TruncatedNormalConfig
  ]
  type VarianceScalingSerialization = typingsSlinky.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.VarianceScaling, 
    typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.VarianceScalingConfig
  ]
  type ZerosSerialization = typingsSlinky.tensorflowTfjsLayers.typesMod.BaseSerialization[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Zeros, js.Object]
}
