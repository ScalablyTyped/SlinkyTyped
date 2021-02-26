package typingsSlinky.yup.mod

import typingsSlinky.std.Exclude
import typingsSlinky.std.Record
import typingsSlinky.yup.anon.ExcludeEmptyString
import typingsSlinky.yup.anon.Length
import typingsSlinky.yup.anon.Max
import typingsSlinky.yup.anon.Min
import typingsSlinky.yup.anon.Regex
import typingsSlinky.yup.anon.Values
import typingsSlinky.yup.yupBooleans.`false`
import typingsSlinky.yup.yupBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringSchema[T /* <: js.UndefOr[String | Null] */, C] extends Schema[T, C] {
  
  def defined(): StringSchema[Exclude[T, js.UndefOr[scala.Nothing]], C] = js.native
  
  def email(): StringSchema[T, C] = js.native
  def email(message: js.UndefOr[TestOptionsMessage[Regex, _]]): StringSchema[T, C] = js.native
  
  def ensure(): StringSchema[T, C] = js.native
  
  def equals[U /* <: T */](arrayOfValues: js.Array[U | Ref_]): StringSchema[MaintainOptionality[T, U], C] = js.native
  def equals[U /* <: T */](arrayOfValues: js.Array[U | Ref_], message: js.UndefOr[TestOptionsMessage[Values, _]]): StringSchema[MaintainOptionality[T, U], C] = js.native
  
  def length(limit: Double): StringSchema[T, C] = js.native
  def length(limit: Double, message: js.UndefOr[TestOptionsMessage[Length, _]]): StringSchema[T, C] = js.native
  def length(limit: Ref_): StringSchema[T, C] = js.native
  def length(limit: Ref_, message: js.UndefOr[TestOptionsMessage[Length, _]]): StringSchema[T, C] = js.native
  
  def lowercase(): StringSchema[T, C] = js.native
  def lowercase(message: js.UndefOr[TestOptionsMessage[js.Object, _]]): StringSchema[T, C] = js.native
  
  def matches(regex: js.RegExp): StringSchema[T, C] = js.native
  def matches(regex: js.RegExp, messageOrOptions: js.UndefOr[TestOptionsMessage[Regex, _]]): StringSchema[T, C] = js.native
  def matches(regex: js.RegExp, messageOrOptions: ExcludeEmptyString): StringSchema[T, C] = js.native
  
  def max(limit: Double): StringSchema[T, C] = js.native
  def max(limit: Double, message: js.UndefOr[TestOptionsMessage[Max, _]]): StringSchema[T, C] = js.native
  def max(limit: Ref_): StringSchema[T, C] = js.native
  def max(limit: Ref_, message: js.UndefOr[TestOptionsMessage[Max, _]]): StringSchema[T, C] = js.native
  
  def min(limit: Double): StringSchema[T, C] = js.native
  def min(limit: Double, message: js.UndefOr[TestOptionsMessage[Min, _]]): StringSchema[T, C] = js.native
  def min(limit: Ref_): StringSchema[T, C] = js.native
  def min(limit: Ref_, message: js.UndefOr[TestOptionsMessage[Min, _]]): StringSchema[T, C] = js.native
  
  def notRequired(): StringSchema[js.UndefOr[T], C] = js.native
  
  def nullable(): StringSchema[T | Null, C] = js.native
  def nullable(isNullable: Boolean): StringSchema[T, C] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: `false`): StringSchema[Exclude[T, Null], C] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: `true`): StringSchema[T | Null, C] = js.native
  
  def oneOf[U /* <: T */](arrayOfValues: js.Array[U | Ref_]): StringSchema[MaintainOptionality[T, U], C] = js.native
  def oneOf[U /* <: T */](arrayOfValues: js.Array[U | Ref_], message: js.UndefOr[TestOptionsMessage[Values, _]]): StringSchema[MaintainOptionality[T, U], C] = js.native
  
  def optional(): StringSchema[js.UndefOr[T], C] = js.native
  
  def required(): StringSchema[Exclude[T, js.UndefOr[Null]], C] = js.native
  def required(message: TestOptionsMessage[js.Object, _]): StringSchema[Exclude[T, js.UndefOr[Null]], C] = js.native
  
  /*
    All TestFunction generics are intentionally T with (undefined | null) as previous .required / .defined / .nullable
    will narrow out those types, and tests run for (undefined | null) even if they're not allowed.
    */
  def test(
    name: String,
    message: TestOptionsMessage[js.Object, _],
    test: TestFunction[js.UndefOr[T | Null], C]
  ): this.type = js.native
  def test(options: TestOptions[Record[String, _], C]): this.type = js.native
  def test[U /* <: T */](options: AssertingTestOptions[U, Record[String, _], C]): StringSchema[U, C] = js.native
  @JSName("test")
  def test_U_T_StringSchema[U /* <: T */](name: String, message: TestOptionsMessage[js.Object, _], test: AssertingTestFunction[U, C]): StringSchema[U, C] = js.native
  
  def trim(): StringSchema[T, C] = js.native
  def trim(message: js.UndefOr[TestOptionsMessage[js.Object, _]]): StringSchema[T, C] = js.native
  
  def uppercase(): StringSchema[T, C] = js.native
  def uppercase(message: js.UndefOr[TestOptionsMessage[js.Object, _]]): StringSchema[T, C] = js.native
  
  def url(): StringSchema[T, C] = js.native
  def url(message: js.UndefOr[TestOptionsMessage[Regex, _]]): StringSchema[T, C] = js.native
  
  def uuid(): StringSchema[T, C] = js.native
  def uuid(message: js.UndefOr[TestOptionsMessage[Regex, _]]): StringSchema[T, C] = js.native
}
