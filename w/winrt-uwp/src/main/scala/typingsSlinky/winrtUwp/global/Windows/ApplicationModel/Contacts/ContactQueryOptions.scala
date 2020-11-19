package typingsSlinky.winrtUwp.global.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to specify the query options when searching for contacts. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactQueryOptions")
@js.native
/** Initializes a new instance of the ContactQueryOptions class. */
class ContactQueryOptions ()
  extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts.ContactQueryOptions {
  /**
    * Initializes a new instance of the ContactQueryOptions class.
    * @param text The text to match in the search operation.
    */
  def this(text: String) = this()
  /**
    * Initializes a new instance of the ContactQueryOptions class.
    * @param text The text to match in the search operation.
    * @param fields Specifies which contact fields to search for a match.
    */
  def this(
    text: String,
    fields: typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts.ContactQuerySearchFields
  ) = this()
}
