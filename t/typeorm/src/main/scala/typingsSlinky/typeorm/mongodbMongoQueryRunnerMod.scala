package typingsSlinky.typeorm

import typingsSlinky.typeorm.anon.BatchSizeReadPreference
import typingsSlinky.typeorm.anon.DropTarget
import typingsSlinky.typeorm.anon.Full
import typingsSlinky.typeorm.anon.J
import typingsSlinky.typeorm.anon.MaxTimeMS
import typingsSlinky.typeorm.anon.Scale
import typingsSlinky.typeorm.anon.`5`
import typingsSlinky.typeorm.commonObjectLiteralMod.ObjectLiteral
import typingsSlinky.typeorm.connectionConnectionMod.Connection
import typingsSlinky.typeorm.entityManagerMongoEntityManagerMod.MongoEntityManager
import typingsSlinky.typeorm.mongodbTypingsMod.AggregationCursor
import typingsSlinky.typeorm.mongodbTypingsMod.BulkWriteOpResultObject
import typingsSlinky.typeorm.mongodbTypingsMod.ChangeStream
import typingsSlinky.typeorm.mongodbTypingsMod.ChangeStreamOptions
import typingsSlinky.typeorm.mongodbTypingsMod.Code
import typingsSlinky.typeorm.mongodbTypingsMod.CollStats
import typingsSlinky.typeorm.mongodbTypingsMod.Collection
import typingsSlinky.typeorm.mongodbTypingsMod.CollectionAggregationOptions
import typingsSlinky.typeorm.mongodbTypingsMod.CollectionBulkWriteOptions
import typingsSlinky.typeorm.mongodbTypingsMod.CollectionInsertManyOptions
import typingsSlinky.typeorm.mongodbTypingsMod.CollectionInsertOneOptions
import typingsSlinky.typeorm.mongodbTypingsMod.CollectionOptions
import typingsSlinky.typeorm.mongodbTypingsMod.CommandCursor
import typingsSlinky.typeorm.mongodbTypingsMod.Cursor
import typingsSlinky.typeorm.mongodbTypingsMod.DeleteWriteOpResultObject
import typingsSlinky.typeorm.mongodbTypingsMod.FindAndModifyWriteOpResultObject
import typingsSlinky.typeorm.mongodbTypingsMod.FindOneAndReplaceOption
import typingsSlinky.typeorm.mongodbTypingsMod.GeoHaystackSearchOptions
import typingsSlinky.typeorm.mongodbTypingsMod.GeoNearOptions
import typingsSlinky.typeorm.mongodbTypingsMod.InsertOneWriteOpResult
import typingsSlinky.typeorm.mongodbTypingsMod.InsertWriteOpResult
import typingsSlinky.typeorm.mongodbTypingsMod.MapReduceOptions
import typingsSlinky.typeorm.mongodbTypingsMod.MongoClient
import typingsSlinky.typeorm.mongodbTypingsMod.MongoCountPreferences
import typingsSlinky.typeorm.mongodbTypingsMod.MongodbIndexOptions
import typingsSlinky.typeorm.mongodbTypingsMod.OrderedBulkOperation
import typingsSlinky.typeorm.mongodbTypingsMod.ParallelCollectionScanOptions
import typingsSlinky.typeorm.mongodbTypingsMod.ReplaceOneOptions
import typingsSlinky.typeorm.mongodbTypingsMod.UnorderedBulkOperation
import typingsSlinky.typeorm.mongodbTypingsMod.UpdateWriteOpResult
import typingsSlinky.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import typingsSlinky.typeorm.tableTableMod.Table
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mongodbMongoQueryRunnerMod {
  
  @JSImport("typeorm/driver/mongodb/MongoQueryRunner", "MongoQueryRunner")
  @js.native
  class MongoQueryRunner protected () extends QueryRunner {
    def this(connection: Connection, databaseConnection: MongoClient) = this()
    
    /**
      * Execute an aggregation framework pipeline against the collection.
      */
    def aggregate(collectionName: String, pipeline: js.Array[ObjectLiteral]): AggregationCursor[_] = js.native
    def aggregate(collectionName: String, pipeline: js.Array[ObjectLiteral], options: CollectionAggregationOptions): AggregationCursor[_] = js.native
    
    /**
      * Perform a bulkWrite operation without a fluent API.
      */
    def bulkWrite(collectionName: String, operations: js.Array[ObjectLiteral]): js.Promise[BulkWriteOpResultObject] = js.native
    def bulkWrite(collectionName: String, operations: js.Array[ObjectLiteral], options: CollectionBulkWriteOptions): js.Promise[BulkWriteOpResultObject] = js.native
    
    /**
      * Retrieve all the indexes on the collection.
      */
    def collectionIndexExists(collectionName: String, indexes: String): js.Promise[Boolean] = js.native
    def collectionIndexExists(collectionName: String, indexes: js.Array[String]): js.Promise[Boolean] = js.native
    
    /**
      * Retrieves this collections index info.
      */
    def collectionIndexInformation(collectionName: String): js.Promise[_] = js.native
    def collectionIndexInformation(collectionName: String, options: Full): js.Promise[_] = js.native
    
    /**
      * Retrieve all the indexes on the collection.
      */
    def collectionIndexes(collectionName: String): js.Promise[_] = js.native
    
    /**
      * Count number of matching documents in the db to a query.
      */
    def count(collectionName: String): js.Promise[_] = js.native
    def count(collectionName: String, query: js.UndefOr[scala.Nothing], options: MongoCountPreferences): js.Promise[_] = js.native
    def count(collectionName: String, query: ObjectLiteral): js.Promise[_] = js.native
    def count(collectionName: String, query: ObjectLiteral, options: MongoCountPreferences): js.Promise[_] = js.native
    
    /**
      * Creates an index on the db and collection.
      */
    def createCollectionIndex(collectionName: String, fieldOrSpec: String): js.Promise[String] = js.native
    def createCollectionIndex(collectionName: String, fieldOrSpec: String, options: MongodbIndexOptions): js.Promise[String] = js.native
    def createCollectionIndex(collectionName: String, fieldOrSpec: js.Any): js.Promise[String] = js.native
    def createCollectionIndex(collectionName: String, fieldOrSpec: js.Any, options: MongodbIndexOptions): js.Promise[String] = js.native
    
    /**
      * Creates multiple indexes in the collection, this method is only supported for MongoDB 2.6 or higher.
      * Earlier version of MongoDB will throw a command not supported error. Index specifications are defined at http://docs.mongodb.org/manual/reference/command/createIndexes/.
      */
    def createCollectionIndexes(collectionName: String, indexSpecs: js.Array[ObjectLiteral]): js.Promise[Unit] = js.native
    
    /**
      * Creates a cursor for a query that can be used to iterate over results from MongoDB.
      */
    def cursor(collectionName: String): Cursor[_] = js.native
    def cursor(collectionName: String, query: ObjectLiteral): Cursor[_] = js.native
    
    /**
      * Real database connection from a connection pool used to perform queries.
      */
    var databaseConnection: MongoClient = js.native
    
    /**
      * Delete multiple documents on MongoDB.
      */
    def deleteMany(collectionName: String, query: ObjectLiteral): js.Promise[DeleteWriteOpResultObject] = js.native
    def deleteMany(collectionName: String, query: ObjectLiteral, options: CollectionOptions): js.Promise[DeleteWriteOpResultObject] = js.native
    
    /**
      * Delete a document on MongoDB.
      */
    def deleteOne(collectionName: String, query: ObjectLiteral): js.Promise[DeleteWriteOpResultObject] = js.native
    def deleteOne(collectionName: String, query: ObjectLiteral, options: CollectionOptions): js.Promise[DeleteWriteOpResultObject] = js.native
    
    /**
      * The distinct command returns returns a list of distinct values for the given key across a collection.
      */
    def distinct(collectionName: String, key: String, query: ObjectLiteral): js.Promise[_] = js.native
    def distinct(collectionName: String, key: String, query: ObjectLiteral, options: `5`): js.Promise[_] = js.native
    
    /**
      * Drops an index from this collection.
      */
    def dropCollectionIndex(collectionName: String, indexName: String): js.Promise[_] = js.native
    def dropCollectionIndex(collectionName: String, indexName: String, options: CollectionOptions): js.Promise[_] = js.native
    
    /**
      * Drops all indexes from the collection.
      */
    def dropCollectionIndexes(collectionName: String): js.Promise[_] = js.native
    
    /**
      * Find a document and delete it in one atomic operation, requires a write lock for the duration of the operation.
      */
    def findOneAndDelete(collectionName: String, query: ObjectLiteral): js.Promise[FindAndModifyWriteOpResultObject] = js.native
    def findOneAndDelete(collectionName: String, query: ObjectLiteral, options: MaxTimeMS): js.Promise[FindAndModifyWriteOpResultObject] = js.native
    
    /**
      * Find a document and replace it in one atomic operation, requires a write lock for the duration of the operation.
      */
    def findOneAndReplace(collectionName: String, query: ObjectLiteral, replacement: js.Object): js.Promise[FindAndModifyWriteOpResultObject] = js.native
    def findOneAndReplace(
      collectionName: String,
      query: ObjectLiteral,
      replacement: js.Object,
      options: FindOneAndReplaceOption
    ): js.Promise[FindAndModifyWriteOpResultObject] = js.native
    
    /**
      * Find a document and update it in one atomic operation, requires a write lock for the duration of the operation.
      */
    def findOneAndUpdate(collectionName: String, query: ObjectLiteral, update: js.Object): js.Promise[FindAndModifyWriteOpResultObject] = js.native
    def findOneAndUpdate(collectionName: String, query: ObjectLiteral, update: js.Object, options: FindOneAndReplaceOption): js.Promise[FindAndModifyWriteOpResultObject] = js.native
    
    /**
      * Execute a geo search using a geo haystack index on a collection.
      */
    def geoHaystackSearch(collectionName: String, x: Double, y: Double): js.Promise[_] = js.native
    def geoHaystackSearch(collectionName: String, x: Double, y: Double, options: GeoHaystackSearchOptions): js.Promise[_] = js.native
    
    /**
      * Execute the geoNear command to search for items in the collection.
      */
    def geoNear(collectionName: String, x: Double, y: Double): js.Promise[_] = js.native
    def geoNear(collectionName: String, x: Double, y: Double, options: GeoNearOptions): js.Promise[_] = js.native
    
    /**
      * Gets collection from the database with a given name.
      */
    /* protected */ def getCollection(collectionName: String): Collection[_] = js.native
    
    def group(
      collectionName: String,
      keys: js.Array[_],
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: js.Function,
      command: Boolean
    ): js.Promise[_] = js.native
    def group(
      collectionName: String,
      keys: js.Array[_],
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: js.Function,
      command: Boolean,
      options: `5`
    ): js.Promise[_] = js.native
    def group(
      collectionName: String,
      keys: js.Array[_],
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: Code,
      command: Boolean
    ): js.Promise[_] = js.native
    def group(
      collectionName: String,
      keys: js.Array[_],
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: Code,
      command: Boolean,
      options: `5`
    ): js.Promise[_] = js.native
    def group(
      collectionName: String,
      keys: js.Array[_],
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: js.Function,
      command: Boolean
    ): js.Promise[_] = js.native
    def group(
      collectionName: String,
      keys: js.Array[_],
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: js.Function,
      command: Boolean,
      options: `5`
    ): js.Promise[_] = js.native
    def group(
      collectionName: String,
      keys: js.Array[_],
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: Code,
      command: Boolean
    ): js.Promise[_] = js.native
    def group(
      collectionName: String,
      keys: js.Array[_],
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: Code,
      command: Boolean,
      options: `5`
    ): js.Promise[_] = js.native
    def group(
      collectionName: String,
      keys: js.Function,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: js.Function,
      command: Boolean
    ): js.Promise[_] = js.native
    def group(
      collectionName: String,
      keys: js.Function,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: js.Function,
      command: Boolean,
      options: `5`
    ): js.Promise[_] = js.native
    def group(
      collectionName: String,
      keys: js.Function,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: Code,
      command: Boolean
    ): js.Promise[_] = js.native
    def group(
      collectionName: String,
      keys: js.Function,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: Code,
      command: Boolean,
      options: `5`
    ): js.Promise[_] = js.native
    def group(
      collectionName: String,
      keys: js.Function,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: js.Function,
      command: Boolean
    ): js.Promise[_] = js.native
    def group(
      collectionName: String,
      keys: js.Function,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: js.Function,
      command: Boolean,
      options: `5`
    ): js.Promise[_] = js.native
    def group(
      collectionName: String,
      keys: js.Function,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: Code,
      command: Boolean
    ): js.Promise[_] = js.native
    def group(
      collectionName: String,
      keys: js.Function,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: Code,
      command: Boolean,
      options: `5`
    ): js.Promise[_] = js.native
    /**
      * Run a group command across a collection.
      */
    def group(
      collectionName: String,
      keys: js.Object,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: js.Function,
      command: Boolean
    ): js.Promise[_] = js.native
    def group(
      collectionName: String,
      keys: js.Object,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: js.Function,
      command: Boolean,
      options: `5`
    ): js.Promise[_] = js.native
    def group(
      collectionName: String,
      keys: js.Object,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: Code,
      command: Boolean
    ): js.Promise[_] = js.native
    def group(
      collectionName: String,
      keys: js.Object,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: Code,
      command: Boolean,
      options: `5`
    ): js.Promise[_] = js.native
    def group(
      collectionName: String,
      keys: js.Object,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: js.Function,
      command: Boolean
    ): js.Promise[_] = js.native
    def group(
      collectionName: String,
      keys: js.Object,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: js.Function,
      command: Boolean,
      options: `5`
    ): js.Promise[_] = js.native
    def group(
      collectionName: String,
      keys: js.Object,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: Code,
      command: Boolean
    ): js.Promise[_] = js.native
    def group(
      collectionName: String,
      keys: js.Object,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: Code,
      command: Boolean,
      options: `5`
    ): js.Promise[_] = js.native
    def group(
      collectionName: String,
      keys: Code,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: js.Function,
      command: Boolean
    ): js.Promise[_] = js.native
    def group(
      collectionName: String,
      keys: Code,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: js.Function,
      command: Boolean,
      options: `5`
    ): js.Promise[_] = js.native
    def group(
      collectionName: String,
      keys: Code,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: Code,
      command: Boolean
    ): js.Promise[_] = js.native
    def group(
      collectionName: String,
      keys: Code,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: Code,
      command: Boolean,
      options: `5`
    ): js.Promise[_] = js.native
    def group(
      collectionName: String,
      keys: Code,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: js.Function,
      command: Boolean
    ): js.Promise[_] = js.native
    def group(
      collectionName: String,
      keys: Code,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: js.Function,
      command: Boolean,
      options: `5`
    ): js.Promise[_] = js.native
    def group(
      collectionName: String,
      keys: Code,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: Code,
      command: Boolean
    ): js.Promise[_] = js.native
    def group(
      collectionName: String,
      keys: Code,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: Code,
      command: Boolean,
      options: `5`
    ): js.Promise[_] = js.native
    
    /**
      * Initiate an In order bulk write operation, operations will be serially executed in the order they are added, creating a new operation for each switch in types.
      */
    def initializeOrderedBulkOp(collectionName: String): OrderedBulkOperation = js.native
    def initializeOrderedBulkOp(collectionName: String, options: CollectionOptions): OrderedBulkOperation = js.native
    
    /**
      * Initiate a Out of order batch write operation. All operations will be buffered into insert/update/remove commands executed out of order.
      */
    def initializeUnorderedBulkOp(collectionName: String): UnorderedBulkOperation = js.native
    def initializeUnorderedBulkOp(collectionName: String, options: CollectionOptions): UnorderedBulkOperation = js.native
    
    /**
      * Inserts an array of documents into MongoDB.
      */
    def insertMany(collectionName: String, docs: js.Array[ObjectLiteral]): js.Promise[InsertWriteOpResult] = js.native
    def insertMany(collectionName: String, docs: js.Array[ObjectLiteral], options: CollectionInsertManyOptions): js.Promise[InsertWriteOpResult] = js.native
    
    /**
      * Inserts a single document into MongoDB.
      */
    def insertOne(collectionName: String, doc: ObjectLiteral): js.Promise[InsertOneWriteOpResult] = js.native
    def insertOne(collectionName: String, doc: ObjectLiteral, options: CollectionInsertOneOptions): js.Promise[InsertOneWriteOpResult] = js.native
    
    /**
      * Returns if the collection is a capped collection.
      */
    def isCapped(collectionName: String): js.Promise[_] = js.native
    
    /**
      * Get the list of all indexes information for the collection.
      */
    def listCollectionIndexes(collectionName: String): CommandCursor = js.native
    def listCollectionIndexes(collectionName: String, options: BatchSizeReadPreference): CommandCursor = js.native
    
    /**
      * Entity manager working only with current query runner.
      */
    @JSName("manager")
    var manager_MongoQueryRunner: MongoEntityManager = js.native
    
    def mapReduce(collectionName: String, map: String, reduce: String): js.Promise[_] = js.native
    def mapReduce(collectionName: String, map: String, reduce: String, options: MapReduceOptions): js.Promise[_] = js.native
    def mapReduce(collectionName: String, map: String, reduce: js.Function): js.Promise[_] = js.native
    def mapReduce(collectionName: String, map: String, reduce: js.Function, options: MapReduceOptions): js.Promise[_] = js.native
    def mapReduce(collectionName: String, map: js.Function, reduce: String): js.Promise[_] = js.native
    def mapReduce(collectionName: String, map: js.Function, reduce: String, options: MapReduceOptions): js.Promise[_] = js.native
    /**
      * Run Map Reduce across a collection. Be aware that the inline option for out will return an array of results not a collection.
      */
    def mapReduce(collectionName: String, map: js.Function, reduce: js.Function): js.Promise[_] = js.native
    def mapReduce(collectionName: String, map: js.Function, reduce: js.Function, options: MapReduceOptions): js.Promise[_] = js.native
    
    /**
      * Return N number of parallel cursors for a collection allowing parallel reading of entire collection.
      * There are no ordering guarantees for returned results.
      */
    def parallelCollectionScan(collectionName: String): js.Promise[js.Array[Cursor[_]]] = js.native
    def parallelCollectionScan(collectionName: String, options: ParallelCollectionScanOptions): js.Promise[js.Array[Cursor[_]]] = js.native
    
    /**
      * Reindex all indexes on the collection Warning: reIndex is a blocking operation (indexes are rebuilt in the foreground) and will be slow for large collections.
      */
    def reIndex(collectionName: String): js.Promise[_] = js.native
    
    /**
      * Reindex all indexes on the collection Warning: reIndex is a blocking operation (indexes are rebuilt in the foreground) and will be slow for large collections.
      */
    def rename(collectionName: String, newName: String): js.Promise[Collection[_]] = js.native
    def rename(collectionName: String, newName: String, options: DropTarget): js.Promise[Collection[_]] = js.native
    
    def renameTable(oldTableOrName: String, newTableOrName: Table): js.Promise[Unit] = js.native
    /**
      * Renames the given table.
      */
    def renameTable(oldTableOrName: Table, newTableOrName: Table): js.Promise[Unit] = js.native
    
    /**
      * Replace a document on MongoDB.
      */
    def replaceOne(collectionName: String, query: ObjectLiteral, doc: ObjectLiteral): js.Promise[UpdateWriteOpResult] = js.native
    def replaceOne(collectionName: String, query: ObjectLiteral, doc: ObjectLiteral, options: ReplaceOneOptions): js.Promise[UpdateWriteOpResult] = js.native
    
    /**
      * Get all the collection statistics.
      */
    def stats(collectionName: String): js.Promise[CollStats] = js.native
    def stats(collectionName: String, options: Scale): js.Promise[CollStats] = js.native
    
    /**
      * Update multiple documents on MongoDB.
      */
    def updateMany(collectionName: String, query: ObjectLiteral, update: ObjectLiteral): js.Promise[UpdateWriteOpResult] = js.native
    def updateMany(collectionName: String, query: ObjectLiteral, update: ObjectLiteral, options: J): js.Promise[UpdateWriteOpResult] = js.native
    
    /**
      * Update a single document on MongoDB.
      */
    def updateOne(collectionName: String, query: ObjectLiteral, update: ObjectLiteral): js.Promise[UpdateWriteOpResult] = js.native
    def updateOne(collectionName: String, query: ObjectLiteral, update: ObjectLiteral, options: ReplaceOneOptions): js.Promise[UpdateWriteOpResult] = js.native
    
    /**
      * Watching new changes as stream.
      */
    def watch(collectionName: String): ChangeStream = js.native
    def watch(collectionName: String, pipeline: js.UndefOr[scala.Nothing], options: ChangeStreamOptions): ChangeStream = js.native
    def watch(collectionName: String, pipeline: js.Array[js.Object]): ChangeStream = js.native
    def watch(collectionName: String, pipeline: js.Array[js.Object], options: ChangeStreamOptions): ChangeStream = js.native
  }
}
