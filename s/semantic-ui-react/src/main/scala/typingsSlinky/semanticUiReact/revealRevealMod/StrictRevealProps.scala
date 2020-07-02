package typingsSlinky.semanticUiReact.revealRevealMod

import slinky.core.facade.ReactElement
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`move down`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`move right`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`move up`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`rotate left`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`small fade`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.fade
import typingsSlinky.semanticUiReact.semanticUiReactStrings.move
import typingsSlinky.semanticUiReact.semanticUiReactStrings.rotate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictRevealProps extends js.Object {
  /** An active reveal displays its hidden content. */
  var active: js.UndefOr[Boolean] = js.undefined
  /** An animation name that will be applied to Reveal. */
  var animated: js.UndefOr[
    fade | (`small fade`) | move | (`move right`) | (`move up`) | (`move down`) | rotate | (`rotate left`)
  ] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactElement] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** A disabled reveal will not animate when hovered. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** An element can show its content without delay. */
  var instant: js.UndefOr[Boolean] = js.undefined
}

object StrictRevealProps {
  @scala.inline
  def apply(): StrictRevealProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictRevealProps]
  }
  @scala.inline
  implicit class StrictRevealPropsOps[Self <: StrictRevealProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setAnimated(
      value: fade | (`small fade`) | move | (`move right`) | (`move up`) | (`move down`) | rotate | (`rotate left`)
    ): Self = this.set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    @scala.inline
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContentReactElement(value: ReactElement): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: SemanticShorthandContent): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setInstant(value: Boolean): Self = this.set("instant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstant: Self = this.set("instant", js.undefined)
  }
  
}

