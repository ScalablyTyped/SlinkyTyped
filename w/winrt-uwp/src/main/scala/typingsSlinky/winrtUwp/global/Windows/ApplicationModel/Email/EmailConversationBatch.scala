package typingsSlinky.winrtUwp.global.Windows.ApplicationModel.Email

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a group of EmailConversation objects for batch processing. */
@JSGlobal("Windows.ApplicationModel.Email.EmailConversationBatch")
@js.native
abstract class EmailConversationBatch ()
  extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Email.EmailConversationBatch {
  /** Gets a list of EmailConversation objects to use for batch processing. */
  /* CompleteClass */
  override var conversations: IVectorView[typingsSlinky.winrtUwp.Windows.ApplicationModel.Email.EmailConversation] = js.native
  /** Gets the status of the last batch processing operation. */
  /* CompleteClass */
  override var status: typingsSlinky.winrtUwp.Windows.ApplicationModel.Email.EmailBatchStatus = js.native
}

