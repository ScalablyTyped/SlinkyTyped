package typingsSlinky.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Npv extends js.Object {
  var npv: js.UndefOr[Decimals] = js.native
  var title: js.UndefOr[Fontfamily] = js.native
  var value: js.UndefOr[Fontfamily] = js.native
  /**
    * To set the visibility of the object. true | false
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object Npv {
  @scala.inline
  def apply(): Npv = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Npv]
  }
  @scala.inline
  implicit class NpvOps[Self <: Npv] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNpv(value: Decimals): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("npv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNpv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("npv")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: Fontfamily): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Fontfamily): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

