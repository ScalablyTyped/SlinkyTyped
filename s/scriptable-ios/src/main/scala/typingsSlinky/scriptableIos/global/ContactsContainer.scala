package typingsSlinky.scriptableIos.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Collection of contacts._
  * @see https://docs.scriptable.app/contactscontainer
  */
@JSGlobal("ContactsContainer")
@js.native
class ContactsContainer ()
  extends typingsSlinky.scriptableIos.ContactsContainer
/* static members */
@JSGlobal("ContactsContainer")
@js.native
object ContactsContainer extends js.Object {
  
  /**
    * _Fetches all contacts containers._
    * @see https://docs.scriptable.app/contactscontainer/#all
    */
  def all(): js.Promise[js.Array[typingsSlinky.scriptableIos.ContactsContainer]] = js.native
  
  /**
    * _Fetches default contacts container._
    * @see https://docs.scriptable.app/contactscontainer/#default
    */
  def default(): js.Promise[typingsSlinky.scriptableIos.ContactsContainer] = js.native
  
  /**
    * _Fetches a contacts container._
    * @param identifier - Identifier of the contacts container to fetch.
    * @see https://docs.scriptable.app/contactscontainer/#withidentifier
    */
  def withIdentifier(identifier: String): js.Promise[typingsSlinky.scriptableIos.ContactsContainer] = js.native
}
