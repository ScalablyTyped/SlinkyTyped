package typingsSlinky.semanticDashUiDashReact.distCommonjsElementsListListItemMod

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

trait StrictListItemProps extends js.Object {
  /** A list item can active. */
  var active: js.UndefOr[Boolean] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandItem[ListContentProps]] = js.undefined
  /** Shorthand for ListDescription. */
  var description: js.UndefOr[SemanticShorthandItem[ListDescriptionProps]] = js.undefined
  /** A list item can disabled. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** Shorthand for ListHeader. */
  var header: js.UndefOr[SemanticShorthandItem[ListHeaderProps]] = js.undefined
  /** Shorthand for ListIcon. */
  var icon: js.UndefOr[SemanticShorthandItem[ListIconProps]] = js.undefined
  /** Shorthand for Image. */
  var image: js.UndefOr[SemanticShorthandItem[ImageProps]] = js.undefined
  /**
    * Called on click.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onClick: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ ListItemProps, Unit]
  ] = js.undefined
  /** A value for an ordered list. */
  var value: js.UndefOr[String] = js.undefined
}

object StrictListItemProps {
  @scala.inline
  def apply(
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
  ): StrictListItemProps = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[StrictListItemProps]
  }
}

