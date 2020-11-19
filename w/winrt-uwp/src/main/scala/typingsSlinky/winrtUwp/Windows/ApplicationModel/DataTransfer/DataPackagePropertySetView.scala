package typingsSlinky.winrtUwp.Windows.ApplicationModel.DataTransfer

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import typingsSlinky.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference
import typingsSlinky.winrtUwp.Windows.UI.Color
import typingsSlinky.winrtUwp.anon.Second
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Gets the set of properties of a DataPackageView object. */
@js.native
trait DataPackagePropertySetView extends js.Object {
  
  /** Gets the Uniform Resource Identifier (URI) of the app's location in the Windows Store. */
  var applicationListingUri: Uri = js.native
  
  /** Gets the name of the app that created the DataPackage object. */
  var applicationName: String = js.native
  
  /** Gets the application link to the content from the source app. */
  var contentSourceApplicationLink: Uri = js.native
  
  /** Gets a web link to shared content that's currently displayed in the app. */
  var contentSourceWebLink: Uri = js.native
  
  /** Gets the text that describes the contents of the DataPackage . */
  var description: String = js.native
  
  /** Gets or sets the enterprise Id. */
  var enterpriseId: String = js.native
  
  /** Gets a vector object that contains the types of files stored in the DataPackage object. */
  var fileTypes: IVectorView[String] = js.native
  
  /**
    * Returns an iterator to enumerate the items in the property set.
    * @return The first item in the DataPackage object.
    */
  def first(): IIterator[IKeyValuePair[_, _]] = js.native
  
  /**
    * Indicates whether the DataPackagePropertySetView object contains a specific property.
    * @param key The key.
    * @return True if the property set has an item with the specified key; otherwise false.
    */
  def hasKey(key: String): Boolean = js.native
  
  /** Gets a background color for the sharing app's Square30x30Logo . */
  var logoBackgroundColor: Color = js.native
  
  /**
    * Retrieves the value of a specific property.
    * @param key The key.
    * @return The value, if an item with the specified key exists. Otherwise, an error code.
    */
  def lookup(key: String): js.Any = js.native
  
  /** Gets the package family name of the source app. */
  var packageFamilyName: String = js.native
  
  /** Gets the number of items that are contained in the property set. */
  var size: Double = js.native
  
  /**
    * Divides the object into two views
    */
  def split(): Second = js.native
  
  /** Gets the source app's logo. */
  var square30x30Logo: IRandomAccessStreamReference = js.native
  
  /** Gets the thumbnail image for the DataPackageView . */
  var thumbnail: RandomAccessStreamReference = js.native
  
  /** Gets the text that displays as a title for the contents of the DataPackagePropertySetView object. */
  var title: String = js.native
}
object DataPackagePropertySetView {
  
  @scala.inline
  def apply(
    applicationListingUri: Uri,
    applicationName: String,
    contentSourceApplicationLink: Uri,
    contentSourceWebLink: Uri,
    description: String,
    enterpriseId: String,
    fileTypes: IVectorView[String],
    first: () => IIterator[IKeyValuePair[_, _]],
    hasKey: String => Boolean,
    logoBackgroundColor: Color,
    lookup: String => js.Any,
    packageFamilyName: String,
    size: Double,
    split: () => Second,
    square30x30Logo: IRandomAccessStreamReference,
    thumbnail: RandomAccessStreamReference,
    title: String
  ): DataPackagePropertySetView = {
    val __obj = js.Dynamic.literal(applicationListingUri = applicationListingUri.asInstanceOf[js.Any], applicationName = applicationName.asInstanceOf[js.Any], contentSourceApplicationLink = contentSourceApplicationLink.asInstanceOf[js.Any], contentSourceWebLink = contentSourceWebLink.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enterpriseId = enterpriseId.asInstanceOf[js.Any], fileTypes = fileTypes.asInstanceOf[js.Any], first = js.Any.fromFunction0(first), hasKey = js.Any.fromFunction1(hasKey), logoBackgroundColor = logoBackgroundColor.asInstanceOf[js.Any], lookup = js.Any.fromFunction1(lookup), packageFamilyName = packageFamilyName.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], split = js.Any.fromFunction0(split), square30x30Logo = square30x30Logo.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPackagePropertySetView]
  }
  
  @scala.inline
  implicit class DataPackagePropertySetViewOps[Self <: DataPackagePropertySetView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplicationListingUri(value: Uri): Self = this.set("applicationListingUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationName(value: String): Self = this.set("applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentSourceApplicationLink(value: Uri): Self = this.set("contentSourceApplicationLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentSourceWebLink(value: Uri): Self = this.set("contentSourceWebLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterpriseId(value: String): Self = this.set("enterpriseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypes(value: IVectorView[String]): Self = this.set("fileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst(value: () => IIterator[IKeyValuePair[_, _]]): Self = this.set("first", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasKey(value: String => Boolean): Self = this.set("hasKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLogoBackgroundColor(value: Color): Self = this.set("logoBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookup(value: String => js.Any): Self = this.set("lookup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPackageFamilyName(value: String): Self = this.set("packageFamilyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplit(value: () => Second): Self = this.set("split", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSquare30x30Logo(value: IRandomAccessStreamReference): Self = this.set("square30x30Logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: RandomAccessStreamReference): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
