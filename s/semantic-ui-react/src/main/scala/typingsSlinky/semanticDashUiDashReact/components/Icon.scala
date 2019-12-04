package typingsSlinky.semanticDashUiDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.semanticDashUiDashReact.distCommonjsElementsIconIconMod.IconCorner
import typingsSlinky.semanticDashUiDashReact.distCommonjsElementsIconIconMod.IconProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsElementsIconIconMod.IconSizeProp
import typingsSlinky.semanticDashUiDashReact.distCommonjsElementsIconMod.default
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticCOLORS
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticICONS
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.clockwise
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.counterclockwise
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.horizontally
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.vertically
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Icon
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("semantic-ui-react/dist/commonjs/elements/Icon", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled */
  def apply(
    `aria-hidden`: String = null,
    `aria-label`: String = null,
    as: js.Any = null,
    bordered: js.UndefOr[Boolean] = js.undefined,
    circular: js.UndefOr[Boolean] = js.undefined,
    color: SemanticCOLORS = null,
    corner: Boolean | IconCorner = null,
    fitted: js.UndefOr[Boolean] = js.undefined,
    flipped: horizontally | vertically = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    link: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    name: SemanticICONS = null,
    rotated: clockwise | counterclockwise = null,
    size: IconSizeProp = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (`aria-hidden` != null) __obj.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.asInstanceOf[js.Any])
    if (!js.isUndefined(circular)) __obj.updateDynamic("circular")(circular.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (corner != null) __obj.updateDynamic("corner")(corner.asInstanceOf[js.Any])
    if (!js.isUndefined(fitted)) __obj.updateDynamic("fitted")(fitted.asInstanceOf[js.Any])
    if (flipped != null) __obj.updateDynamic("flipped")(flipped.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (!js.isUndefined(link)) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rotated != null) __obj.updateDynamic("rotated")(rotated.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IconProps
}

