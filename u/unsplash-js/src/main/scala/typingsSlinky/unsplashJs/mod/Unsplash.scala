package typingsSlinky.unsplashJs.mod

import org.scalajs.dom.experimental.Response
import typingsSlinky.unsplashJs.anon.Body
import typingsSlinky.unsplashJs.mod.UnsplashApi.Auth
import typingsSlinky.unsplashJs.mod.UnsplashApi.Collections
import typingsSlinky.unsplashJs.mod.UnsplashApi.CurrentUser
import typingsSlinky.unsplashJs.mod.UnsplashApi.Photo
import typingsSlinky.unsplashJs.mod.UnsplashApi.Search
import typingsSlinky.unsplashJs.mod.UnsplashApi.Stats
import typingsSlinky.unsplashJs.mod.UnsplashApi.Users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Unsplash extends js.Object {
  
  var auth: Auth = js.native
  
  var collections: Collections = js.native
  
  var currentUser: CurrentUser = js.native
  
  var photos: Photo = js.native
  
  def request(requestOptions: Body): js.Promise[Response] = js.native
  
  var search: Search = js.native
  
  var stats: Stats = js.native
  
  var users: Users = js.native
}
object Unsplash {
  
  @scala.inline
  def apply(
    auth: Auth,
    collections: Collections,
    currentUser: CurrentUser,
    photos: Photo,
    request: Body => js.Promise[Response],
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuth(value: Auth): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollections(value: Collections): Self = this.set("collections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUser(value: CurrentUser): Self = this.set("currentUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotos(value: Photo): Self = this.set("photos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: Body => js.Promise[Response]): Self = this.set("request", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSearch(value: Search): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStats(value: Stats): Self = this.set("stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsers(value: Users): Self = this.set("users", value.asInstanceOf[js.Any])
  }
}
