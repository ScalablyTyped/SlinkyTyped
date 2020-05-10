package typingsSlinky.shelljs

import typingsSlinky.node.NodeJS.ProcessEnv
import typingsSlinky.node.NodeJS.Signals
import typingsSlinky.shelljs.shelljsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined shelljs.shelljs.ExecOptions & {  async ? :false} */
@js.native
trait ExecOptionsasyncfalse extends js.Object {
  /**
  	 * Asynchronous execution.
  	 *
  	 * If a callback is provided, it will be set to `true`, regardless of the passed value.
  	 *
  	 * @default false
  	 */
  var async: js.UndefOr[Boolean with `false`] = js.native
  var cwd: js.UndefOr[String] = js.native
  /**
  	 * Character encoding to use.
  	 *
  	 * Affects the values returned by `stdout` and `stderr`,
  	 * and what is written to `stdout` and `stderr` when not in silent mode
  	 *
  	 * @default "utf8"
  	 */
  var encoding: js.UndefOr[String] = js.native
  var env: js.UndefOr[ProcessEnv] = js.native
  /**
  	 * Exit when command return code is non-zero.
  	 *
  	 * @default false
  	 */
  var fatal: js.UndefOr[Boolean] = js.native
  var gid: js.UndefOr[Double] = js.native
  var killSignal: js.UndefOr[Signals | Double] = js.native
  var maxBuffer: js.UndefOr[Double] = js.native
  var shell: js.UndefOr[String] = js.native
  /**
  	 * Do not echo program output to the console.
  	 *
  	 * @default false
  	 */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * @default 0
    */
  var timeout: js.UndefOr[Double] = js.native
  var uid: js.UndefOr[Double] = js.native
  /**
    * @default true
    */
  var windowsHide: js.UndefOr[Boolean] = js.native
}

object ExecOptionsasyncfalse {
  @scala.inline
  def apply(): ExecOptionsasyncfalse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecOptionsasyncfalse]
  }
  @scala.inline
  implicit class ExecOptionsasyncfalseOps[Self <: ExecOptionsasyncfalse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsync(value: Boolean with `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(js.undefined)
        ret
    }
    @scala.inline
    def withCwd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCwd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withEnv(value: ProcessEnv): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
    @scala.inline
    def withFatal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fatal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFatal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fatal")(js.undefined)
        ret
    }
    @scala.inline
    def withGid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gid")(js.undefined)
        ret
    }
    @scala.inline
    def withKillSignal(value: Signals | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("killSignal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKillSignal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("killSignal")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBuffer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withShell(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shell")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
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
    def withUid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowsHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowsHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsHide")(js.undefined)
        ret
    }
  }
  
}

