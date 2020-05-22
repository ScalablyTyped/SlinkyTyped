package typingsSlinky.screeps.anon

import typingsSlinky.screeps.screepsNumbers.`10000`
import typingsSlinky.screeps.screepsNumbers.`100`
import typingsSlinky.screeps.screepsNumbers.`15000`
import typingsSlinky.screeps.screepsNumbers.`20000`
import typingsSlinky.screeps.screepsNumbers.`25000`
import typingsSlinky.screeps.screepsNumbers.`5000`
import typingsSlinky.screeps.screepsNumbers.`50`
import typingsSlinky.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Energy extends js.Object {
  var className: operator
  var cooldown: typingsSlinky.screeps.screepsNumbers.`20`
  var duration: `50`
  var effect: js.Tuple5[`5000`, `10000`, `15000`, `20000`, `25000`]
  var energy: `100`
  var level: js.Tuple5[
    typingsSlinky.screeps.screepsNumbers.`0`, 
    typingsSlinky.screeps.screepsNumbers.`2`, 
    typingsSlinky.screeps.screepsNumbers.`7`, 
    typingsSlinky.screeps.screepsNumbers.`14`, 
    typingsSlinky.screeps.screepsNumbers.`22`
  ]
}

object Energy {
  @scala.inline
  def apply(
    className: operator,
    cooldown: typingsSlinky.screeps.screepsNumbers.`20`,
    duration: `50`,
    effect: js.Tuple5[`5000`, `10000`, `15000`, `20000`, `25000`],
    energy: `100`,
    level: js.Tuple5[
      typingsSlinky.screeps.screepsNumbers.`0`, 
      typingsSlinky.screeps.screepsNumbers.`2`, 
      typingsSlinky.screeps.screepsNumbers.`7`, 
      typingsSlinky.screeps.screepsNumbers.`14`, 
      typingsSlinky.screeps.screepsNumbers.`22`
    ]
  ): Energy = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], energy = energy.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Energy]
  }
}

