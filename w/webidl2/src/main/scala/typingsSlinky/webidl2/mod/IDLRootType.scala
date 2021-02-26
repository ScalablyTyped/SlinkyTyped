package typingsSlinky.webidl2.mod

import typingsSlinky.webidl2.anon.Parent
import typingsSlinky.webidl2.webidl2Strings.`callback interface`
import typingsSlinky.webidl2.webidl2Strings.`interface mixin`
import typingsSlinky.webidl2.webidl2Strings.callback
import typingsSlinky.webidl2.webidl2Strings.dictionary
import typingsSlinky.webidl2.webidl2Strings.enum
import typingsSlinky.webidl2.webidl2Strings.includes
import typingsSlinky.webidl2.webidl2Strings.interface
import typingsSlinky.webidl2.webidl2Strings.namespace
import typingsSlinky.webidl2.webidl2Strings.typedef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webidl2.mod.CallbackType
  - typingsSlinky.webidl2.mod.CallbackInterfaceType
  - typingsSlinky.webidl2.mod.DictionaryType
  - typingsSlinky.webidl2.mod.EnumType
  - typingsSlinky.webidl2.mod.IncludesType
  - typingsSlinky.webidl2.mod.InterfaceMixinType
  - typingsSlinky.webidl2.mod.InterfaceType
  - typingsSlinky.webidl2.mod.NamespaceType
  - typingsSlinky.webidl2.mod.TypedefType
*/
trait IDLRootType extends StObject
object IDLRootType {
  
  @scala.inline
  def CallbackInterfaceType(
    extAttrs: js.Array[ExtendedAttribute],
    inheritance: Null,
    members: js.Array[IDLCallbackInterfaceMemberType],
    name: String,
    parent: Null,
    partial: Boolean,
    `type`: `callback interface`
  ): typingsSlinky.webidl2.mod.CallbackInterfaceType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], inheritance = inheritance.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.CallbackInterfaceType]
  }
  
  @scala.inline
  def CallbackType(
    arguments: js.Array[Argument],
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    name: String,
    parent: Null,
    `type`: callback
  ): typingsSlinky.webidl2.mod.CallbackType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.CallbackType]
  }
  
  @scala.inline
  def DictionaryType(
    extAttrs: js.Array[ExtendedAttribute],
    members: js.Array[DictionaryMemberType],
    name: String,
    parent: Null,
    partial: Boolean,
    `type`: dictionary
  ): typingsSlinky.webidl2.mod.DictionaryType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.DictionaryType]
  }
  
  @scala.inline
  def EnumType(
    extAttrs: js.Array[ExtendedAttribute],
    name: String,
    parent: Null,
    `type`: enum,
    values: js.Array[Parent]
  ): typingsSlinky.webidl2.mod.EnumType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.EnumType]
  }
  
  @scala.inline
  def IncludesType(
    extAttrs: js.Array[ExtendedAttribute],
    includes: String,
    parent: Null,
    target: String,
    `type`: includes
  ): typingsSlinky.webidl2.mod.IncludesType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.IncludesType]
  }
  
  @scala.inline
  def InterfaceMixinType(
    extAttrs: js.Array[ExtendedAttribute],
    inheritance: Null,
    members: js.Array[IDLInterfaceMixinMemberType],
    name: String,
    parent: Null,
    partial: Boolean,
    `type`: `interface mixin`
  ): typingsSlinky.webidl2.mod.InterfaceMixinType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], inheritance = inheritance.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.InterfaceMixinType]
  }
  
  @scala.inline
  def InterfaceType(
    extAttrs: js.Array[ExtendedAttribute],
    members: js.Array[IDLInterfaceMemberType],
    name: String,
    parent: Null,
    partial: Boolean,
    `type`: interface
  ): typingsSlinky.webidl2.mod.InterfaceType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.InterfaceType]
  }
  
  @scala.inline
  def NamespaceType(
    extAttrs: js.Array[ExtendedAttribute],
    inheritance: Null,
    members: js.Array[IDLNamespaceMemberType],
    name: String,
    parent: Null,
    partial: Boolean,
    `type`: namespace
  ): typingsSlinky.webidl2.mod.NamespaceType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], inheritance = inheritance.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.NamespaceType]
  }
  
  @scala.inline
  def TypedefType(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    name: String,
    parent: Null,
    `type`: typedef
  ): typingsSlinky.webidl2.mod.TypedefType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.TypedefType]
  }
}
