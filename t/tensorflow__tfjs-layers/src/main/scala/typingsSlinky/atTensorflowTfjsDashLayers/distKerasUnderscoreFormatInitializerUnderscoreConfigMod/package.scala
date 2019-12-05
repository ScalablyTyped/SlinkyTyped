package typingsSlinky.atTensorflowTfjsDashLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distKerasUnderscoreFormatInitializerUnderscoreConfigMod {
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Constant
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Identity
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Ones
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Orthogonal
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.RandomNormal
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.RandomUniform
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.TruncatedNormal
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.VarianceScaling
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Zeros
  import typingsSlinky.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTypesMod.BaseSerialization

  type ConstantSerialization = BaseSerialization[Constant, ConstantConfig]
  type IdentitySerialization = BaseSerialization[Identity, IdentityConfig]
  type InitializerClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/initializer_config.InitializerSerialization['class_name'] */ js.Any
  type InitializerSerialization = ZerosSerialization | OnesSerialization | ConstantSerialization | RandomUniformSerialization | RandomNormalSerialization | TruncatedNormalSerialization | IdentitySerialization | VarianceScalingSerialization | OrthogonalSerialization
  type OnesSerialization = BaseSerialization[Ones, js.Object]
  type OrthogonalSerialization = BaseSerialization[Orthogonal, OrthogonalConfig]
  type RandomNormalSerialization = BaseSerialization[RandomNormal, RandomNormalConfig]
  type RandomUniformSerialization = BaseSerialization[RandomUniform, RandomUniformConfig]
  type TruncatedNormalSerialization = BaseSerialization[TruncatedNormal, TruncatedNormalConfig]
  type VarianceScalingSerialization = BaseSerialization[VarianceScaling, VarianceScalingConfig]
  type ZerosSerialization = BaseSerialization[Zeros, js.Object]
}
