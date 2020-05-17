package typingsSlinky.winrtUwp.Windows.ApplicationModel.DataTransfer

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import typingsSlinky.winrtUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a set of properties to use with a DataPackage object. */
@js.native
trait DataPackagePropertySet extends js.Object {
  /** Gets or sets the Uniform Resource Identifier (URI) of the app's location in the Windows Store. */
  var applicationListingUri: Uri = js.native
  /** Gets or sets the name of the app that created the DataPackage object. */
  var applicationName: String = js.native
  /** Gets or sets the application link to the content from the source app. */
  var contentSourceApplicationLink: Uri = js.native
  /** Provides a web link to shared content that's currently displayed in the app. */
  var contentSourceWebLink: Uri = js.native
  /** Gets or sets text that describes the contents of the DataPackage . */
  var description: String = js.native
  /** Gets or sets the enterprise identity (see Enterprise data protection). */
  var enterpriseId: String = js.native
  /** Specifies a vector object that contains the types of files stored in the DataPackage object. */
  var fileTypes: IVector[String] = js.native
  /** Gets or sets a background color for the sharing app's Square30x30Logo . */
  var logoBackgroundColor: Color = js.native
  /** Gets or sets the package family name of the source app. */
  var packageFamilyName: String = js.native
  /** Gets the number of items that are contained in the property set. */
  var size: Double = js.native
  /** Gets or sets the source app's logo. */
  var square30x30Logo: IRandomAccessStreamReference = js.native
  /** Gets or sets a thumbnail image for the DataPackage . */
  var thumbnail: IRandomAccessStreamReference = js.native
  /** Gets or sets the text that displays as a title for the contents of the DataPackage object. */
  var title: String = js.native
  /** Removes all items from the property set. */
  def clear(): Unit = js.native
  /**
    * Returns an iterator to enumerate the items in the property set.
    * @return The first item in the DataPackage object.
    */
  def first(): IIterator[IKeyValuePair[_, _]] = js.native
  /**
    * Gets an immutable view of the property set.
    * @return The immutable view.
    */
  def getView(): IMapView[String, _] = js.native
  /**
    * Indicates whether the DataPackagePropertySet object contains a specific property.
    * @param key The key.
    * @return True if the property set has an item with the specified key; otherwise false.
    */
  def hasKey(key: String): Boolean = js.native
  /**
    * Adds a property to the DataPackagePropertySet object.
    * @param key The key to insert.
    * @param value The value to insert.
    * @return True if the method replaced a value that already existed for the key; false if this is a new key.
    */
  def insert(key: String, value: js.Any): Boolean = js.native
  /**
    * Retrieves the value of a specific property.
    * @param key The key.
    * @return The value, if an item with the specified key exists. Otherwise, an error code.
    */
  def lookup(key: String): js.Any = js.native
  /**
    * Removes an item from the property set.
    * @param key The key.
    */
  def remove(key: String): Unit = js.native
}

object DataPackagePropertySet {
  @scala.inline
  def apply(
    applicationListingUri: Uri,
    applicationName: String,
    clear: () => Unit,
    contentSourceApplicationLink: Uri,
    contentSourceWebLink: Uri,
    description: String,
    enterpriseId: String,
    fileTypes: IVector[String],
    first: () => IIterator[IKeyValuePair[_, _]],
    getView: () => IMapView[String, _],
    hasKey: String => Boolean,
    insert: (String, js.Any) => Boolean,
    logoBackgroundColor: Color,
    lookup: String => js.Any,
    packageFamilyName: String,
    remove: String => Unit,
    size: Double,
    square30x30Logo: IRandomAccessStreamReference,
    thumbnail: IRandomAccessStreamReference,
    title: String
  ): DataPackagePropertySet = {
    val __obj = js.Dynamic.literal(applicationListingUri = applicationListingUri.asInstanceOf[js.Any], applicationName = applicationName.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), contentSourceApplicationLink = contentSourceApplicationLink.asInstanceOf[js.Any], contentSourceWebLink = contentSourceWebLink.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enterpriseId = enterpriseId.asInstanceOf[js.Any], fileTypes = fileTypes.asInstanceOf[js.Any], first = js.Any.fromFunction0(first), getView = js.Any.fromFunction0(getView), hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), logoBackgroundColor = logoBackgroundColor.asInstanceOf[js.Any], lookup = js.Any.fromFunction1(lookup), packageFamilyName = packageFamilyName.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), size = size.asInstanceOf[js.Any], square30x30Logo = square30x30Logo.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPackagePropertySet]
  }
  @scala.inline
  implicit class DataPackagePropertySetOps[Self <: DataPackagePropertySet] (val x: Self) extends AnyVal {
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
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
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
    def withFileTypes(value: IVector[String]): Self = {
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
    def withGetView(value: () => IMapView[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getView")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasKey(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: (String, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction2(value))
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
    def withRemove(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSquare30x30Logo(value: IRandomAccessStreamReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("square30x30Logo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnail(value: IRandomAccessStreamReference): Self = {
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

