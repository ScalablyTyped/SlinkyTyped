package typingsSlinky.subscribeUiEvent.mod

import typingsSlinky.subscribeUiEvent.anon.AxisIntention
import typingsSlinky.subscribeUiEvent.anon.Delta
import typingsSlinky.subscribeUiEvent.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArgmentedEvent[T /* <: EventType */] extends js.Object {
  var mainType: String = js.native
  var resize: Height = js.native
  var scroll: Delta = js.native
  var subType: String = js.native
  var touch: AxisIntention = js.native
  var `type`: T = js.native
}

object ArgmentedEvent {
  @scala.inline
  def apply[T](mainType: String, resize: Height, scroll: Delta, subType: String, touch: AxisIntention, `type`: T): ArgmentedEvent[T] = {
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
    def withResize(value: Height): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScroll(value: Delta): Self[T] = {
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
    def withTouch(value: AxisIntention): Self[T] = {
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

