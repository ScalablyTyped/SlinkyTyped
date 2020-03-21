package typingsSlinky.wordpressNotices

import typingsSlinky.wordpressNotices.mod.Action
import typingsSlinky.wordpressNotices.wordpressNoticesStrings.default
import typingsSlinky.wordpressNotices.wordpressNoticesStrings.snackbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@wordpress/notices.@wordpress/notices.Options> */
trait PartialOptions extends js.Object {
  var actions: js.UndefOr[js.Array[Action]] = js.undefined
  var context: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var isDismissible: js.UndefOr[Boolean] = js.undefined
  var speak: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[default | snackbar] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(
    actions: js.Array[Action] = null,
    context: String = null,
    id: String = null,
    isDismissible: js.UndefOr[Boolean] = js.undefined,
    speak: js.UndefOr[Boolean] = js.undefined,
    `type`: default | snackbar = null
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isDismissible)) __obj.updateDynamic("isDismissible")(isDismissible.asInstanceOf[js.Any])
    if (!js.isUndefined(speak)) __obj.updateDynamic("speak")(speak.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

