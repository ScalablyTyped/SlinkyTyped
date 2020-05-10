package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminalOptions extends js.Object {
  /**
  		 * A path or Uri for the current working directory to be used for the terminal.
  		 */
  var cwd: js.UndefOr[String | Uri] = js.native
  /**
  		 * Object with environment variables that will be added to the VS Code process.
  		 */
  var env: js.UndefOr[StringDictionary[String | Null]] = js.native
  /**
  		 * When enabled the terminal will run the process as normal but not be surfaced to the user
  		 * until `Terminal.show` is called. The typical usage for this is when you need to run
  		 * something that may need interactivity but only want to tell the user about it when
  		 * interaction is needed. Note that the terminals will still be exposed to all extensions
  		 * as normal.
  		 */
  var hideFromUser: js.UndefOr[Boolean] = js.native
  /**
  		 * A human-readable string which will be used to represent the terminal in the UI.
  		 */
  var name: js.UndefOr[String] = js.native
  /**
  		 * Args for the custom shell executable. A string can be used on Windows only which allows
  		 * specifying shell args in [command-line format](https://msdn.microsoft.com/en-au/08dfcab2-eb6e-49a4-80eb-87d4076c98c6).
  		 */
  var shellArgs: js.UndefOr[js.Array[String] | String] = js.native
  /**
  		 * A path to a custom shell executable to be used in the terminal.
  		 */
  var shellPath: js.UndefOr[String] = js.native
  /**
  		 * Whether the terminal process environment should be exactly as provided in
  		 * `TerminalOptions.env`. When this is false (default), the environment will be based on the
  		 * window's environment and also apply configured platform settings like
  		 * `terminal.integrated.windows.env` on top. When this is true, the complete environment
  		 * must be provided as nothing will be inherited from the process or any configuration.
  		 */
  var strictEnv: js.UndefOr[Boolean] = js.native
}

object TerminalOptions {
  @scala.inline
  def apply(): TerminalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminalOptions]
  }
  @scala.inline
  implicit class TerminalOptionsOps[Self <: TerminalOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCwd(value: String | Uri): Self = {
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
    def withEnv(value: StringDictionary[String | Null]): Self = {
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
    def withHideFromUser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFromUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideFromUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFromUser")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
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
    def withShellArgs(value: js.Array[String] | String): Self = {
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
    def withShellPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shellPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShellPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shellPath")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictEnv(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictEnv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictEnv")(js.undefined)
        ret
    }
  }
  
}

