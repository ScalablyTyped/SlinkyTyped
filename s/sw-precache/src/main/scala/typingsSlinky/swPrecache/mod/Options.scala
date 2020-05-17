package typingsSlinky.swPrecache.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.Buffer
import typingsSlinky.swPrecache.anon.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var cacheId: js.UndefOr[String] = js.native
  var clientsClaim: js.UndefOr[Boolean] = js.native
  var directoryIndex: js.UndefOr[String] = js.native
  var dontCacheBustUrlsMatching: js.UndefOr[js.RegExp] = js.native
  var dynamicUrlToDependencies: js.UndefOr[StringDictionary[String | Buffer | js.Array[String]]] = js.native
  var handleFetch: js.UndefOr[Boolean] = js.native
  var ignoreUrlParametersMatching: js.UndefOr[js.Array[js.RegExp]] = js.native
  var importScripts: js.UndefOr[js.Array[String]] = js.native
  var logger: js.UndefOr[FnCall] = js.native
  var maximumFileSizeToCacheInBytes: js.UndefOr[Double] = js.native
  var navigateFallback: js.UndefOr[String] = js.native
  var navigateFallbackWhitelist: js.UndefOr[js.Array[js.RegExp]] = js.native
  var replacePrefix: js.UndefOr[String] = js.native
  var runtimeCaching: js.UndefOr[js.Array[typingsSlinky.swPrecache.anon.Handler]] = js.native
  var skipWaiting: js.UndefOr[Boolean] = js.native
  var staticFileGlobs: js.UndefOr[js.Array[String]] = js.native
  var stripPrefix: js.UndefOr[String] = js.native
  var stripPrefixMulti: js.UndefOr[StringDictionary[String]] = js.native
  var templateFilePath: js.UndefOr[String] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDontCacheBustUrlsMatching(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dontCacheBustUrlsMatching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDontCacheBustUrlsMatching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dontCacheBustUrlsMatching")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicUrlToDependencies(value: StringDictionary[String | Buffer | js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicUrlToDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicUrlToDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicUrlToDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleFetch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleFetch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleFetch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleFetch")(js.undefined)
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
    def withLogger(value: FnCall): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
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
    def withNavigateFallbackWhitelist(value: js.Array[js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigateFallbackWhitelist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigateFallbackWhitelist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigateFallbackWhitelist")(js.undefined)
        ret
    }
    @scala.inline
    def withReplacePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplacePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withRuntimeCaching(value: js.Array[typingsSlinky.swPrecache.anon.Handler]): Self = {
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
    def withStaticFileGlobs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticFileGlobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticFileGlobs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticFileGlobs")(js.undefined)
        ret
    }
    @scala.inline
    def withStripPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withStripPrefixMulti(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripPrefixMulti")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripPrefixMulti: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripPrefixMulti")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateFilePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateFilePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateFilePath")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
  }
  
}

