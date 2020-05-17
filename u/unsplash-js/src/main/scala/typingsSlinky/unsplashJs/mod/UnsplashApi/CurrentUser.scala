package typingsSlinky.unsplashJs.mod.UnsplashApi

import org.scalajs.dom.experimental.Response
import typingsSlinky.unsplashJs.anon.Bio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentUser extends js.Object {
  def profile(): js.Promise[Response] = js.native
  def updateProfile(options: Bio): js.Promise[Response] = js.native
}

object CurrentUser {
  @scala.inline
  def apply(profile: () => js.Promise[Response], updateProfile: Bio => js.Promise[Response]): CurrentUser = {
    val __obj = js.Dynamic.literal(profile = js.Any.fromFunction0(profile), updateProfile = js.Any.fromFunction1(updateProfile))
    __obj.asInstanceOf[CurrentUser]
  }
  @scala.inline
  implicit class CurrentUserOps[Self <: CurrentUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProfile(value: () => js.Promise[Response]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdateProfile(value: Bio => js.Promise[Response]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateProfile")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

