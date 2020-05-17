package typingsSlinky.tensorflowTfjsLayers.constraintConfigMod

import typingsSlinky.tensorflowTfjsLayers.kerasClassNamesMod.KerasSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tensorflowTfjsLayers.constraintConfigMod.MaxNormSerialization
  - typingsSlinky.tensorflowTfjsLayers.constraintConfigMod.NonNegSerialization
  - typingsSlinky.tensorflowTfjsLayers.constraintConfigMod.UnitNormSerialization
  - typingsSlinky.tensorflowTfjsLayers.constraintConfigMod.MinMaxNormSerialization
*/
trait ConstraintSerialization extends KerasSerialization

object ConstraintSerialization {
  @scala.inline
  implicit def apply(
    value: MaxNormSerialization | MinMaxNormSerialization | NonNegSerialization | UnitNormSerialization
  ): ConstraintSerialization = value.asInstanceOf[ConstraintSerialization]
}

