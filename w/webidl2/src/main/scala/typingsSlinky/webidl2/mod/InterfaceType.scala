package typingsSlinky.webidl2.mod

import typingsSlinky.webidl2.webidl2Strings.`callback interface`
import typingsSlinky.webidl2.webidl2Strings.interface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterfaceType extends IDLRootType {
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttribute] = js.native
  /** A string giving the name of an interface this one inherits from, null otherwise. */
  var inheritance: String | Null = js.native
  /** An array of interface members (attributes, operations, etc.). Empty if there are none. */
  var members: js.Array[IDLInterfaceMemberType] = js.native
  /** The name of the interface */
  var name: String = js.native
  /** A boolean indicating whether it's a partial interface. */
  var partial: Boolean = js.native
  var `type`: interface | (`callback interface`) = js.native
}

object InterfaceType {
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    members: js.Array[IDLInterfaceMemberType],
    name: String,
    partial: Boolean,
    `type`: interface | (`callback interface`)
  ): InterfaceType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceType]
  }
  @scala.inline
  implicit class InterfaceTypeOps[Self <: InterfaceType] (val x: Self) extends AnyVal {
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
    def withMembers(value: js.Array[IDLInterfaceMemberType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: interface | (`callback interface`)): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInheritance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInheritanceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritance")(null)
        ret
    }
  }
  
}

