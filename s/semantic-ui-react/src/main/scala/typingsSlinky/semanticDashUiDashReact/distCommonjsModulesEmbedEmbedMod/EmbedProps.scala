package typingsSlinky.semanticDashUiDashReact.distCommonjsModulesEmbedEmbedMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.semanticDashUiDashReact.distCommonjsElementsIconIconMod.IconProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.HtmlIframeProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`16:9`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`21:9`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`4:3`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.vimeo
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.youtube
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbedProps
  extends StrictEmbedProps
     with /* key */ StringDictionary[js.Any]

object EmbedProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    aspectRatio: `4:3` | `16:9` | `21:9` = null,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    brandedUI: js.UndefOr[Boolean] = js.undefined,
    children: TagMod[Any] = null,
    className: String = null,
    color: String = null,
    content: SemanticShorthandContent = null,
    defaultActive: js.UndefOr[Boolean] = js.undefined,
    hd: js.UndefOr[Boolean] = js.undefined,
    icon: SemanticShorthandItem[IconProps] = null,
    id: String = null,
    iframe: SemanticShorthandItem[HtmlIframeProps] = null,
    onClick: (/* event */ SyntheticMouseEvent[HTMLDivElement], /* data */ EmbedProps) => Unit = null,
    placeholder: String = null,
    source: youtube | vimeo = null,
    url: String = null
  ): EmbedProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (!js.isUndefined(brandedUI)) __obj.updateDynamic("brandedUI")(brandedUI.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultActive)) __obj.updateDynamic("defaultActive")(defaultActive.asInstanceOf[js.Any])
    if (!js.isUndefined(hd)) __obj.updateDynamic("hd")(hd.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (iframe != null) __obj.updateDynamic("iframe")(iframe.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbedProps]
  }
}

