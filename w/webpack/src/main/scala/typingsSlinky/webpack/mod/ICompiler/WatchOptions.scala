package typingsSlinky.webpack.mod.ICompiler

import typingsSlinky.anymatch.mod.Matcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatchOptions extends js.Object {
  /**
    * Add a delay before rebuilding once the first file changed. This allows webpack to aggregate any other
    * changes made during this time period into one rebuild.
    * Pass a value in milliseconds. Default: 300.
    */
  var aggregateTimeout: js.UndefOr[Double] = js.native
  /**
    * For some systems, watching many file systems can result in a lot of CPU or memory usage.
    * It is possible to exclude a huge folder like node_modules.
    * It is also possible to use anymatch patterns.
    */
  var ignored: js.UndefOr[Matcher] = js.native
  /** Turn on polling by passing true, or specifying a poll interval in milliseconds. */
  var poll: js.UndefOr[Boolean | Double] = js.native
}

object WatchOptions {
  @scala.inline
  def apply(): WatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchOptions]
  }
  @scala.inline
  implicit class WatchOptionsOps[Self <: WatchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregateTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregateTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoredFunction1(value: /* repeated */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignored")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIgnoredRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnored(value: Matcher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnored: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignored")(js.undefined)
        ret
    }
    @scala.inline
    def withPoll(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poll")(js.undefined)
        ret
    }
  }
  
}

