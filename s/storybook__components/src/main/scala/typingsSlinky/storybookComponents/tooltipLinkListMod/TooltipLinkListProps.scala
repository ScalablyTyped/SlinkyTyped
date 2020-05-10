package typingsSlinky.storybookComponents.tooltipLinkListMod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipLinkListProps extends js.Object {
  var LinkWrapper: js.UndefOr[ReactComponentClass[js.Object]] = js.native
  var links: js.Array[Link] = js.native
}

object TooltipLinkListProps {
  @scala.inline
  def apply(links: js.Array[Link]): TooltipLinkListProps = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipLinkListProps]
  }
  @scala.inline
  implicit class TooltipLinkListPropsOps[Self <: TooltipLinkListProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLinks(value: js.Array[Link]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkWrapper(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkWrapper")(js.undefined)
        ret
    }
  }
  
}

