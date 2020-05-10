package typingsSlinky.wonderJs

import typingsSlinky.wonderJs.escreensizeMod.EScreenSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCanvasId extends js.Object {
  var canvasId: js.UndefOr[Null] = js.native
  var contextConfig: js.UndefOr[AnonOptions] = js.native
  var isTest: js.UndefOr[Boolean] = js.native
  var screenSize: js.UndefOr[EScreenSize] = js.native
  var useDevicePixelRatio: js.UndefOr[Boolean] = js.native
}

object AnonCanvasId {
  @scala.inline
  def apply(): AnonCanvasId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCanvasId]
  }
  @scala.inline
  implicit class AnonCanvasIdOps[Self <: AnonCanvasId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanvasId(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanvasId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasId")(js.undefined)
        ret
    }
    @scala.inline
    def withCanvasIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasId")(null)
        ret
    }
    @scala.inline
    def withContextConfig(value: AnonOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTest")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenSize(value: EScreenSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenSize")(js.undefined)
        ret
    }
    @scala.inline
    def withUseDevicePixelRatio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDevicePixelRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseDevicePixelRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDevicePixelRatio")(js.undefined)
        ret
    }
  }
  
}

