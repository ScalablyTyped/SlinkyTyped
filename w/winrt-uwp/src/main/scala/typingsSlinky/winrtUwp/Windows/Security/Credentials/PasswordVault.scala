package typingsSlinky.winrtUwp.Windows.Security.Credentials

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Credential Locker of credentials. The contents of the locker are specific to the app or service. Apps and services don't have access to credentials associated with other apps or services. */
@js.native
trait PasswordVault extends js.Object {
  /**
    * Adds a credential to the Credential Locker.
    * @param credential The credential to be added.
    */
  def add(credential: PasswordCredential): Unit = js.native
  /**
    * Searches the Credential Locker for credentials matching the resource specified.
    * @param resource The resource to be searched for.
    * @return When this method returns, contains an IVectorView of credential objects that match the search criteria.
    */
  def findAllByResource(resource: String): IVectorView[PasswordCredential] = js.native
  /**
    * Searches the Credential Locker for credentials that match the user name specified.
    * @param userName The user name to be searched for.
    * @return When this method returns, contains an IVectorView of credential objects that match the search criteria.
    */
  def findAllByUserName(userName: String): IVectorView[PasswordCredential] = js.native
  /**
    * Removes a credential from the Credential Locker.
    * @param credential The credential to be removed.
    */
  def remove(credential: PasswordCredential): Unit = js.native
  /**
    * Reads a credential from the Credential Locker.
    * @param resource The resource for which the credential is used.
    * @param userName The user name that must be present in the credential.
    * @return The returned credential that contains all the data.
    */
  def retrieve(resource: String, userName: String): PasswordCredential = js.native
  /**
    * Retrieves all of the credentials stored in the Credential Locker.
    * @return When this method returns, contains an IVectorView output of credential objects that match the search criteria. This output is a snapshot and not dynamic. If the results are used for updating or deleting credentials, those changes won't be reflected in the previous output.
    */
  def retrieveAll(): IVectorView[PasswordCredential] = js.native
}

object PasswordVault {
  @scala.inline
  def apply(
    add: PasswordCredential => Unit,
    findAllByResource: String => IVectorView[PasswordCredential],
    findAllByUserName: String => IVectorView[PasswordCredential],
    remove: PasswordCredential => Unit,
    retrieve: (String, String) => PasswordCredential,
    retrieveAll: () => IVectorView[PasswordCredential]
  ): PasswordVault = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), findAllByResource = js.Any.fromFunction1(findAllByResource), findAllByUserName = js.Any.fromFunction1(findAllByUserName), remove = js.Any.fromFunction1(remove), retrieve = js.Any.fromFunction2(retrieve), retrieveAll = js.Any.fromFunction0(retrieveAll))
    __obj.asInstanceOf[PasswordVault]
  }
  @scala.inline
  implicit class PasswordVaultOps[Self <: PasswordVault] (val x: Self) extends AnyVal {
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

