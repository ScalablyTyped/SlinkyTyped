package typingsSlinky.workboxBuild.generateSwMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.workboxBuild.typesMod.ManifestEntry
import typingsSlinky.workboxBuild.typesMod.ManifestTransform
import typingsSlinky.workboxBuild.typesMod.RuntimeCachingEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateSWConfig extends js.Object {
  /**
    * A list of entries to be precached, in addition to any entries that are
    * generated as part of the build configuration.
    */
  var additionalManifestEntries: js.UndefOr[js.Array[ManifestEntry]] = js.native
  /**
    * The [targets](https://babeljs.io/docs/en/babel-preset-env#targets) to pass to
    * `babel-preset-env` when transpiling the service worker bundle.
    *
    * @default ['chrome >= 56']
    */
  var babelPresetEnvTargets: js.UndefOr[js.Array[String]] = js.native
  /**
    * An optional ID to be prepended to cache names. This is primarily useful for
    * local development where multiple sites may be served from the same
    * `http://localhost:port` origin.
    */
  var cacheId: js.UndefOr[String] = js.native
  /**
    * Whether or not Workbox should attempt to identify an delete any precaches
    * created by older, incompatible versions.
    *
    * @default false
    */
  var cleanupOutdatedCaches: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not the service worker should [start controlling](https://developers.google.com/web/fundamentals/primers/service-workers/lifecycle#clientsclaim)
    * any existing clients as soon as it activates.
    *
    * @default false
    */
  var clientsClaim: js.UndefOr[Boolean] = js.native
  /**
    * If a navigation request for a URL ending in `/` fails to match a precached
    * URL, this value will be appended to the URL and that will be checked for
    * a precache match. This should be set to what your web server is using for
    * its directory index.
    *
    * @default 'index.html'
    */
  var directoryIndex: js.UndefOr[String] = js.native
  /**
    * Assets that match this will be assumed to be uniquely versioned via their
    * URL, and exempted from the normal HTTP cache-busting that's done when
    * populating the precache. While not required, it's recommended that if your
    * existing build process already inserts a `[hash]` value into each filename,
    * you provide a RegExp that will detect that, as it will reduce the bandwidth
    * consumed when precaching.
    */
  var dontCacheBustURLsMatching: js.UndefOr[js.RegExp] = js.native
  /**
    * The local directory you wish to match `globPatterns` against. The path is relative to the current directory.
    */
  var globDirectory: String = js.native
  /**
    * Determines whether or not symlinks are followed when generating the precache
    * manifest. For more information, see the definition of `follow` in the `glob`
    * [documentation](https://github.com/isaacs/node-glob#options).
    *
    * @default true
    */
  var globFollow: js.UndefOr[Boolean] = js.native
  /**
    * A set of patterns matching files to always exclude when generating the
    * precache manifest. For more information, see the definition of `ignore` in the `glob`
    * [documentation](https://github.com/isaacs/node-glob#options).
    *
    * @default ['node_modules/ **']
    */
  var globIgnores: js.UndefOr[js.Array[String]] = js.native
  /**
    * Files matching any of these patterns will be included in the precache
    * manifest. For more information, see the
    * [`glob` primer](https://github.com/isaacs/node-glob#glob-primer).
    *
    * @default ['**.{js,css,html}']
    */
  var globPatterns: js.UndefOr[js.Array[String]] = js.native
  /**
    * If true, an error reading a directory when generating a precache manifest
    * will cause the build to fail. If false, the problematic directory will be
    * skipped. For more information, see the definition of `strict` in the `glob`
    * [documentation](https://github.com/isaacs/node-glob#options).
    *
    * @default true
    */
  var globStrict: js.UndefOr[Boolean] = js.native
  /**
    * Any search parameter names that match against one of the RegExp in this array
    * will be removed before looking for a precache match. This is useful if your
    * users might request URLs that contain, for example, URL parameters used to
    * track the source of the traffic.
    *
    * @default [/^utm_/]
    */
  var ignoreURLParametersMatching: js.UndefOr[js.Array[js.RegExp]] = js.native
  /**
    * A list of JavaScript files that should be passed to [`importScripts()`](https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/importScripts)
    * inside the generated service worker file. This is  useful when you want to
    * let Workbox create your top-level service worker file, but want to include
    * some additional code, such as a push event listener.
    */
  var importScripts: js.UndefOr[js.Array[String]] = js.native
  /**
    * Whether the runtime code for the Workbox library should be included in the
    * top-level service worker, or split into a separate file that needs to be deployed
    * alongside the service worker. Keeping the runtime separate means that users will
    * not have to re-download the Workbox code each time your top-level service worker changes.
    *
    * @default false
    */
  var inlineWorkboxRuntime: js.UndefOr[Boolean] = js.native
  /**
    * One or more functions which will be applied sequentially against the
    * generated manifest. If `modifyURLPrefix` or `dontCacheBustURLsMatching` are
    * also specified, their corresponding transformations will be applied first.
    */
  var manifestTransforms: js.UndefOr[js.Array[ManifestTransform]] = js.native
  /**
    * This value can be used to determine the maximum size of files that will be
    * precached. This prevents you from inadvertently precaching very large files
    * that might have accidentally matched one of your patterns.
    *
    * @default 2097152
    */
  var maximumFileSizeToCacheInBytes: js.UndefOr[Double] = js.native
  /**
    * If set to 'production', then an optimized service worker bundle that excludes
    * debugging info will be produced. If not explicitly configured here, the `mode`
    * value configured in the current `webpack` compiltion will be used.
    */
  var mode: js.UndefOr[String] = js.native
  /**
    * A mapping of prefixes that, if present in an entry in the precache manifest,
    * will be replaced with the corresponding value. This can be used to, for example,
    * remove or add a path prefix from a manifest entry if your web hosting setup
    * doesn't match your local filesystem setup. As an alternative with more flexibility,
    * you can use the `manifestTransforms` option and provide a function that modifies
    * the entries in the manifest using whatever logic you provide.
    */
  var modifyURLPrefix: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * If specified, all [navigation requests](https://developers.google.com/web/fundamentals/primers/service-workers/high-performance-loading#first_what_are_navigation_requests)
    * for URLs that aren't precached will be fulfilled with the HTML at the URL
    * provided. You must pass in the URL of an HTML document that is listed in your
    * precache manifest. This is meant to be used in a Single Page App scenario, in
    * which you want all navigations to use common [App Shell HTML](https://developers.google.com/web/fundamentals/architecture/app-shell).
    */
  var navigateFallback: js.UndefOr[String] = js.native
  /**
    * An optional array of regular expressions that restricts which URLs the configured
    * `navigateFallback` behavior applies to. This is useful if only a subset of
    * your site's URLs should be treated as being part of a
    * [Single Page App](https://en.wikipedia.org/wiki/Single-page_application). If
    * both `navigateFallbackDenylist` and `navigateFallbackAllowlist` are
    * configured, the denylist takes precedent.
    */
  var navigateFallbackAllowlist: js.UndefOr[js.Array[js.RegExp]] = js.native
  /**
    * An optional array of regular expressions that restricts which URLs the configured
    * `navigateFallback` behavior applies to. This is useful if only a subset of
    * your site's URLs should be treated as being part of a
    * [Single Page App](https://en.wikipedia.org/wiki/Single-page_application). If
    * both `navigateFallbackDenylist` and `navigateFallbackAllowlist` are
    * configured, the denylist takes precedent.
    */
  var navigateFallbackDenylist: js.UndefOr[js.Array[js.RegExp]] = js.native
  /**
    * Whether or not to enable [navigation preload](https://developers.google.com/web/tools/workbox/modules/workbox-navigation-preload)
    * in the generated service worker. When set to true, you must also use
    * `runtimeCaching` to set up an appropriate response strategy that will match
    * navigation requests, and make use of the preloaded response.
    *
    * @default false
    */
  var navigationPreload: js.UndefOr[Boolean] = js.native
  /**
    * Controls whether or not to include support for [offline Google Analytics](https://developers.google.com/web/tools/workbox/guides/enable-offline-analytics).
    * When `true`, the call to `workbox-google-analytics`'s `initialize()` will be
    * added to your generated service worker. When set to an `Object`, that object
    * will be passed in to the `initialize()` call, allowing you to customize the
    * behavior.
    *
    * @default false
    */
  var offlineGoogleAnalytics: js.UndefOr[Boolean | js.Object] = js.native
  var runtimeCaching: js.UndefOr[js.Array[RuntimeCachingEntry]] = js.native
  /**
    * Whether to add an unconditional call to [`skipWaiting()`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-core#.skipWaiting)
    * to the generated service worker. If `false`, then a `message` listener will
    * be added instead, allowing you to conditionally call `skipWaiting()`.
    *
    * @default false
    */
  var skipWaiting: js.UndefOr[Boolean] = js.native
  /**
    * Whether to create a sourcemap for the generated service worker files.
    *
    * @default true
    */
  var sourcemap: js.UndefOr[Boolean] = js.native
  /**
    * The path and filename of the service worker file that will be created by the
    * build process, relative to the current working directory. It must end in '.js'.
    */
  var swDest: String = js.native
  /**
    * If a URL is rendered based on some server-side logic, its contents may depend
    * on multiple files or on some other unique string value. The keys in this object
    * are server-rendered URLs. If the values are an array of strings, they will be
    * interpreted as `glob` patterns, and the contents of any files matching the
    * patterns will be used to uniquely version the URL. If used with a single string,
    * it will be interpreted as unique versioning information that you've generated
    * for a given URL.
    */
  var templatedURLs: js.UndefOr[js.Object] = js.native
}

object GenerateSWConfig {
  @scala.inline
  def apply(globDirectory: String, swDest: String): GenerateSWConfig = {
    val __obj = js.Dynamic.literal(globDirectory = globDirectory.asInstanceOf[js.Any], swDest = swDest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateSWConfig]
  }
  @scala.inline
  implicit class GenerateSWConfigOps[Self <: GenerateSWConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwDest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swDest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalManifestEntries(value: js.Array[ManifestEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalManifestEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalManifestEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalManifestEntries")(js.undefined)
        ret
    }
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
    def withDontCacheBustURLsMatching(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dontCacheBustURLsMatching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDontCacheBustURLsMatching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dontCacheBustURLsMatching")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobFollow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globFollow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobFollow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globFollow")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobIgnores(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globIgnores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobIgnores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globIgnores")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobPatterns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globPatterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobPatterns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globPatterns")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globStrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globStrict")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreURLParametersMatching(value: js.Array[js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreURLParametersMatching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreURLParametersMatching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreURLParametersMatching")(js.undefined)
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
    def withManifestTransforms(value: js.Array[ManifestTransform]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifestTransforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifestTransforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifestTransforms")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumFileSizeToCacheInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumFileSizeToCacheInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumFileSizeToCacheInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumFileSizeToCacheInBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyURLPrefix(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyURLPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifyURLPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyURLPrefix")(js.undefined)
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
    def withOfflineGoogleAnalytics(value: Boolean | js.Object): Self = {
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
    def withRuntimeCaching(value: js.Array[RuntimeCachingEntry]): Self = {
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
    @scala.inline
    def withTemplatedURLs(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templatedURLs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplatedURLs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templatedURLs")(js.undefined)
        ret
    }
  }
  
}

