package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatchOptions
  extends /* option */ StringDictionary[js.UndefOr[CompilerOptionsValue]] {
  var fallbackPolling: js.UndefOr[PollingWatchKind] = js.native
  var synchronousWatchDirectory: js.UndefOr[Boolean] = js.native
  var watchDirectory: js.UndefOr[WatchDirectoryKind] = js.native
  var watchFile: js.UndefOr[WatchFileKind] = js.native
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
    def withFallbackPolling(value: PollingWatchKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackPolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackPolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackPolling")(js.undefined)
        ret
    }
    @scala.inline
    def withSynchronousWatchDirectory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronousWatchDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSynchronousWatchDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronousWatchDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchDirectory(value: WatchDirectoryKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchFile(value: WatchFileKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchFile")(js.undefined)
        ret
    }
  }
  
}

