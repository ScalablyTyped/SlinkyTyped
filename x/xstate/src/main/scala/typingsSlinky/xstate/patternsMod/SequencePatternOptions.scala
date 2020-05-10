package typingsSlinky.xstate.patternsMod

import typingsSlinky.xstate.typesMod.Event
import typingsSlinky.xstate.typesMod.EventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequencePatternOptions[TEvent /* <: EventObject */] extends js.Object {
  var nextEvent: js.UndefOr[Event[TEvent]] = js.native
  var prevEvent: js.UndefOr[Event[TEvent]] = js.native
}

object SequencePatternOptions {
  @scala.inline
  def apply[TEvent](): SequencePatternOptions[TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SequencePatternOptions[TEvent]]
  }
  @scala.inline
  implicit class SequencePatternOptionsOps[Self[tevent] <: SequencePatternOptions[tevent], TEvent] (val x: Self[TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEvent] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEvent] with Other]
    @scala.inline
    def withNextEvent(value: Event[TEvent]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextEvent: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevEvent(value: Event[TEvent]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevEvent: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevEvent")(js.undefined)
        ret
    }
  }
  
}

