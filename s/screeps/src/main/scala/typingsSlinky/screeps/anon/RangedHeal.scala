package typingsSlinky.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangedHeal extends js.Object {
  var heal: typingsSlinky.screeps.screepsNumbers.`3`
  var rangedHeal: typingsSlinky.screeps.screepsNumbers.`3`
}

object RangedHeal {
  @scala.inline
  def apply(
    heal: typingsSlinky.screeps.screepsNumbers.`3`,
    rangedHeal: typingsSlinky.screeps.screepsNumbers.`3`
  ): RangedHeal = {
    val __obj = js.Dynamic.literal(heal = heal.asInstanceOf[js.Any], rangedHeal = rangedHeal.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangedHeal]
  }
}

