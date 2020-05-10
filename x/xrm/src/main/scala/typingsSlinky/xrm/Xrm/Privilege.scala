package typingsSlinky.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a user attribute privilege.
  */
@js.native
trait Privilege extends js.Object {
  /**
    * True if the user can create.
    */
  var canCreate: Boolean = js.native
  /**
    * True if the user can read.
    */
  var canRead: Boolean = js.native
  /**
    * True if the user can update.
    */
  var canUpdate: Boolean = js.native
}

object Privilege {
  @scala.inline
  def apply(canCreate: Boolean, canRead: Boolean, canUpdate: Boolean): Privilege = {
    val __obj = js.Dynamic.literal(canCreate = canCreate.asInstanceOf[js.Any], canRead = canRead.asInstanceOf[js.Any], canUpdate = canUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Privilege]
  }
  @scala.inline
  implicit class PrivilegeOps[Self <: Privilege] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanCreate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canCreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanRead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canUpdate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

