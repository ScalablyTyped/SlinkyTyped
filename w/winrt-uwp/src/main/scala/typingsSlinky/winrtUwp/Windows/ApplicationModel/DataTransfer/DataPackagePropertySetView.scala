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
import scala.scalajs.js.annotation._

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
  /** Gets a background color for the sharing app's Square30x30Logo . */
  var logoBackgroundColor: Color = js.native
  /** Gets the package family name of the source app. */
  var packageFamilyName: String = js.native
  /** Gets the number of items that are contained in the property set. */
  var size: Double = js.native
  /** Gets the source app's logo. */
  var square30x30Logo: IRandomAccessStreamReference = js.native
  /** Gets the thumbnail image for the DataPackageView . */
  var thumbnail: RandomAccessStreamReference = js.native
  /** Gets the text that displays as a title for the contents of the DataPackagePropertySetView object. */
  var title: String = js.native
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
  /**
    * Retrieves the value of a specific property.
    * @param key The key.
    * @return The value, if an item with the specified key exists. Otherwise, an error code.
    */
  def lookup(key: String): js.Any = js.native
  /**
    * Divides the object into two views
    */
  def split(): Second = js.native
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
    def withApplicationListingUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationListingUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentSourceApplicationLink(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentSourceApplicationLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentSourceWebLink(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentSourceWebLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnterpriseId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileTypes(value: IVectorView[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirst(value: () => IIterator[IKeyValuePair[_, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasKey(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLogoBackgroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logoBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLookup(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPackageFamilyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageFamilyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplit(value: () => Second): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("split")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSquare30x30Logo(value: IRandomAccessStreamReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("square30x30Logo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnail(value: RandomAccessStreamReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

