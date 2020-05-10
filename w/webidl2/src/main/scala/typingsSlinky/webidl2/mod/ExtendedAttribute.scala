package typingsSlinky.webidl2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendedAttribute extends js.Object {
  /** If the extended attribute takes arguments or if its right-hand side does they are listed here. */
  var arguments: js.Array[Argument] = js.native
  /** The extended attribute's name. */
  var name: String = js.native
  /** The container of this extended attribute. */
  var parent: IDLRootType | FieldType | IDLInterfaceMemberType = js.native
  /** If there is a right-hand side, this will capture its type and value. */
  var rhs: ExtendedAttributeRightHandSide | Null = js.native
}

object ExtendedAttribute {
  @scala.inline
  def apply(
    arguments: js.Array[Argument],
    name: String,
    parent: IDLRootType | FieldType | IDLInterfaceMemberType
  ): ExtendedAttribute = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttribute]
  }
  @scala.inline
  implicit class ExtendedAttributeOps[Self <: ExtendedAttribute] (val x: Self) extends AnyVal {
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: IDLRootType | FieldType | IDLInterfaceMemberType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRhs(value: ExtendedAttributeRightHandSide): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rhs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRhsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rhs")(null)
        ret
    }
  }
  
}

