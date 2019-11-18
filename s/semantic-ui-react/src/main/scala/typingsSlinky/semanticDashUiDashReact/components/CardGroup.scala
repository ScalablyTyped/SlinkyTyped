package typingsSlinky.semanticDashUiDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandCollection
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticWIDTHS
import typingsSlinky.semanticDashUiDashReact.distCommonjsViewsCardCardGroupMod.CardGroupProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsViewsCardCardMod.CardProps
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.center
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.left
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className */
object CardGroup
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typingsSlinky.semanticDashUiDashReact.distCommonjsViewsCardCardGroupMod.default.asInstanceOf[String | js.Object]
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    content: SemanticShorthandContent = null,
    doubling: js.UndefOr[Boolean] = js.undefined,
    items: SemanticShorthandCollection[CardProps] = null,
    itemsPerRow: SemanticWIDTHS = null,
    stackable: js.UndefOr[Boolean] = js.undefined,
    textAlign: center | left | right = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(doubling)) __obj.updateDynamic("doubling")(doubling.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (itemsPerRow != null) __obj.updateDynamic("itemsPerRow")(itemsPerRow.asInstanceOf[js.Any])
    if (!js.isUndefined(stackable)) __obj.updateDynamic("stackable")(stackable.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CardGroupProps
}

