package typingsSlinky.semanticDashUiDashReact.distCommonjsElementsHeaderHeaderMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticCOLORS
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticFLOATS
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticTEXTALIGNMENTS
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.bottom
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.huge
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.large
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.medium
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.small
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.tiny
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderProps
  extends StrictHeaderProps
     with /* key */ StringDictionary[js.Any]

object HeaderProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    attached: Boolean | top | bottom = null,
    block: js.UndefOr[Boolean] = js.undefined,
    children: TagMod[Any] = null,
    className: String = null,
    color: SemanticCOLORS = null,
    content: TagMod[Any] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dividing: js.UndefOr[Boolean] = js.undefined,
    floated: SemanticFLOATS = null,
    icon: js.Any = null,
    image: js.Any = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    size: tiny | small | medium | large | huge = null,
    sub: js.UndefOr[Boolean] = js.undefined,
    subheader: js.Any = null,
    textAlign: SemanticTEXTALIGNMENTS = null
  ): HeaderProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (attached != null) __obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(dividing)) __obj.updateDynamic("dividing")(dividing.asInstanceOf[js.Any])
    if (floated != null) __obj.updateDynamic("floated")(floated.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(sub)) __obj.updateDynamic("sub")(sub.asInstanceOf[js.Any])
    if (subheader != null) __obj.updateDynamic("subheader")(subheader.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderProps]
  }
}

