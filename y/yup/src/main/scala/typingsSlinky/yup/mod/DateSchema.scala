package typingsSlinky.yup.mod

import typingsSlinky.std.Exclude
import typingsSlinky.std.Record
import typingsSlinky.yup.anon.Values
import typingsSlinky.yup.anon.`0`
import typingsSlinky.yup.anon.`1`
import typingsSlinky.yup.yupBooleans.`false`
import typingsSlinky.yup.yupBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateSchema[T /* <: js.UndefOr[js.Date | Null] */] extends Schema[T] {
  
  def defined(): DateSchema[Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  
  def equals[U /* <: T */](arrayOfValues: js.Array[U | Ref_]): DateSchema[MaintainOptionality[T, U]] = js.native
  def equals[U /* <: T */](arrayOfValues: js.Array[U | Ref_], message: js.UndefOr[TestOptionsMessage[Values, _]]): DateSchema[MaintainOptionality[T, U]] = js.native
  
  def max(limit: String): DateSchema[T] = js.native
  def max(limit: String, message: js.UndefOr[TestOptionsMessage[`1`, _]]): DateSchema[T] = js.native
  def max(limit: js.Date): DateSchema[T] = js.native
  def max(limit: js.Date, message: js.UndefOr[TestOptionsMessage[`1`, _]]): DateSchema[T] = js.native
  def max(limit: Ref_): DateSchema[T] = js.native
  def max(limit: Ref_, message: js.UndefOr[TestOptionsMessage[`1`, _]]): DateSchema[T] = js.native
  
  def min(limit: String): DateSchema[T] = js.native
  def min(limit: String, message: js.UndefOr[TestOptionsMessage[`0`, _]]): DateSchema[T] = js.native
  def min(limit: js.Date): DateSchema[T] = js.native
  def min(limit: js.Date, message: js.UndefOr[TestOptionsMessage[`0`, _]]): DateSchema[T] = js.native
  def min(limit: Ref_): DateSchema[T] = js.native
  def min(limit: Ref_, message: js.UndefOr[TestOptionsMessage[`0`, _]]): DateSchema[T] = js.native
  
  def notRequired(): DateSchema[js.UndefOr[T]] = js.native
  
  def nullable(): DateSchema[T | Null] = js.native
  def nullable(isNullable: Boolean): DateSchema[T] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: `false`): DateSchema[Exclude[T, Null]] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: `true`): DateSchema[T | Null] = js.native
  
  def oneOf[U /* <: T */](arrayOfValues: js.Array[U | Ref_]): DateSchema[MaintainOptionality[T, U]] = js.native
  def oneOf[U /* <: T */](arrayOfValues: js.Array[U | Ref_], message: js.UndefOr[TestOptionsMessage[Values, _]]): DateSchema[MaintainOptionality[T, U]] = js.native
  
  def optional(): DateSchema[js.UndefOr[T]] = js.native
  
  def required(): DateSchema[Exclude[T, js.UndefOr[Null]]] = js.native
  def required(message: TestOptionsMessage[js.Object, _]): DateSchema[Exclude[T, js.UndefOr[Null]]] = js.native
  
  def test(name: String, message: TestOptionsMessage[js.Object, _], test: TestFunction): this.type = js.native
  def test(options: TestOptions[Record[String, _]]): this.type = js.native
  def test[U /* <: T */](options: AssertingTestOptions[U, Record[String, _]]): DateSchema[U] = js.native
  @JSName("test")
  def test_U_T_DateSchema[U /* <: T */](name: String, message: TestOptionsMessage[js.Object, _], test: AssertingTestFunction[U]): DateSchema[U] = js.native
}
