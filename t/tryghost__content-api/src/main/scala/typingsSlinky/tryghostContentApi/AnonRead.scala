package typingsSlinky.tryghostContentApi

import typingsSlinky.tryghostContentApi.mod.Author
import typingsSlinky.tryghostContentApi.mod.AuthorsObject
import typingsSlinky.tryghostContentApi.mod.BrowseFunction
import typingsSlinky.tryghostContentApi.mod.GhostData
import typingsSlinky.tryghostContentApi.mod.Nullable
import typingsSlinky.tryghostContentApi.mod.Params
import typingsSlinky.tryghostContentApi.mod.ReadFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRead extends js.Object {
  @JSName("browse")
  var browse_Original: BrowseFunction[AuthorsObject] = js.native
  @JSName("read")
  var read_Original: ReadFunction[Author] = js.native
  def browse(): js.Promise[AuthorsObject] = js.native
  def browse(options: Params): js.Promise[AuthorsObject] = js.native
  def browse(options: Params, memberToken: Nullable[String]): js.Promise[AuthorsObject] = js.native
  def read(data: GhostData): js.Promise[Author] = js.native
  def read(data: GhostData, options: Params): js.Promise[Author] = js.native
  def read(data: GhostData, options: Params, memberToken: Nullable[String]): js.Promise[Author] = js.native
}

