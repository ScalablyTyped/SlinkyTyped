package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMQuadInit extends js.Object {
  var p1: js.UndefOr[DOMPointInit] = js.native
  var p2: js.UndefOr[DOMPointInit] = js.native
  var p3: js.UndefOr[DOMPointInit] = js.native
  var p4: js.UndefOr[DOMPointInit] = js.native
}

object DOMQuadInit {
  @scala.inline
  def apply(): DOMQuadInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DOMQuadInit]
  }
  @scala.inline
  implicit class DOMQuadInitOps[Self <: DOMQuadInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withP1(value: DOMPointInit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutP1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p1")(js.undefined)
        ret
    }
    @scala.inline
    def withP2(value: DOMPointInit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutP2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p2")(js.undefined)
        ret
    }
    @scala.inline
    def withP3(value: DOMPointInit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutP3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p3")(js.undefined)
        ret
    }
    @scala.inline
    def withP4(value: DOMPointInit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutP4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p4")(js.undefined)
        ret
    }
  }
  
}

