package typingsSlinky.unityWebapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Unity extends js.Object {
  var Launcher: UnityLauncher = js.native
  var MediaPlayer: UnityMediaPlayer = js.native
  var MessagingIndicator: UnityMessagingIndicator = js.native
  var Notification: UnityNotification = js.native
  def addAction(name: String, callback: js.Function): js.Any = js.native
  def init(settings: UnitySettings): js.Any = js.native
  def removeAction(actionName: String): js.Any = js.native
  def removeActions(): js.Any = js.native
}

object Unity {
  @scala.inline
  def apply(
    Launcher: UnityLauncher,
    MediaPlayer: UnityMediaPlayer,
    MessagingIndicator: UnityMessagingIndicator,
    Notification: UnityNotification,
    addAction: (String, js.Function) => js.Any,
    init: UnitySettings => js.Any,
    removeAction: String => js.Any,
    removeActions: () => js.Any
  ): Unity = {
    val __obj = js.Dynamic.literal(Launcher = Launcher.asInstanceOf[js.Any], MediaPlayer = MediaPlayer.asInstanceOf[js.Any], MessagingIndicator = MessagingIndicator.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], addAction = js.Any.fromFunction2(addAction), init = js.Any.fromFunction1(init), removeAction = js.Any.fromFunction1(removeAction), removeActions = js.Any.fromFunction0(removeActions))
    __obj.asInstanceOf[Unity]
  }
  @scala.inline
  implicit class UnityOps[Self <: Unity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLauncher(value: UnityLauncher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Launcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaPlayer(value: UnityMediaPlayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaPlayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessagingIndicator(value: UnityMessagingIndicator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessagingIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotification(value: UnityNotification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Notification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddAction(value: (String, js.Function) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInit(value: UnitySettings => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveAction(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveActions(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeActions")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

