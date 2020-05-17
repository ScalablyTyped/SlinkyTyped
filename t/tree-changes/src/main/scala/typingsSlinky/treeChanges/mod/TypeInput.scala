package typingsSlinky.treeChanges.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Boolean
  - scala.Double
  - typingsSlinky.treeChanges.mod.IPlainObject
  - js.Array[
java.lang.String | scala.Boolean | scala.Double | typingsSlinky.treeChanges.mod.IPlainObject]
*/
trait TypeInput extends js.Object

object TypeInput {
  @scala.inline
  implicit def apply(value: js.Array[String | Boolean | Double | IPlainObject]): TypeInput = value.asInstanceOf[TypeInput]
  @scala.inline
  implicit def apply(value: Boolean): TypeInput = value.asInstanceOf[TypeInput]
  @scala.inline
  implicit def apply(value: Double): TypeInput = value.asInstanceOf[TypeInput]
  @scala.inline
  implicit def apply(value: IPlainObject): TypeInput = value.asInstanceOf[TypeInput]
  @scala.inline
  implicit def apply(value: String): TypeInput = value.asInstanceOf[TypeInput]
}

