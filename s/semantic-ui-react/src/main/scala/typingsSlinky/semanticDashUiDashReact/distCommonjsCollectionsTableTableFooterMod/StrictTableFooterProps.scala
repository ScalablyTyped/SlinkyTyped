package typingsSlinky.semanticDashUiDashReact.distCommonjsCollectionsTableTableFooterMod

import slinky.core.TagMod
import typingsSlinky.semanticDashUiDashReact.distCommonjsCollectionsTableTableHeaderMod.StrictTableHeaderProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictTableFooterProps extends StrictTableHeaderProps

object StrictTableFooterProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    children: TagMod[Any] = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    fullWidth: js.UndefOr[Boolean] = js.undefined
  ): StrictTableFooterProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictTableFooterProps]
  }
}

