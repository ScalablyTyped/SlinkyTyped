package typingsSlinky.uglifyjsWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UglifyJsPluginOptions extends js.Object {
  var cache: js.UndefOr[Boolean | String] = js.native
  var exclude: js.UndefOr[js.RegExp | js.Array[js.RegExp]] = js.native
  var extractComments: js.UndefOr[
    Boolean | js.RegExp | (js.Function2[/* node */ js.Object, /* comment */ String, Boolean]) | ExtractCommentsOptions
  ] = js.native
  var include: js.UndefOr[js.RegExp | js.Array[js.RegExp]] = js.native
  var parallel: js.UndefOr[Boolean | Double] = js.native
  var sourceMap: js.UndefOr[Boolean] = js.native
  var test: js.UndefOr[js.RegExp | js.Array[js.RegExp]] = js.native
  var uglifyOptions: js.UndefOr[UglifyJsOptions] = js.native
  var warningsFilter: js.UndefOr[js.Function1[/* source */ String, Boolean]] = js.native
}

object UglifyJsPluginOptions {
  @scala.inline
  def apply(): UglifyJsPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UglifyJsPluginOptions]
  }
  @scala.inline
  implicit class UglifyJsPluginOptionsOps[Self <: UglifyJsPluginOptions] (val x: Self) extends AnyVal {
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
    def withExcludeRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExclude(value: js.RegExp | js.Array[js.RegExp]): Self = {
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
    def withExtractCommentsFunction2(value: (/* node */ js.Object, /* comment */ String) => Boolean): Self = {
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
    def withExtractComments(
      value: Boolean | js.RegExp | (js.Function2[/* node */ js.Object, /* comment */ String, Boolean]) | ExtractCommentsOptions
    ): Self = {
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
    def withInclude(value: js.RegExp | js.Array[js.RegExp]): Self = {
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
    def withTest(value: js.RegExp | js.Array[js.RegExp]): Self = {
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
    def withUglifyOptions(value: UglifyJsOptions): Self = {
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
    def withWarningsFilter(value: /* source */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningsFilter")(js.Any.fromFunction1(value))
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

