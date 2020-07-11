package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchEventInit extends EventModifierInit {
  var changedTouches: js.UndefOr[js.Array[org.scalajs.dom.raw.Touch]] = js.undefined
  var targetTouches: js.UndefOr[js.Array[org.scalajs.dom.raw.Touch]] = js.undefined
  var touches: js.UndefOr[js.Array[org.scalajs.dom.raw.Touch]] = js.undefined
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
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChangedTouchesVarargs(value: org.scalajs.dom.raw.Touch*): Self = this.set("changedTouches", js.Array(value :_*))
    @scala.inline
    def setChangedTouches(value: js.Array[org.scalajs.dom.raw.Touch]): Self = this.set("changedTouches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangedTouches: Self = this.set("changedTouches", js.undefined)
    @scala.inline
    def setTargetTouchesVarargs(value: org.scalajs.dom.raw.Touch*): Self = this.set("targetTouches", js.Array(value :_*))
    @scala.inline
    def setTargetTouches(value: js.Array[org.scalajs.dom.raw.Touch]): Self = this.set("targetTouches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetTouches: Self = this.set("targetTouches", js.undefined)
    @scala.inline
    def setTouchesVarargs(value: org.scalajs.dom.raw.Touch*): Self = this.set("touches", js.Array(value :_*))
    @scala.inline
    def setTouches(value: js.Array[org.scalajs.dom.raw.Touch]): Self = this.set("touches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouches: Self = this.set("touches", js.undefined)
  }
  
}

