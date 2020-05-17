package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The raw harvestable minerals */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.screeps.RESOURCE_UTRIUM
  - typingsSlinky.screeps.RESOURCE_LEMERGIUM
  - typingsSlinky.screeps.RESOURCE_KEANIUM
  - typingsSlinky.screeps.RESOURCE_ZYNTHIUM
  - typingsSlinky.screeps.RESOURCE_OXYGEN
  - typingsSlinky.screeps.RESOURCE_HYDROGEN
  - typingsSlinky.screeps.RESOURCE_CATALYST
*/
trait MineralConstant extends ResourceConstant

object MineralConstant {
  @scala.inline
  implicit def apply(value: RESOURCE_CATALYST): MineralConstant = value.asInstanceOf[MineralConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_HYDROGEN): MineralConstant = value.asInstanceOf[MineralConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_KEANIUM): MineralConstant = value.asInstanceOf[MineralConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_LEMERGIUM): MineralConstant = value.asInstanceOf[MineralConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_OXYGEN): MineralConstant = value.asInstanceOf[MineralConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_UTRIUM): MineralConstant = value.asInstanceOf[MineralConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_ZYNTHIUM): MineralConstant = value.asInstanceOf[MineralConstant]
}

