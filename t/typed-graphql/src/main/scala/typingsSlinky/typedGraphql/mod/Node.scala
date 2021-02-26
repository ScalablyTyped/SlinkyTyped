package typingsSlinky.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typedGraphql.mod.Name
  - typingsSlinky.typedGraphql.mod.Document
  - typingsSlinky.typedGraphql.mod.OperationDefinition
  - typingsSlinky.typedGraphql.mod.VariableDefinition
  - typingsSlinky.typedGraphql.mod.Variable
  - typingsSlinky.typedGraphql.mod.SelectionSet
  - typingsSlinky.typedGraphql.mod.Field
  - typingsSlinky.typedGraphql.mod.Argument
  - typingsSlinky.typedGraphql.mod.FragmentSpread
  - typingsSlinky.typedGraphql.mod.InlineFragment
  - typingsSlinky.typedGraphql.mod.FragmentDefinition
  - typingsSlinky.typedGraphql.mod.IntValue
  - typingsSlinky.typedGraphql.mod.FloatValue
  - typingsSlinky.typedGraphql.mod.StringValue
  - typingsSlinky.typedGraphql.mod.BooleanValue
  - typingsSlinky.typedGraphql.mod.EnumValue
  - typingsSlinky.typedGraphql.mod.ListValue
  - typingsSlinky.typedGraphql.mod.ObjectValue
  - typingsSlinky.typedGraphql.mod.ObjectField
  - typingsSlinky.typedGraphql.mod.Directive
  - typingsSlinky.typedGraphql.mod.ListType
  - typingsSlinky.typedGraphql.mod.NonNullType
  - typingsSlinky.typedGraphql.mod.ObjectTypeDefinition
  - typingsSlinky.typedGraphql.mod.FieldDefinition
  - typingsSlinky.typedGraphql.mod.InputValueDefinition
  - typingsSlinky.typedGraphql.mod.InterfaceTypeDefinition
  - typingsSlinky.typedGraphql.mod.UnionTypeDefinition
  - typingsSlinky.typedGraphql.mod.ScalarTypeDefinition
  - typingsSlinky.typedGraphql.mod.EnumTypeDefinition
  - typingsSlinky.typedGraphql.mod.EnumValueDefinition
  - typingsSlinky.typedGraphql.mod.InputObjectTypeDefinition
  - typingsSlinky.typedGraphql.mod.TypeExtensionDefinition
*/
trait Node extends StObject
object Node {
  
  @scala.inline
  def Argument(kind: String, name: Name, value: Value): typingsSlinky.typedGraphql.mod.Argument = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.Argument]
  }
  
  @scala.inline
  def BooleanValue(kind: String, value: Boolean): typingsSlinky.typedGraphql.mod.BooleanValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.BooleanValue]
  }
  
  @scala.inline
  def Directive(kind: String, name: Name): typingsSlinky.typedGraphql.mod.Directive = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.Directive]
  }
  
  @scala.inline
  def Document(definitions: js.Array[Definition], kind: String): typingsSlinky.typedGraphql.mod.Document = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.Document]
  }
  
  @scala.inline
  def EnumTypeDefinition(kind: String, name: Name, values: js.Array[EnumValueDefinition]): typingsSlinky.typedGraphql.mod.EnumTypeDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.EnumTypeDefinition]
  }
  
  @scala.inline
  def EnumValue(kind: String, value: String): typingsSlinky.typedGraphql.mod.EnumValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.EnumValue]
  }
  
  @scala.inline
  def EnumValueDefinition(kind: String, name: Name): typingsSlinky.typedGraphql.mod.EnumValueDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.EnumValueDefinition]
  }
  
  @scala.inline
  def Field(kind: String, name: Name): typingsSlinky.typedGraphql.mod.Field = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.Field]
  }
  
  @scala.inline
  def FieldDefinition(arguments: js.Array[InputValueDefinition], kind: String, name: Name, `type`: Type): typingsSlinky.typedGraphql.mod.FieldDefinition = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.FieldDefinition]
  }
  
  @scala.inline
  def FloatValue(kind: String, value: String): typingsSlinky.typedGraphql.mod.FloatValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.FloatValue]
  }
  
  @scala.inline
  def FragmentDefinition(kind: String, name: Name, selectionSet: SelectionSet, typeCondition: NamedType): typingsSlinky.typedGraphql.mod.FragmentDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any], typeCondition = typeCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.FragmentDefinition]
  }
  
  @scala.inline
  def FragmentSpread(kind: String, name: Name): typingsSlinky.typedGraphql.mod.FragmentSpread = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.FragmentSpread]
  }
  
  @scala.inline
  def InlineFragment(kind: String, selectionSet: SelectionSet): typingsSlinky.typedGraphql.mod.InlineFragment = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.InlineFragment]
  }
  
  @scala.inline
  def InputObjectTypeDefinition(fields: js.Array[InputValueDefinition], kind: String, name: Name): typingsSlinky.typedGraphql.mod.InputObjectTypeDefinition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.InputObjectTypeDefinition]
  }
  
  @scala.inline
  def InputValueDefinition(kind: String, name: Name, `type`: Type): typingsSlinky.typedGraphql.mod.InputValueDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.InputValueDefinition]
  }
  
  @scala.inline
  def IntValue(kind: String, value: String): typingsSlinky.typedGraphql.mod.IntValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.IntValue]
  }
  
  @scala.inline
  def InterfaceTypeDefinition(fields: js.Array[FieldDefinition], kind: String, name: Name): typingsSlinky.typedGraphql.mod.InterfaceTypeDefinition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.InterfaceTypeDefinition]
  }
  
  @scala.inline
  def ListType(kind: String, `type`: Type): typingsSlinky.typedGraphql.mod.ListType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.ListType]
  }
  
  @scala.inline
  def ListValue(kind: String, values: js.Array[Value]): typingsSlinky.typedGraphql.mod.ListValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.ListValue]
  }
  
  @scala.inline
  def Name(kind: String, value: String): typingsSlinky.typedGraphql.mod.Name = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.Name]
  }
  
  @scala.inline
  def NonNullType(kind: String, `type`: NamedType | ListType): typingsSlinky.typedGraphql.mod.NonNullType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.NonNullType]
  }
  
  @scala.inline
  def ObjectField(kind: String, name: Name, value: Value): typingsSlinky.typedGraphql.mod.ObjectField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.ObjectField]
  }
  
  @scala.inline
  def ObjectTypeDefinition(fields: js.Array[FieldDefinition], kind: String, name: Name): typingsSlinky.typedGraphql.mod.ObjectTypeDefinition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.ObjectTypeDefinition]
  }
  
  @scala.inline
  def ObjectValue(fields: js.Array[ObjectField], kind: String): typingsSlinky.typedGraphql.mod.ObjectValue = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.ObjectValue]
  }
  
  @scala.inline
  def OperationDefinition(kind: String, operation: String, selectionSet: SelectionSet): typingsSlinky.typedGraphql.mod.OperationDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.OperationDefinition]
  }
  
  @scala.inline
  def ScalarTypeDefinition(kind: String, name: Name): typingsSlinky.typedGraphql.mod.ScalarTypeDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.ScalarTypeDefinition]
  }
  
  @scala.inline
  def SelectionSet(kind: String, selections: js.Array[Selection]): typingsSlinky.typedGraphql.mod.SelectionSet = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.SelectionSet]
  }
  
  @scala.inline
  def StringValue(kind: String, value: String): typingsSlinky.typedGraphql.mod.StringValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.StringValue]
  }
  
  @scala.inline
  def TypeExtensionDefinition(definition: ObjectTypeDefinition, kind: String): typingsSlinky.typedGraphql.mod.TypeExtensionDefinition = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.TypeExtensionDefinition]
  }
  
  @scala.inline
  def UnionTypeDefinition(kind: String, name: Name, types: js.Array[NamedType]): typingsSlinky.typedGraphql.mod.UnionTypeDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.UnionTypeDefinition]
  }
  
  @scala.inline
  def Variable(kind: String, name: Name): typingsSlinky.typedGraphql.mod.Variable = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.Variable]
  }
  
  @scala.inline
  def VariableDefinition(kind: String, `type`: Type, variable: Variable): typingsSlinky.typedGraphql.mod.VariableDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.VariableDefinition]
  }
}
