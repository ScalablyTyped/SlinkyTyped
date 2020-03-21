package typingsSlinky.tryghostContentApi

import typingsSlinky.tryghostContentApi.mod.BrowseFunction
import typingsSlinky.tryghostContentApi.mod.Nullable
import typingsSlinky.tryghostContentApi.mod.Params
import typingsSlinky.tryghostContentApi.mod.SettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon0 extends js.Object {
  @JSName("browse")
  var browse_Original: BrowseFunction[SettingsObject] = js.native
  def browse(): js.Promise[SettingsObject] = js.native
  def browse(options: Params): js.Promise[SettingsObject] = js.native
  def browse(options: Params, memberToken: Nullable[String]): js.Promise[SettingsObject] = js.native
}

