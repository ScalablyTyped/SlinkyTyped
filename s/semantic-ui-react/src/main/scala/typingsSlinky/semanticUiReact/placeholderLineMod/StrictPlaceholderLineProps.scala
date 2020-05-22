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

trait StrictPlaceholderLineProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** A line can specify how long its contents should appear. */
  var length: js.UndefOr[full | (`very long`) | long | medium | short | (`very short`)] = js.undefined
}

object StrictPlaceholderLineProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    className: String = null,
    length: full | (`very long`) | long | medium | short | (`very short`) = null
  ): StrictPlaceholderLineProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictPlaceholderLineProps]
  }
}

