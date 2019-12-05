package typingsSlinky.semanticDashUiDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.semanticDashUiDashReact.distCommonjsElementsStepStepGroupMod.StepGroupProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsElementsStepStepMod.StepProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandCollection
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactNumbers.`1`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactNumbers.`2`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactNumbers.`3`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactNumbers.`4`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactNumbers.`5`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactNumbers.`6`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactNumbers.`7`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactNumbers.`8`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.big
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.bottom
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.eight
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.five
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.four
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.huge
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.large
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.massive
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.mini
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.one
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.seven
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.six
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.small
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.tablet
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.three
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.tiny
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.top
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.two
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StepGroup
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("semantic-ui-react/dist/commonjs/elements/Step/StepGroup", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    as: js.Any = null,
    attached: Boolean | bottom | top = null,
    content: SemanticShorthandContent = null,
    fluid: js.UndefOr[Boolean] = js.undefined,
    items: SemanticShorthandCollection[StepProps] = null,
    ordered: js.UndefOr[Boolean] = js.undefined,
    size: mini | tiny | small | large | big | huge | massive = null,
    stackable: tablet = null,
    unstackable: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined,
    widths: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`1` | typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`2` | typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`3` | typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`4` | typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`5` | typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`6` | typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`7` | typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`8` | one | two | three | four | five | six | seven | eight = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (attached != null) __obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(ordered)) __obj.updateDynamic("ordered")(ordered.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (stackable != null) __obj.updateDynamic("stackable")(stackable.asInstanceOf[js.Any])
    if (!js.isUndefined(unstackable)) __obj.updateDynamic("unstackable")(unstackable.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (widths != null) __obj.updateDynamic("widths")(widths.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = StepGroupProps
}

