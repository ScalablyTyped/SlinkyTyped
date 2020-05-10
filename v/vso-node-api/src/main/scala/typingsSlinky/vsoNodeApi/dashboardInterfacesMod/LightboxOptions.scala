package typingsSlinky.vsoNodeApi.dashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LightboxOptions extends js.Object {
  /**
    * Height of desired lightbox, in pixels
    */
  var height: Double = js.native
  /**
    * True to allow lightbox resizing, false to disallow lightbox resizing, defaults to false.
    */
  var resizable: Boolean = js.native
  /**
    * Width of desired lightbox, in pixels
    */
  var width: Double = js.native
}

object LightboxOptions {
  @scala.inline
  def apply(height: Double, resizable: Boolean, width: Double): LightboxOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], resizable = resizable.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightboxOptions]
  }
  @scala.inline
  implicit class LightboxOptionsOps[Self <: LightboxOptions] (val x: Self) extends AnyVal {
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
    def withResizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

