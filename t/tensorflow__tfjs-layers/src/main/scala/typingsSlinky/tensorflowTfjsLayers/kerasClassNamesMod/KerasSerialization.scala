package typingsSlinky.tensorflowTfjsLayers.kerasClassNamesMod

import typingsSlinky.tensorflowTfjsLayers.constraintConfigMod.ConstraintSerialization
import typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.InitializerSerialization
import typingsSlinky.tensorflowTfjsLayers.layerSerializationMod.LayerSerialization
import typingsSlinky.tensorflowTfjsLayers.optimizerConfigMod.OptimizerSerialization
import typingsSlinky.tensorflowTfjsLayers.regularizerConfigMod.RegularizerSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tensorflowTfjsLayers.layerSerializationMod.LayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.constraintConfigMod.ConstraintSerialization
  - typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.InitializerSerialization
  - typingsSlinky.tensorflowTfjsLayers.regularizerConfigMod.RegularizerSerialization
  - typingsSlinky.tensorflowTfjsLayers.optimizerConfigMod.OptimizerSerialization
*/
trait KerasSerialization extends js.Object

object KerasSerialization {
  @scala.inline
  implicit def apply(value: ConstraintSerialization): KerasSerialization = value.asInstanceOf[KerasSerialization]
  @scala.inline
  implicit def apply(value: InitializerSerialization): KerasSerialization = value.asInstanceOf[KerasSerialization]
  @scala.inline
  implicit def apply(value: LayerSerialization): KerasSerialization = value.asInstanceOf[KerasSerialization]
  @scala.inline
  implicit def apply(value: OptimizerSerialization): KerasSerialization = value.asInstanceOf[KerasSerialization]
  @scala.inline
  implicit def apply(value: RegularizerSerialization): KerasSerialization = value.asInstanceOf[KerasSerialization]
}

