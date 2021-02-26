package typingsSlinky.webidl2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractTypeDescription extends AbstractBase {
  
  /** Boolean indicating whether this is nullable or not. */
  var nullable: Boolean = js.native
  
  /** The container of this type. */
  @JSName("parent")
  var parent_AbstractTypeDescription: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription = js.native
}
object AbstractTypeDescription {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    nullable: Boolean,
    parent: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription
  ): AbstractTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractTypeDescription]
  }
  
  @scala.inline
  implicit class AbstractTypeDescriptionMutableBuilder[Self <: AbstractTypeDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(
      value: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription
    ): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
