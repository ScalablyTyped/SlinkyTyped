package typingsSlinky.ssh2.mod

import typingsSlinky.node.NodeJS.ProcessEnv
import typingsSlinky.ssh2.ssh2Booleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecOptions extends js.Object {
  /** An environment to use for the execution of the command. */
  var env: js.UndefOr[ProcessEnv] = js.native
  /** Set to `true` to allocate a pseudo-tty with defaults, or an object containing specific pseudo-tty settings. */
  var pty: js.UndefOr[`true` | PseudoTtyOptions] = js.native
  /** Set either to `true` to use defaults, a number to specify a specific screen number, or an object containing x11 settings. */
  var x11: js.UndefOr[Boolean | Double | X11Options] = js.native
}

object ExecOptions {
  @scala.inline
  def apply(): ExecOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecOptions]
  }
  @scala.inline
  implicit class ExecOptionsOps[Self <: ExecOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withPty(value: `true` | PseudoTtyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pty")(js.undefined)
        ret
    }
    @scala.inline
    def withX11(value: Boolean | Double | X11Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x11")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX11: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x11")(js.undefined)
        ret
    }
  }
  
}

