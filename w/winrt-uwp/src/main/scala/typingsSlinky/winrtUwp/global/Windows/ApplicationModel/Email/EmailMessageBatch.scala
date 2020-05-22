package typingsSlinky.winrtUwp.global.Windows.ApplicationModel.Email

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of email messages. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMessageBatch")
@js.native
abstract class EmailMessageBatch ()
  extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Email.EmailMessageBatch {
  /** Gets a batch of email messages. */
  /* CompleteClass */
  override var messages: IVectorView[typingsSlinky.winrtUwp.Windows.ApplicationModel.Email.EmailMessage] = js.native
  /** Gets the status of the email batch read. */
  /* CompleteClass */
  override var status: typingsSlinky.winrtUwp.Windows.ApplicationModel.Email.EmailBatchStatus = js.native
}

