package typingsSlinky.ydnDb.ydn.db.events

import typingsSlinky.ydnDb.ydn.db.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageEvent extends Event {
  def getError(): js.Error
  def getOldVersion(): Double
  def getVersion(): Double
}

object StorageEvent {
  @scala.inline
  def apply(
    getError: () => js.Error,
    getOldVersion: () => Double,
    getVersion: () => Double,
    name: String,
    `type`: EventType
  ): StorageEvent = {
    val __obj = js.Dynamic.literal(getError = js.Any.fromFunction0(getError), getOldVersion = js.Any.fromFunction0(getOldVersion), getVersion = js.Any.fromFunction0(getVersion), name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageEvent]
  }
}

