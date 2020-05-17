package typingsSlinky.scriptableIos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Collection of contacts._
  * @see https://docs.scriptable.app/contactscontainer
  */
@js.native
trait ContactsContainer extends js.Object {
  /**
    * _Identifier of the contacts container._
    * @see https://docs.scriptable.app/contactscontainer/#identifier
    */
  var identifier: String = js.native
  /**
    * _Name of the contacts container._
    * @see https://docs.scriptable.app/contactscontainer/#name
    */
  var name: String = js.native
}

object ContactsContainer {
  @scala.inline
  def apply(identifier: String, name: String): ContactsContainer = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactsContainer]
  }
  @scala.inline
  implicit class ContactsContainerOps[Self <: ContactsContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

