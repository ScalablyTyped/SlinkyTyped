package typingsSlinky.storybookApi.anon

import typingsSlinky.storybookApi.mod.API
import typingsSlinky.storybookApi.storeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Provider extends js.Object {
  var api: API = js.native
  var provider: typingsSlinky.storybookApi.initProviderApiMod.Provider = js.native
  var store: default = js.native
}

object Provider {
  @scala.inline
  def apply(api: API, provider: typingsSlinky.storybookApi.initProviderApiMod.Provider, store: default): Provider = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Provider]
  }
  @scala.inline
  implicit class ProviderOps[Self <: Provider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi(value: API): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvider(value: typingsSlinky.storybookApi.initProviderApiMod.Provider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStore(value: default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

