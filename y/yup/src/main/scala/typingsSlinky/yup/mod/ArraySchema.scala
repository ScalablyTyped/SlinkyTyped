package typingsSlinky.yup.mod

import typingsSlinky.yup.yupBooleans.`false`
import typingsSlinky.yup.yupBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArraySchema[T]
  extends BasicArraySchema[T, js.Array[T]] {
  
  def defined(): ArraySchema[T] = js.native
  
  def notRequired(): NotRequiredArraySchema[T] = js.native
  
  def nullable(): NullableArraySchema[T] = js.native
  def nullable(isNullable: Boolean): ArraySchema[T] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: `false`): ArraySchema[T] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: `true`): NullableArraySchema[T] = js.native
  
  def of[U](`type`: Schema[U]): ArraySchema[U] = js.native
  
  def optional(): NotRequiredArraySchema[T] = js.native
  
  def required(): ArraySchema[T] = js.native
  def required(message: TestOptionsMessage[js.Object, _]): ArraySchema[T] = js.native
}
