package typingsSlinky.wordpressComponents.withNoticesMod.withNotices

import slinky.core.TagMod
import typingsSlinky.wordpressComponents.anon.CreateErrorNotice
import typingsSlinky.wordpressComponents.listMod.NoticeList.Notice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var noticeList: js.Array[Notice]
  var noticeOperations: CreateErrorNotice
  var noticeUI: TagMod[Any]
}

object Props {
  @scala.inline
  def apply(noticeList: js.Array[Notice], noticeOperations: CreateErrorNotice, noticeUI: TagMod[Any] = null): Props = {
    val __obj = js.Dynamic.literal(noticeList = noticeList.asInstanceOf[js.Any], noticeOperations = noticeOperations.asInstanceOf[js.Any])
    if (noticeUI != null) __obj.updateDynamic("noticeUI")(noticeUI.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

