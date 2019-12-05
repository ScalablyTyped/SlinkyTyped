package typingsSlinky.winrt.Windows.Storage.Search

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions
import typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailMode
import typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Search.QueryOptions")
@js.native
class QueryOptions () extends IQueryOptions {
  def this(query: CommonFolderQuery) = this()
  def this(query: CommonFileQuery, fileTypeFilter: IIterable[String]) = this()
  /* CompleteClass */
  override var applicationSearchFilter: String = js.native
  /* CompleteClass */
  override var dateStackOption: DateStackOption = js.native
  /* CompleteClass */
  override var fileTypeFilter: IVector[String] = js.native
  /* CompleteClass */
  override var folderDepth: FolderDepth = js.native
  /* CompleteClass */
  override var groupPropertyName: String = js.native
  /* CompleteClass */
  override var indexerOption: IndexerOption = js.native
  /* CompleteClass */
  override var language: String = js.native
  /* CompleteClass */
  override var sortOrder: IVector[SortEntry] = js.native
  /* CompleteClass */
  override var userSearchFilter: String = js.native
  /* CompleteClass */
  override def loadFromString(value: String): Unit = js.native
  /* CompleteClass */
  override def saveToString(): String = js.native
  /* CompleteClass */
  override def setPropertyPrefetch(options: PropertyPrefetchOptions, propertiesToRetrieve: IIterable[String]): Unit = js.native
  /* CompleteClass */
  override def setThumbnailPrefetch(mode: ThumbnailMode, requestedSize: Double, options: ThumbnailOptions): Unit = js.native
}

