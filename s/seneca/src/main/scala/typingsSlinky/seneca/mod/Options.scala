package typingsSlinky.seneca.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.seneca.anon.Act
import typingsSlinky.seneca.anon.Actcaller
import typingsSlinky.seneca.anon.Active
import typingsSlinky.seneca.anon.Actrouter
import typingsSlinky.seneca.anon.Add
import typingsSlinky.seneca.anon.Basic
import typingsSlinky.seneca.anon.Host
import typingsSlinky.seneca.anon.Interval
import typingsSlinky.seneca.anon.Level
import typingsSlinky.seneca.anon.Local
import typingsSlinky.seneca.anon.Running
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends /* plugin_name */ StringDictionary[js.Any] {
  // Action cache. Makes inbound messages idempotent.
  var actcache: js.UndefOr[Active] = js.native
  // Default seneca-admin settings.
  // TODO: move to seneca-admin!
  var admin: js.UndefOr[Local] = js.native
  // Wait time for plugins to close gracefully.
  var deathdelay: js.UndefOr[Double] = js.native
  // Debug settings.
  var debug: js.UndefOr[Actcaller] = js.native
     // milliseconds
  // Register (true) default plugins. Set false to not register when
  // using custom versions.
  var default_plugins: js.UndefOr[Basic] = js.native
  var errhandler: js.UndefOr[GlobalErrorHandler] = js.native
  // Standard length of identifiers for actions.
  var idlen: js.UndefOr[Double] = js.native
  // Internal settings.
  var internal: js.UndefOr[Actrouter] = js.native
  var log: js.UndefOr[LogSpec | Level] = js.native
  // Plugin settings
  var plugin: js.UndefOr[js.Any] = js.native
  // Settings for network REPL.
  var repl: js.UndefOr[Host] = js.native
  // Action statistics settings. See rolling-stats module.
  var stats: js.UndefOr[Interval] = js.native
  // Log status at periodic intervals.
  var status: js.UndefOr[Running] = js.native
  // Enforce strict behaviours. Relax when backwards compatibility needed.
  var strict: js.UndefOr[Add] = js.native
  var tag: js.UndefOr[String] = js.native
  // Standard timeout for actions.
  var timeout: js.UndefOr[Double] = js.native
  // Action executor tracing. See gate-executor module.
  var trace: js.UndefOr[Act] = js.native
  // zig module settings for seneca.start() chaining.
  var zig: js.UndefOr[js.Any] = js.native
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
    def withActcache(value: Active): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actcache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActcache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actcache")(js.undefined)
        ret
    }
    @scala.inline
    def withAdmin(value: Local): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("admin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdmin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("admin")(js.undefined)
        ret
    }
    @scala.inline
    def withDeathdelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deathdelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeathdelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deathdelay")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Actcaller): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault_plugins(value: Basic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_plugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withErrhandler(value: /* error */ js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errhandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutErrhandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errhandler")(js.undefined)
        ret
    }
    @scala.inline
    def withIdlen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idlen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdlen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idlen")(js.undefined)
        ret
    }
    @scala.inline
    def withInternal(value: Actrouter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internal")(js.undefined)
        ret
    }
    @scala.inline
    def withLog(value: LogSpec | Level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugin(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin")(js.undefined)
        ret
    }
    @scala.inline
    def withRepl(value: Host): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repl")(js.undefined)
        ret
    }
    @scala.inline
    def withStats(value: Interval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Running): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict(value: Add): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTrace(value: Act): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(js.undefined)
        ret
    }
    @scala.inline
    def withZig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zig")(js.undefined)
        ret
    }
  }
  
}

