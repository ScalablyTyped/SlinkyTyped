package typingsSlinky.winrt.Windows.ApplicationModel.DataTransfer

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Storage.Streams.RandomAccessStreamReference
import typingsSlinky.winrt.anon.First
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataPackagePropertySetView extends IDataPackagePropertySetView
object DataPackagePropertySetView {
  
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
  ): DataPackagePropertySetView = {
    val __obj = js.Dynamic.literal(applicationListingUri = applicationListingUri.asInstanceOf[js.Any], applicationName = applicationName.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fileTypes = fileTypes.asInstanceOf[js.Any], first = js.Any.fromFunction0(first), hasKey = js.Any.fromFunction1(hasKey), lookup = js.Any.fromFunction1(lookup), size = size.asInstanceOf[js.Any], split = js.Any.fromFunction0(split), thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPackagePropertySetView]
  }
}
