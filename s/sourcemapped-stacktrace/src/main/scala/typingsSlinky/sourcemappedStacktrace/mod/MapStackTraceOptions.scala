package typingsSlinky.sourcemappedStacktrace.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapStackTraceOptions extends js.Object {
  /** Whether to cache sourcemaps globally across multiple calls. */
  var cacheGlobally: js.UndefOr[Boolean] = js.native
  /** Filter function applied to each stackTrace line. Lines which do not pass the filter won't be processesd. */
  var filter: js.UndefOr[js.Function1[/* line */ String, Boolean]] = js.native
  /** Whether to use synchronous ajax to load the sourcemaps. */
  var sync: js.UndefOr[Boolean] = js.native
}

object MapStackTraceOptions {
  @scala.inline
  def apply(): MapStackTraceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapStackTraceOptions]
  }
  @scala.inline
  implicit class MapStackTraceOptionsOps[Self <: MapStackTraceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheGlobally(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheGlobally")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheGlobally: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheGlobally")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: /* line */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(js.undefined)
        ret
    }
  }
  
}

