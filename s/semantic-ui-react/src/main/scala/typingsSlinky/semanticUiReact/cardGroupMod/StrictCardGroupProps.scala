package typingsSlinky.semanticUiReact.cardGroupMod

import slinky.core.facade.ReactElement
import typingsSlinky.semanticUiReact.cardCardMod.CardProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticWIDTHS
import typingsSlinky.semanticUiReact.semanticUiReactStrings.center
import typingsSlinky.semanticUiReact.semanticUiReactStrings.left
import typingsSlinky.semanticUiReact.semanticUiReactStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictCardGroupProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** A group of cards can center itself inside its container. */
  var centered: js.UndefOr[Boolean] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactElement] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** A group of cards can double its column width for mobile. */
  var doubling: js.UndefOr[Boolean] = js.undefined
  /** Shorthand array of props for Card. */
  var items: js.UndefOr[SemanticShorthandCollection[CardProps]] = js.undefined
  /** A group of cards can set how many cards should exist in a row. */
  var itemsPerRow: js.UndefOr[SemanticWIDTHS] = js.undefined
  /** A group of cards can automatically stack rows to a single columns on mobile devices. */
  var stackable: js.UndefOr[Boolean] = js.undefined
  /** A card group can adjust its text alignment. */
  var textAlign: js.UndefOr[center | left | right] = js.undefined
}

object StrictCardGroupProps {
  @scala.inline
  def apply(): StrictCardGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictCardGroupProps]
  }
  @scala.inline
  implicit class StrictCardGroupPropsOps[Self <: StrictCardGroupProps] (val x: Self) extends AnyVal {
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
    def setCentered(value: Boolean): Self = this.set("centered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCentered: Self = this.set("centered", js.undefined)
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
    def setDoubling(value: Boolean): Self = this.set("doubling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoubling: Self = this.set("doubling", js.undefined)
    @scala.inline
    def setItems(value: SemanticShorthandCollection[CardProps]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setItemsPerRow(value: SemanticWIDTHS): Self = this.set("itemsPerRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemsPerRow: Self = this.set("itemsPerRow", js.undefined)
    @scala.inline
    def setStackable(value: Boolean): Self = this.set("stackable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackable: Self = this.set("stackable", js.undefined)
    @scala.inline
    def setTextAlign(value: center | left | right): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
  }
  
}

