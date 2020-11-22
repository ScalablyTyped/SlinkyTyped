package typingsSlinky.yup.mod

import typingsSlinky.yup.yupBooleans.`false`
import typingsSlinky.yup.yupBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotRequiredNullableArraySchema[T, C]
  extends BasicArraySchema[T, js.UndefOr[js.Array[T] | Null], C] {
  
  def defined(): NullableArraySchema[T, C] = js.native
  
  def notRequired(): NotRequiredNullableArraySchema[T, C] = js.native
  
  def nullable(): NotRequiredNullableArraySchema[T, C] = js.native
  def nullable(isNullable: Boolean): ArraySchema[T, C] = js.native
  @JSName("nullable")
  def nullable_ArraySchema(): ArraySchema[T, C] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: `false`): NotRequiredArraySchema[T, C] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: `true`): NotRequiredNullableArraySchema[T, C] = js.native
  
  def of[U](`type`: Schema[U, C]): NotRequiredNullableArraySchema[U, C] = js.native
  
  def optional(): NotRequiredNullableArraySchema[T, C] = js.native
  
  def required(): ArraySchema[T, C] = js.native
  def required(message: TestOptionsMessage[js.Object, _]): ArraySchema[T, C] = js.native
}
