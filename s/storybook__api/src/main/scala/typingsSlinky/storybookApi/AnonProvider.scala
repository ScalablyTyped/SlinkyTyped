package typingsSlinky.storybookApi

import typingsSlinky.storybookApi.initProviderApiMod.Provider
import typingsSlinky.storybookApi.mod.API
import typingsSlinky.storybookApi.storeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProvider extends js.Object {
  var api: API
  var provider: Provider
  var store: default
}

object AnonProvider {
  @scala.inline
  def apply(api: API, provider: Provider, store: default): AnonProvider = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonProvider]
  }
}

