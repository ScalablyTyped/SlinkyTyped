package typingsSlinky.semanticDashUiDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsSlinky.semanticDashUiDashReact.distCommonjsModulesDimmerDimmerDimmableMod.DimmerDimmableProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsModulesDimmerDimmerDimmableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DimmerDimmable
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("semantic-ui-react/dist/commonjs/modules/Dimmer/DimmerDimmable", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    as: js.Any = null,
    blurring: js.UndefOr[Boolean] = js.undefined,
    content: SemanticShorthandContent = null,
    dimmed: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(blurring)) __obj.updateDynamic("blurring")(blurring.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(dimmed)) __obj.updateDynamic("dimmed")(dimmed.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.semanticDashUiDashReact.distCommonjsModulesDimmerDimmerDimmableMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DimmerDimmableProps
}

