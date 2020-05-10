package typingsSlinky.webpackBlocksUglify.mod

import typingsSlinky.uglifyJs.mod.MinifyOptions
import typingsSlinky.webpackBlocksUglify.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var cache: js.UndefOr[String | Boolean] = js.native
  var cacheKeys: js.UndefOr[js.Function2[/* defaultCacheKeys */ js.Any, /* file */ js.Any, js.Object]] = js.native
  var chunkFilter: js.UndefOr[js.Function1[/* chunk */ js.Any, Boolean]] = js.native
  var exclude: js.UndefOr[TestType | js.Array[TestType]] = js.native
  var extractComments: js.UndefOr[Boolean | String | js.RegExp | ExtractCommentsFunction] = js.native
  var include: js.UndefOr[TestType | js.Array[TestType]] = js.native
  var minify: js.UndefOr[js.Function2[/* file */ js.Any, /* sourceMap */ js.Any, AnonCode]] = js.native
  var parallel: js.UndefOr[Boolean | Double] = js.native
  var sourceMap: js.UndefOr[Boolean] = js.native
  var test: js.UndefOr[TestType | js.Array[TestType]] = js.native
  var uglifyOptions: js.UndefOr[MinifyOptions] = js.native
  var warningsFilter: js.UndefOr[js.Function2[/* warning */ js.Any, /* source */ js.Any, Boolean]] = js.native
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
    def withCache(value: String | Boolean): Self = {
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
    def withChunkFilter(value: /* chunk */ js.Any => Boolean): Self = {
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
    def withExclude(value: TestType | js.Array[TestType]): Self = {
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
    def withExtractCommentsFunction2(value: (/* node */ js.Any, /* comment */ js.Any) => Boolean | ExtractCommentsObject): Self = {
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
    def withExtractComments(value: Boolean | String | js.RegExp | ExtractCommentsFunction): Self = {
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
    def withInclude(value: TestType | js.Array[TestType]): Self = {
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
    def withMinify(value: (/* file */ js.Any, /* sourceMap */ js.Any) => AnonCode): Self = {
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
    def withTestRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTest(value: TestType | js.Array[TestType]): Self = {
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
    def withUglifyOptions(value: MinifyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uglifyOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUglifyOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uglifyOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withWarningsFilter(value: (/* warning */ js.Any, /* source */ js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningsFilter")(js.Any.fromFunction2(value))
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

