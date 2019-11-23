package typingsSlinky.semanticDashUiDashReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.semanticDashUiDashReact.distCommonjsElementsImageImageMod.ImageProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticCOLORS
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsSlinky.semanticDashUiDashReact.distCommonjsViewsCardCardDescriptionMod.CardDescriptionProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsViewsCardCardHeaderMod.CardHeaderProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsViewsCardCardMetaMod.CardMetaProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsViewsCardCardMod.CardProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsViewsCardMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Card
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.semanticDashUiDashReact.distCommonjsViewsCardMod.default].asInstanceOf[String | js.Object]
  /* The following DOM/SVG props were specified: className, href */
  def apply(
    as: js.Any = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    color: SemanticCOLORS = null,
    content: SemanticShorthandContent = null,
    description: SemanticShorthandItem[CardDescriptionProps] = null,
    extra: SemanticShorthandContent = null,
    fluid: js.UndefOr[Boolean] = js.undefined,
    header: SemanticShorthandItem[CardHeaderProps] = null,
    image: SemanticShorthandItem[ImageProps] = null,
    link: js.UndefOr[Boolean] = js.undefined,
    meta: SemanticShorthandItem[CardMetaProps] = null,
    onClick: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ CardProps) => Unit = null,
    raised: js.UndefOr[Boolean] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(link)) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (!js.isUndefined(raised)) __obj.updateDynamic("raised")(raised.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CardProps
}

