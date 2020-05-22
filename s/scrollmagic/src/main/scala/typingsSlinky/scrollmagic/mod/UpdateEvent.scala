package typingsSlinky.scrollmagic.mod

import typingsSlinky.scrollmagic.scrollmagicStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEvent extends Event[update] {
  val endPos: Double
  val scrollPos: Double
  val startPos: Double
}

object UpdateEvent {
  @scala.inline
  def apply(
    currentTarget: Scene,
    endPos: Double,
    namespace: String,
    scrollPos: Double,
    startPos: Double,
    target: Scene,
    timeStamp: js.Date,
    timestamp: js.Date,
    `type`: update
  ): UpdateEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], endPos = endPos.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], scrollPos = scrollPos.asInstanceOf[js.Any], startPos = startPos.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEvent]
  }
}

