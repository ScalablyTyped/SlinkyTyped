package typingsSlinky.semanticUiReact.stepGroupMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
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

@js.native
trait StrictStepGroupProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Steps can be attached to other elements. */
  var attached: js.UndefOr[Boolean | bottom | top] = js.native
  /** Primary content. */
  var children: js.UndefOr[TagMod[Any]] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  /** A fluid step takes up the width of its container. */
  var fluid: js.UndefOr[Boolean] = js.native
  /** Shorthand array of props for Step. */
  var items: js.UndefOr[SemanticShorthandCollection[StepProps]] = js.native
  /** A step can show a ordered sequence of steps. */
  var ordered: js.UndefOr[Boolean] = js.native
  /** Steps can have different sizes. */
  var size: js.UndefOr[mini | tiny | small | large | big | huge | massive] = js.native
  /** A step can stack vertically only on smaller screens. */
  var stackable: js.UndefOr[tablet] = js.native
  /** A step can prevent itself from stacking on mobile. */
  var unstackable: js.UndefOr[Boolean] = js.native
  /** A step can be displayed stacked vertically. */
  var vertical: js.UndefOr[Boolean] = js.native
  /** Steps can be divided evenly inside their parent. */
  var widths: js.UndefOr[
    `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`1` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`2` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`3` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`4` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`5` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`6` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`7` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`8` | one | two | three | four | five | six | seven | eight
  ] = js.native
}

object StrictStepGroupProps {
  @scala.inline
  def apply(): StrictStepGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictStepGroupProps]
  }
  @scala.inline
  implicit class StrictStepGroupPropsOps[Self <: StrictStepGroupProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.undefined)
        ret
    }
    @scala.inline
    def withAttached(value: Boolean | bottom | top): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttached: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attached")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withContentReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: SemanticShorthandContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withFluid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fluid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFluid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fluid")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: SemanticShorthandCollection[StepProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withOrdered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrdered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordered")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: mini | tiny | small | large | big | huge | massive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withStackable(value: tablet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackable")(js.undefined)
        ret
    }
    @scala.inline
    def withUnstackable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unstackable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnstackable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unstackable")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
    @scala.inline
    def withWidths(
      value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`1` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`2` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`3` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`4` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`5` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`6` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`7` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`8` | one | two | three | four | five | six | seven | eight
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widths")(js.undefined)
        ret
    }
  }
  
}

