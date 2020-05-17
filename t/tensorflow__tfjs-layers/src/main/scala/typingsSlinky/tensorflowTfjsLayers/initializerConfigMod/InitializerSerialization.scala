package typingsSlinky.tensorflowTfjsLayers.initializerConfigMod

import typingsSlinky.tensorflowTfjsLayers.kerasClassNamesMod.KerasSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.ZerosSerialization
  - typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.OnesSerialization
  - typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.ConstantSerialization
  - typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.RandomUniformSerialization
  - typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.RandomNormalSerialization
  - typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.TruncatedNormalSerialization
  - typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.IdentitySerialization
  - typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.VarianceScalingSerialization
  - typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.OrthogonalSerialization
*/
trait InitializerSerialization extends KerasSerialization

object InitializerSerialization {
  @scala.inline
  implicit def apply(
    value: ConstantSerialization | IdentitySerialization | OnesSerialization | OrthogonalSerialization | RandomNormalSerialization | RandomUniformSerialization | TruncatedNormalSerialization | VarianceScalingSerialization | ZerosSerialization
  ): InitializerSerialization = value.asInstanceOf[InitializerSerialization]
}

