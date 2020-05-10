package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary object of parameters for the <Titanium.UI.TextField.selection> property that describes
  * position and length of the selected text.
  */
@js.native
trait textFieldSelectedParams extends js.Object {
  /**
  	 * Number of characters selected.
  	 */
  var length: js.UndefOr[Double] = js.native
  /**
  	 * Starting position of selected text.
  	 */
  var location: js.UndefOr[Double] = js.native
}

object textFieldSelectedParams {
  @scala.inline
  def apply(): textFieldSelectedParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[textFieldSelectedParams]
  }
  @scala.inline
  implicit class textFieldSelectedParamsOps[Self <: textFieldSelectedParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
  }
  
}

