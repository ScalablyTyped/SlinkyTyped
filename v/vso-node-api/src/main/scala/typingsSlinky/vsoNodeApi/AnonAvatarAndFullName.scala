package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAvatarAndFullName extends js.Object {
  var avatarAndFullName: Double = js.native
  var avatarOnly: Double = js.native
  var fullName: Double = js.native
}

object AnonAvatarAndFullName {
  @scala.inline
  def apply(avatarAndFullName: Double, avatarOnly: Double, fullName: Double): AnonAvatarAndFullName = {
    val __obj = js.Dynamic.literal(avatarAndFullName = avatarAndFullName.asInstanceOf[js.Any], avatarOnly = avatarOnly.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAvatarAndFullName]
  }
  @scala.inline
  implicit class AnonAvatarAndFullNameOps[Self <: AnonAvatarAndFullName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvatarAndFullName(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatarAndFullName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvatarOnly(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatarOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullName(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

