package typingsSlinky.screeps.anon

import typingsSlinky.screeps.screepsNumbers.`100`
import typingsSlinky.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelPeriod extends js.Object {
  var className: operator
  var cooldown: `100`
  var duration: `100`
  var effect: js.Tuple5[
    typingsSlinky.screeps.screepsNumbers.`2`, 
    typingsSlinky.screeps.screepsNumbers.`4`, 
    typingsSlinky.screeps.screepsNumbers.`6`, 
    typingsSlinky.screeps.screepsNumbers.`8`, 
    typingsSlinky.screeps.screepsNumbers.`10`
  ]
  var level: js.Tuple5[
    typingsSlinky.screeps.screepsNumbers.`10`, 
    typingsSlinky.screeps.screepsNumbers.`11`, 
    typingsSlinky.screeps.screepsNumbers.`12`, 
    typingsSlinky.screeps.screepsNumbers.`14`, 
    typingsSlinky.screeps.screepsNumbers.`22`
  ]
  var period: typingsSlinky.screeps.screepsNumbers.`10`
  var range: typingsSlinky.screeps.screepsNumbers.`3`
}

object LevelPeriod {
  @scala.inline
  def apply(
    className: operator,
    cooldown: `100`,
    duration: `100`,
    effect: js.Tuple5[
      typingsSlinky.screeps.screepsNumbers.`2`, 
      typingsSlinky.screeps.screepsNumbers.`4`, 
      typingsSlinky.screeps.screepsNumbers.`6`, 
      typingsSlinky.screeps.screepsNumbers.`8`, 
      typingsSlinky.screeps.screepsNumbers.`10`
    ],
    level: js.Tuple5[
      typingsSlinky.screeps.screepsNumbers.`10`, 
      typingsSlinky.screeps.screepsNumbers.`11`, 
      typingsSlinky.screeps.screepsNumbers.`12`, 
      typingsSlinky.screeps.screepsNumbers.`14`, 
      typingsSlinky.screeps.screepsNumbers.`22`
    ],
    period: typingsSlinky.screeps.screepsNumbers.`10`,
    range: typingsSlinky.screeps.screepsNumbers.`3`
  ): LevelPeriod = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelPeriod]
  }
}

