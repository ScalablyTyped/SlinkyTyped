package typingsSlinky.atTryghostContentDashApi

import typingsSlinky.atTryghostContentDashApi.atTryghostContentDashApiMod.BrowseFunction
import typingsSlinky.atTryghostContentDashApi.atTryghostContentDashApiMod.Nullable
import typingsSlinky.atTryghostContentDashApi.atTryghostContentDashApiMod.Params
import typingsSlinky.atTryghostContentDashApi.atTryghostContentDashApiMod.SettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BrowseBrowseFunction extends js.Object {
  @JSName("browse")
  var browse_Original: BrowseFunction[SettingsObject] = js.native
  def browse(): js.Promise[SettingsObject] = js.native
  def browse(options: Params): js.Promise[SettingsObject] = js.native
  def browse(options: Params, memberToken: Nullable[String]): js.Promise[SettingsObject] = js.native
}

