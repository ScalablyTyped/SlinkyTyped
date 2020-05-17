package typingsSlinky.ydnDb.ydn.db.events

import typingsSlinky.ydnDb.ydn.db.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageEvent extends Event {
  def getError(): js.Error = js.native
  def getOldVersion(): Double = js.native
  def getVersion(): Double = js.native
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
  @scala.inline
  implicit class StorageEventOps[Self <: StorageEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetError(value: () => js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOldVersion(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOldVersion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVersion(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVersion")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

