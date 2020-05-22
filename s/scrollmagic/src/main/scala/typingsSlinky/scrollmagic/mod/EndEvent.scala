package typingsSlinky.scrollmagic.mod

import typingsSlinky.scrollmagic.scrollmagicStrings.end
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndEvent extends Event[end] {
  val progress: Double
  val state: SceneState
}

object EndEvent {
  @scala.inline
  def apply(
    currentTarget: Scene,
    namespace: String,
    progress: Double,
    state: SceneState,
    target: Scene,
    timeStamp: js.Date,
    timestamp: js.Date,
    `type`: end
  ): EndEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndEvent]
  }
}

