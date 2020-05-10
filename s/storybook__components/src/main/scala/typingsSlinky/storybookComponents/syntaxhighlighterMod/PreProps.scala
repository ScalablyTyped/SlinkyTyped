package typingsSlinky.storybookComponents.syntaxhighlighterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreProps extends js.Object {
  var padded: js.UndefOr[Boolean] = js.native
}

object PreProps {
  @scala.inline
  def apply(): PreProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreProps]
  }
  @scala.inline
  implicit class PrePropsOps[Self <: PreProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPadded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padded")(js.undefined)
        ret
    }
  }
  
}

