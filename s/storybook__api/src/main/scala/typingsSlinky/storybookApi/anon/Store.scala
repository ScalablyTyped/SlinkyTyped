package typingsSlinky.storybookApi.anon

import typingsSlinky.storybookApi.storeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Store extends js.Object {
  var provider: typingsSlinky.storybookApi.initProviderApiMod.Provider
  var store: default
}

object Store {
  @scala.inline
  def apply(provider: typingsSlinky.storybookApi.initProviderApiMod.Provider, store: default): Store = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Store]
  }
}

