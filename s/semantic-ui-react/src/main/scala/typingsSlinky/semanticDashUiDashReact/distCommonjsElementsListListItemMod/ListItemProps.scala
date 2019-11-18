package typingsSlinky.semanticDashUiDashReact.distCommonjsElementsListListItemMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.semanticDashUiDashReact.distCommonjsElementsImageImageMod.ImageProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsElementsListListContentMod.ListContentProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsElementsListListDescriptionMod.ListDescriptionProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsElementsListListHeaderMod.ListHeaderProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsElementsListListIconMod.ListIconProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemProps
  extends StrictListItemProps
     with /* key */ StringDictionary[js.Any]

object ListItemProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    children: TagMod[Any] = null,
    className: String = null,
    content: SemanticShorthandItem[ListContentProps] = null,
    description: SemanticShorthandItem[ListDescriptionProps] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    header: SemanticShorthandItem[ListHeaderProps] = null,
    icon: SemanticShorthandItem[ListIconProps] = null,
    image: SemanticShorthandItem[ImageProps] = null,
    onClick: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ ListItemProps) => Unit = null,
    value: String = null
  ): ListItemProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemProps]
  }
}

