package typingsSlinky.viewportMercatorProject.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewportOptions extends js.Object {
  var height: js.UndefOr[Double] = js.native
  var projectionMatrix: js.UndefOr[ViewMatrix] = js.native
  var viewMatrix: js.UndefOr[ViewMatrix] = js.native
  var width: js.UndefOr[Double] = js.native
}

object ViewportOptions {
  @scala.inline
  def apply(): ViewportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewportOptions]
  }
  @scala.inline
  implicit class ViewportOptionsOps[Self <: ViewportOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectionMatrix(value: ViewMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectionMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectionMatrix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectionMatrix")(js.undefined)
        ret
    }
    @scala.inline
    def withViewMatrix(value: ViewMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewMatrix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewMatrix")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

