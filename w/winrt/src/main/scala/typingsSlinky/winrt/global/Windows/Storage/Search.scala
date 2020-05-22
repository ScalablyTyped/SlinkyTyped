package typingsSlinky.winrt.global.Windows.Storage

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrt.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions
import typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailMode
import typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailOptions
import typingsSlinky.winrt.Windows.Storage.Search.CommonFileQuery
import typingsSlinky.winrt.Windows.Storage.Search.CommonFolderQuery
import typingsSlinky.winrt.Windows.Storage.Search.DateStackOption
import typingsSlinky.winrt.Windows.Storage.Search.FolderDepth
import typingsSlinky.winrt.Windows.Storage.Search.IndexerOption
import typingsSlinky.winrt.Windows.Storage.Search.SortEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Search")
@js.native
object Search extends js.Object {
  @js.native
  class QueryOptions ()
    extends typingsSlinky.winrt.Windows.Storage.Search.QueryOptions {
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
  
  @js.native
  class SortEntryVector ()
    extends typingsSlinky.winrt.Windows.Storage.Search.SortEntryVector {
    /* CompleteClass */
    override def first(): IIterator[SortEntry] = js.native
  }
  
  @js.native
  class StorageFileQueryResult ()
    extends typingsSlinky.winrt.Windows.Storage.Search.StorageFileQueryResult {
    /* CompleteClass */
    override var folder: typingsSlinky.winrt.Windows.Storage.StorageFolder = js.native
    /* CompleteClass */
    override var oncontentschanged: js.Any = js.native
    /* CompleteClass */
    override var onoptionschanged: js.Any = js.native
    /* CompleteClass */
    override def applyNewQueryOptions(newQueryOptions: typingsSlinky.winrt.Windows.Storage.Search.QueryOptions): Unit = js.native
    /* CompleteClass */
    override def findStartIndexAsync(value: js.Any): IAsyncOperation[Double] = js.native
    /* CompleteClass */
    override def getCurrentQueryOptions(): typingsSlinky.winrt.Windows.Storage.Search.QueryOptions = js.native
    /* CompleteClass */
    override def getItemCountAsync(): IAsyncOperation[Double] = js.native
  }
  
  @js.native
  class StorageFolderQueryResult ()
    extends typingsSlinky.winrt.Windows.Storage.Search.StorageFolderQueryResult {
    /* CompleteClass */
    override var folder: typingsSlinky.winrt.Windows.Storage.StorageFolder = js.native
    /* CompleteClass */
    override var oncontentschanged: js.Any = js.native
    /* CompleteClass */
    override var onoptionschanged: js.Any = js.native
    /* CompleteClass */
    override def applyNewQueryOptions(newQueryOptions: typingsSlinky.winrt.Windows.Storage.Search.QueryOptions): Unit = js.native
    /* CompleteClass */
    override def findStartIndexAsync(value: js.Any): IAsyncOperation[Double] = js.native
    /* CompleteClass */
    override def getCurrentQueryOptions(): typingsSlinky.winrt.Windows.Storage.Search.QueryOptions = js.native
    /* CompleteClass */
    override def getItemCountAsync(): IAsyncOperation[Double] = js.native
  }
  
  @js.native
  class StorageItemQueryResult ()
    extends typingsSlinky.winrt.Windows.Storage.Search.StorageItemQueryResult {
    /* CompleteClass */
    override var folder: typingsSlinky.winrt.Windows.Storage.StorageFolder = js.native
    /* CompleteClass */
    override var oncontentschanged: js.Any = js.native
    /* CompleteClass */
    override var onoptionschanged: js.Any = js.native
    /* CompleteClass */
    override def applyNewQueryOptions(newQueryOptions: typingsSlinky.winrt.Windows.Storage.Search.QueryOptions): Unit = js.native
    /* CompleteClass */
    override def findStartIndexAsync(value: js.Any): IAsyncOperation[Double] = js.native
    /* CompleteClass */
    override def getCurrentQueryOptions(): typingsSlinky.winrt.Windows.Storage.Search.QueryOptions = js.native
    /* CompleteClass */
    override def getItemCountAsync(): IAsyncOperation[Double] = js.native
  }
  
  @js.native
  object CommonFileQuery extends js.Object {
    /* 0 */ val defaultQuery: typingsSlinky.winrt.Windows.Storage.Search.CommonFileQuery.defaultQuery with Double = js.native
    /* 5 */ val orderByDate: typingsSlinky.winrt.Windows.Storage.Search.CommonFileQuery.orderByDate with Double = js.native
    /* 3 */ val orderByMusicProperties: typingsSlinky.winrt.Windows.Storage.Search.CommonFileQuery.orderByMusicProperties with Double = js.native
    /* 1 */ val orderByName: typingsSlinky.winrt.Windows.Storage.Search.CommonFileQuery.orderByName with Double = js.native
    /* 4 */ val orderBySearchRank: typingsSlinky.winrt.Windows.Storage.Search.CommonFileQuery.orderBySearchRank with Double = js.native
    /* 2 */ val orderByTitle: typingsSlinky.winrt.Windows.Storage.Search.CommonFileQuery.orderByTitle with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Storage.Search.CommonFileQuery with Double] = js.native
  }
  
  @js.native
  object CommonFolderQuery extends js.Object {
    /* 0 */ val defaultQuery: typingsSlinky.winrt.Windows.Storage.Search.CommonFolderQuery.defaultQuery with Double = js.native
    /* 4 */ val groupByAlbum: typingsSlinky.winrt.Windows.Storage.Search.CommonFolderQuery.groupByAlbum with Double = js.native
    /* 5 */ val groupByAlbumArtist: typingsSlinky.winrt.Windows.Storage.Search.CommonFolderQuery.groupByAlbumArtist with Double = js.native
    /* 3 */ val groupByArtist: typingsSlinky.winrt.Windows.Storage.Search.CommonFolderQuery.groupByArtist with Double = js.native
    /* 11 */ val groupByAuthor: typingsSlinky.winrt.Windows.Storage.Search.CommonFolderQuery.groupByAuthor with Double = js.native
    /* 6 */ val groupByComposer: typingsSlinky.winrt.Windows.Storage.Search.CommonFolderQuery.groupByComposer with Double = js.native
    /* 7 */ val groupByGenre: typingsSlinky.winrt.Windows.Storage.Search.CommonFolderQuery.groupByGenre with Double = js.native
    /* 2 */ val groupByMonth: typingsSlinky.winrt.Windows.Storage.Search.CommonFolderQuery.groupByMonth with Double = js.native
    /* 8 */ val groupByPublishedYear: typingsSlinky.winrt.Windows.Storage.Search.CommonFolderQuery.groupByPublishedYear with Double = js.native
    /* 9 */ val groupByRating: typingsSlinky.winrt.Windows.Storage.Search.CommonFolderQuery.groupByRating with Double = js.native
    /* 10 */ val groupByTag: typingsSlinky.winrt.Windows.Storage.Search.CommonFolderQuery.groupByTag with Double = js.native
    /* 12 */ val groupByType: typingsSlinky.winrt.Windows.Storage.Search.CommonFolderQuery.groupByType with Double = js.native
    /* 1 */ val groupByYear: typingsSlinky.winrt.Windows.Storage.Search.CommonFolderQuery.groupByYear with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Storage.Search.CommonFolderQuery with Double] = js.native
  }
  
  @js.native
  object DateStackOption extends js.Object {
    /* 2 */ val month: typingsSlinky.winrt.Windows.Storage.Search.DateStackOption.month with Double = js.native
    /* 0 */ val none: typingsSlinky.winrt.Windows.Storage.Search.DateStackOption.none with Double = js.native
    /* 1 */ val year: typingsSlinky.winrt.Windows.Storage.Search.DateStackOption.year with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Storage.Search.DateStackOption with Double] = js.native
  }
  
  @js.native
  object FolderDepth extends js.Object {
    /* 1 */ val deep: typingsSlinky.winrt.Windows.Storage.Search.FolderDepth.deep with Double = js.native
    /* 0 */ val shallow: typingsSlinky.winrt.Windows.Storage.Search.FolderDepth.shallow with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Storage.Search.FolderDepth with Double] = js.native
  }
  
  @js.native
  object IndexedState extends js.Object {
    /* 3 */ val fullyIndexed: typingsSlinky.winrt.Windows.Storage.Search.IndexedState.fullyIndexed with Double = js.native
    /* 1 */ val notIndexed: typingsSlinky.winrt.Windows.Storage.Search.IndexedState.notIndexed with Double = js.native
    /* 2 */ val partiallyIndexed: typingsSlinky.winrt.Windows.Storage.Search.IndexedState.partiallyIndexed with Double = js.native
    /* 0 */ val unknown: typingsSlinky.winrt.Windows.Storage.Search.IndexedState.unknown with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Storage.Search.IndexedState with Double] = js.native
  }
  
  @js.native
  object IndexerOption extends js.Object {
    /* 2 */ val doNotUseIndexer: typingsSlinky.winrt.Windows.Storage.Search.IndexerOption.doNotUseIndexer with Double = js.native
    /* 1 */ val onlyUseIndexer: typingsSlinky.winrt.Windows.Storage.Search.IndexerOption.onlyUseIndexer with Double = js.native
    /* 0 */ val useIndexerWhenAvailable: typingsSlinky.winrt.Windows.Storage.Search.IndexerOption.useIndexerWhenAvailable with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Storage.Search.IndexerOption with Double] = js.native
  }
  
}

