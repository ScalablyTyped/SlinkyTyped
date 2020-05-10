package typingsSlinky.subscribeUiEvent.mod

import typingsSlinky.subscribeUiEvent.AnonAxisIntention
import typingsSlinky.subscribeUiEvent.AnonDelta
import typingsSlinky.subscribeUiEvent.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArgmentedEvent[T /* <: EventType */] extends js.Object {
  var mainType: String = js.native
  var resize: AnonHeight = js.native
  var scroll: AnonDelta = js.native
  var subType: String = js.native
  var touch: AnonAxisIntention = js.native
  var `type`: T = js.native
}

object ArgmentedEvent {
  @scala.inline
  def apply[T](
    mainType: String,
    resize: AnonHeight,
    scroll: AnonDelta,
    subType: String,
    touch: AnonAxisIntention,
    `type`: T
  ): ArgmentedEvent[T] = {
    val __obj = js.Dynamic.literal(mainType = mainType.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], subType = subType.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgmentedEvent[T]]
  }
  @scala.inline
  implicit class ArgmentedEventOps[Self[t] <: ArgmentedEvent[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withMainType(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResize(value: AnonHeight): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScroll(value: AnonDelta): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubType(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouch(value: AnonAxisIntention): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

