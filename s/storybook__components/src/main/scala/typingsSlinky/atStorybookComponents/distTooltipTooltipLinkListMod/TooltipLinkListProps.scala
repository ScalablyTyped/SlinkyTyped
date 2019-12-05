package typingsSlinky.atStorybookComponents.distTooltipTooltipLinkListMod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipLinkListProps extends js.Object {
  var LinkWrapper: js.UndefOr[ReactComponentClass[js.Object]] = js.undefined
  var links: js.Array[Link]
}

object TooltipLinkListProps {
  @scala.inline
  def apply(links: js.Array[Link], LinkWrapper: ReactComponentClass[js.Object] = null): TooltipLinkListProps = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
    if (LinkWrapper != null) __obj.updateDynamic("LinkWrapper")(LinkWrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipLinkListProps]
  }
}

