package typingsSlinky.winrt.Windows.ApplicationModel.DataTransfer

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsSlinky.winrt.Windows.Foundation.Collections.IMap
import typingsSlinky.winrt.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataPackagePropertySet
  extends IMap[String, js.Any] {
  
  var applicationListingUri: Uri = js.native
  
  var applicationName: String = js.native
  
  var description: String = js.native
  
  var fileTypes: IVector[String] = js.native
  
  var thumbnail: IRandomAccessStreamReference = js.native
  
  var title: String = js.native
}
object IDataPackagePropertySet {
  
  @scala.inline
  def apply(
    applicationListingUri: Uri,
    applicationName: String,
    clear: () => Unit,
    description: String,
    fileTypes: IVector[String],
    first: () => IIterator[IKeyValuePair[String, js.Any]],
    getView: () => IMapView[String, js.Any],
    hasKey: String => Boolean,
    insert: (String, js.Any) => Boolean,
    lookup: String => js.Any,
    remove: String => Unit,
    size: Double,
    thumbnail: IRandomAccessStreamReference,
    title: String
  ): IDataPackagePropertySet = {
    val __obj = js.Dynamic.literal(applicationListingUri = applicationListingUri.asInstanceOf[js.Any], applicationName = applicationName.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), description = description.asInstanceOf[js.Any], fileTypes = fileTypes.asInstanceOf[js.Any], first = js.Any.fromFunction0(first), getView = js.Any.fromFunction0(getView), hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), remove = js.Any.fromFunction1(remove), size = size.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataPackagePropertySet]
  }
  
  @scala.inline
  implicit class IDataPackagePropertySetMutableBuilder[Self <: IDataPackagePropertySet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationListingUri(value: Uri): Self = StObject.set(x, "applicationListingUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationName(value: String): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypes(value: IVector[String]): Self = StObject.set(x, "fileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: IRandomAccessStreamReference): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
