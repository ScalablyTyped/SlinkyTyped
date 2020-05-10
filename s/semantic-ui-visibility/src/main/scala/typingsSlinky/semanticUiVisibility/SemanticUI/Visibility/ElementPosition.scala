package typingsSlinky.semanticUiVisibility.SemanticUI.Visibility

import typingsSlinky.jquery.JQueryCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementPosition extends js.Object {
  var fits: Boolean = js.native
  var height: Double = js.native
  var offset: JQueryCoordinates = js.native
  var width: Double = js.native
}

object ElementPosition {
  @scala.inline
  def apply(fits: Boolean, height: Double, offset: JQueryCoordinates, width: Double): ElementPosition = {
    val __obj = js.Dynamic.literal(fits = fits.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementPosition]
  }
  @scala.inline
  implicit class ElementPositionOps[Self <: ElementPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFits(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: JQueryCoordinates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
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

