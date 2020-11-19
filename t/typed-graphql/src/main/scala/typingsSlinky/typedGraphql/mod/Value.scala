package typingsSlinky.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Values
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typedGraphql.mod.Variable
  - typingsSlinky.typedGraphql.mod.IntValue
  - typingsSlinky.typedGraphql.mod.FloatValue
  - typingsSlinky.typedGraphql.mod.StringValue
  - typingsSlinky.typedGraphql.mod.BooleanValue
  - typingsSlinky.typedGraphql.mod.EnumValue
  - typingsSlinky.typedGraphql.mod.ListValue
  - typingsSlinky.typedGraphql.mod.ObjectValue
*/
trait Value extends js.Object
object Value {
  
  @scala.inline
  def ObjectValue(fields: js.Array[ObjectField], kind: String): Value = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  def EnumValue(kind: String, value: String): Value = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  def IntValue(kind: String, value: String): Value = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  def BooleanValue(kind: String, value: Boolean): Value = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  def FloatValue(kind: String, value: String): Value = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  def StringValue(kind: String, value: String): Value = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  def Variable(kind: String, name: Name): Value = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  def ListValue(kind: String, values: js.Array[Value]): Value = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}
