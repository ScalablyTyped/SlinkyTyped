package typingsSlinky.screeps.anon

import typingsSlinky.screeps.screepsNumbers.`1.1`
import typingsSlinky.screeps.screepsNumbers.`1.2`
import typingsSlinky.screeps.screepsNumbers.`1.3`
import typingsSlinky.screeps.screepsNumbers.`1.4`
import typingsSlinky.screeps.screepsNumbers.`1.5`
import typingsSlinky.screeps.screepsNumbers.`100`
import typingsSlinky.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Level extends js.Object {
  var className: operator
  var cooldown: typingsSlinky.screeps.screepsNumbers.`10`
  var duration: `100`
  var effect: js.Tuple5[`1.1`, `1.2`, `1.3`, `1.4`, `1.5`]
  var level: js.Tuple5[
    typingsSlinky.screeps.screepsNumbers.`0`, 
    typingsSlinky.screeps.screepsNumbers.`2`, 
    typingsSlinky.screeps.screepsNumbers.`7`, 
    typingsSlinky.screeps.screepsNumbers.`14`, 
    typingsSlinky.screeps.screepsNumbers.`22`
  ]
  var ops: typingsSlinky.screeps.screepsNumbers.`10`
  var range: typingsSlinky.screeps.screepsNumbers.`3`
}

object Level {
  @scala.inline
  def apply(
    className: operator,
    cooldown: typingsSlinky.screeps.screepsNumbers.`10`,
    duration: `100`,
    effect: js.Tuple5[`1.1`, `1.2`, `1.3`, `1.4`, `1.5`],
    level: js.Tuple5[
      typingsSlinky.screeps.screepsNumbers.`0`, 
      typingsSlinky.screeps.screepsNumbers.`2`, 
      typingsSlinky.screeps.screepsNumbers.`7`, 
      typingsSlinky.screeps.screepsNumbers.`14`, 
      typingsSlinky.screeps.screepsNumbers.`22`
    ],
    ops: typingsSlinky.screeps.screepsNumbers.`10`,
    range: typingsSlinky.screeps.screepsNumbers.`3`
  ): Level = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
}

