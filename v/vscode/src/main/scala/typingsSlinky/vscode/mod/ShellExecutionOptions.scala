package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShellExecutionOptions extends js.Object {
  /**
  		 * The current working directory of the executed shell.
  		 * If omitted the tools current workspace root is used.
  		 */
  var cwd: js.UndefOr[String] = js.native
  /**
  		 * The additional environment of the executed shell. If omitted
  		 * the parent process' environment is used. If provided it is merged with
  		 * the parent process' environment.
  		 */
  var env: js.UndefOr[StringDictionary[String]] = js.native
  /**
  		 * The shell executable.
  		 */
  var executable: js.UndefOr[String] = js.native
  /**
  		 * The arguments to be passed to the shell executable used to run the task. Most shells
  		 * require special arguments to execute a command. For  example `bash` requires the `-c`
  		 * argument to execute a command, `PowerShell` requires `-Command` and `cmd` requires both
  		 * `/d` and `/c`.
  		 */
  var shellArgs: js.UndefOr[js.Array[String]] = js.native
  /**
  		 * The shell quotes supported by this shell.
  		 */
  var shellQuoting: js.UndefOr[ShellQuotingOptions] = js.native
}

object ShellExecutionOptions {
  @scala.inline
  def apply(): ShellExecutionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShellExecutionOptions]
  }
  @scala.inline
  implicit class ShellExecutionOptionsOps[Self <: ShellExecutionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withEnv(value: StringDictionary[String]): Self = {
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
    def withExecutable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executable")(js.undefined)
        ret
    }
    @scala.inline
    def withShellArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shellArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShellArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shellArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withShellQuoting(value: ShellQuotingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shellQuoting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShellQuoting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shellQuoting")(js.undefined)
        ret
    }
  }
  
}

