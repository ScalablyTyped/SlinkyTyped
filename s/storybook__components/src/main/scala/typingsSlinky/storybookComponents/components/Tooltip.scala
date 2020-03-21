package typingsSlinky.storybookComponents.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.storybookComponents.tooltipMod.TooltipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tooltip
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@storybook/components/dist/tooltip/Tooltip", "Tooltip")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    arrowProps: js.Any = null,
    arrowRef: js.Any = null,
    color: String = null,
    hasChrome: js.UndefOr[Boolean] = js.undefined,
    placement: String = null,
    tooltipRef: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (arrowProps != null) __obj.updateDynamic("arrowProps")(arrowProps.asInstanceOf[js.Any])
    if (arrowRef != null) __obj.updateDynamic("arrowRef")(arrowRef.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(hasChrome)) __obj.updateDynamic("hasChrome")(hasChrome.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (tooltipRef != null) __obj.updateDynamic("tooltipRef")(tooltipRef.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TooltipProps
}

