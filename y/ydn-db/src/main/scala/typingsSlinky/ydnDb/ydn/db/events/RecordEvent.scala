package typingsSlinky.ydnDb.ydn.db.events

import typingsSlinky.ydnDb.ydn.db.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordEvent extends Event {
  def getKey(): js.Any = js.native
  def getStoreName(): String = js.native
  def getValue(): js.Any = js.native
}

object RecordEvent {
  @scala.inline
  def apply(
    getKey: () => js.Any,
    getStoreName: () => String,
    getValue: () => js.Any,
    name: String,
    `type`: EventType
  ): RecordEvent = {
    val __obj = js.Dynamic.literal(getKey = js.Any.fromFunction0(getKey), getStoreName = js.Any.fromFunction0(getStoreName), getValue = js.Any.fromFunction0(getValue), name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordEvent]
  }
  @scala.inline
  implicit class RecordEventOps[Self <: RecordEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetKey(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKey")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStoreName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStoreName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValue(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

