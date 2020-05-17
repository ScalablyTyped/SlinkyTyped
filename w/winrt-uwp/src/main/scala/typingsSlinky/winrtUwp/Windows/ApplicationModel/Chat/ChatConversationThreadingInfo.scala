package typingsSlinky.winrtUwp.Windows.ApplicationModel.Chat

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides threading info for a ChatConversation . */
@js.native
trait ChatConversationThreadingInfo extends js.Object {
  /** Gets or sets the Contact.Id for the remote participant. */
  var contactId: String = js.native
  /** Gets or sets the ID of the ChatConversation . */
  var conversationId: String = js.native
  /** Gets or sets a string where you can store your own custom threading info. */
  var custom: String = js.native
  /** Gets or sets a value that indicates the type of threading info, such as participant, contact ID, conversation ID, and so on. */
  var kind: ChatConversationThreadingKind = js.native
  /** Gets the list of participants in the ChatConversation . */
  var participants: IVector[String] = js.native
}

object ChatConversationThreadingInfo {
  @scala.inline
  def apply(
    contactId: String,
    conversationId: String,
    custom: String,
    kind: ChatConversationThreadingKind,
    participants: IVector[String]
  ): ChatConversationThreadingInfo = {
    val __obj = js.Dynamic.literal(contactId = contactId.asInstanceOf[js.Any], conversationId = conversationId.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], participants = participants.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatConversationThreadingInfo]
  }
  @scala.inline
  implicit class ChatConversationThreadingInfoOps[Self <: ChatConversationThreadingInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContactId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConversationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: ChatConversationThreadingKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParticipants(value: IVector[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participants")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

