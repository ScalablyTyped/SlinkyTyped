package typingsSlinky.semanticDashUiDashReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.semanticDashUiDashReact.distCommonjsCollectionsMessageMessageHeaderMod.MessageHeaderProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsCollectionsMessageMessageItemMod.MessageItemProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsCollectionsMessageMessageMod.MessageProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsCollectionsMessageMessageMod.MessageSizeProp
import typingsSlinky.semanticDashUiDashReact.distCommonjsCollectionsMessageMod.default
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticCOLORS
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandCollection
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.bottom
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Message
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.semanticDashUiDashReact.distCommonjsCollectionsMessageMod.default].asInstanceOf[String | js.Object]
  /* The following DOM/SVG props were specified: className, hidden */
  def apply(
    as: js.Any = null,
    attached: Boolean | bottom | top = null,
    color: SemanticCOLORS = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    content: SemanticShorthandContent = null,
    error: js.UndefOr[Boolean] = js.undefined,
    floating: js.UndefOr[Boolean] = js.undefined,
    header: SemanticShorthandItem[MessageHeaderProps] = null,
    icon: js.Any | Boolean = null,
    info: js.UndefOr[Boolean] = js.undefined,
    list: SemanticShorthandCollection[MessageItemProps] = null,
    negative: js.UndefOr[Boolean] = js.undefined,
    onDismiss: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ MessageProps) => Unit = null,
    positive: js.UndefOr[Boolean] = js.undefined,
    size: MessageSizeProp = null,
    success: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    warning: js.UndefOr[Boolean] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (attached != null) __obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(info)) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (!js.isUndefined(negative)) __obj.updateDynamic("negative")(negative.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction2(onDismiss))
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (!js.isUndefined(warning)) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MessageProps
}

