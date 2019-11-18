package typingsSlinky.semanticDashUiDashReact.distCommonjsViewsFeedFeedMod

import slinky.core.TagMod
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandCollection
import typingsSlinky.semanticDashUiDashReact.distCommonjsViewsFeedFeedEventMod.FeedEventProps
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.large
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictFeedProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Shorthand array of props for FeedEvent. */
  var events: js.UndefOr[SemanticShorthandCollection[FeedEventProps]] = js.undefined
  /** A feed can have different sizes. */
  var size: js.UndefOr[small | large] = js.undefined
}

object StrictFeedProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    children: TagMod[Any] = null,
    className: String = null,
    events: SemanticShorthandCollection[FeedEventProps] = null,
    size: small | large = null
  ): StrictFeedProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictFeedProps]
  }
}

