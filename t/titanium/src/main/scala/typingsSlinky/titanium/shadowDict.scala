package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary describing the shadow effect for text.
  */
@js.native
trait shadowDict extends js.Object {
  /**
  	 * Specifies the blur radius of the shadow.
  	 */
  var blurRadius: js.UndefOr[Double] = js.native
  /**
  	 * Color name or hex triplet specifying the color of the shadow.
  	 */
  var color: js.UndefOr[java.lang.String] = js.native
  /**
  	 * <Size> with the properties `width` and `height` used as the horizontal
  	 * and vertical offset of the shadow, respectively.
  	 */
  var offset: js.UndefOr[Size] = js.native
}

object shadowDict {
  @scala.inline
  def apply(): shadowDict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[shadowDict]
  }
  @scala.inline
  implicit class shadowDictOps[Self <: shadowDict] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlurRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlurRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
  }
  
}

