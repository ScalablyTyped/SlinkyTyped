package typingsSlinky.unsplashJs.mod.UnsplashApi

import org.scalajs.dom.experimental.Response
import typingsSlinky.unsplashJs.anon.Bio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentUser extends js.Object {
  def profile(): js.Promise[Response]
  def updateProfile(options: Bio): js.Promise[Response]
}

object CurrentUser {
  @scala.inline
  def apply(profile: () => js.Promise[Response], updateProfile: Bio => js.Promise[Response]): CurrentUser = {
    val __obj = js.Dynamic.literal(profile = js.Any.fromFunction0(profile), updateProfile = js.Any.fromFunction1(updateProfile))
    __obj.asInstanceOf[CurrentUser]
  }
}

