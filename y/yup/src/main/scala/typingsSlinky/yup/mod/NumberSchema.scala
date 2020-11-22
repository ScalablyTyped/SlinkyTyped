package typingsSlinky.yup.mod

import typingsSlinky.std.Exclude
import typingsSlinky.std.Record
import typingsSlinky.yup.anon.Less
import typingsSlinky.yup.anon.Max
import typingsSlinky.yup.anon.Min
import typingsSlinky.yup.anon.More
import typingsSlinky.yup.anon.Values
import typingsSlinky.yup.yupBooleans.`false`
import typingsSlinky.yup.yupBooleans.`true`
import typingsSlinky.yup.yupStrings.ceil
import typingsSlinky.yup.yupStrings.floor
import typingsSlinky.yup.yupStrings.round
import typingsSlinky.yup.yupStrings.trunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberSchema[T /* <: js.UndefOr[Double | Null] */, C] extends Schema[T, C] {
  
  def defined(): NumberSchema[Exclude[T, js.UndefOr[scala.Nothing]], C] = js.native
  
  def equals[U /* <: T */](arrayOfValues: js.Array[U | Ref_]): NumberSchema[MaintainOptionality[T, U], C] = js.native
  def equals[U /* <: T */](arrayOfValues: js.Array[U | Ref_], message: js.UndefOr[TestOptionsMessage[Values, _]]): NumberSchema[MaintainOptionality[T, U], C] = js.native
  
  def integer(): NumberSchema[T, C] = js.native
  def integer(message: js.UndefOr[TestOptionsMessage[js.Object, _]]): NumberSchema[T, C] = js.native
  
  def lessThan(limit: Double): NumberSchema[T, C] = js.native
  def lessThan(limit: Double, message: js.UndefOr[TestOptionsMessage[Less, _]]): NumberSchema[T, C] = js.native
  def lessThan(limit: Ref_): NumberSchema[T, C] = js.native
  def lessThan(limit: Ref_, message: js.UndefOr[TestOptionsMessage[Less, _]]): NumberSchema[T, C] = js.native
  
  def max(limit: Double): NumberSchema[T, C] = js.native
  def max(limit: Double, message: js.UndefOr[TestOptionsMessage[Max, _]]): NumberSchema[T, C] = js.native
  def max(limit: Ref_): NumberSchema[T, C] = js.native
  def max(limit: Ref_, message: js.UndefOr[TestOptionsMessage[Max, _]]): NumberSchema[T, C] = js.native
  
  def min(limit: Double): NumberSchema[T, C] = js.native
  def min(limit: Double, message: js.UndefOr[TestOptionsMessage[Min, _]]): NumberSchema[T, C] = js.native
  def min(limit: Ref_): NumberSchema[T, C] = js.native
  def min(limit: Ref_, message: js.UndefOr[TestOptionsMessage[Min, _]]): NumberSchema[T, C] = js.native
  
  def moreThan(limit: Double): NumberSchema[T, C] = js.native
  def moreThan(limit: Double, message: js.UndefOr[TestOptionsMessage[More, _]]): NumberSchema[T, C] = js.native
  def moreThan(limit: Ref_): NumberSchema[T, C] = js.native
  def moreThan(limit: Ref_, message: js.UndefOr[TestOptionsMessage[More, _]]): NumberSchema[T, C] = js.native
  
  def negative(): NumberSchema[T, C] = js.native
  def negative(message: js.UndefOr[TestOptionsMessage[Less, _]]): NumberSchema[T, C] = js.native
  
  def notRequired(): NumberSchema[js.UndefOr[T], C] = js.native
  
  def nullable(): NumberSchema[T | Null, C] = js.native
  def nullable(isNullable: Boolean): NumberSchema[T, C] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: `false`): NumberSchema[Exclude[T, Null], C] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: `true`): NumberSchema[T | Null, C] = js.native
  
  def oneOf[U /* <: T */](arrayOfValues: js.Array[U | Ref_]): NumberSchema[MaintainOptionality[T, U], C] = js.native
  def oneOf[U /* <: T */](arrayOfValues: js.Array[U | Ref_], message: js.UndefOr[TestOptionsMessage[Values, _]]): NumberSchema[MaintainOptionality[T, U], C] = js.native
  
  def optional(): NumberSchema[js.UndefOr[T], C] = js.native
  
  def positive(): NumberSchema[T, C] = js.native
  def positive(message: js.UndefOr[TestOptionsMessage[More, _]]): NumberSchema[T, C] = js.native
  
  def required(): NumberSchema[Exclude[T, js.UndefOr[Null]], C] = js.native
  def required(message: TestOptionsMessage[js.Object, _]): NumberSchema[Exclude[T, js.UndefOr[Null]], C] = js.native
  
  @JSName("round")
  def round_ceil(`type`: ceil): NumberSchema[T, C] = js.native
  @JSName("round")
  def round_floor(`type`: floor): NumberSchema[T, C] = js.native
  @JSName("round")
  def round_round(`type`: round): NumberSchema[T, C] = js.native
  @JSName("round")
  def round_trunc(`type`: trunc): NumberSchema[T, C] = js.native
  
  def test(
    name: String,
    message: TestOptionsMessage[js.Object, _],
    test: TestFunction[js.UndefOr[T | Null], C]
  ): this.type = js.native
  def test(options: TestOptions[Record[String, _], C]): this.type = js.native
  def test[U /* <: T */](options: AssertingTestOptions[U, Record[String, _], C]): NumberSchema[U, C] = js.native
  @JSName("test")
  def test_U_T_NumberSchema[U /* <: T */](name: String, message: TestOptionsMessage[js.Object, _], test: AssertingTestFunction[U, C]): NumberSchema[U, C] = js.native
  
  def truncate(): NumberSchema[T, C] = js.native
}
