package typingsSlinky.workboxWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateSWOptions extends CommonOptions {
  /**
  	 * The targets to pass to babel-preset-env when transpiling the service worker bundle
  	 */
  var babelPresetEnvTargets: js.UndefOr[js.Array[String]] = js.native
  /**
  	 * An optional ID to be prepended to cache names used by Workbox.
  	 *
  	 * This is primarily useful for local development where multiple sites may be served from the same `http://localhost:port` origin.
  	 *
  	 * @default null
  	 * @example cacheId: 'my-app'
  	 */
  var cacheId: js.UndefOr[String | Null] = js.native
  /**
  	 * Whether or not Workbox should attempt to identify an delete any precaches created by older, incompatible versions
  	 */
  var cleanupOutdatedCaches: js.UndefOr[Boolean] = js.native
  /**
  	 * Whether or not the service worker should [start controlling](https://developers.google.com/web/fundamentals/primers/service-workers/lifecycle#clientsclaim)
  	 * any existing clients as soon as it activates.
  	 *
  	 * @default false
  	 * @example clientsClaim: true
  	 */
  var clientsClaim: js.UndefOr[Boolean] = js.native
  /**
  	 * If a [navigation request](https://developers.google.com/web/fundamentals/primers/service-workers/high-performance-loading#first_what_are_navigation_requests)
  	 * for a URL ending in `/` fails to match a precached URL, this value will be appended to the URL and that will be checked for a precache match.
  	 *
  	 * This should be configured to whatever your web server is using, if anything, for its [directory index](https://httpd.apache.org/docs/2.0/mod/mod_dir.html).
  	 *
  	 * @default 'index.html'
  	 * @example directoryIndex: 'index.html'
  	 */
  var directoryIndex: js.UndefOr[String] = js.native
  /**
  	 * Any search parameter names that match against one of the regex's in this array will be removed before looking for a precache match.
  	 *
  	 * This is useful if your users might request URLs that contain, for example, URL parameters used to track the source of the traffic.
  	 * Those URL parameters would normally cause the cache lookup to fail, since the URL strings used as cache keys would not be expected to include them.
  	 *
  	 * @default [/^utm_/]
  	 * @example ignoreUrlParametersMatching: [/./]
  	 */
  var ignoreUrlParametersMatching: js.UndefOr[js.Array[js.RegExp]] = js.native
  /**
  	 * An required list of JavaScript files that should be passed to
  	 * [`importScripts()`](https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/importScripts) inside the generated service worker file.
  	 *
  	 * If one of the imported files sets the `self.__precacheManifest` variable to an array of
  	 * [`ManifestEntrys`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-build#.ManifestEntry),
  	 * those entries will be automatically precached in the generated service worker.
  	 *
  	 * This is also useful when you want to let Workbox create your top-level service worker file, but want to include some additional code, such as a `push` event listener.
  	 *
  	 * @default []
  	 * @example importScripts: ['push-notifications.abcd1234.js']
  	 */
  var importScripts: js.UndefOr[js.Array[String]] = js.native
  /**
  	 * Whether the runtime code for the Workbox library should be included in the top-level service worker,
  	 * or split into a separate file that needs to be deployed alongside the service worker. Keeping the runtime separate means
  	 * that users will not have to re-download the Workbox code each time your top-level service worker changes
  	 */
  var inlineWorkboxRuntime: js.UndefOr[Boolean] = js.native
  /**
  	 * This will be used to create a [`NavigationRoute`](https://developers.google.com/web/tools/workbox/reference-docs/latest/workbox.routing.NavigationRoute)
  	 * that will respond to [navigation requests](https://developers.google.com/web/fundamentals/primers/service-workers/high-performance-loading#first_what_are_navigation_requests)
  	 * for URLs that that aren't precached.
  	 *
  	 * This is meant to be used in a [Single Page App](https://en.wikipedia.org/wiki/Single-page_application) scenario, in which you want all navigations to use common App Shell HTML.
  	 *
  	 * It's not intended for use as a fallback that's displayed when the browser is offline.
  	 *
  	 * @default undefined
  	 * @example navigateFallback: '/app-shell'
  	 */
  var navigateFallback: js.UndefOr[String] = js.native
  /**
  	 * An optional array of regular expressions that restricts which URLs the configured navigateFallback behavior applies to.
  	 *
  	 * This is useful if only a subset of your site's URLs should be treated as being part of a Single Page App.
  	 *
  	 * If both navigateFallbackDenylist and navigateFallbackAllowlist are configured, the blacklist takes precedent.
  	 *
  	 * @default []
  	 * @example navigateFallbackAllowlist: [/^\/pages/]
  	 */
  var navigateFallbackAllowlist: js.UndefOr[js.Array[js.RegExp]] = js.native
  /**
  	 * An optional array of regular expressions that restricts which URLs the configured navigateFallback behavior applies to.
  	 *
  	 * This is useful if only a subset of your site's URLs should be treated as being part of a Single Page App.
  	 *
  	 * If both navigateFallbackDenylist and navigateFallbackAllowlist are configured, the blacklist takes precedent.
  	 *
  	 * @default []
  	 * @example navigateFallbackDenylist: [/^\/_/, /admin/]
  	 */
  var navigateFallbackDenylist: js.UndefOr[js.Array[js.RegExp]] = js.native
  /**
  	 * Whether or not to enable navigation preload in the generated service worker.
  	 * When set to true, you must also use runtimeCaching to set up an appropriate response strategy that will match navigation requests, and make use of the preloaded response
  	 */
  var navigationPreload: js.UndefOr[Boolean] = js.native
  /**
  	 * Controls whether or not to include support for [offline Google Analytics](https://developers.google.com/web/tools/workbox/guides/enable-offline-analytics).
  	 *
  	 * When `true`, `workbox.googleAnalytics.initialize()` will be added to your new service worker file.
  	 *
  	 * @default false
  	 * @example offlineGoogleAnalytics: true
  	 */
  var offlineGoogleAnalytics: js.UndefOr[Boolean] = js.native
  /**
  	 * Passing in an array of objects containing `urlPatterns`, `handlers`, and potentially `options` will add the appropriate code to the generated service worker to handle runtime caching.
  	 *
  	 * Requests for precached URLs that are picked up via `globPatterns` are handled by default, and don't need to be accommodated in `runtimeCaching`.
  	 *
  	 * @default []
  	 */
  var runtimeCaching: js.UndefOr[js.Array[RuntimeCacheRule]] = js.native
  /**
  	 * Whether or not the service worker should skip over the waiting lifecycle stage. Normally this is used with `clientsClaim: true`.
  	 *
  	 * @default false
  	 * @example skipWaiting: true
  	 */
  var skipWaiting: js.UndefOr[Boolean] = js.native
  /**
  	 * Whether to create a sourcemap for the generated service worker files
  	 */
  var sourcemap: js.UndefOr[Boolean] = js.native
}

object GenerateSWOptions {
  @scala.inline
  def apply(): GenerateSWOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateSWOptions]
  }
  @scala.inline
  implicit class GenerateSWOptionsOps[Self <: GenerateSWOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBabelPresetEnvTargets(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("babelPresetEnvTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBabelPresetEnvTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("babelPresetEnvTargets")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheId")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheId")(null)
        ret
    }
    @scala.inline
    def withCleanupOutdatedCaches(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanupOutdatedCaches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleanupOutdatedCaches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanupOutdatedCaches")(js.undefined)
        ret
    }
    @scala.inline
    def withClientsClaim(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientsClaim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientsClaim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientsClaim")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectoryIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreUrlParametersMatching(value: js.Array[js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUrlParametersMatching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreUrlParametersMatching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUrlParametersMatching")(js.undefined)
        ret
    }
    @scala.inline
    def withImportScripts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importScripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportScripts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importScripts")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineWorkboxRuntime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineWorkboxRuntime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineWorkboxRuntime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineWorkboxRuntime")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigateFallback(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigateFallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigateFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigateFallback")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigateFallbackAllowlist(value: js.Array[js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigateFallbackAllowlist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigateFallbackAllowlist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigateFallbackAllowlist")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigateFallbackDenylist(value: js.Array[js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigateFallbackDenylist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigateFallbackDenylist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigateFallbackDenylist")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationPreload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationPreload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationPreload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationPreload")(js.undefined)
        ret
    }
    @scala.inline
    def withOfflineGoogleAnalytics(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offlineGoogleAnalytics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfflineGoogleAnalytics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offlineGoogleAnalytics")(js.undefined)
        ret
    }
    @scala.inline
    def withRuntimeCaching(value: js.Array[RuntimeCacheRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeCaching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntimeCaching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeCaching")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipWaiting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipWaiting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipWaiting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipWaiting")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcemap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcemap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcemap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcemap")(js.undefined)
        ret
    }
  }
  
}

