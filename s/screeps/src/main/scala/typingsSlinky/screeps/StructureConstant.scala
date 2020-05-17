package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.screeps.BuildableStructureConstant
  - typingsSlinky.screeps.STRUCTURE_KEEPER_LAIR
  - typingsSlinky.screeps.STRUCTURE_CONTROLLER
  - typingsSlinky.screeps.STRUCTURE_POWER_BANK
  - typingsSlinky.screeps.STRUCTURE_PORTAL
  - typingsSlinky.screeps.STRUCTURE_INVADER_CORE
*/
trait StructureConstant extends EventDestroyType

object StructureConstant {
  @scala.inline
  implicit def apply(value: BuildableStructureConstant): StructureConstant = value.asInstanceOf[StructureConstant]
  @scala.inline
  implicit def apply(value: STRUCTURE_CONTROLLER): StructureConstant = value.asInstanceOf[StructureConstant]
  @scala.inline
  implicit def apply(value: STRUCTURE_INVADER_CORE): StructureConstant = value.asInstanceOf[StructureConstant]
  @scala.inline
  implicit def apply(value: STRUCTURE_KEEPER_LAIR): StructureConstant = value.asInstanceOf[StructureConstant]
  @scala.inline
  implicit def apply(value: STRUCTURE_PORTAL): StructureConstant = value.asInstanceOf[StructureConstant]
  @scala.inline
  implicit def apply(value: STRUCTURE_POWER_BANK): StructureConstant = value.asInstanceOf[StructureConstant]
}

