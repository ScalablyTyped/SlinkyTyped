package typingsSlinky.semanticUiReact.cardGroupMod

import slinky.core.TagMod
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
  var children: js.UndefOr[TagMod[Any]] = js.undefined
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
  def apply(
    as: js.Any = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    children: TagMod[Any] = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    doubling: js.UndefOr[Boolean] = js.undefined,
    items: SemanticShorthandCollection[CardProps] = null,
    itemsPerRow: SemanticWIDTHS = null,
    stackable: js.UndefOr[Boolean] = js.undefined,
    textAlign: center | left | right = null
  ): StrictCardGroupProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(doubling)) __obj.updateDynamic("doubling")(doubling.get.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (itemsPerRow != null) __obj.updateDynamic("itemsPerRow")(itemsPerRow.asInstanceOf[js.Any])
    if (!js.isUndefined(stackable)) __obj.updateDynamic("stackable")(stackable.get.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictCardGroupProps]
  }
}

