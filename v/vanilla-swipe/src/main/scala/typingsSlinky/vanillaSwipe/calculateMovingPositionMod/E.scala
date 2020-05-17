package typingsSlinky.vanillaSwipe.calculateMovingPositionMod

import typingsSlinky.vanillaSwipe.anon.ClientX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait E extends js.Object {
  var changedTouches: js.UndefOr[js.Array[ClientX]] = js.native
  var clientX: Double = js.native
  var clientY: Double = js.native
  var preventDefault: js.UndefOr[js.Function] = js.native
}

object E {
  @scala.inline
  def apply(clientX: Double, clientY: Double): E = {
    val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any])
    __obj.asInstanceOf[E]
  }
  @scala.inline
  implicit class EOps[Self <: E] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangedTouches(value: js.Array[ClientX]): Self = {
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
    def withPreventDefault(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.undefined)
        ret
    }
  }
  
}

