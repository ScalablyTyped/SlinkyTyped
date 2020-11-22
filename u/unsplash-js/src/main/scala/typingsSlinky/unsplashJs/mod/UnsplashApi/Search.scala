package typingsSlinky.unsplashJs.mod.UnsplashApi

import org.scalajs.dom.experimental.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Search extends js.Object {
  
  def collections(keyword: String): js.Promise[Response] = js.native
  def collections(keyword: String, page: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[Response] = js.native
  def collections(keyword: String, page: Double): js.Promise[Response] = js.native
  def collections(keyword: String, page: Double, perPage: Double): js.Promise[Response] = js.native
  
  def photos(keyword: String): js.Promise[Response] = js.native
  def photos(
    keyword: String,
    page: js.UndefOr[scala.Nothing],
    perPage: js.UndefOr[scala.Nothing],
    filters: typingsSlinky.unsplashJs.anon.Collections
  ): js.Promise[Response] = js.native
  def photos(keyword: String, page: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[Response] = js.native
  def photos(
    keyword: String,
    page: js.UndefOr[scala.Nothing],
    perPage: Double,
    filters: typingsSlinky.unsplashJs.anon.Collections
  ): js.Promise[Response] = js.native
  def photos(keyword: String, page: Double): js.Promise[Response] = js.native
  def photos(
    keyword: String,
    page: Double,
    perPage: js.UndefOr[scala.Nothing],
    filters: typingsSlinky.unsplashJs.anon.Collections
  ): js.Promise[Response] = js.native
  def photos(keyword: String, page: Double, perPage: Double): js.Promise[Response] = js.native
  def photos(keyword: String, page: Double, perPage: Double, filters: typingsSlinky.unsplashJs.anon.Collections): js.Promise[Response] = js.native
  
  def users(keyword: String): js.Promise[Response] = js.native
  def users(keyword: String, page: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[Response] = js.native
  def users(keyword: String, page: Double): js.Promise[Response] = js.native
  def users(keyword: String, page: Double, perPage: Double): js.Promise[Response] = js.native
}
