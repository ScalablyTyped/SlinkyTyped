package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Resource Constants
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.screeps.RESOURCE_ENERGY
  - typingsSlinky.screeps.RESOURCE_POWER
  - typingsSlinky.screeps.RESOURCE_OPS
  - typingsSlinky.screeps.MineralConstant
  - typingsSlinky.screeps.MineralCompoundConstant
  - typingsSlinky.screeps.DepositConstant
  - typingsSlinky.screeps.CommodityConstant
*/
trait ResourceConstant extends MarketResourceConstant

object ResourceConstant {
  @scala.inline
  implicit def apply(value: CommodityConstant): ResourceConstant = value.asInstanceOf[ResourceConstant]
  @scala.inline
  implicit def apply(value: DepositConstant): ResourceConstant = value.asInstanceOf[ResourceConstant]
  @scala.inline
  implicit def apply(value: MineralCompoundConstant): ResourceConstant = value.asInstanceOf[ResourceConstant]
  @scala.inline
  implicit def apply(value: MineralConstant): ResourceConstant = value.asInstanceOf[ResourceConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_ENERGY): ResourceConstant = value.asInstanceOf[ResourceConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_OPS): ResourceConstant = value.asInstanceOf[ResourceConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_POWER): ResourceConstant = value.asInstanceOf[ResourceConstant]
}

