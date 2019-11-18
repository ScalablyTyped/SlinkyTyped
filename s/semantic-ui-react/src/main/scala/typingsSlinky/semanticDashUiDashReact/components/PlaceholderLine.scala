package typingsSlinky.semanticDashUiDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.semanticDashUiDashReact.distCommonjsElementsPlaceholderPlaceholderLineMod.PlaceholderLineProps
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`very long`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`very short`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.full
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.long
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.medium
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className */
object PlaceholderLine
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typingsSlinky.semanticDashUiDashReact.distCommonjsElementsPlaceholderPlaceholderLineMod.default.asInstanceOf[String | js.Object]
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    length: full | (`very long`) | long | medium | short | (`very short`) = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PlaceholderLineProps
}

