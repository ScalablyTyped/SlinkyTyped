package typingsSlinky.semanticDashUiDashReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.semanticDashUiDashReact.distCommonjsElementsIconIconMod.IconProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.HtmlIframeProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsSlinky.semanticDashUiDashReact.distCommonjsModulesEmbedEmbedMod.EmbedProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsModulesEmbedMod.default
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`16Colon9`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`21Colon9`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`4Colon3`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.vimeo
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.youtube
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Embed
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("semantic-ui-react/dist/commonjs/modules/Embed", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id, placeholder */
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    aspectRatio: `4Colon3` | `16Colon9` | `21Colon9` = null,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    brandedUI: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    content: SemanticShorthandContent = null,
    defaultActive: js.UndefOr[Boolean] = js.undefined,
    hd: js.UndefOr[Boolean] = js.undefined,
    icon: SemanticShorthandItem[IconProps] = null,
    iframe: SemanticShorthandItem[HtmlIframeProps] = null,
    onClick: (/* event */ SyntheticMouseEvent[HTMLDivElement], /* data */ EmbedProps) => Unit = null,
    source: youtube | vimeo = null,
    url: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (!js.isUndefined(brandedUI)) __obj.updateDynamic("brandedUI")(brandedUI.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultActive)) __obj.updateDynamic("defaultActive")(defaultActive.asInstanceOf[js.Any])
    if (!js.isUndefined(hd)) __obj.updateDynamic("hd")(hd.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iframe != null) __obj.updateDynamic("iframe")(iframe.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.semanticDashUiDashReact.distCommonjsModulesEmbedMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = EmbedProps
}

