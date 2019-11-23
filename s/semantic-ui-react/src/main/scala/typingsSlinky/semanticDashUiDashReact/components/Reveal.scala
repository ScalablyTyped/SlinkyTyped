package typingsSlinky.semanticDashUiDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.semanticDashUiDashReact.distCommonjsElementsRevealRevealMod.RevealProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`move down`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`move right`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`move up`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`rotate left`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`small fade`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.fade
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.move
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.rotate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Reveal
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typingsSlinky.semanticDashUiDashReact.distCommonjsElementsRevealMod.default.asInstanceOf[String | js.Object]
  /* The following DOM/SVG props were specified: className, disabled */
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    animated: fade | (`small fade`) | move | (`move right`) | (`move up`) | (`move down`) | rotate | (`rotate left`) = null,
    as: js.Any = null,
    content: SemanticShorthandContent = null,
    instant: js.UndefOr[Boolean] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (animated != null) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(instant)) __obj.updateDynamic("instant")(instant.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = RevealProps
}

