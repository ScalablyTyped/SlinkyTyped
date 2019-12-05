package typingsSlinky.atStorybookComponents.distTooltipTooltipMessageMod

import slinky.core.TagMod
import typingsSlinky.atStorybookComponents.Anon_Href
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipMessageProps extends js.Object {
  var desc: js.UndefOr[TagMod[Any]] = js.undefined
  var links: js.UndefOr[js.Array[Anon_Href]] = js.undefined
  var title: js.UndefOr[TagMod[Any]] = js.undefined
}

object TooltipMessageProps {
  @scala.inline
  def apply(desc: TagMod[Any] = null, links: js.Array[Anon_Href] = null, title: TagMod[Any] = null): TooltipMessageProps = {
    val __obj = js.Dynamic.literal()
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipMessageProps]
  }
}

