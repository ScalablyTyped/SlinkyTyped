package typingsSlinky.semanticUiReact.itemGroupMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.itemItemMod.ItemProps
import typingsSlinky.semanticUiReact.semanticUiReactStrings.very
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictItemGroupProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** Items can be divided to better distinguish between grouped content. */
  var divided: js.UndefOr[Boolean] = js.undefined
  /** Shorthand array of props for Item. */
  var items: js.UndefOr[SemanticShorthandCollection[ItemProps]] = js.undefined
  /** An item can be formatted so that the entire contents link to another page. */
  var link: js.UndefOr[Boolean] = js.undefined
  /** A group of items can relax its padding to provide more negative space. */
  var relaxed: js.UndefOr[Boolean | very] = js.undefined
  /** Prevent items from stacking on mobile. */
  var unstackable: js.UndefOr[Boolean] = js.undefined
}

object StrictItemGroupProps {
  @scala.inline
  def apply(): StrictItemGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictItemGroupProps]
  }
  @scala.inline
  implicit class StrictItemGroupPropsOps[Self <: StrictItemGroupProps] (val x: Self) extends AnyVal {
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
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: TagMod[Any]): Self = this.set("children", value.asInstanceOf[js.Any])
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
    def setDivided(value: Boolean): Self = this.set("divided", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDivided: Self = this.set("divided", js.undefined)
    @scala.inline
    def setItems(value: SemanticShorthandCollection[ItemProps]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setLink(value: Boolean): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setRelaxed(value: Boolean | very): Self = this.set("relaxed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelaxed: Self = this.set("relaxed", js.undefined)
    @scala.inline
    def setUnstackable(value: Boolean): Self = this.set("unstackable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnstackable: Self = this.set("unstackable", js.undefined)
  }
  
}

