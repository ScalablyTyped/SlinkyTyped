package typingsSlinky.typeorm

import typingsSlinky.std.Partial
import typingsSlinky.typeorm.anon.BatchSizeReadPreference
import typingsSlinky.typeorm.anon.DropTarget
import typingsSlinky.typeorm.anon.Full
import typingsSlinky.typeorm.anon.J
import typingsSlinky.typeorm.anon.MaxTimeMS
import typingsSlinky.typeorm.anon.Scale
import typingsSlinky.typeorm.anon.`5`
import typingsSlinky.typeorm.commonDeepPartialMod.DeepPartial
import typingsSlinky.typeorm.commonEntityTargetMod.EntityTarget
import typingsSlinky.typeorm.commonObjectLiteralMod.ObjectLiteral
import typingsSlinky.typeorm.connectionConnectionMod.Connection
import typingsSlinky.typeorm.entityManagerEntityManagerMod.EntityManager
import typingsSlinky.typeorm.findOptionsFindConditionsMod.FindConditions
import typingsSlinky.typeorm.findOptionsFindManyOptionsMod.FindManyOptions
import typingsSlinky.typeorm.findOptionsFindOneOptionsMod.FindOneOptions
import typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata
import typingsSlinky.typeorm.mongodbMongoQueryRunnerMod.MongoQueryRunner
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
import typingsSlinky.typeorm.mongodbTypingsMod.MongoCountPreferences
import typingsSlinky.typeorm.mongodbTypingsMod.MongodbIndexOptions
import typingsSlinky.typeorm.mongodbTypingsMod.ObjectID
import typingsSlinky.typeorm.mongodbTypingsMod.OrderedBulkOperation
import typingsSlinky.typeorm.mongodbTypingsMod.ParallelCollectionScanOptions
import typingsSlinky.typeorm.mongodbTypingsMod.ReplaceOneOptions
import typingsSlinky.typeorm.mongodbTypingsMod.UnorderedBulkOperation
import typingsSlinky.typeorm.mongodbTypingsMod.UpdateWriteOpResult
import typingsSlinky.typeorm.queryBuilderQueryPartialEntityMod.QueryDeepPartialEntity
import typingsSlinky.typeorm.resultDeleteResultMod.DeleteResult
import typingsSlinky.typeorm.resultUpdateResultMod.UpdateResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/entity-manager/MongoEntityManager", JSImport.Namespace)
@js.native
object entityManagerMongoEntityManagerMod extends js.Object {
  
  @js.native
  class MongoEntityManager protected () extends EntityManager {
    def this(connection: Connection) = this()
    
    /**
      * Execute an aggregation framework pipeline against the collection.
      */
    def aggregate[Entity, R](entityClassOrName: EntityTarget[Entity], pipeline: js.Array[ObjectLiteral]): AggregationCursor[R] = js.native
    def aggregate[Entity, R](
      entityClassOrName: EntityTarget[Entity],
      pipeline: js.Array[ObjectLiteral],
      options: CollectionAggregationOptions
    ): AggregationCursor[R] = js.native
    
    /**
      * Execute an aggregation framework pipeline against the collection.
      * This returns modified version of cursor that transforms each result into Entity model.
      */
    def aggregateEntity[Entity](entityClassOrName: EntityTarget[Entity], pipeline: js.Array[ObjectLiteral]): AggregationCursor[Entity] = js.native
    def aggregateEntity[Entity](
      entityClassOrName: EntityTarget[Entity],
      pipeline: js.Array[ObjectLiteral],
      options: CollectionAggregationOptions
    ): AggregationCursor[Entity] = js.native
    
    /* protected */ def applyEntityTransformationToCursor[Entity](metadata: EntityMetadata, cursor: AggregationCursor[Entity]): Unit = js.native
    /**
      * Overrides cursor's toArray and next methods to convert results to entity automatically.
      */
    /* protected */ def applyEntityTransformationToCursor[Entity](metadata: EntityMetadata, cursor: Cursor[Entity]): Unit = js.native
    
    /**
      * Perform a bulkWrite operation without a fluent API.
      */
    def bulkWrite[Entity](entityClassOrName: EntityTarget[Entity], operations: js.Array[ObjectLiteral]): js.Promise[BulkWriteOpResultObject] = js.native
    def bulkWrite[Entity](
      entityClassOrName: EntityTarget[Entity],
      operations: js.Array[ObjectLiteral],
      options: CollectionBulkWriteOptions
    ): js.Promise[BulkWriteOpResultObject] = js.native
    
    /**
      * Retrieve all the indexes on the collection.
      */
    def collectionIndexExists[Entity](entityClassOrName: EntityTarget[Entity], indexes: String): js.Promise[Boolean] = js.native
    def collectionIndexExists[Entity](entityClassOrName: EntityTarget[Entity], indexes: js.Array[String]): js.Promise[Boolean] = js.native
    
    /**
      * Retrieves this collections index info.
      */
    def collectionIndexInformation[Entity](entityClassOrName: EntityTarget[Entity]): js.Promise[_] = js.native
    def collectionIndexInformation[Entity](entityClassOrName: EntityTarget[Entity], options: Full): js.Promise[_] = js.native
    
    /**
      * Retrieve all the indexes on the collection.
      */
    def collectionIndexes[Entity](entityClassOrName: EntityTarget[Entity]): js.Promise[_] = js.native
    
    /**
      * Converts FindManyOptions to mongodb query.
      */
    /* protected */ def convertFindManyOptionsOrConditionsToMongodbQuery[Entity](): js.UndefOr[ObjectLiteral] = js.native
    /* protected */ def convertFindManyOptionsOrConditionsToMongodbQuery[Entity](optionsOrConditions: Partial[Entity]): js.UndefOr[ObjectLiteral] = js.native
    /* protected */ def convertFindManyOptionsOrConditionsToMongodbQuery[Entity](optionsOrConditions: FindManyOptions[Entity]): js.UndefOr[ObjectLiteral] = js.native
    
    /**
      * Converts FindOneOptions to mongodb query.
      */
    /* protected */ def convertFindOneOptionsOrConditionsToMongodbQuery[Entity](): js.UndefOr[ObjectLiteral] = js.native
    /* protected */ def convertFindOneOptionsOrConditionsToMongodbQuery[Entity](optionsOrConditions: Partial[Entity]): js.UndefOr[ObjectLiteral] = js.native
    /* protected */ def convertFindOneOptionsOrConditionsToMongodbQuery[Entity](optionsOrConditions: FindOneOptions[Entity]): js.UndefOr[ObjectLiteral] = js.native
    
    /**
      * Converts FindOptions into mongodb order by criteria.
      */
    /* protected */ def convertFindOptionsOrderToOrderCriteria(order: ObjectLiteral): ObjectLiteral = js.native
    
    /**
      * Converts FindOptions into mongodb select by criteria.
      */
    /* protected */ def convertFindOptionsSelectToProjectCriteria(selects: js.Array[/* keyof any */ String]): js.Any = js.native
    
    /**
      * Ensures given id is an id for query.
      */
    /* protected */ def convertMixedCriteria(metadata: EntityMetadata, idMap: js.Any): ObjectLiteral = js.native
    
    def count[Entity](
      entityClassOrName: EntityTarget[Entity],
      query: js.UndefOr[scala.Nothing],
      options: MongoCountPreferences
    ): js.Promise[Double] = js.native
    def count[Entity](entityClassOrName: EntityTarget[Entity], query: ObjectLiteral): js.Promise[Double] = js.native
    def count[Entity](entityClassOrName: EntityTarget[Entity], query: ObjectLiteral, options: MongoCountPreferences): js.Promise[Double] = js.native
    
    /**
      * Creates an index on the db and collection.
      */
    def createCollectionIndex[Entity](entityClassOrName: EntityTarget[Entity], fieldOrSpec: String): js.Promise[String] = js.native
    def createCollectionIndex[Entity](entityClassOrName: EntityTarget[Entity], fieldOrSpec: String, options: MongodbIndexOptions): js.Promise[String] = js.native
    def createCollectionIndex[Entity](entityClassOrName: EntityTarget[Entity], fieldOrSpec: js.Any): js.Promise[String] = js.native
    def createCollectionIndex[Entity](entityClassOrName: EntityTarget[Entity], fieldOrSpec: js.Any, options: MongodbIndexOptions): js.Promise[String] = js.native
    
    /**
      * Creates multiple indexes in the collection, this method is only supported for MongoDB 2.6 or higher.
      * Earlier version of MongoDB will throw a command not supported error.
      * Index specifications are defined at http://docs.mongodb.org/manual/reference/command/createIndexes/.
      */
    def createCollectionIndexes[Entity](entityClassOrName: EntityTarget[Entity], indexSpecs: js.Array[ObjectLiteral]): js.Promise[Unit] = js.native
    
    /**
      * Creates a cursor for a query that can be used to iterate over results from MongoDB.
      */
    def createCursor[Entity, T](entityClassOrName: EntityTarget[Entity]): Cursor[T] = js.native
    def createCursor[Entity, T](entityClassOrName: EntityTarget[Entity], query: ObjectLiteral): Cursor[T] = js.native
    
    /**
      * Creates a cursor for a query that can be used to iterate over results from MongoDB.
      * This returns modified version of cursor that transforms each result into Entity model.
      */
    def createEntityCursor[Entity](entityClassOrName: EntityTarget[Entity]): Cursor[Entity] = js.native
    def createEntityCursor[Entity](entityClassOrName: EntityTarget[Entity], query: ObjectLiteral): Cursor[Entity] = js.native
    
    def delete[Entity](target: EntityTarget[Entity], criteria: FindConditions[Entity]): js.Promise[DeleteResult] = js.native
    
    /**
      * Delete multiple documents on MongoDB.
      */
    def deleteMany[Entity](entityClassOrName: EntityTarget[Entity], query: ObjectLiteral): js.Promise[DeleteWriteOpResultObject] = js.native
    def deleteMany[Entity](entityClassOrName: EntityTarget[Entity], query: ObjectLiteral, options: CollectionOptions): js.Promise[DeleteWriteOpResultObject] = js.native
    
    /**
      * Delete a document on MongoDB.
      */
    def deleteOne[Entity](entityClassOrName: EntityTarget[Entity], query: ObjectLiteral): js.Promise[DeleteWriteOpResultObject] = js.native
    def deleteOne[Entity](entityClassOrName: EntityTarget[Entity], query: ObjectLiteral, options: CollectionOptions): js.Promise[DeleteWriteOpResultObject] = js.native
    
    /**
      * The distinct command returns returns a list of distinct values for the given key across a collection.
      */
    def distinct[Entity](entityClassOrName: EntityTarget[Entity], key: String, query: ObjectLiteral): js.Promise[_] = js.native
    def distinct[Entity](entityClassOrName: EntityTarget[Entity], key: String, query: ObjectLiteral, options: `5`): js.Promise[_] = js.native
    
    /**
      * Drops an index from this collection.
      */
    def dropCollectionIndex[Entity](entityClassOrName: EntityTarget[Entity], indexName: String): js.Promise[_] = js.native
    def dropCollectionIndex[Entity](entityClassOrName: EntityTarget[Entity], indexName: String, options: CollectionOptions): js.Promise[_] = js.native
    
    /**
      * Drops all indexes from the collection.
      */
    def dropCollectionIndexes[Entity](entityClassOrName: EntityTarget[Entity]): js.Promise[_] = js.native
    
    def find[Entity](entityClassOrName: EntityTarget[Entity], optionsOrConditions: Partial[Entity]): js.Promise[js.Array[Entity]] = js.native
    
    def findAndCount[Entity](entityClassOrName: EntityTarget[Entity], optionsOrConditions: Partial[Entity]): js.Promise[js.Tuple2[js.Array[Entity], Double]] = js.native
    
    def findByIds[Entity](entityClassOrName: EntityTarget[Entity], ids: js.Array[_], optionsOrConditions: Partial[Entity]): js.Promise[js.Array[Entity]] = js.native
    
    def findOne[Entity](
      entityClassOrName: EntityTarget[Entity],
      optionsOrConditions: js.Array[js.Date | Double | ObjectID | String]
    ): js.Promise[js.UndefOr[Entity]] = js.native
    def findOne[Entity](
      entityClassOrName: EntityTarget[Entity],
      optionsOrConditions: js.Array[js.Date | Double | ObjectID | String],
      maybeOptions: FindOneOptions[Entity]
    ): js.Promise[js.UndefOr[Entity]] = js.native
    def findOne[Entity](entityClassOrName: EntityTarget[Entity], optionsOrConditions: DeepPartial[Entity]): js.Promise[js.UndefOr[Entity]] = js.native
    def findOne[Entity](
      entityClassOrName: EntityTarget[Entity],
      optionsOrConditions: DeepPartial[Entity],
      maybeOptions: FindOneOptions[Entity]
    ): js.Promise[js.UndefOr[Entity]] = js.native
    def findOne[Entity](
      entityClassOrName: EntityTarget[Entity],
      optionsOrConditions: FindOneOptions[Entity],
      maybeOptions: FindOneOptions[Entity]
    ): js.Promise[js.UndefOr[Entity]] = js.native
    
    /**
      * Find a document and delete it in one atomic operation, requires a write lock for the duration of the operation.
      */
    def findOneAndDelete[Entity](entityClassOrName: EntityTarget[Entity], query: ObjectLiteral): js.Promise[FindAndModifyWriteOpResultObject] = js.native
    def findOneAndDelete[Entity](entityClassOrName: EntityTarget[Entity], query: ObjectLiteral, options: MaxTimeMS): js.Promise[FindAndModifyWriteOpResultObject] = js.native
    
    /**
      * Find a document and replace it in one atomic operation, requires a write lock for the duration of the operation.
      */
    def findOneAndReplace[Entity](entityClassOrName: EntityTarget[Entity], query: ObjectLiteral, replacement: js.Object): js.Promise[FindAndModifyWriteOpResultObject] = js.native
    def findOneAndReplace[Entity](
      entityClassOrName: EntityTarget[Entity],
      query: ObjectLiteral,
      replacement: js.Object,
      options: FindOneAndReplaceOption
    ): js.Promise[FindAndModifyWriteOpResultObject] = js.native
    
    /**
      * Find a document and update it in one atomic operation, requires a write lock for the duration of the operation.
      */
    def findOneAndUpdate[Entity](entityClassOrName: EntityTarget[Entity], query: ObjectLiteral, update: js.Object): js.Promise[FindAndModifyWriteOpResultObject] = js.native
    def findOneAndUpdate[Entity](
      entityClassOrName: EntityTarget[Entity],
      query: ObjectLiteral,
      update: js.Object,
      options: FindOneAndReplaceOption
    ): js.Promise[FindAndModifyWriteOpResultObject] = js.native
    
    /**
      * Execute a geo search using a geo haystack index on a collection.
      */
    def geoHaystackSearch[Entity](entityClassOrName: EntityTarget[Entity], x: Double, y: Double): js.Promise[_] = js.native
    def geoHaystackSearch[Entity](entityClassOrName: EntityTarget[Entity], x: Double, y: Double, options: GeoHaystackSearchOptions): js.Promise[_] = js.native
    
    /**
      * Execute the geoNear command to search for items in the collection.
      */
    def geoNear[Entity](entityClassOrName: EntityTarget[Entity], x: Double, y: Double): js.Promise[_] = js.native
    def geoNear[Entity](entityClassOrName: EntityTarget[Entity], x: Double, y: Double, options: GeoNearOptions): js.Promise[_] = js.native
    
    def group[Entity](
      entityClassOrName: EntityTarget[Entity],
      keys: js.Array[_],
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: js.Function,
      command: Boolean
    ): js.Promise[_] = js.native
    def group[Entity](
      entityClassOrName: EntityTarget[Entity],
      keys: js.Array[_],
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: js.Function,
      command: Boolean,
      options: `5`
    ): js.Promise[_] = js.native
    def group[Entity](
      entityClassOrName: EntityTarget[Entity],
      keys: js.Array[_],
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: Code,
      command: Boolean
    ): js.Promise[_] = js.native
    def group[Entity](
      entityClassOrName: EntityTarget[Entity],
      keys: js.Array[_],
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: Code,
      command: Boolean,
      options: `5`
    ): js.Promise[_] = js.native
    def group[Entity](
      entityClassOrName: EntityTarget[Entity],
      keys: js.Array[_],
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: js.Function,
      command: Boolean
    ): js.Promise[_] = js.native
    def group[Entity](
      entityClassOrName: EntityTarget[Entity],
      keys: js.Array[_],
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: js.Function,
      command: Boolean,
      options: `5`
    ): js.Promise[_] = js.native
    def group[Entity](
      entityClassOrName: EntityTarget[Entity],
      keys: js.Array[_],
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: Code,
      command: Boolean
    ): js.Promise[_] = js.native
    def group[Entity](
      entityClassOrName: EntityTarget[Entity],
      keys: js.Array[_],
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: Code,
      command: Boolean,
      options: `5`
    ): js.Promise[_] = js.native
    def group[Entity](
      entityClassOrName: EntityTarget[Entity],
      keys: js.Function,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: js.Function,
      command: Boolean
    ): js.Promise[_] = js.native
    def group[Entity](
      entityClassOrName: EntityTarget[Entity],
      keys: js.Function,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: js.Function,
      command: Boolean,
      options: `5`
    ): js.Promise[_] = js.native
    def group[Entity](
      entityClassOrName: EntityTarget[Entity],
      keys: js.Function,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: Code,
      command: Boolean
    ): js.Promise[_] = js.native
    def group[Entity](
      entityClassOrName: EntityTarget[Entity],
      keys: js.Function,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: Code,
      command: Boolean,
      options: `5`
    ): js.Promise[_] = js.native
    def group[Entity](
      entityClassOrName: EntityTarget[Entity],
      keys: js.Function,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: js.Function,
      command: Boolean
    ): js.Promise[_] = js.native
    def group[Entity](
      entityClassOrName: EntityTarget[Entity],
      keys: js.Function,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: js.Function,
      command: Boolean,
      options: `5`
    ): js.Promise[_] = js.native
    def group[Entity](
      entityClassOrName: EntityTarget[Entity],
      keys: js.Function,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: Code,
      command: Boolean
    ): js.Promise[_] = js.native
    def group[Entity](
      entityClassOrName: EntityTarget[Entity],
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
    def group[Entity](
      entityClassOrName: EntityTarget[Entity],
      keys: js.Object,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: js.Function,
      command: Boolean
    ): js.Promise[_] = js.native
    def group[Entity](
      entityClassOrName: EntityTarget[Entity],
      keys: js.Object,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: js.Function,
      command: Boolean,
      options: `5`
    ): js.Promise[_] = js.native
    def group[Entity](
      entityClassOrName: EntityTarget[Entity],
      keys: js.Object,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: Code,
      command: Boolean
    ): js.Promise[_] = js.native
    def group[Entity](
      entityClassOrName: EntityTarget[Entity],
      keys: js.Object,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: Code,
      command: Boolean,
      options: `5`
    ): js.Promise[_] = js.native
    def group[Entity](
      entityClassOrName: EntityTarget[Entity],
      keys: js.Object,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: js.Function,
      command: Boolean
    ): js.Promise[_] = js.native
    def group[Entity](
      entityClassOrName: EntityTarget[Entity],
      keys: js.Object,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: js.Function,
      command: Boolean,
      options: `5`
    ): js.Promise[_] = js.native
    def group[Entity](
      entityClassOrName: EntityTarget[Entity],
      keys: js.Object,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: Code,
      command: Boolean
    ): js.Promise[_] = js.native
    def group[Entity](
      entityClassOrName: EntityTarget[Entity],
      keys: js.Object,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: Code,
      command: Boolean,
      options: `5`
    ): js.Promise[_] = js.native
    def group[Entity](
      entityClassOrName: EntityTarget[Entity],
      keys: Code,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: js.Function,
      command: Boolean
    ): js.Promise[_] = js.native
    def group[Entity](
      entityClassOrName: EntityTarget[Entity],
      keys: Code,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: js.Function,
      command: Boolean,
      options: `5`
    ): js.Promise[_] = js.native
    def group[Entity](
      entityClassOrName: EntityTarget[Entity],
      keys: Code,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: Code,
      command: Boolean
    ): js.Promise[_] = js.native
    def group[Entity](
      entityClassOrName: EntityTarget[Entity],
      keys: Code,
      condition: js.Object,
      initial: js.Object,
      reduce: js.Function,
      finalize: Code,
      command: Boolean,
      options: `5`
    ): js.Promise[_] = js.native
    def group[Entity](
      entityClassOrName: EntityTarget[Entity],
      keys: Code,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: js.Function,
      command: Boolean
    ): js.Promise[_] = js.native
    def group[Entity](
      entityClassOrName: EntityTarget[Entity],
      keys: Code,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: js.Function,
      command: Boolean,
      options: `5`
    ): js.Promise[_] = js.native
    def group[Entity](
      entityClassOrName: EntityTarget[Entity],
      keys: Code,
      condition: js.Object,
      initial: js.Object,
      reduce: Code,
      finalize: Code,
      command: Boolean
    ): js.Promise[_] = js.native
    def group[Entity](
      entityClassOrName: EntityTarget[Entity],
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
    def initializeOrderedBulkOp[Entity](entityClassOrName: EntityTarget[Entity]): OrderedBulkOperation = js.native
    def initializeOrderedBulkOp[Entity](entityClassOrName: EntityTarget[Entity], options: CollectionOptions): OrderedBulkOperation = js.native
    
    /**
      * Initiate a Out of order batch write operation. All operations will be buffered into insert/update/remove commands executed out of order.
      */
    def initializeUnorderedBulkOp[Entity](entityClassOrName: EntityTarget[Entity]): UnorderedBulkOperation = js.native
    def initializeUnorderedBulkOp[Entity](entityClassOrName: EntityTarget[Entity], options: CollectionOptions): UnorderedBulkOperation = js.native
    
    /**
      * Inserts an array of documents into MongoDB.
      */
    def insertMany[Entity](entityClassOrName: EntityTarget[Entity], docs: js.Array[ObjectLiteral]): js.Promise[InsertWriteOpResult] = js.native
    def insertMany[Entity](
      entityClassOrName: EntityTarget[Entity],
      docs: js.Array[ObjectLiteral],
      options: CollectionInsertManyOptions
    ): js.Promise[InsertWriteOpResult] = js.native
    
    /**
      * Inserts a single document into MongoDB.
      */
    def insertOne[Entity](entityClassOrName: EntityTarget[Entity], doc: ObjectLiteral): js.Promise[InsertOneWriteOpResult] = js.native
    def insertOne[Entity](entityClassOrName: EntityTarget[Entity], doc: ObjectLiteral, options: CollectionInsertOneOptions): js.Promise[InsertOneWriteOpResult] = js.native
    
    /**
      * Returns if the collection is a capped collection.
      */
    def isCapped[Entity](entityClassOrName: EntityTarget[Entity]): js.Promise[_] = js.native
    
    /**
      * Get the list of all indexes information for the collection.
      */
    def listCollectionIndexes[Entity](entityClassOrName: EntityTarget[Entity]): CommandCursor = js.native
    def listCollectionIndexes[Entity](entityClassOrName: EntityTarget[Entity], options: BatchSizeReadPreference): CommandCursor = js.native
    
    def mapReduce[Entity](entityClassOrName: EntityTarget[Entity], map: String, reduce: String): js.Promise[_] = js.native
    def mapReduce[Entity](entityClassOrName: EntityTarget[Entity], map: String, reduce: String, options: MapReduceOptions): js.Promise[_] = js.native
    def mapReduce[Entity](entityClassOrName: EntityTarget[Entity], map: String, reduce: js.Function): js.Promise[_] = js.native
    def mapReduce[Entity](
      entityClassOrName: EntityTarget[Entity],
      map: String,
      reduce: js.Function,
      options: MapReduceOptions
    ): js.Promise[_] = js.native
    def mapReduce[Entity](entityClassOrName: EntityTarget[Entity], map: js.Function, reduce: String): js.Promise[_] = js.native
    def mapReduce[Entity](
      entityClassOrName: EntityTarget[Entity],
      map: js.Function,
      reduce: String,
      options: MapReduceOptions
    ): js.Promise[_] = js.native
    /**
      * Run Map Reduce across a collection. Be aware that the inline option for out will return an array of results not a collection.
      */
    def mapReduce[Entity](entityClassOrName: EntityTarget[Entity], map: js.Function, reduce: js.Function): js.Promise[_] = js.native
    def mapReduce[Entity](
      entityClassOrName: EntityTarget[Entity],
      map: js.Function,
      reduce: js.Function,
      options: MapReduceOptions
    ): js.Promise[_] = js.native
    
    /**
      * Return N number of parallel cursors for a collection allowing parallel reading of entire collection.
      * There are no ordering guarantees for returned results.
      */
    def parallelCollectionScan[Entity](entityClassOrName: EntityTarget[Entity]): js.Promise[js.Array[Cursor[Entity]]] = js.native
    def parallelCollectionScan[Entity](entityClassOrName: EntityTarget[Entity], options: ParallelCollectionScanOptions): js.Promise[js.Array[Cursor[Entity]]] = js.native
    
    /**
      * Gets query runner used to execute queries.
      */
    @JSName("queryRunner")
    val queryRunner_MongoEntityManager: MongoQueryRunner = js.native
    
    /**
      * Reindex all indexes on the collection Warning: reIndex is a blocking operation (indexes are rebuilt in the foreground) and will be slow for large collections.
      */
    def reIndex[Entity](entityClassOrName: EntityTarget[Entity]): js.Promise[_] = js.native
    
    /**
      * Reindex all indexes on the collection Warning: reIndex is a blocking operation (indexes are rebuilt in the foreground) and will be slow for large collections.
      */
    def rename[Entity](entityClassOrName: EntityTarget[Entity], newName: String): js.Promise[Collection[_]] = js.native
    def rename[Entity](entityClassOrName: EntityTarget[Entity], newName: String, options: DropTarget): js.Promise[Collection[_]] = js.native
    
    /**
      * Replace a document on MongoDB.
      */
    def replaceOne[Entity](entityClassOrName: EntityTarget[Entity], query: ObjectLiteral, doc: ObjectLiteral): js.Promise[UpdateWriteOpResult] = js.native
    def replaceOne[Entity](
      entityClassOrName: EntityTarget[Entity],
      query: ObjectLiteral,
      doc: ObjectLiteral,
      options: ReplaceOneOptions
    ): js.Promise[UpdateWriteOpResult] = js.native
    
    /**
      * Get all the collection statistics.
      */
    def stats[Entity](entityClassOrName: EntityTarget[Entity]): js.Promise[CollStats] = js.native
    def stats[Entity](entityClassOrName: EntityTarget[Entity], options: Scale): js.Promise[CollStats] = js.native
    
    def update[Entity](
      target: EntityTarget[Entity],
      criteria: FindConditions[Entity],
      partialEntity: QueryDeepPartialEntity[Entity]
    ): js.Promise[UpdateResult] = js.native
    
    /**
      * Update multiple documents on MongoDB.
      */
    def updateMany[Entity](entityClassOrName: EntityTarget[Entity], query: ObjectLiteral, update: ObjectLiteral): js.Promise[UpdateWriteOpResult] = js.native
    def updateMany[Entity](entityClassOrName: EntityTarget[Entity], query: ObjectLiteral, update: ObjectLiteral, options: J): js.Promise[UpdateWriteOpResult] = js.native
    
    /**
      * Update a single document on MongoDB.
      */
    def updateOne[Entity](entityClassOrName: EntityTarget[Entity], query: ObjectLiteral, update: ObjectLiteral): js.Promise[UpdateWriteOpResult] = js.native
    def updateOne[Entity](
      entityClassOrName: EntityTarget[Entity],
      query: ObjectLiteral,
      update: ObjectLiteral,
      options: ReplaceOneOptions
    ): js.Promise[UpdateWriteOpResult] = js.native
    
    def watch[Entity](entityClassOrName: EntityTarget[Entity]): ChangeStream = js.native
    def watch[Entity](
      entityClassOrName: EntityTarget[Entity],
      pipeline: js.UndefOr[scala.Nothing],
      options: ChangeStreamOptions
    ): ChangeStream = js.native
    def watch[Entity](entityClassOrName: EntityTarget[Entity], pipeline: js.Array[js.Object]): ChangeStream = js.native
    def watch[Entity](
      entityClassOrName: EntityTarget[Entity],
      pipeline: js.Array[js.Object],
      options: ChangeStreamOptions
    ): ChangeStream = js.native
  }
}
