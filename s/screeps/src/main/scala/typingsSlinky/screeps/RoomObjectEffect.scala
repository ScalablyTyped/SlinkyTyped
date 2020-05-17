package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Discriminated union of possible effects on `effect`
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.screeps.NaturalEffect
  - typingsSlinky.screeps.PowerEffect
*/
trait RoomObjectEffect extends js.Object

object RoomObjectEffect {
  @scala.inline
  implicit def apply(value: NaturalEffect): RoomObjectEffect = value.asInstanceOf[RoomObjectEffect]
  @scala.inline
  implicit def apply(value: PowerEffect): RoomObjectEffect = value.asInstanceOf[RoomObjectEffect]
}

