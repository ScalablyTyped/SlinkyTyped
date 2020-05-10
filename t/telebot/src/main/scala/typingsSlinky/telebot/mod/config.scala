package typingsSlinky.telebot.mod

import typingsSlinky.telebot.AnonCert
import typingsSlinky.telebot.AnonInterval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait config extends js.Object {
  var allowedUpdates: js.UndefOr[js.Array[String]] = js.native
   // Optional. Plugin folder location relative to telebot package.
  var pluginConfig: js.UndefOr[js.Any] = js.native
   // Optional. Use build-in plugins from pluginFolder.
  var pluginFolder: js.UndefOr[String] = js.native
   // Required. Telegram Bot API token.
  var polling: js.UndefOr[AnonInterval] = js.native
  var token: String = js.native
   // Optional. List the types of updates you want your bot to receive. Specify an empty list to receive all updates.
  var usePlugins: js.UndefOr[js.Array[String]] = js.native
  var webhook: js.UndefOr[AnonCert] = js.native
}

object config {
  @scala.inline
  def apply(token: String): config = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[config]
  }
  @scala.inline
  implicit class configOps[Self <: config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedUpdates(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedUpdates")(js.undefined)
        ret
    }
    @scala.inline
    def withPluginConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPluginConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withPluginFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPluginFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginFolder")(js.undefined)
        ret
    }
    @scala.inline
    def withPolling(value: AnonInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polling")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePlugins(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePlugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePlugins")(js.undefined)
        ret
    }
    @scala.inline
    def withWebhook(value: AnonCert): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebhook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhook")(js.undefined)
        ret
    }
  }
  
}

