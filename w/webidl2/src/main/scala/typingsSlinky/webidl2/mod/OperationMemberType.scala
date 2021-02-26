package typingsSlinky.webidl2.mod

import typingsSlinky.webidl2.webidl2Strings.deleter
import typingsSlinky.webidl2.webidl2Strings.getter
import typingsSlinky.webidl2.webidl2Strings.operation
import typingsSlinky.webidl2.webidl2Strings.setter
import typingsSlinky.webidl2.webidl2Strings.static
import typingsSlinky.webidl2.webidl2Strings.stringifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationMemberType
  extends AbstractBase
     with IDLCallbackInterfaceMemberType
     with IDLInterfaceMemberType
     with IDLInterfaceMixinMemberType
     with IDLNamespaceMemberType {
  
  /** An array of arguments for the operation. */
  var arguments: js.Array[Argument] = js.native
  
  /** An IDL Type of what the operation returns. If a stringifier, may be absent. */
  var idlType: IDLTypeDescription | Null = js.native
  
  /** The name of the operation. If a stringifier, may be null. */
  var name: String | Null = js.native
  
  @JSName("parent")
  var parent_OperationMemberType: CallbackInterfaceType | InterfaceMixinType | InterfaceType | NamespaceType = js.native
  
  /** Special modifier if exists */
  var special: getter | setter | deleter | static | stringifier | Null = js.native
  
  @JSName("type")
  var type_OperationMemberType: operation = js.native
}
object OperationMemberType {
  
  @scala.inline
  def apply(
    arguments: js.Array[Argument],
    extAttrs: js.Array[ExtendedAttribute],
    parent: CallbackInterfaceType | InterfaceMixinType | InterfaceType | NamespaceType,
    `type`: operation
  ): OperationMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationMemberType]
  }
  
  @scala.inline
  implicit class OperationMemberTypeMutableBuilder[Self <: OperationMemberType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: js.Array[Argument]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsVarargs(value: Argument*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    @scala.inline
    def setIdlType(value: IDLTypeDescription): Self = StObject.set(x, "idlType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdlTypeNull: Self = StObject.set(x, "idlType", null)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setParent(value: CallbackInterfaceType | InterfaceMixinType | InterfaceType | NamespaceType): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecial(value: getter | setter | deleter | static | stringifier): Self = StObject.set(x, "special", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecialNull: Self = StObject.set(x, "special", null)
    
    @scala.inline
    def setType(value: operation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
