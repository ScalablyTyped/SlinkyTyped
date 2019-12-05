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

object PlaceholderLine
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("semantic-ui-react/dist/commonjs/elements/Placeholder/PlaceholderLine", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    as: js.Any = null,
    length: full | (`very long`) | long | medium | short | (`very short`) = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PlaceholderLineProps
}

