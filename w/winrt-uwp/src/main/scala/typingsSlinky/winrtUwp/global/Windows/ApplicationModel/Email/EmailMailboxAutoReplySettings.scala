package typingsSlinky.winrtUwp.global.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the settings for the automatic reply functionality of an email account. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxAutoReplySettings")
@js.native
/** Initializes a new instance of an EmailMailboxAutoReplySettings object. */
class EmailMailboxAutoReplySettings ()
  extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxAutoReplySettings {
  /** Represents the end time for the automated reply period. */
  /* CompleteClass */
  override var endTime: js.Date = js.native
  /** Gets the automatic reply message intended for an email message from an internal sender. */
  /* CompleteClass */
  override var internalReply: typingsSlinky.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxAutoReply = js.native
  /** Gets a Boolean value indicating whether automatic replies are enabled. */
  /* CompleteClass */
  override var isEnabled: Boolean = js.native
  /** Gets the automatic reply message intended for an email message from a known external sender. */
  /* CompleteClass */
  override var knownExternalReply: typingsSlinky.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxAutoReply = js.native
  /** Gets or sets whether the automated response email message is encoded as HTML or plain text. */
  /* CompleteClass */
  override var responseKind: typingsSlinky.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxAutoReplyMessageResponseKind = js.native
  /** Represents the start time for the automated reply period. */
  /* CompleteClass */
  override var startTime: js.Date = js.native
  /** Gets the automatic reply message intended for an email message from an unknown external sender. */
  /* CompleteClass */
  override var unknownExternalReply: typingsSlinky.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxAutoReply = js.native
}

