package typingsSlinky.webidl2.mod

import typingsSlinky.webidl2.webidl2Booleans.`false`
import typingsSlinky.webidl2.webidl2Strings.FrozenArray
import typingsSlinky.webidl2.webidl2Strings.ObservableArray
import typingsSlinky.webidl2.webidl2Strings.Promise
import typingsSlinky.webidl2.webidl2Strings.record
import typingsSlinky.webidl2.webidl2Strings.sequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webidl2.mod.FrozenArrayTypeDescription
  - typingsSlinky.webidl2.mod.ObservableArrayTypeDescription
  - typingsSlinky.webidl2.mod.PromiseTypeDescription
  - typingsSlinky.webidl2.mod.RecordTypeDescription
  - typingsSlinky.webidl2.mod.SequenceTypeDescription
*/
trait GenericTypeDescription extends IDLTypeDescription
object GenericTypeDescription {
  
  @scala.inline
  def FrozenArrayTypeDescription(
    extAttrs: js.Array[ExtendedAttribute],
    generic: FrozenArray,
    idlType: js.Array[IDLTypeDescription],
    nullable: Boolean,
    parent: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription,
    union: `false`
  ): GenericTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], generic = generic.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], union = union.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericTypeDescription]
  }
  
  @scala.inline
  def ObservableArrayTypeDescription(
    extAttrs: js.Array[ExtendedAttribute],
    generic: ObservableArray,
    idlType: js.Array[IDLTypeDescription],
    nullable: Boolean,
    parent: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription,
    union: `false`
  ): GenericTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], generic = generic.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], union = union.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericTypeDescription]
  }
  
  @scala.inline
  def SequenceTypeDescription(
    extAttrs: js.Array[ExtendedAttribute],
    generic: sequence,
    idlType: js.Array[IDLTypeDescription],
    nullable: Boolean,
    parent: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription,
    union: `false`
  ): GenericTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], generic = generic.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], union = union.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericTypeDescription]
  }
  
  @scala.inline
  def RecordTypeDescription(
    extAttrs: js.Array[ExtendedAttribute],
    generic: record,
    idlType: js.Tuple2[IDLTypeDescription, IDLTypeDescription],
    nullable: Boolean,
    parent: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription,
    union: `false`
  ): GenericTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], generic = generic.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], union = union.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericTypeDescription]
  }
  
  @scala.inline
  def PromiseTypeDescription(
    extAttrs: js.Array[ExtendedAttribute],
    generic: Promise,
    idlType: js.Array[IDLTypeDescription],
    nullable: Boolean,
    parent: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription,
    union: `false`
  ): GenericTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], generic = generic.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], union = union.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericTypeDescription]
  }
}
