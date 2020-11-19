package typingsSlinky.yup.mod

import typingsSlinky.yup.yupBooleans.`false`
import typingsSlinky.yup.yupBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NullableArraySchema[T]
  extends BasicArraySchema[T, js.Array[T] | Null] {
  
  def defined(): NullableArraySchema[T] = js.native
  
  def notRequired(): NotRequiredNullableArraySchema[T] = js.native
  
  def nullable(): NullableArraySchema[T] = js.native
  def nullable(isNullable: Boolean): ArraySchema[T] = js.native
  @JSName("nullable")
  def nullable_ArraySchema(): ArraySchema[T] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: `false`): ArraySchema[T] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: `true`): NullableArraySchema[T] = js.native
  
  def of[U](`type`: Schema[U]): NullableArraySchema[U] = js.native
  
  def optional(): NotRequiredNullableArraySchema[T] = js.native
  
  def required(): ArraySchema[T] = js.native
  def required(message: TestOptionsMessage[js.Object, _]): ArraySchema[T] = js.native
}
