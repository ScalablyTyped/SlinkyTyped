package typingsSlinky.webidl2.mod

import typingsSlinky.webidl2.webidl2Booleans.`false`
import typingsSlinky.webidl2.webidl2Booleans.`true`
import typingsSlinky.webidl2.webidl2Strings.FrozenArray
import typingsSlinky.webidl2.webidl2Strings.ObservableArray
import typingsSlinky.webidl2.webidl2Strings.Promise
import typingsSlinky.webidl2.webidl2Strings._empty
import typingsSlinky.webidl2.webidl2Strings.record
import typingsSlinky.webidl2.webidl2Strings.sequence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webidl2.mod.GenericTypeDescription
  - typingsSlinky.webidl2.mod.SingleTypeDescription
  - typingsSlinky.webidl2.mod.UnionTypeDescription
*/
trait IDLTypeDescription extends StObject
object IDLTypeDescription {
  
  @scala.inline
  def FrozenArrayTypeDescription(
    extAttrs: js.Array[ExtendedAttribute],
    generic: FrozenArray,
    idlType: js.Array[IDLTypeDescription],
    nullable: Boolean,
    parent: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription,
    union: `false`
  ): typingsSlinky.webidl2.mod.FrozenArrayTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], generic = generic.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], union = union.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.FrozenArrayTypeDescription]
  }
  
  @scala.inline
  def ObservableArrayTypeDescription(
    extAttrs: js.Array[ExtendedAttribute],
    generic: ObservableArray,
    idlType: js.Array[IDLTypeDescription],
    nullable: Boolean,
    parent: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription,
    union: `false`
  ): typingsSlinky.webidl2.mod.ObservableArrayTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], generic = generic.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], union = union.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.ObservableArrayTypeDescription]
  }
  
  @scala.inline
  def PromiseTypeDescription(
    extAttrs: js.Array[ExtendedAttribute],
    generic: Promise,
    idlType: js.Array[IDLTypeDescription],
    nullable: Boolean,
    parent: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription,
    union: `false`
  ): typingsSlinky.webidl2.mod.PromiseTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], generic = generic.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], union = union.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.PromiseTypeDescription]
  }
  
  @scala.inline
  def RecordTypeDescription(
    extAttrs: js.Array[ExtendedAttribute],
    generic: record,
    idlType: js.Tuple2[IDLTypeDescription, IDLTypeDescription],
    nullable: Boolean,
    parent: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription,
    union: `false`
  ): typingsSlinky.webidl2.mod.RecordTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], generic = generic.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], union = union.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.RecordTypeDescription]
  }
  
  @scala.inline
  def SequenceTypeDescription(
    extAttrs: js.Array[ExtendedAttribute],
    generic: sequence,
    idlType: js.Array[IDLTypeDescription],
    nullable: Boolean,
    parent: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription,
    union: `false`
  ): typingsSlinky.webidl2.mod.SequenceTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], generic = generic.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], union = union.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.SequenceTypeDescription]
  }
  
  @scala.inline
  def SingleTypeDescription(
    extAttrs: js.Array[ExtendedAttribute],
    generic: _empty,
    idlType: String,
    nullable: Boolean,
    parent: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription,
    union: `false`
  ): typingsSlinky.webidl2.mod.SingleTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], generic = generic.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], union = union.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.SingleTypeDescription]
  }
  
  @scala.inline
  def UnionTypeDescription(
    extAttrs: js.Array[ExtendedAttribute],
    generic: _empty,
    idlType: js.Array[IDLTypeDescription],
    nullable: Boolean,
    parent: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | typingsSlinky.webidl2.mod.UnionTypeDescription,
    union: `true`
  ): typingsSlinky.webidl2.mod.UnionTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], generic = generic.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], union = union.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.UnionTypeDescription]
  }
}
