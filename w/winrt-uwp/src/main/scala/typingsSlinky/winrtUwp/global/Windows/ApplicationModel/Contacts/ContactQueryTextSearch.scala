package typingsSlinky.winrtUwp.global.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies parameters to use in a text search of Contact objects. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactQueryTextSearch")
@js.native
abstract class ContactQueryTextSearch ()
  extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts.ContactQueryTextSearch {
  /** Gets or sets which contact fields to search for a text match. */
  /* CompleteClass */
  override var fields: typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts.ContactQuerySearchFields = js.native
  /** Gets or sets a value that specifies either a local or server search. */
  /* CompleteClass */
  override var searchScope: typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts.ContactQuerySearchScope = js.native
  /** Gets or sets the text for which to search. */
  /* CompleteClass */
  override var text: String = js.native
}

