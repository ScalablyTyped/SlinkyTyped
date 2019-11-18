package typingsSlinky.semanticDashUiDashReact.distCommonjsElementsStepStepGroupMod

import slinky.core.TagMod
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

trait StrictStepGroupProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Steps can be attached to other elements. */
  var attached: js.UndefOr[Boolean | bottom | top] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** A fluid step takes up the width of its container. */
  var fluid: js.UndefOr[Boolean] = js.undefined
  /** Shorthand array of props for Step. */
  var items: js.UndefOr[SemanticShorthandCollection[StepProps]] = js.undefined
  /** A step can show a ordered sequence of steps. */
  var ordered: js.UndefOr[Boolean] = js.undefined
  /** Steps can have different sizes. */
  var size: js.UndefOr[mini | tiny | small | large | big | huge | massive] = js.undefined
  /** A step can stack vertically only on smaller screens. */
  var stackable: js.UndefOr[tablet] = js.undefined
  /** A step can prevent itself from stacking on mobile. */
  var unstackable: js.UndefOr[Boolean] = js.undefined
  /** A step can be displayed stacked vertically. */
  var vertical: js.UndefOr[Boolean] = js.undefined
  /** Steps can be divided evenly inside their parent. */
  var widths: js.UndefOr[
    `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`1` | typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`2` | typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`3` | typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`4` | typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`5` | typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`6` | typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`7` | typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`8` | one | two | three | four | five | six | seven | eight
  ] = js.undefined
}

object StrictStepGroupProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    attached: Boolean | bottom | top = null,
    children: TagMod[Any] = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    fluid: js.UndefOr[Boolean] = js.undefined,
    items: SemanticShorthandCollection[StepProps] = null,
    ordered: js.UndefOr[Boolean] = js.undefined,
    size: mini | tiny | small | large | big | huge | massive = null,
    stackable: tablet = null,
    unstackable: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined,
    widths: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`1` | typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`2` | typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`3` | typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`4` | typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`5` | typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`6` | typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`7` | typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`8` | one | two | three | four | five | six | seven | eight = null
  ): StrictStepGroupProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (attached != null) __obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(ordered)) __obj.updateDynamic("ordered")(ordered.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (stackable != null) __obj.updateDynamic("stackable")(stackable.asInstanceOf[js.Any])
    if (!js.isUndefined(unstackable)) __obj.updateDynamic("unstackable")(unstackable.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (widths != null) __obj.updateDynamic("widths")(widths.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictStepGroupProps]
  }
}

