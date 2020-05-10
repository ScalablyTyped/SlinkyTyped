package typingsSlinky.webidl2.mod

import typingsSlinky.webidl2.webidl2Strings.deleter
import typingsSlinky.webidl2.webidl2Strings.getter
import typingsSlinky.webidl2.webidl2Strings.operation
import typingsSlinky.webidl2.webidl2Strings.setter
import typingsSlinky.webidl2.webidl2Strings.static
import typingsSlinky.webidl2.webidl2Strings.stringifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationMemberType
  extends IDLInterfaceMemberType
     with IDLNamespaceMemberType {
  /** An array of arguments for the operation. */
  var arguments: js.Array[Argument] = js.native
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttribute] = js.native
  /** An IDL Type of what the operation returns. If a stringifier, may be absent. */
  var idlType: IDLTypeDescription | Null = js.native
  /** The name of the operation. If a stringifier, may be null. */
  var name: String | Null = js.native
  /** The container of this type. */
  var parent: InterfaceType | InterfaceMixinType | NamespaceType = js.native
  /** Special modifier if exists */
  var special: getter | setter | deleter | static | stringifier = js.native
  var `type`: operation = js.native
}

object OperationMemberType {
  @scala.inline
  def apply(
    arguments: js.Array[Argument],
    extAttrs: js.Array[ExtendedAttribute],
    parent: InterfaceType | InterfaceMixinType | NamespaceType,
    special: getter | setter | deleter | static | stringifier,
    `type`: operation
  ): OperationMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], special = special.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationMemberType]
  }
  @scala.inline
  implicit class OperationMemberTypeOps[Self <: OperationMemberType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArguments(value: js.Array[Argument]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtAttrs(value: js.Array[ExtendedAttribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extAttrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: InterfaceType | InterfaceMixinType | NamespaceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecial(value: getter | setter | deleter | static | stringifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("special")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: operation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdlType(value: IDLTypeDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idlType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdlTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idlType")(null)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(null)
        ret
    }
  }
  
}

