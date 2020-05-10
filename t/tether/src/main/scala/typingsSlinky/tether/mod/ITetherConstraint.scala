package typingsSlinky.tether.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITetherConstraint extends js.Object {
  var attachment: js.UndefOr[String] = js.native
  var outOfBoundsClass: js.UndefOr[String] = js.native
  var pin: js.UndefOr[Boolean | js.Array[String]] = js.native
  var pinnedClass: js.UndefOr[String] = js.native
  var to: js.UndefOr[String | HTMLElement | js.Array[Double]] = js.native
}

object ITetherConstraint {
  @scala.inline
  def apply(): ITetherConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITetherConstraint]
  }
  @scala.inline
  implicit class ITetherConstraintOps[Self <: ITetherConstraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachment")(js.undefined)
        ret
    }
    @scala.inline
    def withOutOfBoundsClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outOfBoundsClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutOfBoundsClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outOfBoundsClass")(js.undefined)
        ret
    }
    @scala.inline
    def withPin(value: Boolean | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pin")(js.undefined)
        ret
    }
    @scala.inline
    def withPinnedClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinnedClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinnedClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinnedClass")(js.undefined)
        ret
    }
    @scala.inline
    def withToHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: String | HTMLElement | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
  }
  
}

