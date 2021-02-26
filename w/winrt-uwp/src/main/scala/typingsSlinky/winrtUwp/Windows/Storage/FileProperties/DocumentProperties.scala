package typingsSlinky.winrtUwp.Windows.Storage.FileProperties

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMap
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the document-related properties of an item (like a file or folder). */
@js.native
trait DocumentProperties extends StObject {
  
  /** Gets the collection of the document's authors. */
  var author: IVector[String] = js.native
  
  /** Gets or sets the comments associated with the document. */
  var comment: String = js.native
  
  /** Gets the collection of keywords associated with the document. */
  var keywords: IVector[String] = js.native
  
  /**
    * Retrieves the specified properties associated with the item.
    * @param propertiesToRetrieve A collection that contains the names of the properties to retrieve.
    * @return An object for managing the asynchronous property retrieval operation.
    */
  def retrievePropertiesAsync(propertiesToRetrieve: IIterable[String]): IPromiseWithIAsyncOperation[IMap[_, _]] = js.native
  
  /**
    * Saves all properties associated with the item.
    * @return No object or value is returned when this method completes.
    */
  def savePropertiesAsync(): IPromiseWithIAsyncAction = js.native
  /**
    * Saves the specified properties and values associated with the item.
    * @param propertiesToSave A collection that contains the names and values of the properties to save as key-value pairs (type IKeyValuePair ).
    * @return No object or value is returned when this method completes.
    */
  def savePropertiesAsync(propertiesToSave: IIterable[IKeyValuePair[_, _]]): IPromiseWithIAsyncAction = js.native
  
  /** Gets or sets the title of the document. */
  var title: String = js.native
}
