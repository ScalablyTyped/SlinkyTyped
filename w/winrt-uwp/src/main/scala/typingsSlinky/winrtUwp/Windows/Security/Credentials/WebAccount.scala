package typingsSlinky.winrtUwp.Windows.Security.Credentials

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Identifies an account from a web account provider. */
@js.native
trait WebAccount extends js.Object {
  
  /**
    * Gets the web account's picture asynchronously.
    * @param desizedSize The desired size of the web account picture.
    * @return When this method completes, it returns the web account's picture.
    */
  def getPictureAsync(desizedSize: WebAccountPictureSize): IPromiseWithIAsyncOperation[IRandomAccessStream] = js.native
  
  /** Gets the Id of the web account. */
  var id: String = js.native
  
  /** Gets the properties of the web account. */
  var properties: IMapView[String, String] = js.native
  
  /**
    * Signs the web account out asynchronously. This clears all cached tokens associated with the account, and tells the provider to invalidate any tokens associated with the account for this app.
    * @return This method does not return a value.
    */
  def signOutAsync(): IPromiseWithIAsyncAction = js.native
  /**
    * Signs the web account out asynchronously. This clears all cached tokens associated with the account, and tells the provider to invalidate any tokens associated with the account for this app.
    * @param clientId The Id of the client.
    * @return This method does not return a value.
    */
  def signOutAsync(clientId: String): IPromiseWithIAsyncAction = js.native
  
  /** Gets the connected state of the web account. */
  var state: WebAccountState = js.native
  
  /** Gets the username for the web account. */
  var userName: String = js.native
  
  /** Gets the web authentication provider for the account. */
  var webAccountProvider: WebAccountProvider = js.native
}
