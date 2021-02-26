package typingsSlinky.winrtUwp.Windows.Graphics.Imaging

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides read access to image properties and metadata. A particular instance of BitmapPropertiesView may represent the entire contents of the frame metadata, or any nested metadata block within the frame. */
@js.native
trait BitmapPropertiesView extends StObject {
  
  /**
    * Asynchronously retrieves one or more bitmap properties.
    * @param propertiesToRetrieve A collection of strings representing the property keys or queries that are being requested. Valid strings include Windows properties and Windows Imaging Component metadata queries.
    * @return Object that manages the asynchronous retrieval of the bitmap properties.
    */
  def getPropertiesAsync(propertiesToRetrieve: IIterable[String]): IPromiseWithIAsyncOperation[BitmapPropertySet] = js.native
}
object BitmapPropertiesView {
  
  @scala.inline
  def apply(getPropertiesAsync: IIterable[String] => IPromiseWithIAsyncOperation[BitmapPropertySet]): BitmapPropertiesView = {
    val __obj = js.Dynamic.literal(getPropertiesAsync = js.Any.fromFunction1(getPropertiesAsync))
    __obj.asInstanceOf[BitmapPropertiesView]
  }
  
  @scala.inline
  implicit class BitmapPropertiesViewMutableBuilder[Self <: BitmapPropertiesView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetPropertiesAsync(value: IIterable[String] => IPromiseWithIAsyncOperation[BitmapPropertySet]): Self = StObject.set(x, "getPropertiesAsync", js.Any.fromFunction1(value))
  }
}
