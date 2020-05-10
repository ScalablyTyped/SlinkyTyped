package typingsSlinky.workboxWebpackPlugin.mod

import typingsSlinky.workboxWebpackPlugin.AnonChannelName
import typingsSlinky.workboxWebpackPlugin.AnonHeaders
import typingsSlinky.workboxWebpackPlugin.AnonMaxAgeSeconds
import typingsSlinky.workboxWebpackPlugin.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuntimeCacheOptions extends js.Object {
  /**
  	 * Configure background sync.
  	 */
  var backgroundSync: js.UndefOr[AnonName] = js.native
  /**
  	 * Configure the broadcast cache update plugin.
  	 */
  var broadcastUpdate: js.UndefOr[AnonChannelName] = js.native
  /**
  	 * A custom cache name for this route.
  	 */
  var cacheName: js.UndefOr[String] = js.native
  /**
  	 * Configure which responses are considered cacheable.
  	 */
  var cacheableResponse: js.UndefOr[AnonHeaders] = js.native
  /**
  	 * Custom cache expiration.
  	 */
  var expiration: js.UndefOr[AnonMaxAgeSeconds] = js.native
  /**
  	 * Used to configure the handler.
  	 */
  var fetchOptions: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to configure the handler.
  	 */
  var matchOptions: js.UndefOr[js.Any] = js.native
  /**
  	 * Fall back to the cache after X seconds.
  	 */
  var networkTimeoutSeconds: js.UndefOr[Double] = js.native
  /**
  	 * Add in any additional plugin logic you need.
  	 */
  var plugins: js.UndefOr[js.Array[_]] = js.native
}

object RuntimeCacheOptions {
  @scala.inline
  def apply(): RuntimeCacheOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeCacheOptions]
  }
  @scala.inline
  implicit class RuntimeCacheOptionsOps[Self <: RuntimeCacheOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundSync(value: AnonName): Self = {
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
    def withBroadcastUpdate(value: AnonChannelName): Self = {
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
    def withCacheableResponse(value: AnonHeaders): Self = {
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
    def withExpiration(value: AnonMaxAgeSeconds): Self = {
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
    def withFetchOptions(value: js.Any): Self = {
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
    def withMatchOptions(value: js.Any): Self = {
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
    def withPlugins(value: js.Array[_]): Self = {
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

