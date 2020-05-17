package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvatarAndFullName extends js.Object {
  var avatarAndFullName: scala.Double = js.native
  var avatarOnly: scala.Double = js.native
  var fullName: scala.Double = js.native
}

object AvatarAndFullName {
  @scala.inline
  def apply(avatarAndFullName: scala.Double, avatarOnly: scala.Double, fullName: scala.Double): AvatarAndFullName = {
    val __obj = js.Dynamic.literal(avatarAndFullName = avatarAndFullName.asInstanceOf[js.Any], avatarOnly = avatarOnly.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarAndFullName]
  }
  @scala.inline
  implicit class AvatarAndFullNameOps[Self <: AvatarAndFullName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvatarAndFullName(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatarAndFullName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvatarOnly(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatarOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullName(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

