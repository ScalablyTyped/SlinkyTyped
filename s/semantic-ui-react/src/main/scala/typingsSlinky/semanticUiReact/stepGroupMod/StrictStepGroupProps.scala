package typingsSlinky.semanticUiReact.stepGroupMod

import slinky.core.TagMod
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.semanticUiReactNumbers.`1`
import typingsSlinky.semanticUiReact.semanticUiReactNumbers.`2`
import typingsSlinky.semanticUiReact.semanticUiReactNumbers.`3`
import typingsSlinky.semanticUiReact.semanticUiReactNumbers.`4`
import typingsSlinky.semanticUiReact.semanticUiReactNumbers.`5`
import typingsSlinky.semanticUiReact.semanticUiReactNumbers.`6`
import typingsSlinky.semanticUiReact.semanticUiReactNumbers.`7`
import typingsSlinky.semanticUiReact.semanticUiReactNumbers.`8`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.big
import typingsSlinky.semanticUiReact.semanticUiReactStrings.bottom
import typingsSlinky.semanticUiReact.semanticUiReactStrings.eight
import typingsSlinky.semanticUiReact.semanticUiReactStrings.five
import typingsSlinky.semanticUiReact.semanticUiReactStrings.four
import typingsSlinky.semanticUiReact.semanticUiReactStrings.huge
import typingsSlinky.semanticUiReact.semanticUiReactStrings.large
import typingsSlinky.semanticUiReact.semanticUiReactStrings.massive
import typingsSlinky.semanticUiReact.semanticUiReactStrings.mini
import typingsSlinky.semanticUiReact.semanticUiReactStrings.one
import typingsSlinky.semanticUiReact.semanticUiReactStrings.seven
import typingsSlinky.semanticUiReact.semanticUiReactStrings.six
import typingsSlinky.semanticUiReact.semanticUiReactStrings.small
import typingsSlinky.semanticUiReact.semanticUiReactStrings.tablet
import typingsSlinky.semanticUiReact.semanticUiReactStrings.three
import typingsSlinky.semanticUiReact.semanticUiReactStrings.tiny
import typingsSlinky.semanticUiReact.semanticUiReactStrings.top
import typingsSlinky.semanticUiReact.semanticUiReactStrings.two
import typingsSlinky.semanticUiReact.stepStepMod.StepProps
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
    `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`1` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`2` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`3` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`4` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`5` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`6` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`7` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`8` | one | two | three | four | five | six | seven | eight
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
    widths: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`1` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`2` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`3` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`4` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`5` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`6` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`7` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`8` | one | two | three | four | five | six | seven | eight = null
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

