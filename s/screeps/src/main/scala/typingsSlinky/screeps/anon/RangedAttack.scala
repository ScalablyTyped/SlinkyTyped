package typingsSlinky.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangedAttack extends js.Object {
  var rangedAttack: typingsSlinky.screeps.screepsNumbers.`2`
  var rangedMassAttack: typingsSlinky.screeps.screepsNumbers.`2`
}

object RangedAttack {
  @scala.inline
  def apply(
    rangedAttack: typingsSlinky.screeps.screepsNumbers.`2`,
    rangedMassAttack: typingsSlinky.screeps.screepsNumbers.`2`
  ): RangedAttack = {
    val __obj = js.Dynamic.literal(rangedAttack = rangedAttack.asInstanceOf[js.Any], rangedMassAttack = rangedMassAttack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangedAttack]
  }
}

