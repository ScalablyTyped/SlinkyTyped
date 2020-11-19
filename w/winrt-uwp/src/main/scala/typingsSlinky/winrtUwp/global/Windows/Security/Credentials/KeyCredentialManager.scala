package typingsSlinky.winrtUwp.global.Windows.Security.Credentials

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains methods for basic management of key credentials. */
@JSGlobal("Windows.Security.Credentials.KeyCredentialManager")
@js.native
abstract class KeyCredentialManager ()
  extends typingsSlinky.winrtUwp.Windows.Security.Credentials.KeyCredentialManager
/* static members */
@JSGlobal("Windows.Security.Credentials.KeyCredentialManager")
@js.native
object KeyCredentialManager extends js.Object {
  
  /**
    * Deletes a previously provisioned user identity key for the current user and application.
    * @param name The name of the key to delete.
    * @return This method does not return a value.
    */
  def deleteAsync(name: String): IPromiseWithIAsyncAction = js.native
  
  /**
    * Determines if the current device and user is capable of provisioning a key credential.
    * @return When this method completes, it returns true if the current device and user is capable of provisioning a key credential. Otherwise, it returns false.
    */
  def isSupportedAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  
  /**
    * Retrieves a key credential for the current user and application.
    * @param name The name of the key credential to open.
    * @return When this method completes, it returns the results of the key credential retrieval.
    */
  def openAsync(name: String): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Security.Credentials.KeyCredentialRetrievalResult] = js.native
  
  /**
    * Renews an attestation for a key credential.
    * @return This method does not return a value.
    */
  def renewAttestationAsync(): IPromiseWithIAsyncAction = js.native
  
  /**
    * Creates a new key credential for the current user and application.
    * @param name The name of the key credential to create.
    * @param option Options for the creation operation.
    * @return When this method completes, it returns the results of the key credential creation.
    */
  def requestCreateAsync(
    name: String,
    option: typingsSlinky.winrtUwp.Windows.Security.Credentials.KeyCredentialCreationOption
  ): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Security.Credentials.KeyCredentialRetrievalResult] = js.native
}
