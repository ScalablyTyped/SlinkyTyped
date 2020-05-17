package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** All the mineral compounds */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.screeps.MineralBaseCompoundsConstant
  - typingsSlinky.screeps.MineralBoostConstant
*/
trait MineralCompoundConstant extends ResourceConstant

object MineralCompoundConstant {
  @scala.inline
  implicit def apply(value: MineralBaseCompoundsConstant): MineralCompoundConstant = value.asInstanceOf[MineralCompoundConstant]
  @scala.inline
  implicit def apply(value: MineralBoostConstant): MineralCompoundConstant = value.asInstanceOf[MineralCompoundConstant]
}

