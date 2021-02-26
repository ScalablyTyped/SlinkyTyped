package typingsSlinky.winrt.Windows.ApplicationModel.DataTransfer

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsSlinky.winrt.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Storage.Streams.RandomAccessStreamReference
import typingsSlinky.winrt.anon.First
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataPackagePropertySetView
  extends IMapView[String, js.Any] {
  
  var applicationListingUri: Uri = js.native
  
  var applicationName: String = js.native
  
  var description: String = js.native
  
  var fileTypes: IVectorView[String] = js.native
  
  var thumbnail: RandomAccessStreamReference = js.native
  
  var title: String = js.native
}
object IDataPackagePropertySetView {
  
  @scala.inline
  def apply(
    applicationListingUri: Uri,
    applicationName: String,
    description: String,
    fileTypes: IVectorView[String],
    first: () => IIterator[IKeyValuePair[String, js.Any]],
    hasKey: String => Boolean,
    lookup: String => js.Any,
    size: Double,
    split: () => First[String, js.Any],
    thumbnail: RandomAccessStreamReference,
    title: String
  ): IDataPackagePropertySetView = {
    val __obj = js.Dynamic.literal(applicationListingUri = applicationListingUri.asInstanceOf[js.Any], applicationName = applicationName.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fileTypes = fileTypes.asInstanceOf[js.Any], first = js.Any.fromFunction0(first), hasKey = js.Any.fromFunction1(hasKey), lookup = js.Any.fromFunction1(lookup), size = size.asInstanceOf[js.Any], split = js.Any.fromFunction0(split), thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataPackagePropertySetView]
  }
  
  @scala.inline
  implicit class IDataPackagePropertySetViewMutableBuilder[Self <: IDataPackagePropertySetView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationListingUri(value: Uri): Self = StObject.set(x, "applicationListingUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationName(value: String): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypes(value: IVectorView[String]): Self = StObject.set(x, "fileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: RandomAccessStreamReference): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
