package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The compounds which can't boost */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.screeps.RESOURCE_HYDROXIDE
  - typingsSlinky.screeps.RESOURCE_ZYNTHIUM_KEANITE
  - typingsSlinky.screeps.RESOURCE_UTRIUM_LEMERGITE
  - typingsSlinky.screeps.RESOURCE_GHODIUM
*/
trait MineralBaseCompoundsConstant extends MineralCompoundConstant

object MineralBaseCompoundsConstant {
  @scala.inline
  implicit def apply(value: RESOURCE_GHODIUM): MineralBaseCompoundsConstant = value.asInstanceOf[MineralBaseCompoundsConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_HYDROXIDE): MineralBaseCompoundsConstant = value.asInstanceOf[MineralBaseCompoundsConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_UTRIUM_LEMERGITE): MineralBaseCompoundsConstant = value.asInstanceOf[MineralBaseCompoundsConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_ZYNTHIUM_KEANITE): MineralBaseCompoundsConstant = value.asInstanceOf[MineralBaseCompoundsConstant]
}

