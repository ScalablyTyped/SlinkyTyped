package typingsSlinky.scrollmagic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event[T] extends js.Object {
  val currentTarget: Scene
  val namespace: String
  val target: Scene
  val timeStamp: js.Date
  val timestamp: js.Date
  val `type`: T
}

object Event {
  @scala.inline
  def apply[T](
    currentTarget: Scene,
    namespace: String,
    target: Scene,
    timeStamp: js.Date,
    timestamp: js.Date,
    `type`: T
  ): Event[T] = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event[T]]
  }
}

