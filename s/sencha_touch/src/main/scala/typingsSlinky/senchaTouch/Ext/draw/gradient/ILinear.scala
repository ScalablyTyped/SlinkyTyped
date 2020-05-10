package typingsSlinky.senchaTouch.Ext.draw.gradient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILinear extends IGradient {
  /** [Config Option] (Number) */
  var The: js.UndefOr[Double] = js.native
}

object ILinear {
  @scala.inline
  def apply(): ILinear = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILinear]
  }
  @scala.inline
  implicit class ILinearOps[Self <: ILinear] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThe(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("The")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("The")(js.undefined)
        ret
    }
  }
  
}

