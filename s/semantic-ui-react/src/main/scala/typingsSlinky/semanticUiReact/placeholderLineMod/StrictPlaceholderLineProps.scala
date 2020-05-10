package typingsSlinky.semanticUiReact.placeholderLineMod

import typingsSlinky.semanticUiReact.semanticUiReactStrings.`very long`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`very short`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.full
import typingsSlinky.semanticUiReact.semanticUiReactStrings.long
import typingsSlinky.semanticUiReact.semanticUiReactStrings.medium
import typingsSlinky.semanticUiReact.semanticUiReactStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictPlaceholderLineProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** A line can specify how long its contents should appear. */
  var length: js.UndefOr[full | (`very long`) | long | medium | short | (`very short`)] = js.native
}

object StrictPlaceholderLineProps {
  @scala.inline
  def apply(): StrictPlaceholderLineProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictPlaceholderLineProps]
  }
  @scala.inline
  implicit class StrictPlaceholderLinePropsOps[Self <: StrictPlaceholderLineProps] (val x: Self) extends AnyVal {
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
    def withLength(value: full | (`very long`) | long | medium | short | (`very short`)): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
  }
  
}

