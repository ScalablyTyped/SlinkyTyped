package typingsSlinky.tryghostContentApi.anon

import typingsSlinky.tryghostContentApi.mod.BrowseFunction
import typingsSlinky.tryghostContentApi.mod.Nullable
import typingsSlinky.tryghostContentApi.mod.Params
import typingsSlinky.tryghostContentApi.mod.PostOrPage
import typingsSlinky.tryghostContentApi.mod.PostsOrPages
import typingsSlinky.tryghostContentApi.mod.ReadFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Browse extends js.Object {
  @JSName("browse")
  var browse_Original: BrowseFunction[PostsOrPages] = js.native
  @JSName("read")
  var read_Original: ReadFunction[PostOrPage] = js.native
  def browse(): js.Promise[PostsOrPages] = js.native
  def browse(options: js.UndefOr[scala.Nothing], memberToken: Nullable[String]): js.Promise[PostsOrPages] = js.native
  def browse(options: Params): js.Promise[PostsOrPages] = js.native
  def browse(options: Params, memberToken: Nullable[String]): js.Promise[PostsOrPages] = js.native
  def read(data: Id): js.Promise[PostOrPage] = js.native
  def read(data: Id, options: js.UndefOr[scala.Nothing], memberToken: Nullable[String]): js.Promise[PostOrPage] = js.native
  def read(data: Id, options: Params): js.Promise[PostOrPage] = js.native
  def read(data: Id, options: Params, memberToken: Nullable[String]): js.Promise[PostOrPage] = js.native
  def read(data: Slug): js.Promise[PostOrPage] = js.native
  def read(data: Slug, options: js.UndefOr[scala.Nothing], memberToken: Nullable[String]): js.Promise[PostOrPage] = js.native
  def read(data: Slug, options: Params): js.Promise[PostOrPage] = js.native
  def read(data: Slug, options: Params, memberToken: Nullable[String]): js.Promise[PostOrPage] = js.native
}

