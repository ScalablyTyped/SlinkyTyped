package typingsSlinky.storybookApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderData extends js.Object {
  var provider: typingsSlinky.storybookApi.initProviderApiMod.Provider
}

object ProviderData {
  @scala.inline
  def apply(provider: typingsSlinky.storybookApi.initProviderApiMod.Provider): ProviderData = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProviderData]
  }
}

