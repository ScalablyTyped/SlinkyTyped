package typingsSlinky.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// language/visitor.js
@js.native
trait QueryDocumentKeys extends js.Object {
  var Argument: js.Array[String] = js.native
  var BooleanValue: js.Array[Boolean] = js.native
  var Directive: js.Array[String] = js.native
  var Document: js.Array[String] = js.native
  var EnumTypeDefinition: js.Array[String] = js.native
  var EnumValue: js.Array[_] = js.native
  var EnumValueDefinition: js.Array[String] = js.native
  var Field: js.Array[String] = js.native
  var FieldDefinition: js.Array[String] = js.native
  var FloatValue: js.Array[Double] = js.native
  var FragmentDefinition: js.Array[String] = js.native
  var FragmentSpread: js.Array[String] = js.native
  var InlineFragment: js.Array[String] = js.native
  var InputObjectTypeDefinition: js.Array[String] = js.native
  var InputValueDefinition: js.Array[String] = js.native
  var IntValue: js.Array[Double] = js.native
  var InterfaceTypeDefinition: js.Array[String] = js.native
  var ListType: js.Array[String] = js.native
  var ListValue: js.Array[String] = js.native
  var Name: js.Array[_] = js.native
  var NamedType: js.Array[String] = js.native
  var NonNullType: js.Array[String] = js.native
  var ObjectField: js.Array[String] = js.native
  var ObjectTypeDefinition: js.Array[String] = js.native
  var ObjectValue: js.Array[String] = js.native
  var OperationDefinition: js.Array[String] = js.native
  var ScalarTypeDefinition: js.Array[String] = js.native
  var SelectionSet: js.Array[String] = js.native
  var StringValue: js.Array[String] = js.native
  var TypeExtensionDefinition: js.Array[String] = js.native
  var UnionTypeDefinition: js.Array[String] = js.native
  var Variable: js.Array[String] = js.native
  var VariableDefinition: js.Array[String] = js.native
}

object QueryDocumentKeys {
  @scala.inline
  def apply(
    Argument: js.Array[String],
    BooleanValue: js.Array[Boolean],
    Directive: js.Array[String],
    Document: js.Array[String],
    EnumTypeDefinition: js.Array[String],
    EnumValue: js.Array[_],
    EnumValueDefinition: js.Array[String],
    Field: js.Array[String],
    FieldDefinition: js.Array[String],
    FloatValue: js.Array[Double],
    FragmentDefinition: js.Array[String],
    FragmentSpread: js.Array[String],
    InlineFragment: js.Array[String],
    InputObjectTypeDefinition: js.Array[String],
    InputValueDefinition: js.Array[String],
    IntValue: js.Array[Double],
    InterfaceTypeDefinition: js.Array[String],
    ListType: js.Array[String],
    ListValue: js.Array[String],
    Name: js.Array[_],
    NamedType: js.Array[String],
    NonNullType: js.Array[String],
    ObjectField: js.Array[String],
    ObjectTypeDefinition: js.Array[String],
    ObjectValue: js.Array[String],
    OperationDefinition: js.Array[String],
    ScalarTypeDefinition: js.Array[String],
    SelectionSet: js.Array[String],
    StringValue: js.Array[String],
    TypeExtensionDefinition: js.Array[String],
    UnionTypeDefinition: js.Array[String],
    Variable: js.Array[String],
    VariableDefinition: js.Array[String]
  ): QueryDocumentKeys = {
    val __obj = js.Dynamic.literal(Argument = Argument.asInstanceOf[js.Any], BooleanValue = BooleanValue.asInstanceOf[js.Any], Directive = Directive.asInstanceOf[js.Any], Document = Document.asInstanceOf[js.Any], EnumTypeDefinition = EnumTypeDefinition.asInstanceOf[js.Any], EnumValue = EnumValue.asInstanceOf[js.Any], EnumValueDefinition = EnumValueDefinition.asInstanceOf[js.Any], Field = Field.asInstanceOf[js.Any], FieldDefinition = FieldDefinition.asInstanceOf[js.Any], FloatValue = FloatValue.asInstanceOf[js.Any], FragmentDefinition = FragmentDefinition.asInstanceOf[js.Any], FragmentSpread = FragmentSpread.asInstanceOf[js.Any], InlineFragment = InlineFragment.asInstanceOf[js.Any], InputObjectTypeDefinition = InputObjectTypeDefinition.asInstanceOf[js.Any], InputValueDefinition = InputValueDefinition.asInstanceOf[js.Any], IntValue = IntValue.asInstanceOf[js.Any], InterfaceTypeDefinition = InterfaceTypeDefinition.asInstanceOf[js.Any], ListType = ListType.asInstanceOf[js.Any], ListValue = ListValue.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NamedType = NamedType.asInstanceOf[js.Any], NonNullType = NonNullType.asInstanceOf[js.Any], ObjectField = ObjectField.asInstanceOf[js.Any], ObjectTypeDefinition = ObjectTypeDefinition.asInstanceOf[js.Any], ObjectValue = ObjectValue.asInstanceOf[js.Any], OperationDefinition = OperationDefinition.asInstanceOf[js.Any], ScalarTypeDefinition = ScalarTypeDefinition.asInstanceOf[js.Any], SelectionSet = SelectionSet.asInstanceOf[js.Any], StringValue = StringValue.asInstanceOf[js.Any], TypeExtensionDefinition = TypeExtensionDefinition.asInstanceOf[js.Any], UnionTypeDefinition = UnionTypeDefinition.asInstanceOf[js.Any], Variable = Variable.asInstanceOf[js.Any], VariableDefinition = VariableDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDocumentKeys]
  }
  @scala.inline
  implicit class QueryDocumentKeysOps[Self <: QueryDocumentKeys] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgument(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Argument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBooleanValue(value: js.Array[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BooleanValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirective(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Directive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocument(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnumTypeDefinition(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnumTypeDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnumValue(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnumValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnumValueDefinition(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnumValueDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withField(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldDefinition(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFloatValue(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FloatValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragmentDefinition(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FragmentDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragmentSpread(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FragmentSpread")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInlineFragment(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InlineFragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputObjectTypeDefinition(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputObjectTypeDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputValueDefinition(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputValueDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntValue(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterfaceTypeDefinition(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InterfaceTypeDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListType(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListValue(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamedType(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamedType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonNullType(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NonNullType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectField(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectTypeDefinition(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectValue(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperationDefinition(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScalarTypeDefinition(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalarTypeDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionSet(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectionSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStringValue(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeExtensionDefinition(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeExtensionDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnionTypeDefinition(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnionTypeDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariable(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Variable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariableDefinition(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VariableDefinition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

