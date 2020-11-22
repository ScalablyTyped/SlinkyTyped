package typingsSlinky.sequelize.mod

import typingsSlinky.sequelize.anon.DefineIndexOptionsfieldsA
import typingsSlinky.sequelize.anon.Logging
import typingsSlinky.sequelize.anon.Schema
import typingsSlinky.sequelize.anon.SchemaTableName
import typingsSlinky.sequelize.anon.TableName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface that Sequelize uses to talk to all databases.
  *
  * This interface is available through sequelize.QueryInterface. It should not be commonly used, but it's
  * referenced anyway, so it can be used.
  */
@js.native
trait QueryInterface extends js.Object {
  
  /**
    * Returns the dialect-specific sql generator.
    *
    * We don't have a definition for the QueryGenerator, because I doubt it is commonly in use separately.
    */
  var QueryGenerator: js.Any = js.native
  
  def addColumn(tableName: String, key: String, attribute: DataTypeAbstract): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def addColumn(tableName: String, key: String, attribute: DataTypeAbstract, options: QueryInterfaceOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  /**
    * Adds a new column to a table
    */
  def addColumn(tableName: String, key: String, attribute: DefineAttributeColumnOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def addColumn(
    tableName: String,
    key: String,
    attribute: DefineAttributeColumnOptions,
    options: QueryInterfaceOptions
  ): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def addColumn(tableName: TableName, key: String, attribute: DataTypeAbstract): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def addColumn(tableName: TableName, key: String, attribute: DataTypeAbstract, options: QueryInterfaceOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def addColumn(tableName: TableName, key: String, attribute: DefineAttributeColumnOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def addColumn(
    tableName: TableName,
    key: String,
    attribute: DefineAttributeColumnOptions,
    options: QueryInterfaceOptions
  ): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * Adds constraints to a table
    */
  def addConstraint(tableName: String, attributes: js.Array[String]): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def addConstraint(tableName: String, attributes: js.Array[String], options: AddConstraintOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def addConstraint(tableName: String, attributes: js.Array[String], options: QueryInterfaceOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  def addIndex(tableName: String, attributes: js.Array[String]): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def addIndex(
    tableName: String,
    attributes: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    rawTablename: String
  ): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def addIndex(tableName: String, attributes: js.Array[String], options: DefineIndexOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def addIndex(tableName: String, attributes: js.Array[String], options: DefineIndexOptions, rawTablename: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  /**
    * Adds a new index to a table
    */
  def addIndex(tableName: String, options: DefineIndexOptionsfieldsA): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def addIndex(tableName: String, options: DefineIndexOptionsfieldsA, rawTablename: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def addIndex(tableName: js.Object, attributes: js.Array[String]): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def addIndex(
    tableName: js.Object,
    attributes: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    rawTablename: String
  ): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def addIndex(tableName: js.Object, attributes: js.Array[String], options: DefineIndexOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def addIndex(
    tableName: js.Object,
    attributes: js.Array[String],
    options: DefineIndexOptions,
    rawTablename: String
  ): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def addIndex(tableName: js.Object, options: DefineIndexOptionsfieldsA): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def addIndex(tableName: js.Object, options: DefineIndexOptionsfieldsA, rawTablename: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * Deletes multiple rows at once
    */
  def bulkDelete(tableName: String, identifier: js.Object): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def bulkDelete(
    tableName: String,
    identifier: js.Object,
    options: js.UndefOr[scala.Nothing],
    model: Model[_, _, _]
  ): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def bulkDelete(tableName: String, identifier: js.Object, options: QueryOptions): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def bulkDelete(tableName: String, identifier: js.Object, options: QueryOptions, model: Model[_, _, _]): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  
  /**
    * Inserts multiple records at once
    */
  def bulkInsert(tableName: String, records: js.Array[js.Object]): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def bulkInsert(
    tableName: String,
    records: js.Array[js.Object],
    options: js.UndefOr[scala.Nothing],
    attributes: String
  ): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def bulkInsert(
    tableName: String,
    records: js.Array[js.Object],
    options: js.UndefOr[scala.Nothing],
    attributes: js.Array[String]
  ): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def bulkInsert(tableName: String, records: js.Array[js.Object], options: QueryOptions): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def bulkInsert(tableName: String, records: js.Array[js.Object], options: QueryOptions, attributes: String): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def bulkInsert(
    tableName: String,
    records: js.Array[js.Object],
    options: QueryOptions,
    attributes: js.Array[String]
  ): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def bulkInsert(tableName: SchemaTableName, records: js.Array[js.Object]): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def bulkInsert(
    tableName: SchemaTableName,
    records: js.Array[js.Object],
    options: js.UndefOr[scala.Nothing],
    attributes: String
  ): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def bulkInsert(
    tableName: SchemaTableName,
    records: js.Array[js.Object],
    options: js.UndefOr[scala.Nothing],
    attributes: js.Array[String]
  ): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def bulkInsert(tableName: SchemaTableName, records: js.Array[js.Object], options: QueryOptions): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def bulkInsert(
    tableName: SchemaTableName,
    records: js.Array[js.Object],
    options: QueryOptions,
    attributes: String
  ): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def bulkInsert(
    tableName: SchemaTableName,
    records: js.Array[js.Object],
    options: QueryOptions,
    attributes: js.Array[String]
  ): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  
  /**
    * Updates multiple rows at once
    */
  def bulkUpdate(tableName: String, values: js.Object, identifier: js.Object): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def bulkUpdate(
    tableName: String,
    values: js.Object,
    identifier: js.Object,
    options: js.UndefOr[scala.Nothing],
    attributes: String
  ): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def bulkUpdate(
    tableName: String,
    values: js.Object,
    identifier: js.Object,
    options: js.UndefOr[scala.Nothing],
    attributes: js.Array[String]
  ): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def bulkUpdate(tableName: String, values: js.Object, identifier: js.Object, options: QueryOptions): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def bulkUpdate(
    tableName: String,
    values: js.Object,
    identifier: js.Object,
    options: QueryOptions,
    attributes: String
  ): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def bulkUpdate(
    tableName: String,
    values: js.Object,
    identifier: js.Object,
    options: QueryOptions,
    attributes: js.Array[String]
  ): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  
  /**
    * Changes a column
    */
  def changeColumn(tableName: String, attributeName: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def changeColumn(
    tableName: String,
    attributeName: String,
    dataTypeOrOptions: js.UndefOr[scala.Nothing],
    options: QueryInterfaceOptions
  ): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def changeColumn(tableName: String, attributeName: String, dataTypeOrOptions: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def changeColumn(
    tableName: String,
    attributeName: String,
    dataTypeOrOptions: String,
    options: QueryInterfaceOptions
  ): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def changeColumn(tableName: String, attributeName: String, dataTypeOrOptions: DataTypeAbstract): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def changeColumn(
    tableName: String,
    attributeName: String,
    dataTypeOrOptions: DataTypeAbstract,
    options: QueryInterfaceOptions
  ): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def changeColumn(tableName: String, attributeName: String, dataTypeOrOptions: DefineAttributeColumnOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def changeColumn(
    tableName: String,
    attributeName: String,
    dataTypeOrOptions: DefineAttributeColumnOptions,
    options: QueryInterfaceOptions
  ): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def changeColumn(tableName: Schema, attributeName: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def changeColumn(
    tableName: Schema,
    attributeName: String,
    dataTypeOrOptions: js.UndefOr[scala.Nothing],
    options: QueryInterfaceOptions
  ): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def changeColumn(tableName: Schema, attributeName: String, dataTypeOrOptions: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def changeColumn(
    tableName: Schema,
    attributeName: String,
    dataTypeOrOptions: String,
    options: QueryInterfaceOptions
  ): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def changeColumn(tableName: Schema, attributeName: String, dataTypeOrOptions: DataTypeAbstract): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def changeColumn(
    tableName: Schema,
    attributeName: String,
    dataTypeOrOptions: DataTypeAbstract,
    options: QueryInterfaceOptions
  ): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def changeColumn(tableName: Schema, attributeName: String, dataTypeOrOptions: DefineAttributeColumnOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def changeColumn(
    tableName: Schema,
    attributeName: String,
    dataTypeOrOptions: DefineAttributeColumnOptions,
    options: QueryInterfaceOptions
  ): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * Commit an already started transaction
    */
  def commitTransaction(transaction: Transaction): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def commitTransaction(transaction: Transaction, options: QueryOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * Postgres only. Create a function
    */
  def createFunction(functionName: String, params: js.Array[_], returnType: String, language: String, body: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def createFunction(
    functionName: String,
    params: js.Array[_],
    returnType: String,
    language: String,
    body: String,
    options: QueryOptions
  ): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * Queries the schema (table list).
    *
    * @param schema The schema to query. Applies only to Postgres.
    */
  def createSchema(): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def createSchema(schema: js.UndefOr[scala.Nothing], options: QueryInterfaceOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def createSchema(schema: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def createSchema(schema: String, options: QueryInterfaceOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * Creates a table with specified attributes.
    *
    * @param tableName     Name of table to create
    * @param attributes    Hash of attributes, key is attribute name, value is data type
    * @param options       Query options.
    */
  def createTable(tableName: String, attributes: DefineAttributes): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def createTable(tableName: String, attributes: DefineAttributes, options: QueryOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def createTable(tableName: Schema, attributes: DefineAttributes): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def createTable(tableName: Schema, attributes: DefineAttributes, options: QueryOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * Postgres only. Creates a trigger on specified table to call the specified function with supplied
    * parameters.
    */
  def createTrigger(
    tableName: String,
    triggerName: String,
    timingType: String,
    fireOnArray: js.Array[_],
    functionName: String,
    functionParams: js.Array[_],
    optionsArray: js.Array[String]
  ): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def createTrigger(
    tableName: String,
    triggerName: String,
    timingType: String,
    fireOnArray: js.Array[_],
    functionName: String,
    functionParams: js.Array[_],
    optionsArray: js.Array[String],
    options: QueryInterfaceOptions
  ): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * Return database version
    */
  def databaseVersion(): typingsSlinky.bluebird.mod.^[String] = js.native
  def databaseVersion(options: QueryInterfaceOptions): typingsSlinky.bluebird.mod.^[String] = js.native
  
  /**
    * Defer constraints
    */
  def deferConstraints(transaction: Transaction): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def deferConstraints(transaction: Transaction, options: QueryOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * Deletes a row
    */
  def delete(instance: Instance[_], tableName: String, identifier: js.Object): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def delete(instance: Instance[_], tableName: String, identifier: js.Object, options: QueryOptions): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  
  /**
    * Describe a table
    */
  def describeTable(tableName: String): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def describeTable(tableName: String, options: String): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def describeTable(tableName: String, options: Logging): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def describeTable(tableName: Schema): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def describeTable(tableName: Schema, options: String): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def describeTable(tableName: Schema, options: Logging): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  
  /**
    * Drops all defined enums
    *
    * @param options
    */
  def dropAllEnums(): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def dropAllEnums(options: QueryOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * Drops all tables.
    */
  def dropAllSchemas(): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def dropAllSchemas(options: QueryInterfaceOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * Drops all tables.
    *
    * @param options
    */
  def dropAllTables(): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def dropAllTables(options: QueryOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * Postgres only. Drops a function
    */
  def dropFunction(functionName: String, params: js.Array[_]): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def dropFunction(functionName: String, params: js.Array[_], options: QueryInterfaceOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * Drops the specified schema (table).
    *
    * @param schema The schema to query. Applies only to Postgres.
    */
  def dropSchema(): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def dropSchema(schema: js.UndefOr[scala.Nothing], options: QueryInterfaceOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def dropSchema(schema: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def dropSchema(schema: String, options: QueryInterfaceOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * Drops the specified table.
    *
    * @param tableName Table name.
    * @param options   Query options, particularly "force".
    */
  def dropTable(tableName: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def dropTable(tableName: String, options: QueryOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * Postgres only. Drops the specified trigger.
    */
  def dropTrigger(tableName: String, triggerName: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def dropTrigger(tableName: String, triggerName: String, options: QueryInterfaceOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * Escape a value (e.g. a string, number or date)
    */
  def escape(): String = js.native
  def escape(value: String): String = js.native
  def escape(value: Double): String = js.native
  def escape(value: js.Date): String = js.native
  
  /**
    * Returns all foreign key constraints of each table in list
    */
  def getForeignKeysForTables(tableNames: js.Array[String]): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def getForeignKeysForTables(tableNames: js.Array[String], options: QueryInterfaceOptions): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  
  /**
    * Increments a row value
    */
  def increment(instance: Instance[_], tableName: String, values: js.Object, identifier: js.Object): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def increment(
    instance: Instance[_],
    tableName: String,
    values: js.Object,
    identifier: js.Object,
    options: QueryOptions
  ): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  
  /**
    * Inserts a new record
    */
  def insert(instance: Instance[_], tableName: String, values: js.Object): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def insert(instance: Instance[_], tableName: String, values: js.Object, options: QueryOptions): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  
  /**
    * Put a name to an index
    */
  def nameIndexes(indexes: js.Array[String], rawTablename: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * Escape an identifier (e.g. a table or attribute name). If force is true, the identifier will be quoted
    * even if the `quoteIdentifiers` option is false.
    */
  def quoteIdentifier(identifier: String, force: Boolean): String = js.native
  
  /**
    * Split an identifier into .-separated tokens and quote each part. If force is true, the identifier will be
    * quoted even if the `quoteIdentifiers` option is false.
    */
  def quoteIdentifiers(identifiers: String, force: Boolean): String = js.native
  
  /**
    * Escape a table name
    */
  def quoteTable(identifier: String): String = js.native
  
  /**
    * Selects raw without parsing the string into an object
    */
  def rawSelect(tableName: String, options: QueryOptions, attributeSelector: String): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
  def rawSelect(tableName: String, options: QueryOptions, attributeSelector: String, model: Model[_, _, _]): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
  def rawSelect(tableName: String, options: QueryOptions, attributeSelector: js.Array[String]): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
  def rawSelect(
    tableName: String,
    options: QueryOptions,
    attributeSelector: js.Array[String],
    model: Model[_, _, _]
  ): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
  
  /**
    * Removes a column from a table
    */
  def removeColumn(tableName: String, attribute: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def removeColumn(tableName: String, attribute: String, options: QueryInterfaceOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def removeColumn(tableName: TableName, attribute: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def removeColumn(tableName: TableName, attribute: String, options: QueryInterfaceOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * Removes constraints from a table
    */
  def removeConstraint(tableName: String, constraintName: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def removeConstraint(tableName: String, constraintName: String, options: QueryInterfaceOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  def removeIndex(tableName: String, indexNameOrAttributes: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def removeIndex(tableName: String, indexNameOrAttributes: String, options: QueryInterfaceOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  /**
    * Removes an index of a table
    */
  def removeIndex(tableName: String, indexNameOrAttributes: js.Array[String]): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def removeIndex(tableName: String, indexNameOrAttributes: js.Array[String], options: QueryInterfaceOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * Renames a column
    */
  def renameColumn(tableName: String, attrNameBefore: String, attrNameAfter: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def renameColumn(tableName: String, attrNameBefore: String, attrNameAfter: String, options: QueryInterfaceOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def renameColumn(tableName: Schema, attrNameBefore: String, attrNameAfter: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def renameColumn(tableName: Schema, attrNameBefore: String, attrNameAfter: String, options: QueryInterfaceOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * Postgres only. Rename a function
    */
  def renameFunction(oldFunctionName: String, params: js.Array[_], newFunctionName: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def renameFunction(
    oldFunctionName: String,
    params: js.Array[_],
    newFunctionName: String,
    options: QueryInterfaceOptions
  ): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * Renames a table
    */
  def renameTable(before: String, after: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def renameTable(before: String, after: String, options: QueryInterfaceOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * Postgres only. Renames a trigger
    */
  def renameTrigger(tableName: String, oldTriggerName: String, newTriggerName: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def renameTrigger(tableName: String, oldTriggerName: String, newTriggerName: String, options: QueryInterfaceOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * Rollback ( revert ) a transaction that has'nt been commited
    */
  def rollbackTransaction(transaction: Transaction): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def rollbackTransaction(transaction: Transaction, options: QueryOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * Returns selected rows
    */
  def select(model: Model[_, _, _], tableName: String): typingsSlinky.bluebird.mod.^[js.Array[js.Object]] = js.native
  def select(model: Model[_, _, _], tableName: String, options: QueryOptions): typingsSlinky.bluebird.mod.^[js.Array[js.Object]] = js.native
  
  /**
    * Returns the current sequelize instance.
    */
  var sequelize: Sequelize = js.native
  
  /**
    * Set option for autocommit of a transaction
    */
  def setAutocommit(transaction: Transaction, value: Boolean): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def setAutocommit(transaction: Transaction, value: Boolean, options: QueryOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * Set the isolation level of a transaction
    */
  def setIsolationLevel(transaction: Transaction, value: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def setIsolationLevel(transaction: Transaction, value: String, options: QueryOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * Queries all table names in the database.
    *
    * @param options
    */
  def showAllSchemas(): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def showAllSchemas(options: QueryOptions): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  
  /**
    * Returns all tables
    */
  def showAllTables(): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
  def showAllTables(options: QueryOptions): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
  
  /**
    * Shows the index of a table
    */
  def showIndex(tableName: String): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def showIndex(tableName: String, options: QueryOptions): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def showIndex(tableName: js.Object): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def showIndex(tableName: js.Object, options: QueryOptions): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  
  /**
    * Begin a new transaction
    */
  def startTransaction(transaction: Transaction): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def startTransaction(transaction: Transaction, options: QueryOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * Updates a row
    */
  def update(instance: Instance[_], tableName: String, values: js.Object, identifier: js.Object): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def update(
    instance: Instance[_],
    tableName: String,
    values: js.Object,
    identifier: js.Object,
    options: QueryOptions
  ): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  
  /**
    * Inserts or Updates a record in the database
    */
  def upsert(tableName: String, values: js.Object, updateValues: js.Object, model: Model[_, _, _]): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def upsert(
    tableName: String,
    values: js.Object,
    updateValues: js.Object,
    model: Model[_, _, _],
    options: QueryOptions
  ): typingsSlinky.bluebird.mod.^[js.Object] = js.native
}
