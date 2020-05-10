package typingsSlinky.webidl2.mod

import typingsSlinky.webidl2.webidl2Strings.attribute
import typingsSlinky.webidl2.webidl2Strings.const
import typingsSlinky.webidl2.webidl2Strings.constructor
import typingsSlinky.webidl2.webidl2Strings.deleter
import typingsSlinky.webidl2.webidl2Strings.getter
import typingsSlinky.webidl2.webidl2Strings.iterable
import typingsSlinky.webidl2.webidl2Strings.maplike
import typingsSlinky.webidl2.webidl2Strings.operation
import typingsSlinky.webidl2.webidl2Strings.setlike
import typingsSlinky.webidl2.webidl2Strings.setter
import typingsSlinky.webidl2.webidl2Strings.static
import typingsSlinky.webidl2.webidl2Strings.stringifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webidl2.mod.OperationMemberType
  - typingsSlinky.webidl2.mod.ConstructorMemberType
  - typingsSlinky.webidl2.mod.AttributeMemberType
  - typingsSlinky.webidl2.mod.ConstantMemberType
  - typingsSlinky.webidl2.mod.DeclarationMemberType
*/
trait IDLInterfaceMemberType extends js.Object

object IDLInterfaceMemberType {
  @scala.inline
  def ConstructorMemberType(
    arguments: js.Array[Argument],
    extAttrs: js.Array[ExtendedAttribute],
    parent: InterfaceType,
    `type`: constructor
  ): IDLInterfaceMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDLInterfaceMemberType]
  }
  @scala.inline
  def AttributeMemberType(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    inherit: Boolean,
    name: String,
    parent: InterfaceType | InterfaceMixinType | NamespaceType,
    readonly: Boolean,
    special: static | stringifier,
    `type`: attribute
  ): IDLInterfaceMemberType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], inherit = inherit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], special = special.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDLInterfaceMemberType]
  }
  @scala.inline
  def DeclarationMemberType(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Array[IDLTypeDescription],
    readonly: Boolean,
    `type`: iterable | setlike | maplike
  ): IDLInterfaceMemberType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDLInterfaceMemberType]
  }
  @scala.inline
  def ConstantMemberType(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    name: String,
    nullable: Boolean,
    parent: InterfaceType | InterfaceMixinType,
    `type`: const,
    value: ValueDescription
  ): IDLInterfaceMemberType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDLInterfaceMemberType]
  }
  @scala.inline
  def OperationMemberType(
    arguments: js.Array[Argument],
    extAttrs: js.Array[ExtendedAttribute],
    parent: InterfaceType | InterfaceMixinType | NamespaceType,
    special: getter | setter | deleter | static | stringifier,
    `type`: operation
  ): IDLInterfaceMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], special = special.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDLInterfaceMemberType]
  }
}

