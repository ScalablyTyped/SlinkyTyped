package typingsSlinky.storybookComponents.linkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkInnerProps extends js.Object {
  var containsIcon: js.UndefOr[Boolean] = js.native
  var withArrow: js.UndefOr[Boolean] = js.native
}

object LinkInnerProps {
  @scala.inline
  def apply(): LinkInnerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkInnerProps]
  }
  @scala.inline
  implicit class LinkInnerPropsOps[Self <: LinkInnerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainsIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainsIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withWithArrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withArrow")(js.undefined)
        ret
    }
  }
  
}

