package typingsSlinky.winrt.Windows.Security.Credentials

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPasswordVault extends js.Object {
  def add(credential: PasswordCredential): Unit = js.native
  def findAllByResource(resource: String): IVectorView[PasswordCredential] = js.native
  def findAllByUserName(userName: String): IVectorView[PasswordCredential] = js.native
  def remove(credential: PasswordCredential): Unit = js.native
  def retrieve(resource: String, userName: String): PasswordCredential = js.native
  def retrieveAll(): IVectorView[PasswordCredential] = js.native
}

object IPasswordVault {
  @scala.inline
  def apply(
    add: PasswordCredential => Unit,
    findAllByResource: String => IVectorView[PasswordCredential],
    findAllByUserName: String => IVectorView[PasswordCredential],
    remove: PasswordCredential => Unit,
    retrieve: (String, String) => PasswordCredential,
    retrieveAll: () => IVectorView[PasswordCredential]
  ): IPasswordVault = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), findAllByResource = js.Any.fromFunction1(findAllByResource), findAllByUserName = js.Any.fromFunction1(findAllByUserName), remove = js.Any.fromFunction1(remove), retrieve = js.Any.fromFunction2(retrieve), retrieveAll = js.Any.fromFunction0(retrieveAll))
    __obj.asInstanceOf[IPasswordVault]
  }
  @scala.inline
  implicit class IPasswordVaultOps[Self <: IPasswordVault] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: PasswordCredential => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindAllByResource(value: String => IVectorView[PasswordCredential]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findAllByResource")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindAllByUserName(value: String => IVectorView[PasswordCredential]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findAllByUserName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: PasswordCredential => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRetrieve(value: (String, String) => PasswordCredential): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retrieve")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRetrieveAll(value: () => IVectorView[PasswordCredential]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retrieveAll")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

