package typingsSlinky.sequelize.mod

import typingsSlinky.sequelize.anon.Clone
import typingsSlinky.sequelize.anon.Skip
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents an single instance, a database row. You might see it referred to as both Instance and
  * instance. You should not instantiate the Instance class directly, instead you access it using the finder and
  * creation methods on the model.
  *
  * Instance instances operate with the concept of a `dataValues` property, which stores the actual values
  * represented by the instance. By default, the values from dataValues can also be accessed directly from the
  * Instance, that is:
  * ```js
  * instance.field
  * // is the same as
  * instance.get('field')
  * // is the same as
  * instance.getDataValue('field')
  * ```
  * However, if getters and/or setters are defined for `field` they will be invoked, instead of returning the
  * value from `dataValues`. Accessing properties directly or using `get` is preferred for regular use,
  * `getDataValue` should only be used for custom getters.
  *
  * @see Sequelize.define for more information about getters and setters
  */
@js.native
trait Instance[TAttributes] extends StObject {
  
  /**
    * Returns the Model the instance was created from.
    *
    * @see Model
    */
  var Model: typingsSlinky.sequelize.mod.Model[this.type, TAttributes, TAttributes] = js.native
  
  def changed(): Boolean | js.Array[String] = js.native
  /**
    * If changed is called with a string it will return a boolean indicating whether the value of that key in
    * `dataValues` is different from the value in `_previousDataValues`.
    *
    * If changed is called without an argument, it will return an array of keys that have changed.
    *
    * If changed is called without an argument and no keys have changed, it will return `false`.
    */
  def changed(key: /* keyof TAttributes */ String): Boolean = js.native
  
  def decrement(fields: /* keyof TAttributes */ String): typingsSlinky.bluebird.mod.^[this.type] = js.native
  def decrement(fields: /* keyof TAttributes */ String, options: InstanceIncrementDecrementOptions): typingsSlinky.bluebird.mod.^[this.type] = js.native
  def decrement(fields: js.Array[/* keyof TAttributes */ String]): typingsSlinky.bluebird.mod.^[this.type] = js.native
  def decrement(fields: js.Array[/* keyof TAttributes */ String], options: InstanceIncrementDecrementOptions): typingsSlinky.bluebird.mod.^[this.type] = js.native
  /**
    * Decrement the value of one or more columns. This is done in the database, which means it does not use
    * the values currently stored on the Instance. The decrement is done using a
    * ```sql
    * SET column = column - X
    * ```
    * query. To get the correct value after an decrement into the Instance you should do a reload.
    *
    * ```js
    * instance.decrement('number') // decrement number by 1
    * instance.decrement(['number', 'count'], { by: 2 }) // decrement number and count by 2
    * instance.decrement({ answer: 42, tries: 1}, { by: 2 }) // decrement answer by 42, and tries by 1.
    *                                                        // `by` is ignored, since each column has its own
    *                                                        // value
    * ```
    *
    * @param fields If a string is provided, that column is decremented by the value of `by` given in options.
    *               If an array is provided, the same is true for each column.
    *               If and object is provided, each column is decremented by the value given
    */
  def decrement(fields: Partial[TAttributes]): typingsSlinky.bluebird.mod.^[this.type] = js.native
  def decrement(fields: Partial[TAttributes], options: InstanceIncrementDecrementOptions): typingsSlinky.bluebird.mod.^[this.type] = js.native
  
  /**
    * Destroy the row corresponding to this instance. Depending on your setting for paranoid, the row will
    * either be completely deleted, or have its deletedAt timestamp set to the current time.
    */
  def destroy(): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def destroy(options: InstanceDestroyOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * Check whether all values of this and `other` Instance are the same
    */
  def equals(other: Instance[_]): Boolean = js.native
  
  /**
    * Check if this is eqaul to one of `others` by calling equals
    */
  def equalsOneOf(others: js.Array[Instance[_]]): Boolean = js.native
  
  def get(): TAttributes = js.native
  /**
    * If no key is given, returns all values of the instance, also invoking virtual getters.
    *
    * If key is given and a field or virtual getter is present for the key it will call that getter - else it
    * will return the value for key.
    *
    * @param options.plain If set to true, included instances will be returned as plain objects
    */
  def get(key: /* keyof TAttributes */ String): js.Any = js.native
  def get(key: /* keyof TAttributes */ String, options: Clone): js.Any = js.native
  def get(options: Clone): TAttributes = js.native
  
  /**
    * Get the value of the underlying data value
    */
  def getDataValue(key: /* keyof TAttributes */ String): js.Any = js.native
  
  def increment(fields: /* keyof TAttributes */ String): typingsSlinky.bluebird.mod.^[this.type] = js.native
  def increment(fields: /* keyof TAttributes */ String, options: InstanceIncrementDecrementOptions): typingsSlinky.bluebird.mod.^[this.type] = js.native
  def increment(fields: js.Array[/* keyof TAttributes */ String]): typingsSlinky.bluebird.mod.^[this.type] = js.native
  def increment(fields: js.Array[/* keyof TAttributes */ String], options: InstanceIncrementDecrementOptions): typingsSlinky.bluebird.mod.^[this.type] = js.native
  /**
    * Increment the value of one or more columns. This is done in the database, which means it does not use
    * the values currently stored on the Instance. The increment is done using a
    * ```sql
    * SET column = column + X
    * ```
    * query. To get the correct value after an increment into the Instance you should do a reload.
    *
    *```js
    * instance.increment('number') // increment number by 1
    * instance.increment(['number', 'count'], { by: 2 }) // increment number and count by 2
    * instance.increment({ answer: 42, tries: 1}, { by: 2 }) // increment answer by 42, and tries by 1.
    *                                                        // `by` is ignored, since each column has its own
    *                                                        // value
    * ```
    *
    * @param fields If a string is provided, that column is incremented by the value of `by` given in options.
    *               If an array is provided, the same is true for each column.
    *               If and object is provided, each column is incremented by the value given.
    */
  def increment(fields: Partial[TAttributes]): typingsSlinky.bluebird.mod.^[this.type] = js.native
  def increment(fields: Partial[TAttributes], options: InstanceIncrementDecrementOptions): typingsSlinky.bluebird.mod.^[this.type] = js.native
  
  /**
    * Returns true if this instance has not yet been persisted to the database
    */
  var isNewRecord: Boolean = js.native
  
  def previous(): js.Object = js.native
  /**
    * If previous is called with a string, it will return the previous value for the key from `_previousDataValues`.
    *
    * If previous is called without an argument, it will return an object containing the previous keys and values that have changed.
    */
  def previous(key: /* keyof TAttributes */ String): js.Any = js.native
  
  /**
    * Refresh the current instance in-place, i.e. update the object with current data from the DB and return
    * the same object. This is different from doing a `find(Instance.id)`, because that would create and
    * return a new instance. With this method, all references to the Instance are updated with the new data
    * and no new objects are created.
    */
  def reload(): typingsSlinky.bluebird.mod.^[this.type] = js.native
  def reload(options: AnyFindOptions): typingsSlinky.bluebird.mod.^[this.type] = js.native
  
  /**
    * Restore the row corresponding to this instance. Only available for paranoid models.
    */
  def restore(): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def restore(options: InstanceRestoreOptions): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * Validate this instance, and if the validation passes, persist it to the database.
    *
    * On success, the callback will be called with this instance. On validation error, the callback will be
    * called with an instance of `Sequelize.ValidationError`. This error will have a property for each of the
    * fields for which validation failed, with the error message for that field.
    */
  def save(): typingsSlinky.bluebird.mod.^[this.type] = js.native
  def save(options: InstanceSaveOptions): typingsSlinky.bluebird.mod.^[this.type] = js.native
  
  /**
    * A reference to the sequelize instance
    */
  var sequelize: Sequelize = js.native
  
  def set(keys: js.Object): this.type = js.native
  def set(keys: js.Object, options: InstanceSetOptions): this.type = js.native
  /**
    * Set is used to update values on the instance (the sequelize representation of the instance that is,
    * remember that nothing will be persisted before you actually call `save`). In its most basic form `set`
    * will update a value stored in the underlying `dataValues` object. However, if a custom setter function
    * is defined for the key, that function will be called instead. To bypass the setter, you can pass `raw:
    * true` in the options object.
    *
    * If set is called with an object, it will loop over the object, and call set recursively for each key,
    * value pair. If you set raw to true, the underlying dataValues will either be set directly to the object
    * passed, or used to extend dataValues, if dataValues already contain values.
    *
    * When set is called, the previous value of the field is stored and sets a changed flag(see `changed`).
    *
    * Set can also be used to build instances for associations, if you have values for those.
    * When using set with associations you need to make sure the property key matches the alias of the
    * association while also making sure that the proper include options have been set (from .build() or
    * .find())
    *
    * If called with a dot.seperated key on a JSON/JSONB attribute it will set the value nested and flag the
    * entire object as changed.
    *
    * @param options.raw If set to true, field and virtual setters will be ignored
    * @param options.reset Clear all previously set data values
    */
  def set[K /* <: /* keyof TAttributes */ String */](
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: TAttributes[K] */ js.Any
  ): this.type = js.native
  def set[K /* <: /* keyof TAttributes */ String */](
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: TAttributes[K] */ js.Any,
    options: InstanceSetOptions
  ): this.type = js.native
  
  def setAttributes(keys: js.Object): this.type = js.native
  def setAttributes(keys: js.Object, options: InstanceSetOptions): this.type = js.native
  def setAttributes[K /* <: /* keyof TAttributes */ String */](
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: TAttributes[K] */ js.Any
  ): this.type = js.native
  def setAttributes[K /* <: /* keyof TAttributes */ String */](
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: TAttributes[K] */ js.Any,
    options: InstanceSetOptions
  ): this.type = js.native
  
  /**
    * Update the underlying data value
    */
  def setDataValue[K /* <: /* keyof TAttributes */ String */](
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: TAttributes[K] */ js.Any
  ): Unit = js.native
  
  /**
    * Convert the instance to a JSON representation. Proxies to calling `get` with no keys. This means get all
    * values gotten from the DB, and apply all custom getters.
    */
  def toJSON(): TAttributes = js.native
  
  def update(keys: js.Object): typingsSlinky.bluebird.mod.^[this.type] = js.native
  def update(keys: js.Object, options: InstanceUpdateOptions): typingsSlinky.bluebird.mod.^[this.type] = js.native
  /**
    * This is the same as calling `set` and then calling `save`.
    */
  def update[K /* <: /* keyof TAttributes */ String */](
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: TAttributes[K] */ js.Any
  ): typingsSlinky.bluebird.mod.^[this.type] = js.native
  def update[K /* <: /* keyof TAttributes */ String */](
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: TAttributes[K] */ js.Any,
    options: InstanceUpdateOptions
  ): typingsSlinky.bluebird.mod.^[this.type] = js.native
  
  def updateAttributes(keys: js.Object): typingsSlinky.bluebird.mod.^[this.type] = js.native
  def updateAttributes(keys: js.Object, options: InstanceUpdateOptions): typingsSlinky.bluebird.mod.^[this.type] = js.native
  def updateAttributes[K /* <: /* keyof TAttributes */ String */](
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: TAttributes[K] */ js.Any
  ): typingsSlinky.bluebird.mod.^[this.type] = js.native
  def updateAttributes[K /* <: /* keyof TAttributes */ String */](
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: TAttributes[K] */ js.Any,
    options: InstanceUpdateOptions
  ): typingsSlinky.bluebird.mod.^[this.type] = js.native
  
  /**
    * Validate the attribute of this instance according to validation rules set in the model definition.
    *
    * Emits null if and only if validation successful; otherwise an Error instance containing
    * { field name : [error msgs] } entries.
    *
    * @param options.skip An array of strings. All properties that are in this array will not be validated
    */
  def validate(): typingsSlinky.bluebird.mod.^[ValidationError] = js.native
  def validate(options: Skip): typingsSlinky.bluebird.mod.^[ValidationError] = js.native
  
  /**
    * Get an object representing the query for this instance, use with `options.where`
    */
  def where(): js.Object = js.native
}
