package typingsSlinky.atTryghostContentDashApi

import typingsSlinky.atTryghostContentDashApi.atTryghostContentDashApiMod.BrowseFunction
import typingsSlinky.atTryghostContentDashApi.atTryghostContentDashApiMod.GhostData
import typingsSlinky.atTryghostContentDashApi.atTryghostContentDashApiMod.Nullable
import typingsSlinky.atTryghostContentDashApi.atTryghostContentDashApiMod.Params
import typingsSlinky.atTryghostContentDashApi.atTryghostContentDashApiMod.ReadFunction
import typingsSlinky.atTryghostContentDashApi.atTryghostContentDashApiMod.Tag
import typingsSlinky.atTryghostContentDashApi.atTryghostContentDashApiMod.TagsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BrowseReadBrowseFunction extends js.Object {
  @JSName("browse")
  var browse_Original: BrowseFunction[TagsObject] = js.native
  @JSName("read")
  var read_Original: ReadFunction[Tag] = js.native
  def browse(): js.Promise[TagsObject] = js.native
  def browse(options: Params): js.Promise[TagsObject] = js.native
  def browse(options: Params, memberToken: Nullable[String]): js.Promise[TagsObject] = js.native
  def read(data: GhostData): js.Promise[Tag] = js.native
  def read(data: GhostData, options: Params): js.Promise[Tag] = js.native
  def read(data: GhostData, options: Params, memberToken: Nullable[String]): js.Promise[Tag] = js.native
}

