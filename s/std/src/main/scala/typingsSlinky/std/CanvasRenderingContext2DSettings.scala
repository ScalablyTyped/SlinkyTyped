package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasRenderingContext2DSettings extends js.Object {
  var alpha: js.UndefOr[scala.Boolean] = js.native
  var desynchronized: js.UndefOr[scala.Boolean] = js.native
}

object CanvasRenderingContext2DSettings {
  @scala.inline
  def apply(): CanvasRenderingContext2DSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasRenderingContext2DSettings]
  }
  @scala.inline
  implicit class CanvasRenderingContext2DSettingsOps[Self <: CanvasRenderingContext2DSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(js.undefined)
        ret
    }
    @scala.inline
    def withDesynchronized(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desynchronized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesynchronized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desynchronized")(js.undefined)
        ret
    }
  }
  
}

