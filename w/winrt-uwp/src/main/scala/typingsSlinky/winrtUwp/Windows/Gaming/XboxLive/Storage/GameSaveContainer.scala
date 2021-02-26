package typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@js.native
trait GameSaveContainer extends StObject {
  
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param blobNamePrefix This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def createBlobInfoQuery(blobNamePrefix: String): GameSaveBlobInfoQuery = js.native
  
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param blobsToRead This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def getAsync(blobsToRead: IIterable[String]): IPromiseWithIAsyncOperation[GameSaveBlobGetResult] = js.native
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var name: String = js.native
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var provider: GameSaveProvider = js.native
  
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param blobsToRead This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def readAsync(blobsToRead: IMapView[String, IBuffer]): IPromiseWithIAsyncOperation[GameSaveOperationResult] = js.native
  
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param blobsToWrite This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param blobsToDelete This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param displayName This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def submitPropertySetUpdatesAsync(blobsToWrite: IPropertySet, blobsToDelete: IIterable[String], displayName: String): IPromiseWithIAsyncOperation[GameSaveOperationResult] = js.native
  
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param blobsToWrite This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param blobsToDelete This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param displayName This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def submitUpdatesAsync(blobsToWrite: IMapView[String, IBuffer], blobsToDelete: IIterable[String], displayName: String): IPromiseWithIAsyncOperation[GameSaveOperationResult] = js.native
}
object GameSaveContainer {
  
  @scala.inline
  def apply(
    createBlobInfoQuery: String => GameSaveBlobInfoQuery,
    getAsync: IIterable[String] => IPromiseWithIAsyncOperation[GameSaveBlobGetResult],
    name: String,
    provider: GameSaveProvider,
    readAsync: IMapView[String, IBuffer] => IPromiseWithIAsyncOperation[GameSaveOperationResult],
    submitPropertySetUpdatesAsync: (IPropertySet, IIterable[String], String) => IPromiseWithIAsyncOperation[GameSaveOperationResult],
    submitUpdatesAsync: (IMapView[String, IBuffer], IIterable[String], String) => IPromiseWithIAsyncOperation[GameSaveOperationResult]
  ): GameSaveContainer = {
    val __obj = js.Dynamic.literal(createBlobInfoQuery = js.Any.fromFunction1(createBlobInfoQuery), getAsync = js.Any.fromFunction1(getAsync), name = name.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], readAsync = js.Any.fromFunction1(readAsync), submitPropertySetUpdatesAsync = js.Any.fromFunction3(submitPropertySetUpdatesAsync), submitUpdatesAsync = js.Any.fromFunction3(submitUpdatesAsync))
    __obj.asInstanceOf[GameSaveContainer]
  }
  
  @scala.inline
  implicit class GameSaveContainerMutableBuilder[Self <: GameSaveContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateBlobInfoQuery(value: String => GameSaveBlobInfoQuery): Self = StObject.set(x, "createBlobInfoQuery", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAsync(value: IIterable[String] => IPromiseWithIAsyncOperation[GameSaveBlobGetResult]): Self = StObject.set(x, "getAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: GameSaveProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadAsync(value: IMapView[String, IBuffer] => IPromiseWithIAsyncOperation[GameSaveOperationResult]): Self = StObject.set(x, "readAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubmitPropertySetUpdatesAsync(
      value: (IPropertySet, IIterable[String], String) => IPromiseWithIAsyncOperation[GameSaveOperationResult]
    ): Self = StObject.set(x, "submitPropertySetUpdatesAsync", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSubmitUpdatesAsync(
      value: (IMapView[String, IBuffer], IIterable[String], String) => IPromiseWithIAsyncOperation[GameSaveOperationResult]
    ): Self = StObject.set(x, "submitUpdatesAsync", js.Any.fromFunction3(value))
  }
}
