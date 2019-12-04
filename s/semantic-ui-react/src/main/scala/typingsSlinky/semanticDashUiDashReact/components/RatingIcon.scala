package typingsSlinky.semanticDashUiDashReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.semanticDashUiDashReact.distCommonjsModulesRatingRatingIconMod.RatingIconProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsModulesRatingRatingIconMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RatingIcon
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("semantic-ui-react/dist/commonjs/modules/Rating/RatingIcon", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, selected */
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    index: Int | Double = null,
    onClick: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ RatingIconProps) => Unit = null,
    onKeyUp: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ RatingIconProps) => Unit = null,
    onMouseEnter: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ RatingIconProps) => Unit = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction2(onKeyUp))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction2(onMouseEnter))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = RatingIconProps
}

