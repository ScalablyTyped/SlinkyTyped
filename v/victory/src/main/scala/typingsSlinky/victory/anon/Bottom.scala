package typingsSlinky.victory.anon

import typingsSlinky.victory.mod.CallbackArgs
import typingsSlinky.victory.mod.NumberOrCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bottom extends js.Object {
  var bottom: js.UndefOr[NumberOrCallback] = js.native
  var bottomLeft: js.UndefOr[NumberOrCallback] = js.native
  var bottomRight: js.UndefOr[NumberOrCallback] = js.native
  var top: js.UndefOr[NumberOrCallback] = js.native
  var topLeft: js.UndefOr[NumberOrCallback] = js.native
  var topRight: js.UndefOr[NumberOrCallback] = js.native
}

object Bottom {
  @scala.inline
  def apply(): Bottom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bottom]
  }
  @scala.inline
  implicit class BottomOps[Self <: Bottom] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottomFunction1(value: /* args */ CallbackArgs => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBottom(value: NumberOrCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.undefined)
        ret
    }
    @scala.inline
    def withBottomLeftFunction1(value: /* args */ CallbackArgs => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomLeft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBottomLeft(value: NumberOrCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withBottomRightFunction1(value: /* args */ CallbackArgs => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomRight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBottomRight(value: NumberOrCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomRight")(js.undefined)
        ret
    }
    @scala.inline
    def withTopFunction1(value: /* args */ CallbackArgs => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTop(value: NumberOrCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withTopLeftFunction1(value: /* args */ CallbackArgs => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLeft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTopLeft(value: NumberOrCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withTopRightFunction1(value: /* args */ CallbackArgs => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topRight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTopRight(value: NumberOrCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topRight")(js.undefined)
        ret
    }
  }
  
}

