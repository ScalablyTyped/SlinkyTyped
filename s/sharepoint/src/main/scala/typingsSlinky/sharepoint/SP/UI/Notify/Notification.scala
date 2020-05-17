package typingsSlinky.sharepoint.SP.UI.Notify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notification extends js.Object {
  def Hide(bNoAnimate: Boolean): Unit = js.native
  def Show(bNoAnimate: Boolean): Unit = js.native
  def get_id(): String = js.native
}

object Notification {
  @scala.inline
  def apply(Hide: Boolean => Unit, Show: Boolean => Unit, get_id: () => String): Notification = {
    val __obj = js.Dynamic.literal(Hide = js.Any.fromFunction1(Hide), Show = js.Any.fromFunction1(Show), get_id = js.Any.fromFunction0(get_id))
    __obj.asInstanceOf[Notification]
  }
  @scala.inline
  implicit class NotificationOps[Self <: Notification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHide(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShow(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Show")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet_id(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_id")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

