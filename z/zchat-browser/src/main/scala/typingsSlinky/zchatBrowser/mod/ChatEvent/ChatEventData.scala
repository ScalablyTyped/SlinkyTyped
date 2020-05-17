package typingsSlinky.zchatBrowser.mod.ChatEvent

import typingsSlinky.zchatBrowser.anon.BaseChatEventDatatypechat
import typingsSlinky.zchatBrowser.anon.BaseChatEventDatatypechatAttachment
import typingsSlinky.zchatBrowser.anon.BaseChatEventDatatypechatComment
import typingsSlinky.zchatBrowser.anon.BaseChatEventDatatypechatDisplayname
import typingsSlinky.zchatBrowser.anon.BaseChatEventDatatypechatNewrating
import typingsSlinky.zchatBrowser.anon.BaseChatEventDatatypechatNick
import typingsSlinky.zchatBrowser.anon.BaseChatEventDatatypechatTimestamp
import typingsSlinky.zchatBrowser.mod.EventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.zchatBrowser.anon.BaseChatEventDatatypechat
  - typingsSlinky.zchatBrowser.anon.BaseChatEventDatatypechatAttachment
  - typingsSlinky.zchatBrowser.anon.BaseChatEventDatatypechatDisplayname
  - typingsSlinky.zchatBrowser.anon.BaseChatEventDatatypechatNick
  - typingsSlinky.zchatBrowser.anon.BaseChatEventDatatypechatTimestamp
  - typingsSlinky.zchatBrowser.anon.BaseChatEventDatatypechatNewrating
  - typingsSlinky.zchatBrowser.anon.BaseChatEventDatatypechatComment
*/
trait ChatEventData extends EventData

object ChatEventData {
  @scala.inline
  implicit def apply(value: BaseChatEventDatatypechat): ChatEventData = value.asInstanceOf[ChatEventData]
  @scala.inline
  implicit def apply(value: BaseChatEventDatatypechatAttachment): ChatEventData = value.asInstanceOf[ChatEventData]
  @scala.inline
  implicit def apply(value: BaseChatEventDatatypechatComment): ChatEventData = value.asInstanceOf[ChatEventData]
  @scala.inline
  implicit def apply(value: BaseChatEventDatatypechatDisplayname): ChatEventData = value.asInstanceOf[ChatEventData]
  @scala.inline
  implicit def apply(value: BaseChatEventDatatypechatNewrating): ChatEventData = value.asInstanceOf[ChatEventData]
  @scala.inline
  implicit def apply(value: BaseChatEventDatatypechatNick): ChatEventData = value.asInstanceOf[ChatEventData]
  @scala.inline
  implicit def apply(value: BaseChatEventDatatypechatTimestamp): ChatEventData = value.asInstanceOf[ChatEventData]
}

