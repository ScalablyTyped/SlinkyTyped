package typingsSlinky.webidl2.mod

import typingsSlinky.webidl2.webidl2Strings.attribute
import typingsSlinky.webidl2.webidl2Strings.static
import typingsSlinky.webidl2.webidl2Strings.stringifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeMemberType
  extends IDLInterfaceMemberType
     with IDLNamespaceMemberType {
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttribute] = js.native
  /** An IDL Type for the attribute. */
  var idlType: IDLTypeDescription = js.native
  /** True if it's an inherit attribute. */
  var inherit: Boolean = js.native
  /** The attribute's name. */
  var name: String = js.native
  /** The container of this type. */
  var parent: InterfaceType | InterfaceMixinType | NamespaceType = js.native
  /** True if it's a read-only attribute. */
  var readonly: Boolean = js.native
  /** Special modifier if exists */
  var special: static | stringifier = js.native
  var `type`: attribute = js.native
}

object AttributeMemberType {
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    inherit: Boolean,
    name: String,
    parent: InterfaceType | InterfaceMixinType | NamespaceType,
    readonly: Boolean,
    special: static | stringifier,
    `type`: attribute
  ): AttributeMemberType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], inherit = inherit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], special = special.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeMemberType]
  }
  @scala.inline
  implicit class AttributeMemberTypeOps[Self <: AttributeMemberType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtAttrs(value: js.Array[ExtendedAttribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extAttrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdlType(value: IDLTypeDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idlType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInherit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: InterfaceType | InterfaceMixinType | NamespaceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadonly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecial(value: static | stringifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("special")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: attribute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

