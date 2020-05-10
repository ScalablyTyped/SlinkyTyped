package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for model definition
  *
  * @see Sequelize.define
  */
@js.native
trait DefineOptions[TInstance] extends js.Object {
  var charset: js.UndefOr[String] = js.native
  /**
    * Provide functions that are added to the model (Model). If you override methods provided by sequelize,
    * you can access the original method using `this.constructor.prototype`, e.g.
    * `this.constructor.prototype.find.apply(this, arguments)`
    */
  var classMethods: js.UndefOr[js.Object] = js.native
  var collate: js.UndefOr[String] = js.native
  /**
    * Finaly you can specify a comment for the table in MySQL and PG
    */
  var comment: js.UndefOr[String] = js.native
  /**
    * Override the name of the createdAt column if a string is provided, or disable it if false. Timestamps
    * must be true. Not affected by underscored setting.
    */
  var createdAt: js.UndefOr[String | Boolean] = js.native
  /**
    * Define the default search scope to use for this model. Scopes have the same form as the options passed to
    * find / findAll.
    */
  var defaultScope: js.UndefOr[AnyFindOptions] = js.native
  /**
    * Override the name of the deletedAt column if a string is provided, or disable it if false. Timestamps
    * must be true. Not affected by underscored setting.
    */
  var deletedAt: js.UndefOr[String | Boolean] = js.native
  /**
    * You can also change the database engine, e.g. to MyISAM. InnoDB is the default.
    */
  var engine: js.UndefOr[String] = js.native
  /**
    * If freezeTableName is true, sequelize will not try to alter the DAO name to get the table name.
    * Otherwise, the dao name will be pluralized. Default false.
    */
  var freezeTableName: js.UndefOr[Boolean] = js.native
  /**
    * Provide getter functions that work like those defined per column. If you provide a getter method with
    * the
    * same name as a column, it will be used to access the value of that column. If you provide a name that
    * does not match a column, this function will act as a virtual getter, that can fetch multiple other
    * values
    */
  var getterMethods: js.UndefOr[DefineGetterMethodsOptions] = js.native
  /**
    * Indicates if the model's table has a trigger associated with it. Default false.
    */
  var hasTrigger: js.UndefOr[Boolean] = js.native
  /**
    * An object of hook function that are called before and after certain lifecycle events.
    * The possible hooks are: beforeValidate, afterValidate, beforeBulkCreate, beforeBulkDestroy,
    * beforeBulkUpdate, beforeCreate, beforeDestroy, beforeSave, beforeUpdate, afterCreate, afterDestroy,
    * afterSave, afterUpdate, afterBulkCreate, afterBulkDestory and afterBulkUpdate.
    * See Hooks for more information about hook functions and their signatures. Each property can either
    * be a function, or an array of functions.
    */
  var hooks: js.UndefOr[HooksDefineOptions[TInstance]] = js.native
  /**
    * Indexes for the provided database table
    */
  var indexes: js.UndefOr[js.Array[DefineIndexesOptions]] = js.native
  /**
    * Set the initial AUTO_INCREMENT value for the table in MySQL.
    */
  var initialAutoIncrement: js.UndefOr[String] = js.native
  /**
    * Provide functions that are added to each instance (DAO). If you override methods provided by sequelize,
    * you can access the original method using `this.constructor.super_.prototype`, e.g.
    * `this.constructor.super_.prototype.toJSON.apply(this, arguments)`
    */
  var instanceMethods: js.UndefOr[js.Object] = js.native
  /**
    * An object with two attributes, `singular` and `plural`, which are used when this model is associated to
    * others.
    */
  var name: js.UndefOr[DefineNameOptions] = js.native
  /**
    * Don't persits null values. This means that all columns with null values will not be saved.
    */
  var omitNull: js.UndefOr[Boolean] = js.native
  /**
    * Calling destroy will not delete the model, but instead set a deletedAt timestamp if this is true. Needs
    * timestamps=true to work. Default false.
    */
  var paranoid: js.UndefOr[Boolean] = js.native
  /**
    * Throws an error when no records found
    */
  var rejectOnError: js.UndefOr[Boolean | js.Error] = js.native
  /**
    * Specify the ROW_FORMAT for use with the MySQL InnoDB engine.
    */
  var rowFormat: js.UndefOr[String] = js.native
  /**
    * Change the database schema. PG only feature, but also works with other dialects.
    */
  var schema: js.UndefOr[String] = js.native
  /**
    * Change the database schema delimiter. Defaults to "." on PG but for other dialects can be also changed to "_".
    */
  var schemaDelimiter: js.UndefOr[String] = js.native
  /**
    * More scopes, defined in the same way as defaultScope above. See `Model.scope` for more information about
    * how scopes are defined, and what you can do with them
    */
  var scopes: js.UndefOr[DefineScopeOptions] = js.native
  /**
    * Provide setter functions that work like those defined per column. If you provide a setter method with
    * the
    * same name as a column, it will be used to update the value of that column. If you provide a name that
    * does not match a column, this function will act as a virtual setter, that can act on and set other
    * values, but will not be persisted
    */
  var setterMethods: js.UndefOr[DefineSetterMethodsOptions] = js.native
  /**
    * Defaults to pluralized model name, unless freezeTableName is true, in which case it uses model name
    * verbatim
    */
  var tableName: js.UndefOr[String] = js.native
  /**
    * Adds createdAt and updatedAt timestamps to the model. Default true.
    */
  var timestamps: js.UndefOr[Boolean] = js.native
  /**
    * Converts all camelCased columns to underscored if true. Default false.
    */
  var underscored: js.UndefOr[Boolean] = js.native
  /**
    * Converts camelCased model names to underscored tablenames if true. Default false.
    */
  var underscoredAll: js.UndefOr[Boolean] = js.native
  /**
    * Override the name of the updatedAt column if a string is provided, or disable it if false. Timestamps
    * must be true. Not affected by underscored setting.
    */
  var updatedAt: js.UndefOr[String | Boolean] = js.native
  /**
    * An object of model wide validations. Validations have access to all model values via `this`. If the
    * validator function takes an argument, it is asumed to be async, and is called with a callback that
    * accepts an optional error.
    */
  var validate: js.UndefOr[DefineValidateOptions] = js.native
  /**
    * Enable optimistic locking.  When enabled, sequelize will add a version count attribute
    * to the model and throw an OptimisticLockingError error when stale instances are saved.
    * Set to true or a string with the attribute name you want to use to enable.
    */
  var version: js.UndefOr[Boolean | String] = js.native
}

object DefineOptions {
  @scala.inline
  def apply[TInstance](): DefineOptions[TInstance] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefineOptions[TInstance]]
  }
  @scala.inline
  implicit class DefineOptionsOps[Self[tinstance] <: DefineOptions[tinstance], TInstance] (val x: Self[TInstance]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TInstance] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TInstance]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TInstance] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TInstance] with Other]
    @scala.inline
    def withCharset(value: String): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharset: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charset")(js.undefined)
        ret
    }
    @scala.inline
    def withClassMethods(value: js.Object): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassMethods: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classMethods")(js.undefined)
        ret
    }
    @scala.inline
    def withCollate(value: String): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollate: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collate")(js.undefined)
        ret
    }
    @scala.inline
    def withComment(value: String): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: String | Boolean): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultScope(value: AnyFindOptions): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultScope: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultScope")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletedAt(value: String | Boolean): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletedAt: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withEngine(value: String): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngine: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(js.undefined)
        ret
    }
    @scala.inline
    def withFreezeTableName(value: Boolean): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freezeTableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreezeTableName: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freezeTableName")(js.undefined)
        ret
    }
    @scala.inline
    def withGetterMethods(value: DefineGetterMethodsOptions): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getterMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetterMethods: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getterMethods")(js.undefined)
        ret
    }
    @scala.inline
    def withHasTrigger(value: Boolean): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTrigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasTrigger: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTrigger")(js.undefined)
        ret
    }
    @scala.inline
    def withHooks(value: HooksDefineOptions[TInstance]): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHooks: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexes(value: js.Array[DefineIndexesOptions]): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexes: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexes")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialAutoIncrement(value: String): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialAutoIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialAutoIncrement: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialAutoIncrement")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceMethods(value: js.Object): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceMethods: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceMethods")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: DefineNameOptions): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOmitNull(value: Boolean): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitNull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOmitNull: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitNull")(js.undefined)
        ret
    }
    @scala.inline
    def withParanoid(value: Boolean): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paranoid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParanoid: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paranoid")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectOnErrorError(value: js.Error): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRejectOnError(value: Boolean | js.Error): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectOnError: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectOnError")(js.undefined)
        ret
    }
    @scala.inline
    def withRowFormat(value: String): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowFormat: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: String): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaDelimiter(value: String): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaDelimiter: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaDelimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withScopes(value: DefineScopeOptions): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopes: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(js.undefined)
        ret
    }
    @scala.inline
    def withSetterMethods(value: DefineSetterMethodsOptions): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setterMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetterMethods: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setterMethods")(js.undefined)
        ret
    }
    @scala.inline
    def withTableName(value: String): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableName: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableName")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamps(value: Boolean): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamps: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamps")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderscored(value: Boolean): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underscored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderscored: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underscored")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderscoredAll(value: Boolean): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underscoredAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderscoredAll: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underscoredAll")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedAt(value: String | Boolean): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedAt: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate(value: DefineValidateOptions): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidate: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Boolean | String): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

