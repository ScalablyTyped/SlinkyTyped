package typingsSlinky.workboxBuild.typesMod

import typingsSlinky.workboxBuild.anon.ChannelName
import typingsSlinky.workboxBuild.anon.Headers
import typingsSlinky.workboxBuild.anon.MaxAgeSeconds
import typingsSlinky.workboxBuild.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuntimeCachingEntryOptions extends js.Object {
  var backgroundSync: js.UndefOr[Name] = js.native
  var broadcastUpdate: js.UndefOr[ChannelName] = js.native
  /**
    * The `cacheName` to use when constructing one of the [Workbox strategy classes](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-strategies.html).
    */
  var cacheName: js.UndefOr[String] = js.native
  var cacheableResponse: js.UndefOr[Headers] = js.native
  var expiration: js.UndefOr[MaxAgeSeconds] = js.native
  /**
    * The `fetchOptions` property value to use when constructing one of the
    * [Workbox strategy classes](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-strategies.html).
    */
  var fetchOptions: js.UndefOr[js.Object] = js.native
  /**
    * The `matchOptions` property value to use when constructing one of the
    * [Workbox strategy classes](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-strategies.html).
    */
  var matchOptions: js.UndefOr[js.Object] = js.native
  /**
    * The `networkTimeoutSeconds` property value to use when creating a
    * [`NetworkFirst`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-strategies.NetworkFirst) strategy.
    */
  var networkTimeoutSeconds: js.UndefOr[Double] = js.native
  /**
    * One or more [additional plugins](https://developers.google.com/web/tools/workbox/guides/using-plugins#custom_plugins)
    * to apply to the handler. Useful when you want a plugin that doesn't have a
    * "shortcut" configuration.
    */
  var plugins: js.UndefOr[js.Array[js.Object]] = js.native
}

object RuntimeCachingEntryOptions {
  @scala.inline
  def apply(): RuntimeCachingEntryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeCachingEntryOptions]
  }
  @scala.inline
  implicit class RuntimeCachingEntryOptionsOps[Self <: RuntimeCachingEntryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundSync(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundSync")(js.undefined)
        ret
    }
    @scala.inline
    def withBroadcastUpdate(value: ChannelName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcastUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBroadcastUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcastUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheName")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheableResponse(value: Headers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheableResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheableResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheableResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiration(value: MaxAgeSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiration")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkTimeoutSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkTimeoutSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkTimeoutSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkTimeoutSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
  }
  
}

