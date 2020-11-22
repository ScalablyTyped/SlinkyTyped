package typingsSlinky.unsplashJs.mod.UnsplashApi

import org.scalajs.dom.experimental.Response
import typingsSlinky.unsplashJs.anon.OrientationOrientation
import typingsSlinky.unsplashJs.mod.PhotoOrderBy
import typingsSlinky.unsplashJs.unsplashJsStrings.days
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Users extends js.Object {
  
  def collections(username: String): js.Promise[Response] = js.native
  def collections(
    username: String,
    page: js.UndefOr[scala.Nothing],
    perPage: js.UndefOr[scala.Nothing],
    orderBy: String
  ): js.Promise[Response] = js.native
  def collections(username: String, page: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[Response] = js.native
  def collections(username: String, page: js.UndefOr[scala.Nothing], perPage: Double, orderBy: String): js.Promise[Response] = js.native
  def collections(username: String, page: Double): js.Promise[Response] = js.native
  def collections(username: String, page: Double, perPage: js.UndefOr[scala.Nothing], orderBy: String): js.Promise[Response] = js.native
  def collections(username: String, page: Double, perPage: Double): js.Promise[Response] = js.native
  def collections(username: String, page: Double, perPage: Double, orderBy: String): js.Promise[Response] = js.native
  
  def likes(username: String): js.Promise[Response] = js.native
  def likes(
    username: String,
    page: js.UndefOr[scala.Nothing],
    perPage: js.UndefOr[scala.Nothing],
    orderBy: js.UndefOr[scala.Nothing],
    options: OrientationOrientation
  ): js.Promise[Response] = js.native
  def likes(
    username: String,
    page: js.UndefOr[scala.Nothing],
    perPage: js.UndefOr[scala.Nothing],
    orderBy: PhotoOrderBy
  ): js.Promise[Response] = js.native
  def likes(
    username: String,
    page: js.UndefOr[scala.Nothing],
    perPage: js.UndefOr[scala.Nothing],
    orderBy: PhotoOrderBy,
    options: OrientationOrientation
  ): js.Promise[Response] = js.native
  def likes(username: String, page: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[Response] = js.native
  def likes(
    username: String,
    page: js.UndefOr[scala.Nothing],
    perPage: Double,
    orderBy: js.UndefOr[scala.Nothing],
    options: OrientationOrientation
  ): js.Promise[Response] = js.native
  def likes(username: String, page: js.UndefOr[scala.Nothing], perPage: Double, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
  def likes(
    username: String,
    page: js.UndefOr[scala.Nothing],
    perPage: Double,
    orderBy: PhotoOrderBy,
    options: OrientationOrientation
  ): js.Promise[Response] = js.native
  def likes(username: String, page: Double): js.Promise[Response] = js.native
  def likes(
    username: String,
    page: Double,
    perPage: js.UndefOr[scala.Nothing],
    orderBy: js.UndefOr[scala.Nothing],
    options: OrientationOrientation
  ): js.Promise[Response] = js.native
  def likes(username: String, page: Double, perPage: js.UndefOr[scala.Nothing], orderBy: PhotoOrderBy): js.Promise[Response] = js.native
  def likes(
    username: String,
    page: Double,
    perPage: js.UndefOr[scala.Nothing],
    orderBy: PhotoOrderBy,
    options: OrientationOrientation
  ): js.Promise[Response] = js.native
  def likes(username: String, page: Double, perPage: Double): js.Promise[Response] = js.native
  def likes(
    username: String,
    page: Double,
    perPage: Double,
    orderBy: js.UndefOr[scala.Nothing],
    options: OrientationOrientation
  ): js.Promise[Response] = js.native
  def likes(username: String, page: Double, perPage: Double, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
  def likes(
    username: String,
    page: Double,
    perPage: Double,
    orderBy: PhotoOrderBy,
    options: OrientationOrientation
  ): js.Promise[Response] = js.native
  
  def photos(username: String): js.Promise[Response] = js.native
  def photos(
    username: String,
    page: js.UndefOr[scala.Nothing],
    perPage: js.UndefOr[scala.Nothing],
    orderBy: js.UndefOr[scala.Nothing],
    options: typingsSlinky.unsplashJs.anon.Stats
  ): js.Promise[Response] = js.native
  def photos(
    username: String,
    page: js.UndefOr[scala.Nothing],
    perPage: js.UndefOr[scala.Nothing],
    orderBy: PhotoOrderBy
  ): js.Promise[Response] = js.native
  def photos(
    username: String,
    page: js.UndefOr[scala.Nothing],
    perPage: js.UndefOr[scala.Nothing],
    orderBy: PhotoOrderBy,
    options: typingsSlinky.unsplashJs.anon.Stats
  ): js.Promise[Response] = js.native
  def photos(username: String, page: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[Response] = js.native
  def photos(
    username: String,
    page: js.UndefOr[scala.Nothing],
    perPage: Double,
    orderBy: js.UndefOr[scala.Nothing],
    options: typingsSlinky.unsplashJs.anon.Stats
  ): js.Promise[Response] = js.native
  def photos(username: String, page: js.UndefOr[scala.Nothing], perPage: Double, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
  def photos(
    username: String,
    page: js.UndefOr[scala.Nothing],
    perPage: Double,
    orderBy: PhotoOrderBy,
    options: typingsSlinky.unsplashJs.anon.Stats
  ): js.Promise[Response] = js.native
  def photos(username: String, page: Double): js.Promise[Response] = js.native
  def photos(
    username: String,
    page: Double,
    perPage: js.UndefOr[scala.Nothing],
    orderBy: js.UndefOr[scala.Nothing],
    options: typingsSlinky.unsplashJs.anon.Stats
  ): js.Promise[Response] = js.native
  def photos(username: String, page: Double, perPage: js.UndefOr[scala.Nothing], orderBy: PhotoOrderBy): js.Promise[Response] = js.native
  def photos(
    username: String,
    page: Double,
    perPage: js.UndefOr[scala.Nothing],
    orderBy: PhotoOrderBy,
    options: typingsSlinky.unsplashJs.anon.Stats
  ): js.Promise[Response] = js.native
  def photos(username: String, page: Double, perPage: Double): js.Promise[Response] = js.native
  def photos(
    username: String,
    page: Double,
    perPage: Double,
    orderBy: js.UndefOr[scala.Nothing],
    options: typingsSlinky.unsplashJs.anon.Stats
  ): js.Promise[Response] = js.native
  def photos(username: String, page: Double, perPage: Double, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
  def photos(
    username: String,
    page: Double,
    perPage: Double,
    orderBy: PhotoOrderBy,
    options: typingsSlinky.unsplashJs.anon.Stats
  ): js.Promise[Response] = js.native
  
  def profile(username: String): js.Promise[Response] = js.native
  
  def statistics(username: String): js.Promise[Response] = js.native
  def statistics(username: String, resolution: js.UndefOr[scala.Nothing], quantity: Double): js.Promise[Response] = js.native
  @JSName("statistics")
  def statistics_days(username: String, resolution: days): js.Promise[Response] = js.native
  @JSName("statistics")
  def statistics_days(username: String, resolution: days, quantity: Double): js.Promise[Response] = js.native
}
