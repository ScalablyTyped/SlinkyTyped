package typingsSlinky.sharepoint.Srch.U

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadScriptsState extends js.Object {
  var progress: Double = js.native
  var scriptsToLoad: js.Any = js.native
  var timeoutHandle: js.Any = js.native
}

object LoadScriptsState {
  @scala.inline
  def apply(progress: Double, scriptsToLoad: js.Any, timeoutHandle: js.Any): LoadScriptsState = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], scriptsToLoad = scriptsToLoad.asInstanceOf[js.Any], timeoutHandle = timeoutHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadScriptsState]
  }
  @scala.inline
  implicit class LoadScriptsStateOps[Self <: LoadScriptsState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScriptsToLoad(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptsToLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeoutHandle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutHandle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

