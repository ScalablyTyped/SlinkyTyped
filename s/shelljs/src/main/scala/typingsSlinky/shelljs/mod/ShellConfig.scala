package typingsSlinky.shelljs.mod

import typingsSlinky.glob.mod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShellConfig extends js.Object {
  /**
  	 * Absolute path of the Node binary. Default is null (inferred).
  	 */
  var execPath: String | Null = js.native
  /**
  	 * If true the script will die on errors. Default is false.
  	 */
  var fatal: Boolean = js.native
  /**
  	 * Passed to glob.sync() instead of the default options ({}).
  	 */
  var globOptions: IOptions = js.native
  /**
  	 * Suppresses all command output if true, except for echo() calls. Default is false.
  	 */
  var silent: Boolean = js.native
  /**
  	 * Will print each executed command to the screen.
  	 *
  	 * @default false
  	 */
  var verbose: Boolean = js.native
  /**
  	 * Reset shell.config to the defaults.
  	 */
  def reset(): Unit = js.native
}

object ShellConfig {
  @scala.inline
  def apply(fatal: Boolean, globOptions: IOptions, reset: () => Unit, silent: Boolean, verbose: Boolean): ShellConfig = {
    val __obj = js.Dynamic.literal(fatal = fatal.asInstanceOf[js.Any], globOptions = globOptions.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), silent = silent.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellConfig]
  }
  @scala.inline
  implicit class ShellConfigOps[Self <: ShellConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFatal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fatal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobOptions(value: IOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecPathNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execPath")(null)
        ret
    }
  }
  
}

