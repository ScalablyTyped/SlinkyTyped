package typingsSlinky.servicenow.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlideUser extends js.Object {
  def getCompanyID(): String = js.native
  def getDisplayName(): String = js.native
  def getID(): String = js.native
  def getName(): String = js.native
  def getPreference(name: String): String = js.native
  def hasRole(role: String): Boolean = js.native
  def isMemberOf(group: String): Boolean = js.native
  def savePreference(name: String, value: String): Unit = js.native
}

object GlideUser {
  @scala.inline
  def apply(
    getCompanyID: () => String,
    getDisplayName: () => String,
    getID: () => String,
    getName: () => String,
    getPreference: String => String,
    hasRole: String => Boolean,
    isMemberOf: String => Boolean,
    savePreference: (String, String) => Unit
  ): GlideUser = {
    val __obj = js.Dynamic.literal(getCompanyID = js.Any.fromFunction0(getCompanyID), getDisplayName = js.Any.fromFunction0(getDisplayName), getID = js.Any.fromFunction0(getID), getName = js.Any.fromFunction0(getName), getPreference = js.Any.fromFunction1(getPreference), hasRole = js.Any.fromFunction1(hasRole), isMemberOf = js.Any.fromFunction1(isMemberOf), savePreference = js.Any.fromFunction2(savePreference))
    __obj.asInstanceOf[GlideUser]
  }
  @scala.inline
  implicit class GlideUserOps[Self <: GlideUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCompanyID(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCompanyID")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDisplayName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisplayName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetID(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getID")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPreference(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPreference")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasRole(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasRole")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsMemberOf(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMemberOf")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSavePreference(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savePreference")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

