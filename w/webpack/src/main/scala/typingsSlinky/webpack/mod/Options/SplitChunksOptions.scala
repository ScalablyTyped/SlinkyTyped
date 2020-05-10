package typingsSlinky.webpack.mod.Options

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.webpack.mod.compilation.Chunk
import typingsSlinky.webpack.webpackBooleans.`false`
import typingsSlinky.webpack.webpackStrings.all
import typingsSlinky.webpack.webpackStrings.async
import typingsSlinky.webpack.webpackStrings.initial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitChunksOptions extends js.Object {
  /** Override the default name separator (~) when generating names automatically (name: true)  */
  var automaticNameDelimiter: js.UndefOr[String] = js.native
  /** Assign modules to a cache group (modules from different cache groups are tried to keep in separate chunks) */
  var cacheGroups: js.UndefOr[
    `false` | String | (js.Function1[/* repeated */ js.Any, _]) | js.RegExp | (StringDictionary[CacheGroupsOptions | `false`])
  ] = js.native
  /** Select chunks for determining shared modules (defaults to \"async\", \"initial\" and \"all\" requires adding these chunks to the HTML) */
  var chunks: js.UndefOr[initial | async | all | (js.Function1[/* chunk */ Chunk, Boolean])] = js.native
  /** Maximum number of requests which are accepted for on-demand loading */
  var maxAsyncRequests: js.UndefOr[Double] = js.native
  /** Maximum number of initial chunks which are accepted for an entry point */
  var maxInitialRequests: js.UndefOr[Double] = js.native
  /** Maximum size for the created chunk */
  var maxSize: js.UndefOr[Double] = js.native
  /** Minimum number of times a module has to be duplicated until it's considered for splitting */
  var minChunks: js.UndefOr[Double] = js.native
  /** Minimal size for the created chunk */
  var minSize: js.UndefOr[Double] = js.native
  /** Give chunks created a name (chunks with equal name are merged) */
  var name: js.UndefOr[Boolean | String | (js.Function1[/* repeated */ js.Any, _])] = js.native
}

object SplitChunksOptions {
  @scala.inline
  def apply(): SplitChunksOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitChunksOptions]
  }
  @scala.inline
  implicit class SplitChunksOptionsOps[Self <: SplitChunksOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomaticNameDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticNameDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomaticNameDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticNameDelimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheGroupsFunction1(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheGroups")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCacheGroupsRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCacheGroups(
      value: `false` | String | (js.Function1[/* repeated */ js.Any, _]) | js.RegExp | (StringDictionary[CacheGroupsOptions | `false`])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withChunksFunction1(value: /* chunk */ Chunk => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunks")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChunks(value: initial | async | all | (js.Function1[/* chunk */ Chunk, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunks")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAsyncRequests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAsyncRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAsyncRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAsyncRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxInitialRequests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxInitialRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxInitialRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxInitialRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMinChunks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minChunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinChunks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minChunks")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(js.undefined)
        ret
    }
    @scala.inline
    def withNameFunction1(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: Boolean | String | (js.Function1[/* repeated */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

