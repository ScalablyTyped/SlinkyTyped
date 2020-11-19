package typingsSlinky.winrtUwp.Windows.Storage.Search

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Storage.FileProperties.PropertyPrefetchOptions
import typingsSlinky.winrtUwp.Windows.Storage.FileProperties.ThumbnailMode
import typingsSlinky.winrtUwp.Windows.Storage.FileProperties.ThumbnailOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the parameters of a search query for enumerating the contents of storage folders. */
@js.native
trait QueryOptions extends js.Object {
  
  /** Gets or sets an application-defined Advanced Query Syntax (AQS) string for filtering files by keywords or properties. This property is combined with the UserSearchFilter to create the query's search filter. */
  var applicationSearchFilter: String = js.native
  
  /** Gets the unit of time used to group files into folders if the QueryOptions object was created with a CommonFolderQuery based on date. For example, if CommonFolderQuery.GroupByYear is used to create a QueryOptions object, the value of this property is DateStackOption.Year . */
  var dateStackOption: DateStackOption = js.native
  
  /** Gets a list of file name extensions used to filter the search results. If the list is empty, the results include all file types. */
  var fileTypeFilter: IVector[String] = js.native
  
  /** Indicates whether the search query should produce a shallow view of the folder contents or a deep recursive view of all files and subfolder. */
  var folderDepth: FolderDepth = js.native
  
  /** Gets the name of the property used to group query results if the QueryOptions object was created using a CommonFolderQuery . For example, if CommonFolderQuery.GroupByYear is used to create a QueryOptions object, the value of this property is System.ItemDate . */
  var groupPropertyName: String = js.native
  
  /** Gets or sets a value that specifies whether the system index or the file system is used to retrieve query results. The indexer can retrieve results faster but is not available in all file locations. */
  var indexerOption: IndexerOption = js.native
  
  /** Gets or sets the Internet Engineering Task Force (IETF) language tag (BCP47 standard) that identifies the language associated with the query. This determines the language-specific algorithm used by the system to break the query into individual search tokens. */
  var language: String = js.native
  
  /**
    * Initializes the current instance of the QueryOptions class with search parameters specified by a string that was created by the SaveToString method.
    * @param value A string retrieved by a previous call to SaveToString .
    */
  def loadFromString(value: String): Unit = js.native
  
  /**
    * Converts the values of a QueryOptions object to a string that can be used to initialize the values of a QueryOptions object by calling LoadFromString .
    * @return A string representing the serialized settings of a QueryOptions instance.
    */
  def saveToString(): String = js.native
  
  /**
    * Specifies properties that the system should load in advance for all items in the query result set while the query is being executed (instead of retrieving them on a case-by-case basis). If many properties are specified, the query might take longer to execute, but subsequent property retrieval on query results will be faster.
    * @param options A value that specifies the set of properties to retrieve in advance.
    * @param propertiesToRetrieve A custom list of properties to retrieve in advance as an array of property names. Use the system property names to specify properties, for example "System.Copyright" and "System.Image.ColorSpace".
    */
  def setPropertyPrefetch(options: PropertyPrefetchOptions, propertiesToRetrieve: IIterable[String]): Unit = js.native
  
  /**
    * Specifies the type and size of thumbnails that the system should start loading immediately when items are accessed (instead of retrieving them on a case-by-case basis). This uses more resources but makes thumbnail retrieval on query results faster.
    * @param mode The enumeration value that describes the purpose of the thumbnail and determines how the thumbnail image is adjusted.
    * @param requestedSize The requested size, in pixels, of the longest edge of the thumbnail. Windows uses the requestedSize as a guide and tries to return a thumbnail image that can be scaled to the requested size without reducing the quality of the image.
    * @param options The enum value that describes the desired behavior to use to retrieve the thumbnail image. The specified behavior might affect the size and/or quality of the image and how quickly the thumbnail image is retrieved.
    */
  def setThumbnailPrefetch(mode: ThumbnailMode, requestedSize: Double, options: ThumbnailOptions): Unit = js.native
  
  /** Gets the list of SortEntry structures that specify how to sort content (like files and subfolders) in query results. Use this list to customize how query results are sorted. */
  var sortOrder: IVector[SortEntry] = js.native
  
  /** Gets the filter for storage provider identifiers. */
  var storageProviderIdFilter: IVector[String] = js.native
  
  /** Gets or sets a user-defined Advanced Query Syntax (AQS) string for filtering files by keywords or properties. This property is combined with the ApplicationSearchFilter to create the query's search filter. */
  var userSearchFilter: String = js.native
}
object QueryOptions {
  
  @scala.inline
  def apply(
    applicationSearchFilter: String,
    dateStackOption: DateStackOption,
    fileTypeFilter: IVector[String],
    folderDepth: FolderDepth,
    groupPropertyName: String,
    indexerOption: IndexerOption,
    language: String,
    loadFromString: String => Unit,
    saveToString: () => String,
    setPropertyPrefetch: (PropertyPrefetchOptions, IIterable[String]) => Unit,
    setThumbnailPrefetch: (ThumbnailMode, Double, ThumbnailOptions) => Unit,
    sortOrder: IVector[SortEntry],
    storageProviderIdFilter: IVector[String],
    userSearchFilter: String
  ): QueryOptions = {
    val __obj = js.Dynamic.literal(applicationSearchFilter = applicationSearchFilter.asInstanceOf[js.Any], dateStackOption = dateStackOption.asInstanceOf[js.Any], fileTypeFilter = fileTypeFilter.asInstanceOf[js.Any], folderDepth = folderDepth.asInstanceOf[js.Any], groupPropertyName = groupPropertyName.asInstanceOf[js.Any], indexerOption = indexerOption.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], loadFromString = js.Any.fromFunction1(loadFromString), saveToString = js.Any.fromFunction0(saveToString), setPropertyPrefetch = js.Any.fromFunction2(setPropertyPrefetch), setThumbnailPrefetch = js.Any.fromFunction3(setThumbnailPrefetch), sortOrder = sortOrder.asInstanceOf[js.Any], storageProviderIdFilter = storageProviderIdFilter.asInstanceOf[js.Any], userSearchFilter = userSearchFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptions]
  }
  
  @scala.inline
  implicit class QueryOptionsOps[Self <: QueryOptions] (val x: Self) extends AnyVal {
    
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
    def setApplicationSearchFilter(value: String): Self = this.set("applicationSearchFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateStackOption(value: DateStackOption): Self = this.set("dateStackOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypeFilter(value: IVector[String]): Self = this.set("fileTypeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderDepth(value: FolderDepth): Self = this.set("folderDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupPropertyName(value: String): Self = this.set("groupPropertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexerOption(value: IndexerOption): Self = this.set("indexerOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadFromString(value: String => Unit): Self = this.set("loadFromString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSaveToString(value: () => String): Self = this.set("saveToString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetPropertyPrefetch(value: (PropertyPrefetchOptions, IIterable[String]) => Unit): Self = this.set("setPropertyPrefetch", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetThumbnailPrefetch(value: (ThumbnailMode, Double, ThumbnailOptions) => Unit): Self = this.set("setThumbnailPrefetch", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSortOrder(value: IVector[SortEntry]): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageProviderIdFilter(value: IVector[String]): Self = this.set("storageProviderIdFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSearchFilter(value: String): Self = this.set("userSearchFilter", value.asInstanceOf[js.Any])
  }
}
