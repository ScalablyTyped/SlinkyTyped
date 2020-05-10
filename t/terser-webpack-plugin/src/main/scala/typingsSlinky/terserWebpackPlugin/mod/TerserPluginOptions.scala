package typingsSlinky.terserWebpackPlugin.mod

import typingsSlinky.terser.mod.MinifyOptions
import typingsSlinky.webpack.mod.compilation.Chunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerserPluginOptions extends js.Object {
  var cache: js.UndefOr[Boolean | String] = js.native
  var cacheKeys: js.UndefOr[js.Function2[/* defaultCacheKeys */ js.Any, /* file */ js.Any, js.Object]] = js.native
  var chunkFilter: js.UndefOr[js.Function1[/* chunk */ Chunk, Boolean]] = js.native
  var exclude: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.native
  var extractComments: js.UndefOr[Boolean | String | js.RegExp | ExtractCommentFn | ExtractCommentOptions] = js.native
  var include: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.native
  var minify: js.UndefOr[js.Function2[/* file */ js.Any, /* sourceMap */ js.Any, MinifyResult]] = js.native
  var parallel: js.UndefOr[Boolean | Double] = js.native
  var sourceMap: js.UndefOr[Boolean] = js.native
  var terserOptions: js.UndefOr[MinifyOptions] = js.native
  var test: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.native
  var warningsFilter: js.UndefOr[
    js.Function3[/* warning */ String, /* source */ js.UndefOr[String], /* file */ String, Boolean]
  ] = js.native
}

object TerserPluginOptions {
  @scala.inline
  def apply(): TerserPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerserPluginOptions]
  }
  @scala.inline
  implicit class TerserPluginOptionsOps[Self <: TerserPluginOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCache(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheKeys(value: (/* defaultCacheKeys */ js.Any, /* file */ js.Any) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheKeys")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCacheKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withChunkFilter(value: /* chunk */ Chunk => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChunkFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExclude(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withExtractCommentsFunction2(value: (/* node */ js.Any, /* comment */ js.Any) => Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractComments")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withExtractCommentsRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtractComments(value: Boolean | String | js.RegExp | ExtractCommentFn | ExtractCommentOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtractComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractComments")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInclude(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
    @scala.inline
    def withMinify(value: (/* file */ js.Any, /* sourceMap */ js.Any) => MinifyResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minify")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMinify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minify")(js.undefined)
        ret
    }
    @scala.inline
    def withParallel(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallel")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMap")(js.undefined)
        ret
    }
    @scala.inline
    def withTerserOptions(value: MinifyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terserOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerserOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terserOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTestRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTest(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(js.undefined)
        ret
    }
    @scala.inline
    def withWarningsFilter(value: (/* warning */ String, /* source */ js.UndefOr[String], /* file */ String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningsFilter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutWarningsFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningsFilter")(js.undefined)
        ret
    }
  }
  
}

