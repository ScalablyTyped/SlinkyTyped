package typingsSlinky.webidl2.mod

import typingsSlinky.webidl2.webidl2Booleans.`false`
import typingsSlinky.webidl2.webidl2Strings.attribute
import typingsSlinky.webidl2.webidl2Strings.const
import typingsSlinky.webidl2.webidl2Strings.constructor
import typingsSlinky.webidl2.webidl2Strings.iterable
import typingsSlinky.webidl2.webidl2Strings.maplike
import typingsSlinky.webidl2.webidl2Strings.operation
import typingsSlinky.webidl2.webidl2Strings.setlike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webidl2.mod.AttributeMemberType
  - typingsSlinky.webidl2.mod.ConstantMemberType
  - typingsSlinky.webidl2.mod.ConstructorMemberType
  - typingsSlinky.webidl2.mod.DeclarationMemberType
  - typingsSlinky.webidl2.mod.OperationMemberType
*/
trait IDLInterfaceMemberType extends StObject
object IDLInterfaceMemberType {
  
  @scala.inline
  def AttributeMemberType(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    inherit: Boolean,
    name: String,
    parent: InterfaceMixinType | InterfaceType | NamespaceType,
    readonly: Boolean,
    `type`: attribute
  ): typingsSlinky.webidl2.mod.AttributeMemberType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], inherit = inherit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.AttributeMemberType]
  }
  
  @scala.inline
  def ConstantMemberType(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    name: String,
    nullable: Boolean,
    parent: CallbackInterfaceType | InterfaceMixinType | InterfaceType,
    `type`: const,
    value: ValueDescription
  ): typingsSlinky.webidl2.mod.ConstantMemberType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.ConstantMemberType]
  }
  
  @scala.inline
  def ConstructorMemberType(
    arguments: js.Array[Argument],
    extAttrs: js.Array[ExtendedAttribute],
    parent: InterfaceType,
    `type`: constructor
  ): typingsSlinky.webidl2.mod.ConstructorMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.ConstructorMemberType]
  }
  
  @scala.inline
  def IterableDeclarationMemberType(
    arguments: js.Array[Argument],
    async: Boolean,
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Array[IDLTypeDescription] | (js.Tuple2[IDLTypeDescription, IDLTypeDescription]),
    parent: InterfaceMixinType | InterfaceType,
    readonly: `false`,
    `type`: iterable
  ): typingsSlinky.webidl2.mod.IterableDeclarationMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], async = async.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.IterableDeclarationMemberType]
  }
  
  @scala.inline
  def MaplikeDeclarationMemberType(
    arguments: js.Array[js.Any],
    async: `false`,
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Tuple2[IDLTypeDescription, IDLTypeDescription],
    parent: InterfaceMixinType | InterfaceType,
    readonly: Boolean,
    `type`: maplike
  ): typingsSlinky.webidl2.mod.MaplikeDeclarationMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], async = async.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.MaplikeDeclarationMemberType]
  }
  
  @scala.inline
  def OperationMemberType(
    arguments: js.Array[Argument],
    extAttrs: js.Array[ExtendedAttribute],
    parent: CallbackInterfaceType | InterfaceMixinType | InterfaceType | NamespaceType,
    `type`: operation
  ): typingsSlinky.webidl2.mod.OperationMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.OperationMemberType]
  }
  
  @scala.inline
  def SetlikeDeclarationMemberType(
    arguments: js.Array[js.Any],
    async: `false`,
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Array[IDLTypeDescription],
    parent: InterfaceMixinType | InterfaceType,
    readonly: Boolean,
    `type`: setlike
  ): typingsSlinky.webidl2.mod.SetlikeDeclarationMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], async = async.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.SetlikeDeclarationMemberType]
  }
}
