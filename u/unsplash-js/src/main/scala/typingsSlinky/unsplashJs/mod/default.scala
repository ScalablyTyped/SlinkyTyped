package typingsSlinky.unsplashJs.mod

import org.scalajs.dom.experimental.Response
import typingsSlinky.unsplashJs.AnonAccessKey
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

@JSImport("unsplash-js", JSImport.Default)
@js.native
class default protected () extends Unsplash {
  def this(options: AnonAccessKey) = this()
  /* CompleteClass */
  override var auth: Auth = js.native
  /* CompleteClass */
  override var collections: Collections = js.native
  /* CompleteClass */
  override var currentUser: CurrentUser = js.native
  /* CompleteClass */
  override var photos: Photo = js.native
  /* CompleteClass */
  override var search: Search = js.native
  /* CompleteClass */
  override var stats: Stats = js.native
  /* CompleteClass */
  override var users: Users = js.native
  /* CompleteClass */
  override def request(requestOptions: AnonBody): js.Promise[Response] = js.native
}

