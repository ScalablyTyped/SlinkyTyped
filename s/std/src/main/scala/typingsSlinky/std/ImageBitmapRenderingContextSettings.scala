package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageBitmapRenderingContextSettings extends js.Object {
  var alpha: js.UndefOr[scala.Boolean] = js.native
}

object ImageBitmapRenderingContextSettings {
  @scala.inline
  def apply(): ImageBitmapRenderingContextSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageBitmapRenderingContextSettings]
  }
  @scala.inline
  implicit class ImageBitmapRenderingContextSettingsOps[Self <: ImageBitmapRenderingContextSettings] (val x: Self) extends AnyVal {
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
  }
  
}

