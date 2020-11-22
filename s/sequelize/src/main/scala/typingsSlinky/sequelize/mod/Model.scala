package typingsSlinky.sequelize.mod

import typingsSlinky.node.Buffer
import typingsSlinky.sequelize.anon.Count
import typingsSlinky.sequelize.anon.UpsertOptionsreturningfal
import typingsSlinky.sequelize.anon.UpsertOptionsreturningtru
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Model represents a table in the database. Sometimes you might also see it referred to as model, or simply
  * as factory. This class should _not_ be instantiated directly, it is created using `sequelize.define`, and
  * already created models can be loaded using `sequelize.import`
  */
@js.native
trait Model[TInstance, TAttributes, TCreationAttributes]
  extends Hooks[TInstance]
     with Associations {
  
  /**
    * The Instance class
    */
  def Instance(): TInstance = js.native
  
  def addScope(name: String, scope: js.Function): Unit = js.native
  def addScope(name: String, scope: js.Function, options: AddScopeOptions): Unit = js.native
  /**
    * Add a new scope to the model. This is especially useful for adding scopes with includes, when the model you want to include is not available at the time this model is defined.
    *
    * By default this will throw an error if a scope with that name already exists. Pass `override: true` in the options object to silence this error.
    *
    * @param {String}          name The name of the scope. Use `defaultScope` to override the default scope
    * @param {Object|Function} scope
    * @param {Object}          [options]
    * @param {Boolean}         [options.override=false]
    */
  def addScope(name: String, scope: AnyFindOptions): Unit = js.native
  def addScope(name: String, scope: AnyFindOptions, options: AddScopeOptions): Unit = js.native
  
  /**
    * Run an aggregation method on the specified field
    *
    * @param field The field to aggregate over. Can be a field name or *
    * @param aggregateFunction The function to use for aggregation, e.g. sum, max etc.
    * @param options Query options. See sequelize.query for full options
    * @return Returns the aggregate result cast to `options.dataType`, unless `options.plain` is false, in
    *     which case the complete data result is returned.
    */
  def aggregate(field: String, aggregateFunction: String): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def aggregate(field: String, aggregateFunction: String, options: AggregateOptions): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  
  def all[TCustomAttributes](): typingsSlinky.bluebird.mod.^[js.Array[TInstance]] = js.native
  def all[TCustomAttributes](optionz: FindOptions[TAttributes with TCustomAttributes]): typingsSlinky.bluebird.mod.^[js.Array[TInstance]] = js.native
  
  /**
    * Set associations with other models
    *
    * Not part of the sequelize API, used as convention to associate models after creation. e.g.:
    * ```js
    * Object.keys(models).forEach(modelName => {
    *   if (models[modelName].associate) {
    *     models[modelName].associate(models);
    *   }
    * });
    * ```
    *
    * @param models
    */
  var associate: js.UndefOr[js.Function1[/* models */ Models, Unit]] = js.native
  
  /**
    * Builds a new model instance. Values is an object of key value pairs, must be defined but can be empty.
    */
  def build(): TInstance = js.native
  def build(record: TAttributes): TInstance = js.native
  def build(record: TAttributes, options: BuildOptions): TInstance = js.native
  def build(record: js.UndefOr[scala.Nothing], options: BuildOptions): TInstance = js.native
  
  /**
    * Undocumented bulkBuild
    */
  def bulkBuild(records: js.Array[TAttributes]): js.Array[TInstance] = js.native
  def bulkBuild(records: js.Array[TAttributes], options: BuildOptions): js.Array[TInstance] = js.native
  
  /**
    * Create and insert multiple instances in bulk.
    *
    * The success handler is passed an array of instances, but please notice that these may not completely
    * represent the state of the rows in the DB. This is because MySQL and SQLite do not make it easy to
    * obtain
    * back automatically generated IDs and other default values in a way that can be mapped to multiple
    * records. To obtain Instances for the newly created values, you will need to query for them again.
    *
    * @param records List of objects (key/value pairs) to create instances from
    */
  def bulkCreate(records: js.Array[TCreationAttributes]): typingsSlinky.bluebird.mod.^[js.Array[TInstance]] = js.native
  def bulkCreate(records: js.Array[TCreationAttributes], options: BulkCreateOptions): typingsSlinky.bluebird.mod.^[js.Array[TInstance]] = js.native
  
  /**
    * Count the number of records matching the provided where clause.
    *
    * If you provide an `include` option, the number of matching associations will be counted instead.
    */
  def count(): typingsSlinky.bluebird.mod.^[Double] = js.native
  def count(options: CountOptions): typingsSlinky.bluebird.mod.^[Double] = js.native
  
  /**
    * Builds a new model instance and calls save on it.
    */
  def create(): typingsSlinky.bluebird.mod.^[TInstance] = js.native
  def create(values: TCreationAttributes): typingsSlinky.bluebird.mod.^[TInstance] = js.native
  def create(values: TCreationAttributes, options: CreateOptions): typingsSlinky.bluebird.mod.^[TInstance] = js.native
  def create(values: js.UndefOr[scala.Nothing], options: CreateOptions): typingsSlinky.bluebird.mod.^[TInstance] = js.native
  
  /**
    * Run a describe query on the table. The result will be return to the listener as a hash of attributes and
    * their types.
    */
  def describe(): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  
  /**
    * Delete multiple instances, or set their deletedAt timestamp to the current time if `paranoid` is enabled.
    *
    * @return Promise<number> The number of destroyed rows
    */
  def destroy(): typingsSlinky.bluebird.mod.^[Double] = js.native
  def destroy(options: DestroyOptions): typingsSlinky.bluebird.mod.^[Double] = js.native
  
  /**
    * Drop the table represented by this Model
    *
    * @param options
    */
  def drop(): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def drop(options: DropOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  def find[TCustomAttributes](): typingsSlinky.bluebird.mod.^[TInstance | Null] = js.native
  def find[TCustomAttributes](options: FindOptions[TAttributes with TCustomAttributes]): typingsSlinky.bluebird.mod.^[TInstance | Null] = js.native
  
  /**
    * Search for multiple instances.
    *
    * __Simple search using AND and =__
    * ```js
    * Model.findAll({
    *   where: {
    *     attr1: 42,
    *     attr2: 'cake'
    *   }
    * })
    * ```
    * ```sql
    * WHERE attr1 = 42 AND attr2 = 'cake'
    *```
    *
    * __Using greater than, less than etc.__
    * ```js
    *
    * Model.findAll({
    *   where: {
    *     attr1: {
    *       gt: 50
    *     },
    *     attr2: {
    *       lte: 45
    *     },
    *     attr3: {
    *       in: [1,2,3]
    *     },
    *     attr4: {
    *       ne: 5
    *     }
    *   }
    * })
    * ```
    * ```sql
    * WHERE attr1 > 50 AND attr2 <= 45 AND attr3 IN (1,2,3) AND attr4 != 5
    * ```
    * Possible options are: `$ne, $in, $not, $notIn, $gte, $gt, $lte, $lt, $like, $ilike/$iLike, $notLike,
    * $notILike, '..'/$between, '!..'/$notBetween, '&&'/$overlap, '@>'/$contains, '<@'/$contained`
    *
    * __Queries using OR__
    * ```js
    * Model.findAll({
    *   where: Sequelize.and(
    *     { name: 'a project' },
    *     Sequelize.or(
    *       { id: [1,2,3] },
    *       { id: { gt: 10 } }
    *     )
    *   )
    * })
    * ```
    * ```sql
    * WHERE name = 'a project' AND (id` IN (1,2,3) OR id > 10)
    * ```
    *
    * The success listener is called with an array of instances if the query succeeds.
    *
    * @see    {Sequelize#query}
    */
  def findAll[TCustomAttributes](): typingsSlinky.bluebird.mod.^[js.Array[TInstance]] = js.native
  def findAll[TCustomAttributes](options: FindOptions[TAttributes with TCustomAttributes]): typingsSlinky.bluebird.mod.^[js.Array[TInstance]] = js.native
  
  /**
    * Find all the rows matching your query, within a specified offset / limit, and get the total number of
    * rows matching your query. This is very usefull for paging
    *
    * ```js
    * Model.findAndCountAll({
    *   where: ...,
    *   limit: 12,
    *   offset: 12
    * }).then(function (result) {
    *   ...
    * })
    * ```
    * In the above example, `result.rows` will contain rows 13 through 24, while `result.count` will return
    * the
    * total number of rows that matched your query.
    *
    * When you add includes, only those which are required (either because they have a where clause, or
    * because
    * `required` is explicitly set to true on the include) will be added to the count part.
    *
    * Suppose you want to find all users who have a profile attached:
    * ```js
    * User.findAndCountAll({
    *   include: [
    *      { model: Profile, required: true}
    *   ],
    *   limit 3
    * });
    * ```
    * Because the include for `Profile` has `required` set it will result in an inner join, and only the users
    * who have a profile will be counted. If we remove `required` from the include, both users with and
    * without
    * profiles will be counted
    */
  def findAndCount[TCustomAttributes](): typingsSlinky.bluebird.mod.^[Count[TInstance]] = js.native
  def findAndCount[TCustomAttributes](options: FindOptions[TAttributes with TCustomAttributes]): typingsSlinky.bluebird.mod.^[Count[TInstance]] = js.native
  
  def findAndCountAll[TCustomAttributes](): typingsSlinky.bluebird.mod.^[Count[TInstance]] = js.native
  def findAndCountAll[TCustomAttributes](options: FindOptions[TAttributes with TCustomAttributes]): typingsSlinky.bluebird.mod.^[Count[TInstance]] = js.native
  
  /**
    * Search for a single instance by its primary key. This applies LIMIT 1, so the listener will
    * always be called with a single instance.
    */
  def findById[TCustomAttributes](): typingsSlinky.bluebird.mod.^[TInstance | Null] = js.native
  def findById[TCustomAttributes](identifier: String): typingsSlinky.bluebird.mod.^[TInstance | Null] = js.native
  def findById[TCustomAttributes](identifier: Double): typingsSlinky.bluebird.mod.^[TInstance | Null] = js.native
  def findById[TCustomAttributes](identifier: Buffer): typingsSlinky.bluebird.mod.^[TInstance | Null] = js.native
  @JSName("findById")
  def findById_where[TCustomAttributes](
    identifier: js.UndefOr[scala.Nothing],
    options: Omit[
      FindOptions[TAttributes with TCustomAttributes], 
      typingsSlinky.sequelize.sequelizeStrings.where
    ]
  ): typingsSlinky.bluebird.mod.^[TInstance | Null] = js.native
  @JSName("findById")
  def findById_where[TCustomAttributes](
    identifier: String,
    options: Omit[
      FindOptions[TAttributes with TCustomAttributes], 
      typingsSlinky.sequelize.sequelizeStrings.where
    ]
  ): typingsSlinky.bluebird.mod.^[TInstance | Null] = js.native
  @JSName("findById")
  def findById_where[TCustomAttributes](
    identifier: Double,
    options: Omit[
      FindOptions[TAttributes with TCustomAttributes], 
      typingsSlinky.sequelize.sequelizeStrings.where
    ]
  ): typingsSlinky.bluebird.mod.^[TInstance | Null] = js.native
  @JSName("findById")
  def findById_where[TCustomAttributes](
    identifier: Buffer,
    options: Omit[
      FindOptions[TAttributes with TCustomAttributes], 
      typingsSlinky.sequelize.sequelizeStrings.where
    ]
  ): typingsSlinky.bluebird.mod.^[TInstance | Null] = js.native
  
  def findByPk[TCustomAttributes](): typingsSlinky.bluebird.mod.^[TInstance | Null] = js.native
  def findByPk[TCustomAttributes](identifier: String): typingsSlinky.bluebird.mod.^[TInstance | Null] = js.native
  def findByPk[TCustomAttributes](identifier: Double): typingsSlinky.bluebird.mod.^[TInstance | Null] = js.native
  def findByPk[TCustomAttributes](identifier: Buffer): typingsSlinky.bluebird.mod.^[TInstance | Null] = js.native
  @JSName("findByPk")
  def findByPk_where[TCustomAttributes](
    identifier: js.UndefOr[scala.Nothing],
    options: Omit[
      FindOptions[TAttributes with TCustomAttributes], 
      typingsSlinky.sequelize.sequelizeStrings.where
    ]
  ): typingsSlinky.bluebird.mod.^[TInstance | Null] = js.native
  @JSName("findByPk")
  def findByPk_where[TCustomAttributes](
    identifier: String,
    options: Omit[
      FindOptions[TAttributes with TCustomAttributes], 
      typingsSlinky.sequelize.sequelizeStrings.where
    ]
  ): typingsSlinky.bluebird.mod.^[TInstance | Null] = js.native
  @JSName("findByPk")
  def findByPk_where[TCustomAttributes](
    identifier: Double,
    options: Omit[
      FindOptions[TAttributes with TCustomAttributes], 
      typingsSlinky.sequelize.sequelizeStrings.where
    ]
  ): typingsSlinky.bluebird.mod.^[TInstance | Null] = js.native
  @JSName("findByPk")
  def findByPk_where[TCustomAttributes](
    identifier: Buffer,
    options: Omit[
      FindOptions[TAttributes with TCustomAttributes], 
      typingsSlinky.sequelize.sequelizeStrings.where
    ]
  ): typingsSlinky.bluebird.mod.^[TInstance | Null] = js.native
  
  def findByPrimary[TCustomAttributes](): typingsSlinky.bluebird.mod.^[TInstance | Null] = js.native
  def findByPrimary[TCustomAttributes](identifier: String): typingsSlinky.bluebird.mod.^[TInstance | Null] = js.native
  def findByPrimary[TCustomAttributes](identifier: Double): typingsSlinky.bluebird.mod.^[TInstance | Null] = js.native
  def findByPrimary[TCustomAttributes](identifier: Buffer): typingsSlinky.bluebird.mod.^[TInstance | Null] = js.native
  @JSName("findByPrimary")
  def findByPrimary_where[TCustomAttributes](
    identifier: js.UndefOr[scala.Nothing],
    options: Omit[
      FindOptions[TAttributes with TCustomAttributes], 
      typingsSlinky.sequelize.sequelizeStrings.where
    ]
  ): typingsSlinky.bluebird.mod.^[TInstance | Null] = js.native
  @JSName("findByPrimary")
  def findByPrimary_where[TCustomAttributes](
    identifier: String,
    options: Omit[
      FindOptions[TAttributes with TCustomAttributes], 
      typingsSlinky.sequelize.sequelizeStrings.where
    ]
  ): typingsSlinky.bluebird.mod.^[TInstance | Null] = js.native
  @JSName("findByPrimary")
  def findByPrimary_where[TCustomAttributes](
    identifier: Double,
    options: Omit[
      FindOptions[TAttributes with TCustomAttributes], 
      typingsSlinky.sequelize.sequelizeStrings.where
    ]
  ): typingsSlinky.bluebird.mod.^[TInstance | Null] = js.native
  @JSName("findByPrimary")
  def findByPrimary_where[TCustomAttributes](
    identifier: Buffer,
    options: Omit[
      FindOptions[TAttributes with TCustomAttributes], 
      typingsSlinky.sequelize.sequelizeStrings.where
    ]
  ): typingsSlinky.bluebird.mod.^[TInstance | Null] = js.native
  
  /**
    * A more performant findOrCreate that will not work under a transaction (at least not in postgres)
    * Will execute a find call, if empty then attempt to create, if unique constraint then attempt to find again
    */
  def findCreateFind[TCustomAttributes](options: FindCreateFindOptions[TAttributes with TCustomAttributes]): typingsSlinky.bluebird.mod.^[js.Tuple2[TInstance, Boolean]] = js.native
  
  /**
    * Search for a single instance. This applies LIMIT 1, so the listener will always be called with a single
    * instance.
    */
  def findOne[TCustomAttributes](): typingsSlinky.bluebird.mod.^[TInstance | Null] = js.native
  def findOne[TCustomAttributes](options: FindOptions[TAttributes with TCustomAttributes]): typingsSlinky.bluebird.mod.^[TInstance | Null] = js.native
  
  def findOrBuild(options: FindOrInitializeOptions[TAttributes]): typingsSlinky.bluebird.mod.^[js.Tuple2[TInstance, Boolean]] = js.native
  
  /**
    * Find a row that matches the query, or build and save the row if none is found
    * The successful result of the promise will be (instance, created) - Make sure to use .spread()
    *
    * If no transaction is passed in the `options` object, a new transaction will be created internally, to
    * prevent the race condition where a matching row is created by another connection after the find but
    * before the insert call. However, it is not always possible to handle this case in SQLite, specifically
    * if one transaction inserts and another tries to select before the first one has comitted. In this case,
    * an instance of sequelize.TimeoutError will be thrown instead. If a transaction is created, a savepoint
    * will be created instead, and any unique constraint violation will be handled internally.
    */
  def findOrCreate(options: FindOrInitializeOptions[TAttributes]): typingsSlinky.bluebird.mod.^[js.Tuple2[TInstance, Boolean]] = js.native
  
  /**
    * Find a row that matches the query, or build (but don't save) the row if none is found.
    * The successfull result of the promise will be (instance, initialized) - Make sure to use .spread()
    */
  def findOrInitialize(options: FindOrInitializeOptions[TAttributes]): typingsSlinky.bluebird.mod.^[js.Tuple2[TInstance, Boolean]] = js.native
  
  /**
    * Get the tablename of the model, taking schema into account. The method will return The name as a string
    * if the model has no schema, or an object with `tableName`, `schema` and `delimiter` properties.
    *
    * @param options The hash of options from any query. You can use one model to access tables with matching
    *     schemas by overriding `getTableName` and using custom key/values to alter the name of the table.
    *     (eg.
    *     subscribers_1, subscribers_2)
    * @param options.logging=false A function that gets executed while running the query to log the sql.
    */
  def getTableName(): String | js.Object = js.native
  def getTableName(options: GetTableNameOptions): String | js.Object = js.native
  
  def insertOrUpdate(values: TAttributes): typingsSlinky.bluebird.mod.^[Boolean] = js.native
  def insertOrUpdate(values: TAttributes, options: UpsertOptionsreturningfal): typingsSlinky.bluebird.mod.^[Boolean] = js.native
  def insertOrUpdate(values: TAttributes, options: UpsertOptionsreturningtru): typingsSlinky.bluebird.mod.^[js.Tuple2[TInstance, Boolean]] = js.native
  
  /**
    * Find the maximum value of field
    */
  def max(field: String): typingsSlinky.bluebird.mod.^[_] = js.native
  def max(field: String, options: AggregateOptions): typingsSlinky.bluebird.mod.^[_] = js.native
  
  /**
    * Find the minimum value of field
    */
  def min(field: String): typingsSlinky.bluebird.mod.^[_] = js.native
  def min(field: String, options: AggregateOptions): typingsSlinky.bluebird.mod.^[_] = js.native
  
  /**
    * The singular name of the model
    */
  var name: String = js.native
  
  /**
    * Remove attribute from model definition
    *
    * @param attribute
    */
  def removeAttribute(attribute: String): Unit = js.native
  
  /**
    * Restore multiple instances if `paranoid` is enabled.
    */
  def restore(): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def restore(options: RestoreOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * Apply a schema to this model. For postgres, this will actually place the schema in front of the table
    * name
    * - `"schema"."tableName"`, while the schema will be prepended to the table name for mysql and
    * sqlite - `'schema.tablename'`.
    *
    * @param schema The name of the schema
    * @param options
    */
  def schema(schema: String): this.type = js.native
  def schema(schema: String, options: SchemaOptions): this.type = js.native
  
  /**
    * Apply a scope created in `define` to the model. First let's look at how to create scopes:
    * ```js
    * var Model = sequelize.define('model', attributes, {
    *   defaultScope: {
    *     where: {
    *       username: 'dan'
    *     },
    *     limit: 12
    *   },
    *   scopes: {
    *     isALie: {
    *       where: {
    *         stuff: 'cake'
    *       }
    *     },
    *     complexFunction: function(email, accessLevel) {
    *       return {
    *         where: {
    *           email: {
    *             $like: email
    *           },
    *           accesss_level {
    *             $gte: accessLevel
    *           }
    *         }
    *       }
    *     }
    *   }
    * })
    * ```
    * Now, since you defined a default scope, every time you do Model.find, the default scope is appended to
    * your query. Here's a couple of examples:
    * ```js
    * Model.findAll() // WHERE username = 'dan'
    * Model.findAll({ where: { age: { gt: 12 } } }) // WHERE age > 12 AND username = 'dan'
    * ```
    *
    * To invoke scope functions you can do:
    * ```js
    * Model.scope({ method: ['complexFunction' 'dan@sequelize.com', 42]}).findAll()
    * // WHERE email like 'dan@sequelize.com%' AND access_level >= 42
    * ```
    *
    * @return Model A reference to the model, with the scope(s) applied. Calling scope again on the returned
    *     model will clear the previous scope.
    */
  def scope(): this.type = js.native
  def scope(options: String): this.type = js.native
  def scope(options: js.Array[String | ScopeOptions | AnyWhereOptions]): this.type = js.native
  def scope(options: AnyWhereOptions): this.type = js.native
  def scope(options: ScopeOptions): this.type = js.native
  
  /**
    * Find the sum of field
    */
  def sum(field: String): typingsSlinky.bluebird.mod.^[Double] = js.native
  def sum(field: String, options: AggregateOptions): typingsSlinky.bluebird.mod.^[Double] = js.native
  
  /**
    * Sync this Model to the DB, that is create the table. Upon success, the callback will be called with the
    * model instance (this)
    */
  def sync(): typingsSlinky.bluebird.mod.^[this.type] = js.native
  def sync(options: SyncOptions): typingsSlinky.bluebird.mod.^[this.type] = js.native
  
  /**
    * Truncate all instances of the model. This is a convenient method for Model.destroy({ truncate: true }).
    */
  def truncate(): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def truncate(options: TruncateOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * Unscope the model
    */
  def unscoped(): this.type = js.native
  
  /**
    * Update multiple instances that match the where options. The promise returns an array with one or two
    * elements. The first element is always the number of affected rows, while the second element is the actual
    * affected rows (only supported in postgres with `options.returning` true.)
    */
  def update(values: Partial[TAttributes]): typingsSlinky.bluebird.mod.^[js.Tuple2[Double, js.Array[TInstance]]] = js.native
  def update(values: Partial[TAttributes], options: UpdateOptions): typingsSlinky.bluebird.mod.^[js.Tuple2[Double, js.Array[TInstance]]] = js.native
  
  /**
    * Insert or update a single row. An update will be executed if a row which matches the supplied values on
    * either the primary key or a unique key is found. Note that the unique index must be defined in your
    * sequelize model and not just in the table. Otherwise you may experience a unique constraint violation,
    * because sequelize fails to identify the row that should be updated.
    *
    * **Implementation details:**
    *
    * * MySQL - Implemented as a single query `INSERT values ON DUPLICATE KEY UPDATE values`
    * * PostgreSQL - Implemented as a temporary function with exception handling: INSERT EXCEPTION WHEN
    *   unique_constraint UPDATE
    * * SQLite - Implemented as two queries `INSERT; UPDATE`. This means that the update is executed
    * regardless
    *   of whether the row already existed or not
    *
    * **Note** that SQLite returns undefined for created, no matter if the row was created or updated. This is
    * because SQLite always runs INSERT OR IGNORE + UPDATE, in a single query, so there is no way to know
    * whether the row was inserted or not.
    */
  def upsert(values: TAttributes): typingsSlinky.bluebird.mod.^[Boolean] = js.native
  def upsert(values: TAttributes, options: UpsertOptionsreturningfal): typingsSlinky.bluebird.mod.^[Boolean] = js.native
  def upsert(values: TAttributes, options: UpsertOptionsreturningtru): typingsSlinky.bluebird.mod.^[js.Tuple2[TInstance, Boolean]] = js.native
}
