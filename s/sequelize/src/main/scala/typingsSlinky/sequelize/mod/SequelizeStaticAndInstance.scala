package typingsSlinky.sequelize.mod

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.bluebird.mod.Resolvable
import typingsSlinky.sequelize.anon.TypeofPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Sequelize methods that are available both for the static and the instance class of Sequelize
  */
@js.native
trait SequelizeStaticAndInstance extends Errors {
  
  /**
    * A reference to the deferrable collection. Use this to access the different deferrable options.
    */
  var Deferrable: typingsSlinky.sequelize.mod.Deferrable = js.native
  
  /**
    * A reference to the sequelize instance class.
    */
  var Instance: typingsSlinky.sequelize.mod.Instance[_] = js.native
  
  /**
    * A Model represents a table in the database. Sometimes you might also see it referred to as model, or
    * simply as factory. This class should not be instantiated directly, it is created using sequelize.define,
    * and already created models can be loaded using sequelize.import
    */
  var Model: typingsSlinky.sequelize.mod.Model[_, _, _] = js.native
  
  var Op: Operators = js.native
  
  /**
    * A modified version of bluebird promises, that allows listening for sql events
    */
  var Promise: TypeofPromise with (Instantiable1[
    /* callback */ js.Function3[
      /* resolve */ js.Function1[
        /* thenableOrResult */ js.UndefOr[Resolvable[/* import warning: RewrittenClass.unapply cls was tparam R */ js.Any]], 
        Unit
      ], 
      /* reject */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], 
      /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]], 
      Unit
    ], 
    typingsSlinky.bluebird.mod.^[js.Object]
  ]) = js.native
  
  /**
    * Available query types for use with `sequelize.query`
    */
  var QueryTypes: typingsSlinky.sequelize.mod.QueryTypes = js.native
  
  /**
    * A reference to the sequelize transaction class. Use this to access isolationLevels when creating a
    * transaction
    */
  var Transaction: TransactionStatic = js.native
  
  /**
    * A reference to sequelize utilities. Most users will not need to use these utils directly. However, you
    * might want to use `Sequelize.Utils._`, which is a reference to the lodash library, if you don't already
    * have it imported in your project.
    */
  var Utils: typingsSlinky.sequelize.mod.Utils = js.native
  
  /**
    * Exposes the validator.js object, so you can extend it with custom validation functions.
    * The validator is exposed both on the instance, and on the constructor.
    */
  var Validator: typingsSlinky.sequelize.mod.Validator = js.native
  
  /**
    * An AND query
    *
    * @param args Each argument will be joined by AND
    */
  def and(args: (String | js.Object)*): typingsSlinky.sequelize.mod.and = js.native
  
  def asIs(`val`: js.Any): literal = js.native
  
  /**
    * Creates a object representing a call to the cast function.
    *
    * @param val The value to cast
    * @param type The type to cast it to
    */
  def cast(`val`: js.Any, `type`: String): typingsSlinky.sequelize.mod.cast = js.native
  
  /**
    * Creates a object representing a column in the DB. This is often useful in conjunction with
    * `sequelize.fn`, since raw string arguments to fn will be escaped.
    *
    * @param col The name of the column
    */
  def col(col: String): typingsSlinky.sequelize.mod.col = js.native
  
  def condition(attr: js.Object, logic: String): where = js.native
  def condition(attr: js.Object, logic: js.Object): where = js.native
  
  /**
    * Creates a object representing a database function. This can be used in search queries, both in where and
    * order parts, and as default values in column definitions. If you want to refer to columns in your
    * function, you should use `sequelize.col`, so that the columns are properly interpreted as columns and
    * not a strings.
    *
    * Convert a user's username to upper case
    * ```js
    * instance.updateAttributes({
    *   username: self.sequelize.fn('upper', self.sequelize.col('username'))
    * })
    * ```
    * @param fn The function you want to call
    * @param args All further arguments will be passed as arguments to the function
    */
  def fn(fn: String, args: js.Any*): typingsSlinky.sequelize.mod.fn = js.native
  
  /**
    * Creates an object representing nested where conditions for postgres's json data-type.
    *
    * @param conditionsOrPath A hash containing strings/numbers or other nested hash, a string using dot
    *     notation or a string using postgres json syntax.
    * @param value An optional value to compare against. Produces a string of the form "<json path> =
    *     '<value>'".
    */
  def json(conditionsOrPath: String): typingsSlinky.sequelize.mod.json = js.native
  def json(conditionsOrPath: String, value: String): typingsSlinky.sequelize.mod.json = js.native
  def json(conditionsOrPath: String, value: Boolean): typingsSlinky.sequelize.mod.json = js.native
  def json(conditionsOrPath: String, value: Double): typingsSlinky.sequelize.mod.json = js.native
  def json(conditionsOrPath: js.Object): typingsSlinky.sequelize.mod.json = js.native
  def json(conditionsOrPath: js.Object, value: String): typingsSlinky.sequelize.mod.json = js.native
  def json(conditionsOrPath: js.Object, value: Boolean): typingsSlinky.sequelize.mod.json = js.native
  def json(conditionsOrPath: js.Object, value: Double): typingsSlinky.sequelize.mod.json = js.native
  
  /**
    * Creates a object representing a literal, i.e. something that will not be escaped.
    *
    * @param val
    */
  def literal(`val`: js.Any): typingsSlinky.sequelize.mod.literal = js.native
  
  /**
    * An OR query
    *
    * @param args Each argument will be joined by OR
    */
  def or(args: (String | js.Object)*): typingsSlinky.sequelize.mod.or = js.native
  
  /**
    * A way of specifying attr = condition.
    *
    * The attr can either be an object taken from `Model.rawAttributes` (for example `Model.rawAttributes.id`
    * or
    * `Model.rawAttributes.name`). The attribute should be defined in your model definition. The attribute can
    * also be an object from one of the sequelize utility functions (`sequelize.fn`, `sequelize.col` etc.)
    *
    * For string attributes, use the regular `{ where: { attr: something }}` syntax. If you don't want your
    * string to be escaped, use `sequelize.literal`.
    *
    * @param attr The attribute, which can be either an attribute object from `Model.rawAttributes` or a
    *     sequelize object, for example an instance of `sequelize.fn`. For simple string attributes, use the
    *     POJO syntax
    * @param comparator Comparator
    * @param logic The condition. Can be both a simply type, or a further condition (`.or`, `.and`, `.literal`
    *     etc.)
    */
  def where(attr: js.Object, comparator: String, logic: String): typingsSlinky.sequelize.mod.where = js.native
  def where(attr: js.Object, comparator: String, logic: js.Object): typingsSlinky.sequelize.mod.where = js.native
  def where(attr: js.Object, logic: String): typingsSlinky.sequelize.mod.where = js.native
  def where(attr: js.Object, logic: js.Object): typingsSlinky.sequelize.mod.where = js.native
}
