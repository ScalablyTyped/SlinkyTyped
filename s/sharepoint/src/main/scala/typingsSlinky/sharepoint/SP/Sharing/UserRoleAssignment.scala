package typingsSlinky.sharepoint.SP.Sharing

import typingsSlinky.sharepoint.SP.ClientValueObject
import typingsSlinky.sharepoint.SP.SerializationContext
import typingsSlinky.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserRoleAssignment extends ClientValueObject {
  def get_role(): Role = js.native
  def get_userId(): String = js.native
  def set_role(value: Role): Unit = js.native
  def set_userId(value: String): Unit = js.native
}

object UserRoleAssignment {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_role: () => Role,
    get_typeId: () => String,
    get_userId: () => String,
    set_role: Role => Unit,
    set_userId: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): UserRoleAssignment = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_role = js.Any.fromFunction0(get_role), get_typeId = js.Any.fromFunction0(get_typeId), get_userId = js.Any.fromFunction0(get_userId), set_role = js.Any.fromFunction1(set_role), set_userId = js.Any.fromFunction1(set_userId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[UserRoleAssignment]
  }
  @scala.inline
  implicit class UserRoleAssignmentOps[Self <: UserRoleAssignment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_role(value: () => Role): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_role")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_userId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_userId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet_role(value: Role => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_role")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_userId(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_userId")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

