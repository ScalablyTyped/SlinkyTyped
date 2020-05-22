package typingsSlinky.winrtUwp.global.Windows.ApplicationModel.Contacts

import typingsSlinky.winrtUwp.Windows.Data.Text.TextSegment
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details about why search results matched the query parameters. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactMatchReason")
@js.native
abstract class ContactMatchReason ()
  extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts.ContactMatchReason {
  /** Gets the contact field type that matched the search, such as name, phone number, email address and so on. */
  /* CompleteClass */
  override var field: typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts.ContactMatchReasonKind = js.native
  /** Gets a list of matching TextSegment objects which tells you what to highlight in your view as the result of a contact search. */
  /* CompleteClass */
  override var segments: IVectorView[TextSegment] = js.native
  /** Gets the matching text result from a contact search. */
  /* CompleteClass */
  override var text: String = js.native
}

