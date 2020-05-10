package typingsSlinky.terminalKit.terminalMod

import typingsSlinky.node.NodeJS.Process
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOptions extends js.Object {
  var appId: String = js.native
  var appName: String = js.native
  var generic: js.UndefOr[String] = js.native
  var isSSH: js.UndefOr[Boolean] = js.native
  var isTTY: js.UndefOr[Boolean] = js.native
  var pid: js.UndefOr[js.Any] = js.native
  var preferProcessSigwinch: js.UndefOr[Boolean] = js.native
  var processSigwinch: js.UndefOr[Boolean] = js.native
  var stderr: js.UndefOr[Process] = js.native
  var stdin: js.UndefOr[Process] = js.native
  var stdout: js.UndefOr[Process] = js.native
}

object CreateOptions {
  @scala.inline
  def apply(appId: String, appName: String): CreateOptions = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOptions]
  }
  @scala.inline
  implicit class CreateOptionsOps[Self <: CreateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeneric(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeneric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generic")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSSH(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSSH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSSH: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSSH")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTTY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTTY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTTY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTTY")(js.undefined)
        ret
    }
    @scala.inline
    def withPid(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pid")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferProcessSigwinch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferProcessSigwinch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferProcessSigwinch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferProcessSigwinch")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessSigwinch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processSigwinch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessSigwinch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processSigwinch")(js.undefined)
        ret
    }
    @scala.inline
    def withStderr(value: Process): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stderr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStderr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stderr")(js.undefined)
        ret
    }
    @scala.inline
    def withStdin(value: Process): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdin")(js.undefined)
        ret
    }
    @scala.inline
    def withStdout(value: Process): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdout")(js.undefined)
        ret
    }
  }
  
}

