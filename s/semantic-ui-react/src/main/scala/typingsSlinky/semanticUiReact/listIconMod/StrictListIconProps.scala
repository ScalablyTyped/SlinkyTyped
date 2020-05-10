package typingsSlinky.semanticUiReact.listIconMod

import typingsSlinky.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typingsSlinky.semanticUiReact.iconIconMod.StrictIconProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictListIconProps extends StrictIconProps {
  /** An element inside a list can be vertically aligned. */
  var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.native
}

object StrictListIconProps {
  @scala.inline
  def apply(): StrictListIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictListIconProps]
  }
  @scala.inline
  implicit class StrictListIconPropsOps[Self <: StrictListIconProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVerticalAlign(value: SemanticVERTICALALIGNMENTS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(js.undefined)
        ret
    }
  }
  
}

