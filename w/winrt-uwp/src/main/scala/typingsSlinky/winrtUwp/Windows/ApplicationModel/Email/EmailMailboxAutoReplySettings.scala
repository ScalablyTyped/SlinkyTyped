package typingsSlinky.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the settings for the automatic reply functionality of an email account. */
@js.native
trait EmailMailboxAutoReplySettings extends js.Object {
  /** Represents the end time for the automated reply period. */
  var endTime: js.Date = js.native
  /** Gets the automatic reply message intended for an email message from an internal sender. */
  var internalReply: EmailMailboxAutoReply = js.native
  /** Gets a Boolean value indicating whether automatic replies are enabled. */
  var isEnabled: Boolean = js.native
  /** Gets the automatic reply message intended for an email message from a known external sender. */
  var knownExternalReply: EmailMailboxAutoReply = js.native
  /** Gets or sets whether the automated response email message is encoded as HTML or plain text. */
  var responseKind: EmailMailboxAutoReplyMessageResponseKind = js.native
  /** Represents the start time for the automated reply period. */
  var startTime: js.Date = js.native
  /** Gets the automatic reply message intended for an email message from an unknown external sender. */
  var unknownExternalReply: EmailMailboxAutoReply = js.native
}

object EmailMailboxAutoReplySettings {
  @scala.inline
  def apply(
    endTime: js.Date,
    internalReply: EmailMailboxAutoReply,
    isEnabled: Boolean,
    knownExternalReply: EmailMailboxAutoReply,
    responseKind: EmailMailboxAutoReplyMessageResponseKind,
    startTime: js.Date,
    unknownExternalReply: EmailMailboxAutoReply
  ): EmailMailboxAutoReplySettings = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], internalReply = internalReply.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], knownExternalReply = knownExternalReply.asInstanceOf[js.Any], responseKind = responseKind.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], unknownExternalReply = unknownExternalReply.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailMailboxAutoReplySettings]
  }
  @scala.inline
  implicit class EmailMailboxAutoReplySettingsOps[Self <: EmailMailboxAutoReplySettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInternalReply(value: EmailMailboxAutoReply): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalReply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKnownExternalReply(value: EmailMailboxAutoReply): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knownExternalReply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseKind(value: EmailMailboxAutoReplyMessageResponseKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnknownExternalReply(value: EmailMailboxAutoReply): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownExternalReply")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

