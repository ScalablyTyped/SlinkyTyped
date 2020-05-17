package typingsSlinky.smartFoxServer.SFS2X.Entities.Variables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SFSRoomVariable extends SFSUserVariable {
  /** @type {boolean} Indicates whether this Room Variable is persistent or not. */
  var isPersistent: Boolean = js.native
  /** @type {boolean} Indicates whether this Room Variable is private or not. */
  var isPrivate: Boolean = js.native
}

object SFSRoomVariable {
  @scala.inline
  def apply(
    getTypeName: Double => String,
    isNull: () => Boolean,
    isPersistent: Boolean,
    isPrivate: Boolean,
    name: String,
    value: Double
  ): SFSRoomVariable = {
    val __obj = js.Dynamic.literal(getTypeName = js.Any.fromFunction1(getTypeName), isNull = js.Any.fromFunction0(isNull), isPersistent = isPersistent.asInstanceOf[js.Any], isPrivate = isPrivate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFSRoomVariable]
  }
  @scala.inline
  implicit class SFSRoomVariableOps[Self <: SFSRoomVariable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsPersistent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPersistent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPrivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrivate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

