package typingsSlinky.tryghostContentApi

import typingsSlinky.tryghostContentApi.mod.Author
import typingsSlinky.tryghostContentApi.mod.Authors
import typingsSlinky.tryghostContentApi.mod.BrowseFunction
import typingsSlinky.tryghostContentApi.mod.Nullable
import typingsSlinky.tryghostContentApi.mod.Params
import typingsSlinky.tryghostContentApi.mod.ReadFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRead extends js.Object {
  @JSName("browse")
  var browse_Original: BrowseFunction[Authors] = js.native
  @JSName("read")
  var read_Original: ReadFunction[Author] = js.native
  def browse(): js.Promise[Authors] = js.native
  def browse(options: Params): js.Promise[Authors] = js.native
  def browse(options: Params, memberToken: Nullable[String]): js.Promise[Authors] = js.native
  def read(data: AnonId): js.Promise[Author] = js.native
  def read(data: AnonId, options: Params): js.Promise[Author] = js.native
  def read(data: AnonId, options: Params, memberToken: Nullable[String]): js.Promise[Author] = js.native
  def read(data: AnonSlug): js.Promise[Author] = js.native
  def read(data: AnonSlug, options: Params): js.Promise[Author] = js.native
  def read(data: AnonSlug, options: Params, memberToken: Nullable[String]): js.Promise[Author] = js.native
}

