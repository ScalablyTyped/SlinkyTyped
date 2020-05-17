package typingsSlinky.tensorflowTfjsLayers.optimizerConfigMod

import typingsSlinky.tensorflowTfjsLayers.kerasClassNamesMod.KerasSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tensorflowTfjsLayers.optimizerConfigMod.AdadeltaSerialization
  - typingsSlinky.tensorflowTfjsLayers.optimizerConfigMod.AdagradSerialization
  - typingsSlinky.tensorflowTfjsLayers.optimizerConfigMod.AdamSerialization
  - typingsSlinky.tensorflowTfjsLayers.optimizerConfigMod.AdamaxSerialization
  - typingsSlinky.tensorflowTfjsLayers.optimizerConfigMod.MomentumSerialization
  - typingsSlinky.tensorflowTfjsLayers.optimizerConfigMod.RMSPropSerialization
  - typingsSlinky.tensorflowTfjsLayers.optimizerConfigMod.SGDSerialization
*/
trait OptimizerSerialization extends KerasSerialization

object OptimizerSerialization {
  @scala.inline
  implicit def apply(
    value: AdadeltaSerialization | AdagradSerialization | AdamSerialization | AdamaxSerialization | MomentumSerialization | RMSPropSerialization | SGDSerialization
  ): OptimizerSerialization = value.asInstanceOf[OptimizerSerialization]
}

