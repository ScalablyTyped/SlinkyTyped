package typingsSlinky.typpy

import typingsSlinky.std.ArrayConstructor
import typingsSlinky.std.BooleanConstructor
import typingsSlinky.std.FunctionConstructor
import typingsSlinky.std.NumberConstructor
import typingsSlinky.std.ObjectConstructor
import typingsSlinky.std.RegExp
import typingsSlinky.std.RegExpConstructor
import typingsSlinky.std.StringConstructor
import typingsSlinky.typpy.typpyBooleans.`false`
import typingsSlinky.typpy.typpyBooleans.`true`
import typingsSlinky.typpy.typpyMod.CompareFn
import typingsSlinky.typpy.typpyMod.ConstructorFn
import typingsSlinky.typpy.typpyMod.GetFn
import typingsSlinky.typpy.typpyStrings.`null`
import typingsSlinky.typpy.typpyStrings.`object`
import typingsSlinky.typpy.typpyStrings.array
import typingsSlinky.typpy.typpyStrings.boolean
import typingsSlinky.typpy.typpyStrings.function
import typingsSlinky.typpy.typpyStrings.nan
import typingsSlinky.typpy.typpyStrings.number
import typingsSlinky.typpy.typpyStrings.regexp
import typingsSlinky.typpy.typpyStrings.string
import typingsSlinky.typpy.typpyStrings.undefined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Get extends js.Object {
  @JSName("get")
  var get_Original: GetFn = js.native
  @JSName("is")
  var is_Original: CompareFn = js.native
  def get(): Null = js.native
  def get(input: String): StringConstructor = js.native
   // tslint:disable-line:ban-types
  def get(input: js.Any): ConstructorFn = js.native
  def get(input: js.Array[_]): ArrayConstructor = js.native
  def get(input: js.Function): FunctionConstructor = js.native
  def get(input: Boolean): BooleanConstructor = js.native
  def get(input: Double): NumberConstructor | Double = js.native
  def get(input: RegExp): RegExpConstructor = js.native
  @JSName("get")
  def get_Unit(): Unit = js.native
  @JSName("get")
  def get_false(input: js.UndefOr[scala.Nothing], asString: `false`): Unit = js.native
  @JSName("get")
  def get_false(input: String, asString: `false`): StringConstructor = js.native
  @JSName("get")
  def get_false(input: js.Any, asString: `false`): ConstructorFn = js.native
  @JSName("get")
  def get_false(input: js.Array[_], asString: `false`): ArrayConstructor = js.native
  @JSName("get")
  def get_false(input: js.Function, asString: `false`): FunctionConstructor = js.native
  @JSName("get")
  def get_false(input: Boolean, asString: `false`): BooleanConstructor = js.native
  @JSName("get")
  def get_false(input: Double, asString: `false`): NumberConstructor | Double = js.native
  @JSName("get")
  def get_false(input: Null, asString: `false`): Null = js.native
  @JSName("get")
  def get_false(input: RegExp, asString: `false`): RegExpConstructor = js.native
  @JSName("get")
  def get_true(input: js.UndefOr[scala.Nothing], asString: `true`): undefined = js.native
  @JSName("get")
  def get_true(input: String, asString: `true`): string = js.native
   // tslint:disable-line:ban-types
  @JSName("get")
  def get_true(input: js.Any, asString: `true`): String = js.native
  @JSName("get")
  def get_true(input: js.Array[_], asString: `true`): array = js.native
  @JSName("get")
  def get_true(input: js.Function, asString: `true`): function = js.native
  @JSName("get")
  def get_true(input: Boolean, asString: `true`): boolean = js.native
  @JSName("get")
  def get_true(input: Double, asString: `true`): number | nan = js.native
  @JSName("get")
  def get_true(input: Null, asString: `true`): `null` = js.native
  @JSName("get")
  def get_true(input: RegExp, asString: `true`): regexp = js.native
  def is(): `true` = js.native
  def is(input: String, compareTo: StringConstructor): `true` = js.native
  def is(input: js.Any, compareTo: js.Any): Boolean = js.native
  def is(input: js.Array[_], compareTo: ArrayConstructor): `true` = js.native
  def is(input: js.Function, compareTo: FunctionConstructor): `true` = js.native
  def is(input: js.Object, compareTo: ObjectConstructor): Boolean = js.native
  def is(input: Boolean, compareTo: BooleanConstructor): `true` = js.native
  def is(input: Double, compareTo: Double): Boolean = js.native
  def is(input: Double, compareTo: NumberConstructor): Boolean = js.native
  def is(input: RegExp, compareTo: RegExpConstructor): `true` = js.native
  @JSName("is")
  def is_array(input: js.Array[_], compareTo: array): `true` = js.native
  @JSName("is")
  def is_boolean(input: Boolean, compareTo: boolean): `true` = js.native
  @JSName("is")
  def is_function(input: js.Function, compareTo: function): `true` = js.native
  @JSName("is")
  def is_nan(input: Double, compareTo: nan): Boolean = js.native
  @JSName("is")
  def is_null(input: Null, compareTo: `null`): `true` = js.native
   // tslint:disable-line:ban-types
  @JSName("is")
  def is_number(input: Double, compareTo: number): Boolean = js.native
  @JSName("is")
  def is_object(input: js.Object, compareTo: `object`): Boolean = js.native
  @JSName("is")
  def is_regexp(input: js.RegExp, compareTo: regexp): `true` = js.native
  @JSName("is")
  def is_string(input: String, compareTo: string): `true` = js.native
  @JSName("is")
  def is_undefined(input: js.UndefOr[scala.Nothing], compareTo: undefined): `true` = js.native
}

