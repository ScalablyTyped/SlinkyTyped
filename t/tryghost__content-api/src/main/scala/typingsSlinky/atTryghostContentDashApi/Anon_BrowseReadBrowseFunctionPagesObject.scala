package typingsSlinky.atTryghostContentDashApi

import typingsSlinky.atTryghostContentDashApi.atTryghostContentDashApiMod.BrowseFunction
import typingsSlinky.atTryghostContentDashApi.atTryghostContentDashApiMod.GhostData
import typingsSlinky.atTryghostContentDashApi.atTryghostContentDashApiMod.Nullable
import typingsSlinky.atTryghostContentDashApi.atTryghostContentDashApiMod.PagesObject
import typingsSlinky.atTryghostContentDashApi.atTryghostContentDashApiMod.Params
import typingsSlinky.atTryghostContentDashApi.atTryghostContentDashApiMod.PostOrPage
import typingsSlinky.atTryghostContentDashApi.atTryghostContentDashApiMod.ReadFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BrowseReadBrowseFunctionPagesObject extends js.Object {
  @JSName("browse")
  var browse_Original: BrowseFunction[PagesObject] = js.native
  @JSName("read")
  var read_Original: ReadFunction[PostOrPage] = js.native
  def browse(): js.Promise[PagesObject] = js.native
  def browse(options: Params): js.Promise[PagesObject] = js.native
  def browse(options: Params, memberToken: Nullable[String]): js.Promise[PagesObject] = js.native
  def read(data: GhostData): js.Promise[PostOrPage] = js.native
  def read(data: GhostData, options: Params): js.Promise[PostOrPage] = js.native
  def read(data: GhostData, options: Params, memberToken: Nullable[String]): js.Promise[PostOrPage] = js.native
}

