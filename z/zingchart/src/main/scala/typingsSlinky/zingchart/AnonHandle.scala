package typingsSlinky.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHandle extends js.Object {
  var bar: js.UndefOr[AnonWidth] = js.native
  var handle: js.UndefOr[AnonBordertop] = js.native
  /**
    * Sets an x offset that will be applied to the scroll-x object. 4 | '6px' | ...
    */
  var `offset-x`: js.UndefOr[js.Any] = js.native
  /**
    * Sets a y offset that will be applied to the scroll-x object. 4 | '6px' | ...
    */
  var `offset-y`: js.UndefOr[js.Any] = js.native
}

object AnonHandle {
  @scala.inline
  def apply(): AnonHandle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonHandle]
  }
  @scala.inline
  implicit class AnonHandleOps[Self <: AnonHandle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBar(value: AnonWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bar")(js.undefined)
        ret
    }
    @scala.inline
    def withHandle(value: AnonBordertop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(js.undefined)
        ret
    }
    @scala.inline
    def `withOffset-x`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOffset-x`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-x")(js.undefined)
        ret
    }
    @scala.inline
    def `withOffset-y`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOffset-y`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-y")(js.undefined)
        ret
    }
  }
  
}

