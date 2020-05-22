package typingsSlinky.winrtUwp.global.Windows.ApplicationModel.Email

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reads a batch of email conversations. */
@JSGlobal("Windows.ApplicationModel.Email.EmailConversationReader")
@js.native
abstract class EmailConversationReader ()
  extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Email.EmailConversationReader {
  /**
    * Asynchronously reads a batch of email conversations.
    * @return Returns a batch of email conversations.
    */
  /* CompleteClass */
  override def readBatchAsync(): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.ApplicationModel.Email.EmailConversationBatch] = js.native
}

