package typingsSlinky.wordpressNux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofimportedActions extends js.Object {
  def disableTips(): Unit = js.native
  def dismissTip(id: String): Unit = js.native
  def enableTips(): Unit = js.native
  def triggerGuide(tipIds: js.Array[String]): Unit = js.native
}

object TypeofimportedActions {
  @scala.inline
  def apply(
    disableTips: () => Unit,
    dismissTip: String => Unit,
    enableTips: () => Unit,
    triggerGuide: js.Array[String] => Unit
  ): TypeofimportedActions = {
    val __obj = js.Dynamic.literal(disableTips = js.Any.fromFunction0(disableTips), dismissTip = js.Any.fromFunction1(dismissTip), enableTips = js.Any.fromFunction0(enableTips), triggerGuide = js.Any.fromFunction1(triggerGuide))
    __obj.asInstanceOf[TypeofimportedActions]
  }
  @scala.inline
  implicit class TypeofimportedActionsOps[Self <: TypeofimportedActions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableTips(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTips")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDismissTip(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissTip")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnableTips(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTips")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTriggerGuide(value: js.Array[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerGuide")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

