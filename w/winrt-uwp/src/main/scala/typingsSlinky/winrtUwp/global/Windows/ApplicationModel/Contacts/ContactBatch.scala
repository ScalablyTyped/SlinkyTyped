package typingsSlinky.winrtUwp.global.Windows.ApplicationModel.Contacts

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a group of Contact objects and server search status. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactBatch")
@js.native
abstract class ContactBatch ()
  extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts.ContactBatch {
  /** Gets the list of Contact objects returned by a search operation. */
  /* CompleteClass */
  override var contacts: IVectorView[typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts.Contact] = js.native
  /** Gets a ContactBatchStatus value that indicates if a search was successful or if there was a server error. */
  /* CompleteClass */
  override var status: typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts.ContactBatchStatus = js.native
}

