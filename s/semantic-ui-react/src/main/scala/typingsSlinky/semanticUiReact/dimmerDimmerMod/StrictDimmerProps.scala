package typingsSlinky.semanticUiReact.dimmerDimmerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictDimmerProps extends js.Object {
  /** An active dimmer will dim its parent container. */
  var active: js.UndefOr[Boolean] = js.native
  /** A dimmer can be formatted to be fixed to the page. */
  var page: js.UndefOr[Boolean] = js.native
}

object StrictDimmerProps {
  @scala.inline
  def apply(): StrictDimmerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictDimmerProps]
  }
  @scala.inline
  implicit class StrictDimmerPropsOps[Self <: StrictDimmerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
  }
  
}

