package typingsSlinky.typpy.mod

import typingsSlinky.std.ArrayConstructor
import typingsSlinky.std.BooleanConstructor
import typingsSlinky.std.FunctionConstructor
import typingsSlinky.std.NumberConstructor
import typingsSlinky.std.ObjectConstructor
import typingsSlinky.std.RegExpConstructor
import typingsSlinky.std.StringConstructor
import typingsSlinky.typpy.typpyBooleans.`true`
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
trait CompareFn extends js.Object {
  def apply(): `true` = js.native
  def apply(input: js.UndefOr[scala.Nothing], compareTo: undefined): `true` = js.native
  def apply(input: String, compareTo: StringConstructor): `true` = js.native
  def apply(input: String, compareTo: string): `true` = js.native
  def apply(input: js.Any, compareTo: js.Any): Boolean = js.native
  def apply(input: js.Array[_], compareTo: ArrayConstructor): `true` = js.native
  def apply(input: js.Array[_], compareTo: array): `true` = js.native
  def apply(input: js.Function, compareTo: FunctionConstructor): `true` = js.native
  def apply(input: js.Function, compareTo: function): `true` = js.native
  def apply(input: js.Object, compareTo: ObjectConstructor): Boolean = js.native
  def apply(input: js.Object, compareTo: `object`): Boolean = js.native
  def apply(input: Boolean, compareTo: BooleanConstructor): `true` = js.native
  def apply(input: Boolean, compareTo: boolean): `true` = js.native
  def apply(input: Double, compareTo: Double): Boolean = js.native
  def apply(input: Double, compareTo: NumberConstructor): Boolean = js.native
  def apply(input: Double, compareTo: nan): Boolean = js.native
   // tslint:disable-line:ban-types
  def apply(input: Double, compareTo: number): Boolean = js.native
  def apply(input: Null, compareTo: `null`): `true` = js.native
  def apply(input: js.RegExp, compareTo: RegExpConstructor): `true` = js.native
  def apply(input: js.RegExp, compareTo: regexp): `true` = js.native
}

