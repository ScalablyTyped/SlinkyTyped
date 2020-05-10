package typingsSlinky.webpack.mod.Options

import typingsSlinky.webpack.mod.compilation.Chunk
import typingsSlinky.webpack.webpackStrings.all
import typingsSlinky.webpack.webpackStrings.async
import typingsSlinky.webpack.webpackStrings.initial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheGroupsOptions extends js.Object {
  /** Select chunks for determining cache group content (defaults to \"initial\", \"initial\" and \"all\" requires adding these chunks to the HTML) */
  var chunks: js.UndefOr[initial | async | all | (js.Function1[/* chunk */ Chunk, Boolean])] = js.native
  /** Ignore minimum size, minimum chunks and maximum requests and always create chunks for this cache group */
  var enforce: js.UndefOr[Boolean] = js.native
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
  /** Priority of this cache group */
  var priority: js.UndefOr[Double] = js.native
  /** Try to reuse existing chunk (with name) when it has matching modules */
  var reuseExistingChunk: js.UndefOr[Boolean] = js.native
  /** Assign modules to a cache group */
  var test: js.UndefOr[(js.Function1[/* repeated */ js.Any, Boolean]) | String | js.RegExp] = js.native
}

object CacheGroupsOptions {
  @scala.inline
  def apply(): CacheGroupsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheGroupsOptions]
  }
  @scala.inline
  implicit class CacheGroupsOptionsOps[Self <: CacheGroupsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withEnforce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforce")(js.undefined)
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
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withReuseExistingChunk(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reuseExistingChunk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReuseExistingChunk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reuseExistingChunk")(js.undefined)
        ret
    }
    @scala.inline
    def withTestFunction1(value: /* repeated */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTestRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTest(value: (js.Function1[/* repeated */ js.Any, Boolean]) | String | js.RegExp): Self = {
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
  }
  
}

