package typingsSlinky.yup.mod

import typingsSlinky.yup.yupBooleans.`false`
import typingsSlinky.yup.yupBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotRequiredNullableArraySchema[T]
  extends BasicArraySchema[js.UndefOr[js.Array[T] | Null]] {
  def notRequired(): NotRequiredNullableArraySchema[T] = js.native
  def nullable(): NotRequiredNullableArraySchema[T] = js.native
  def nullable(isNullable: Boolean): ArraySchema[T] = js.native
  @JSName("nullable")
  def nullable_ArraySchema(): ArraySchema[T] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: `false`): NotRequiredArraySchema[T] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: `true`): NotRequiredNullableArraySchema[T] = js.native
  def of[U](`type`: Schema[U]): NotRequiredNullableArraySchema[U] = js.native
  def required(): NullableArraySchema[T] = js.native
  def required(message: TestOptionsMessage[js.Object, _]): NullableArraySchema[T] = js.native
}

