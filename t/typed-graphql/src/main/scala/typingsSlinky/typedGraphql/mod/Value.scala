package typingsSlinky.typedGraphql.mod

import org.scalablytyped.runtime.StObject
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
trait Value extends StObject
object Value {
  
  @scala.inline
  def BooleanValue(kind: String, value: Boolean): typingsSlinky.typedGraphql.mod.BooleanValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.BooleanValue]
  }
  
  @scala.inline
  def EnumValue(kind: String, value: String): typingsSlinky.typedGraphql.mod.EnumValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.EnumValue]
  }
  
  @scala.inline
  def FloatValue(kind: String, value: String): typingsSlinky.typedGraphql.mod.FloatValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.FloatValue]
  }
  
  @scala.inline
  def IntValue(kind: String, value: String): typingsSlinky.typedGraphql.mod.IntValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.IntValue]
  }
  
  @scala.inline
  def ListValue(kind: String, values: js.Array[Value]): typingsSlinky.typedGraphql.mod.ListValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.ListValue]
  }
  
  @scala.inline
  def ObjectValue(fields: js.Array[ObjectField], kind: String): typingsSlinky.typedGraphql.mod.ObjectValue = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.ObjectValue]
  }
  
  @scala.inline
  def StringValue(kind: String, value: String): typingsSlinky.typedGraphql.mod.StringValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.StringValue]
  }
  
  @scala.inline
  def Variable(kind: String, name: Name): typingsSlinky.typedGraphql.mod.Variable = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.Variable]
  }
}
