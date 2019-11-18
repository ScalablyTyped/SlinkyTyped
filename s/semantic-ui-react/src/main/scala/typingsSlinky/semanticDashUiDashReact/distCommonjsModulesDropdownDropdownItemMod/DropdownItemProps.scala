package typingsSlinky.semanticDashUiDashReact.distCommonjsModulesDropdownDropdownItemMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.semanticDashUiDashReact.distCommonjsElementsFlagFlagMod.FlagProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsElementsIconIconMod.IconProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsElementsImageImageMod.ImageProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsElementsLabelLabelMod.LabelProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.HtmlSpanProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownItemProps
  extends StrictDropdownItemProps
     with /* key */ StringDictionary[js.Any]

object DropdownItemProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    children: TagMod[Any] = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    description: SemanticShorthandItem[HtmlSpanProps] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    flag: SemanticShorthandItem[FlagProps] = null,
    icon: SemanticShorthandItem[IconProps] = null,
    image: SemanticShorthandItem[ImageProps] = null,
    label: SemanticShorthandItem[LabelProps] = null,
    onClick: (/* event */ SyntheticMouseEvent[HTMLDivElement], /* data */ DropdownItemProps) => Unit = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    text: SemanticShorthandContent = null,
    value: Boolean | Double | String = null
  ): DropdownItemProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownItemProps]
  }
}

