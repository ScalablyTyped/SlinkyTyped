package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugAdapterTracker extends js.Object {
  /**
  		 * The debug adapter has sent a Debug Adapter Protocol message to VS Code.
  		 */
  var onDidSendMessage: js.UndefOr[js.Function1[/* message */ js.Any, Unit]] = js.native
  /**
  		 * An error with the debug adapter has occurred.
  		 */
  var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
  /**
  		 * The debug adapter has exited with the given exit code or signal.
  		 */
  var onExit: js.UndefOr[
    js.Function2[/* code */ js.UndefOr[Double], /* signal */ js.UndefOr[String], Unit]
  ] = js.native
  /**
  		 * The debug adapter is about to receive a Debug Adapter Protocol message from VS Code.
  		 */
  var onWillReceiveMessage: js.UndefOr[js.Function1[/* message */ js.Any, Unit]] = js.native
  /**
  		 * A session with the debug adapter is about to be started.
  		 */
  var onWillStartSession: js.UndefOr[js.Function0[Unit]] = js.native
  /**
  		 * The debug adapter session is about to be stopped.
  		 */
  var onWillStopSession: js.UndefOr[js.Function0[Unit]] = js.native
}

object DebugAdapterTracker {
  @scala.inline
  def apply(): DebugAdapterTracker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugAdapterTracker]
  }
  @scala.inline
  implicit class DebugAdapterTrackerOps[Self <: DebugAdapterTracker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnDidSendMessage(value: /* message */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidSendMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDidSendMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidSendMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: /* error */ js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExit(value: (/* code */ js.UndefOr[Double], /* signal */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWillReceiveMessage(value: /* message */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWillReceiveMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnWillReceiveMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWillReceiveMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWillStartSession(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWillStartSession")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnWillStartSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWillStartSession")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWillStopSession(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWillStopSession")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnWillStopSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWillStopSession")(js.undefined)
        ret
    }
  }
  
}

