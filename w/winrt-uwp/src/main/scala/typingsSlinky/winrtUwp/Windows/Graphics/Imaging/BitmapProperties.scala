package typingsSlinky.winrtUwp.Windows.Graphics.Imaging

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides read and write access to image properties and metadata. */
@js.native
trait BitmapProperties extends StObject {
  
  /**
    * Asynchronously retrieves one or more bitmap properties.
    * @param propertiesToRetrieve A collection of strings containing the specified property keys.
    * @return Object that manages the asynchronous retrieval of the bitmap properties.
    */
  def getPropertiesAsync(propertiesToRetrieve: IIterable[String]): IPromiseWithIAsyncOperation[BitmapPropertySet] = js.native
  
  /**
    * Asynchronously sets one or more bitmap properties.
    * @param propertiesToSet A collection of key-value pairs representing the bitmap properties to be set. Each key is a string containing the Windows property or metadata query, and the corresponding value is a BitmapTypedValue with the data and the correct PropertyType .
    * @return Object that manages the setting of the bitmap properties asynchronously.
    */
  def setPropertiesAsync(propertiesToSet: IIterable[IKeyValuePair[_, _]]): IPromiseWithIAsyncAction = js.native
}
object BitmapProperties {
  
  @scala.inline
  def apply(
    getPropertiesAsync: IIterable[String] => IPromiseWithIAsyncOperation[BitmapPropertySet],
    setPropertiesAsync: IIterable[IKeyValuePair[_, _]] => IPromiseWithIAsyncAction
  ): BitmapProperties = {
    val __obj = js.Dynamic.literal(getPropertiesAsync = js.Any.fromFunction1(getPropertiesAsync), setPropertiesAsync = js.Any.fromFunction1(setPropertiesAsync))
    __obj.asInstanceOf[BitmapProperties]
  }
  
  @scala.inline
  implicit class BitmapPropertiesMutableBuilder[Self <: BitmapProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetPropertiesAsync(value: IIterable[String] => IPromiseWithIAsyncOperation[BitmapPropertySet]): Self = StObject.set(x, "getPropertiesAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPropertiesAsync(value: IIterable[IKeyValuePair[_, _]] => IPromiseWithIAsyncAction): Self = StObject.set(x, "setPropertiesAsync", js.Any.fromFunction1(value))
  }
}
