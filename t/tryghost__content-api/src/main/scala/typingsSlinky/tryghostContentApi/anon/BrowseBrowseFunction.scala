package typingsSlinky.tryghostContentApi.anon

import typingsSlinky.tryghostContentApi.mod.BrowseFunction
import typingsSlinky.tryghostContentApi.mod.Nullable
import typingsSlinky.tryghostContentApi.mod.Params
import typingsSlinky.tryghostContentApi.mod.SettingsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowseBrowseFunction extends js.Object {
  @JSName("browse")
  var browse_Original: BrowseFunction[SettingsResponse] = js.native
  def browse(): js.Promise[SettingsResponse] = js.native
  def browse(options: Params): js.Promise[SettingsResponse] = js.native
  def browse(options: Params, memberToken: Nullable[String]): js.Promise[SettingsResponse] = js.native
}

