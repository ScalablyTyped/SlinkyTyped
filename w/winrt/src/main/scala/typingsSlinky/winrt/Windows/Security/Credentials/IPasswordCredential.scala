package typingsSlinky.winrt.Windows.Security.Credentials

import typingsSlinky.winrt.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPasswordCredential extends js.Object {
  var password: String = js.native
  var properties: IPropertySet = js.native
  var resource: String = js.native
  var userName: String = js.native
  def retrievePassword(): Unit = js.native
}

object IPasswordCredential {
  @scala.inline
  def apply(
    password: String,
    properties: IPropertySet,
    resource: String,
    retrievePassword: () => Unit,
    userName: String
  ): IPasswordCredential = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], retrievePassword = js.Any.fromFunction0(retrievePassword), userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPasswordCredential]
  }
  @scala.inline
  implicit class IPasswordCredentialOps[Self <: IPasswordCredential] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: IPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetrievePassword(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retrievePassword")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

