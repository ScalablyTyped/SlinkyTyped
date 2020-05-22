package typingsSlinky.wordpressComponents.listMod.NoticeList

import slinky.core.TagMod
import typingsSlinky.wordpressComponents.noticeMod.Notice.Action
import typingsSlinky.wordpressNotices.mod.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<@wordpress/components.@wordpress/components/notice.default.Props, 'children' | 'onRemove'> */
trait Notice extends js.Object {
  var actions: js.UndefOr[js.Array[Action]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var content: TagMod[Any]
  var id: String
  var isDismissible: js.UndefOr[Boolean] = js.undefined
  var status: js.UndefOr[Status] = js.undefined
}

object Notice {
  @scala.inline
  def apply(
    id: String,
    actions: js.Array[Action] = null,
    className: String = null,
    content: TagMod[Any] = null,
    isDismissible: js.UndefOr[Boolean] = js.undefined,
    status: Status = null
  ): Notice = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(isDismissible)) __obj.updateDynamic("isDismissible")(isDismissible.get.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notice]
  }
}

