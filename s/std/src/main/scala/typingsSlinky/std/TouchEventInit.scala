package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchEventInit extends EventModifierInit {
  var changedTouches: js.UndefOr[js.Array[org.scalajs.dom.raw.Touch]] = js.native
  var targetTouches: js.UndefOr[js.Array[org.scalajs.dom.raw.Touch]] = js.native
  var touches: js.UndefOr[js.Array[org.scalajs.dom.raw.Touch]] = js.native
}

object TouchEventInit {
  @scala.inline
  def apply(): TouchEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchEventInit]
  }
  @scala.inline
  implicit class TouchEventInitOps[Self <: TouchEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangedTouches(value: js.Array[org.scalajs.dom.raw.Touch]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedTouches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangedTouches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedTouches")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetTouches(value: js.Array[org.scalajs.dom.raw.Touch]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetTouches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetTouches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetTouches")(js.undefined)
        ret
    }
    @scala.inline
    def withTouches(value: js.Array[org.scalajs.dom.raw.Touch]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touches")(js.undefined)
        ret
    }
  }
  
}

