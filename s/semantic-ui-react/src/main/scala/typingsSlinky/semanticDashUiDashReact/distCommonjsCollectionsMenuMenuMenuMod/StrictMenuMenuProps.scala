package typingsSlinky.semanticDashUiDashReact.distCommonjsCollectionsMenuMenuMenuMod

import slinky.core.TagMod
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.left
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictMenuMenuProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** A sub menu can take left or right position. */
  var position: js.UndefOr[left | right] = js.undefined
}

object StrictMenuMenuProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    children: TagMod[Any] = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    position: left | right = null
  ): StrictMenuMenuProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictMenuMenuProps]
  }
}

