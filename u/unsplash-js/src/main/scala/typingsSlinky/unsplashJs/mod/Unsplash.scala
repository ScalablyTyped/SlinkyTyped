package typingsSlinky.unsplashJs.mod

import org.scalajs.dom.experimental.Response
import typingsSlinky.unsplashJs.AnonBody
import typingsSlinky.unsplashJs.mod.UnsplashApi.Auth
import typingsSlinky.unsplashJs.mod.UnsplashApi.Collections
import typingsSlinky.unsplashJs.mod.UnsplashApi.CurrentUser
import typingsSlinky.unsplashJs.mod.UnsplashApi.Photo
import typingsSlinky.unsplashJs.mod.UnsplashApi.Search
import typingsSlinky.unsplashJs.mod.UnsplashApi.Stats
import typingsSlinky.unsplashJs.mod.UnsplashApi.Users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Unsplash extends js.Object {
  var auth: Auth = js.native
  var collections: Collections = js.native
  var currentUser: CurrentUser = js.native
  var photos: Photo = js.native
  var search: Search = js.native
  var stats: Stats = js.native
  var users: Users = js.native
  def request(requestOptions: AnonBody): js.Promise[Response] = js.native
}

object Unsplash {
  @scala.inline
  def apply(
    auth: Auth,
    collections: Collections,
    currentUser: CurrentUser,
    photos: Photo,
    request: AnonBody => js.Promise[Response],
    search: Search,
    stats: Stats,
    users: Users
  ): Unsplash = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], collections = collections.asInstanceOf[js.Any], currentUser = currentUser.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], request = js.Any.fromFunction1(request), search = search.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[Unsplash]
  }
  @scala.inline
  implicit class UnsplashOps[Self <: Unsplash] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: Auth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollections(value: Collections): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentUser(value: CurrentUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhotos(value: Photo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: AnonBody => js.Promise[Response]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSearch(value: Search): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStats(value: Stats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsers(value: Users): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

