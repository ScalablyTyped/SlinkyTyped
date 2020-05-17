package typingsSlinky.workboxBuild.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelName extends js.Object {
  /**
    * The `channelName` property to use when creating the
    * [`BroadcastCacheUpdatePlugin`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-broadcast-update.BroadcastUpdatePlugin).
    */
  var channelName: js.UndefOr[String] = js.native
  /**
    * The `options` property to use when creating the
    * [`BroadcastCacheUpdatePlugin`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-broadcast-update.BroadcastUpdatePlugin).
    */
  var options: js.UndefOr[js.Object] = js.native
}

object ChannelName {
  @scala.inline
  def apply(): ChannelName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelName]
  }
  @scala.inline
  implicit class ChannelNameOps[Self <: ChannelName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelName")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

