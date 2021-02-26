package typingsSlinky.winrtUwp.global.Windows.Storage

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrtUwp.Windows.Storage.Search.CommonFileQuery
import typingsSlinky.winrtUwp.Windows.Storage.Search.CommonFolderQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides classes for enumerating content in storage and performing Advanced Query Syntax (AQS) searches on the content. */
object Search {
  
  /** Specifies how to sort the files in the query results and determines whether the query is shallow or deep. Query results for deep queries include all files in all of the subfolders of the current folder, sorted according to the specified option. */
  @JSGlobal("Windows.Storage.Search.CommonFileQuery")
  @js.native
  object CommonFileQuery extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Storage.Search.CommonFileQuery with Double] = js.native
    
    /* 0 */ val defaultQuery: typingsSlinky.winrtUwp.Windows.Storage.Search.CommonFileQuery.defaultQuery with Double = js.native
    
    /* 5 */ val orderByDate: typingsSlinky.winrtUwp.Windows.Storage.Search.CommonFileQuery.orderByDate with Double = js.native
    
    /* 3 */ val orderByMusicProperties: typingsSlinky.winrtUwp.Windows.Storage.Search.CommonFileQuery.orderByMusicProperties with Double = js.native
    
    /* 1 */ val orderByName: typingsSlinky.winrtUwp.Windows.Storage.Search.CommonFileQuery.orderByName with Double = js.native
    
    /* 4 */ val orderBySearchRank: typingsSlinky.winrtUwp.Windows.Storage.Search.CommonFileQuery.orderBySearchRank with Double = js.native
    
    /* 2 */ val orderByTitle: typingsSlinky.winrtUwp.Windows.Storage.Search.CommonFileQuery.orderByTitle with Double = js.native
  }
  
  /** Specifies how to group files into folders in the query results and determines whether the query is shallow or deep. Query results for deep queries include all files in all of the subfolders of the current folder, grouped into folders according to the specified option. */
  @JSGlobal("Windows.Storage.Search.CommonFolderQuery")
  @js.native
  object CommonFolderQuery extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Storage.Search.CommonFolderQuery with Double] = js.native
    
    /* 0 */ val defaultQuery: typingsSlinky.winrtUwp.Windows.Storage.Search.CommonFolderQuery.defaultQuery with Double = js.native
    
    /* 4 */ val groupByAlbum: typingsSlinky.winrtUwp.Windows.Storage.Search.CommonFolderQuery.groupByAlbum with Double = js.native
    
    /* 5 */ val groupByAlbumArtist: typingsSlinky.winrtUwp.Windows.Storage.Search.CommonFolderQuery.groupByAlbumArtist with Double = js.native
    
    /* 3 */ val groupByArtist: typingsSlinky.winrtUwp.Windows.Storage.Search.CommonFolderQuery.groupByArtist with Double = js.native
    
    /* 11 */ val groupByAuthor: typingsSlinky.winrtUwp.Windows.Storage.Search.CommonFolderQuery.groupByAuthor with Double = js.native
    
    /* 6 */ val groupByComposer: typingsSlinky.winrtUwp.Windows.Storage.Search.CommonFolderQuery.groupByComposer with Double = js.native
    
    /* 7 */ val groupByGenre: typingsSlinky.winrtUwp.Windows.Storage.Search.CommonFolderQuery.groupByGenre with Double = js.native
    
    /* 2 */ val groupByMonth: typingsSlinky.winrtUwp.Windows.Storage.Search.CommonFolderQuery.groupByMonth with Double = js.native
    
    /* 8 */ val groupByPublishedYear: typingsSlinky.winrtUwp.Windows.Storage.Search.CommonFolderQuery.groupByPublishedYear with Double = js.native
    
    /* 9 */ val groupByRating: typingsSlinky.winrtUwp.Windows.Storage.Search.CommonFolderQuery.groupByRating with Double = js.native
    
    /* 10 */ val groupByTag: typingsSlinky.winrtUwp.Windows.Storage.Search.CommonFolderQuery.groupByTag with Double = js.native
    
    /* 12 */ val groupByType: typingsSlinky.winrtUwp.Windows.Storage.Search.CommonFolderQuery.groupByType with Double = js.native
    
    /* 1 */ val groupByYear: typingsSlinky.winrtUwp.Windows.Storage.Search.CommonFolderQuery.groupByYear with Double = js.native
  }
  
  /** Enables Windows Store apps to place content properties in the system index. */
  @JSGlobal("Windows.Storage.Search.ContentIndexer")
  @js.native
  abstract class ContentIndexer ()
    extends typingsSlinky.winrtUwp.Windows.Storage.Search.ContentIndexer
  object ContentIndexer {
    
    /**
      * Gets an existing per-app index or creates a new one, if necessary.
      * @return The index.
      */
    /* static member */
    @JSGlobal("Windows.Storage.Search.ContentIndexer.getIndexer")
    @js.native
    def getIndexer(): typingsSlinky.winrtUwp.Windows.Storage.Search.ContentIndexer = js.native
    /**
      * Gets the per-app index with the specified name or creates a new one, if necessary.
      * @param indexName The index name.
      * @return The index.
      */
    /* static member */
    @JSGlobal("Windows.Storage.Search.ContentIndexer.getIndexer")
    @js.native
    def getIndexer(indexName: String): typingsSlinky.winrtUwp.Windows.Storage.Search.ContentIndexer = js.native
  }
  
  /** Represents a query for content properties in the ContentIndexer . */
  @JSGlobal("Windows.Storage.Search.ContentIndexerQuery")
  @js.native
  abstract class ContentIndexerQuery ()
    extends typingsSlinky.winrtUwp.Windows.Storage.Search.ContentIndexerQuery
  
  /** Indicates the unit of time used to group files into folders if a CommonFolderQuery based on date is used to create a QueryOptions object. */
  @JSGlobal("Windows.Storage.Search.DateStackOption")
  @js.native
  object DateStackOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Storage.Search.DateStackOption with Double] = js.native
    
    /* 2 */ val month: typingsSlinky.winrtUwp.Windows.Storage.Search.DateStackOption.month with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Storage.Search.DateStackOption.none with Double = js.native
    
    /* 1 */ val year: typingsSlinky.winrtUwp.Windows.Storage.Search.DateStackOption.year with Double = js.native
  }
  
  /** Indicates whether all files and subfolders of the folder being queried will be enumerated or if only the top-level files and subfolders will be enumerated. */
  @JSGlobal("Windows.Storage.Search.FolderDepth")
  @js.native
  object FolderDepth extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Storage.Search.FolderDepth with Double] = js.native
    
    /* 1 */ val deep: typingsSlinky.winrtUwp.Windows.Storage.Search.FolderDepth.deep with Double = js.native
    
    /* 0 */ val shallow: typingsSlinky.winrtUwp.Windows.Storage.Search.FolderDepth.shallow with Double = js.native
  }
  
  /** Represents app content and properties that can be added to the ContentIndexer . */
  @JSGlobal("Windows.Storage.Search.IndexableContent")
  @js.native
  /** Initializes a new instance of the IndexableContent class. */
  class IndexableContent ()
    extends typingsSlinky.winrtUwp.Windows.Storage.Search.IndexableContent
  
  /** Indicates whether a StorageFolder is included in the system index. */
  @JSGlobal("Windows.Storage.Search.IndexedState")
  @js.native
  object IndexedState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Storage.Search.IndexedState with Double] = js.native
    
    /* 3 */ val fullyIndexed: typingsSlinky.winrtUwp.Windows.Storage.Search.IndexedState.fullyIndexed with Double = js.native
    
    /* 1 */ val notIndexed: typingsSlinky.winrtUwp.Windows.Storage.Search.IndexedState.notIndexed with Double = js.native
    
    /* 2 */ val partiallyIndexed: typingsSlinky.winrtUwp.Windows.Storage.Search.IndexedState.partiallyIndexed with Double = js.native
    
    /* 0 */ val unknown: typingsSlinky.winrtUwp.Windows.Storage.Search.IndexedState.unknown with Double = js.native
  }
  
  /** Specifies whether the query should use the system index of the file system when enumerating content in the folder being queried. The indexer can retrieve results faster but is not available in all file locations. */
  @JSGlobal("Windows.Storage.Search.IndexerOption")
  @js.native
  object IndexerOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Storage.Search.IndexerOption with Double] = js.native
    
    /* 2 */ val doNotUseIndexer: typingsSlinky.winrtUwp.Windows.Storage.Search.IndexerOption.doNotUseIndexer with Double = js.native
    
    /* 1 */ val onlyUseIndexer: typingsSlinky.winrtUwp.Windows.Storage.Search.IndexerOption.onlyUseIndexer with Double = js.native
    
    /* 0 */ val useIndexerWhenAvailable: typingsSlinky.winrtUwp.Windows.Storage.Search.IndexerOption.useIndexerWhenAvailable with Double = js.native
  }
  
  /** Specifies the parameters of a search query for enumerating the contents of storage folders. */
  @JSGlobal("Windows.Storage.Search.QueryOptions")
  @js.native
  /** Creates an instance of the QueryOptions class for enumerating storage items, and initializes it with the following default settings: QueryOptions.FolderDepth gets FolderDepth.Shallow and QueryOptions.IndexerOption gets IndexerOption.DoNotUseIndexer . */
  class QueryOptions ()
    extends typingsSlinky.winrtUwp.Windows.Storage.Search.QueryOptions {
    /**
      * Creates an instance of the QueryOptions class for enumerating subfolders and initializes it with values based on the specified CommonFolderQuery .
      * @param query An enumeration value that specifies how to group the contents of the folder where the query is created into subfolders to enumerate. The subfolders that are retrieved using a CommonFolderQuery can be actual file system folders or virtual folders that represent groups of files (which are determined by the CommonFolderQuery value). For example, the CommonFolderQuery.GroupByArtist uses the Artist of the files in the folder (and its subfolders) to group files, creating one virtual folder (or file group) for each artist.
      */
    def this(query: CommonFolderQuery) = this()
    /**
      * Creates an instance of the QueryOptions class for enumerating files and initializes it with values provided by the specified CommonFileQuery and an optional file type filter that determines which files to include in query results.
      * @param query An enumeration value that specifies the search parameters to use to query files.
      * @param fileTypeFilter An array of file types to be included in the query results. To include all file types, supply null or an array containing a single entry of "*".
      */
    def this(query: CommonFileQuery, fileTypeFilter: IIterable[String]) = this()
  }
  
  /** Provides access to the sorting criteria of the query results as a collection of SortEntry objects. */
  @JSGlobal("Windows.Storage.Search.SortEntryVector")
  @js.native
  abstract class SortEntryVector ()
    extends typingsSlinky.winrtUwp.Windows.Storage.Search.SortEntryVector
  
  /** Provides access to the results of a query of the files in the location that is represented by a storageFolder object. You can use storageFileQueryResult to enumerate the files in that storageFolder location. */
  @JSGlobal("Windows.Storage.Search.StorageFileQueryResult")
  @js.native
  abstract class StorageFileQueryResult ()
    extends typingsSlinky.winrtUwp.Windows.Storage.Search.StorageFileQueryResult
  
  /** Provides access to the results of a query that lists the folder (or file groups) in the folder being queried (which is represented by a storageFolder ). You can use a storageFolderQueryResult to enumerate folders or file groups in that folder. */
  @JSGlobal("Windows.Storage.Search.StorageFolderQueryResult")
  @js.native
  abstract class StorageFolderQueryResult ()
    extends typingsSlinky.winrtUwp.Windows.Storage.Search.StorageFolderQueryResult
  
  /** Provides access to the results of a query that lists all items including files and folders (or file groups) in the folder being queried (which is represented by a storageFolder ). You can use storageItemQueryResult to enumerate the files and folders in that storageFolder . */
  @JSGlobal("Windows.Storage.Search.StorageItemQueryResult")
  @js.native
  abstract class StorageItemQueryResult ()
    extends typingsSlinky.winrtUwp.Windows.Storage.Search.StorageItemQueryResult
  
  /** Details about a change to storage library content. */
  @JSGlobal("Windows.Storage.Search.StorageLibraryContentChangedTriggerDetails")
  @js.native
  abstract class StorageLibraryContentChangedTriggerDetails ()
    extends typingsSlinky.winrtUwp.Windows.Storage.Search.StorageLibraryContentChangedTriggerDetails
  
  /** Specifies the language of a property, as a BCP-47 language code. */
  @JSGlobal("Windows.Storage.Search.ValueAndLanguage")
  @js.native
  /** Initializes a new instance of the ValueAndLanguage class. */
  class ValueAndLanguage ()
    extends typingsSlinky.winrtUwp.Windows.Storage.Search.ValueAndLanguage
}
