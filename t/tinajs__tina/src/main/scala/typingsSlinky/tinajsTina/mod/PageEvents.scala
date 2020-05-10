package typingsSlinky.tinajsTina.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageEvents extends js.Object {
  def onPageScroll(event: Page): Unit = js.native
  def onPullDownRefresh(event: Page): Unit = js.native
  def onReachBottom(event: Page): Unit = js.native
  def onShareAppMessage(event: Page): Unit = js.native
}

object PageEvents {
  @scala.inline
  def apply(
    onPageScroll: Page => Unit,
    onPullDownRefresh: Page => Unit,
    onReachBottom: Page => Unit,
    onShareAppMessage: Page => Unit
  ): PageEvents = {
    val __obj = js.Dynamic.literal(onPageScroll = js.Any.fromFunction1(onPageScroll), onPullDownRefresh = js.Any.fromFunction1(onPullDownRefresh), onReachBottom = js.Any.fromFunction1(onReachBottom), onShareAppMessage = js.Any.fromFunction1(onShareAppMessage))
    __obj.asInstanceOf[PageEvents]
  }
  @scala.inline
  implicit class PageEventsOps[Self <: PageEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnPageScroll(value: Page => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnPullDownRefresh(value: Page => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPullDownRefresh")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnReachBottom(value: Page => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReachBottom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnShareAppMessage(value: Page => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShareAppMessage")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

