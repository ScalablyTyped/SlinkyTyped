package typingsSlinky.scrollbooster.mod

import typingsSlinky.scrollbooster.anon.PartialScrollBoosterOptio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollBooster extends js.Object {
  def destroy(): Unit = js.native
  def getState(): ScrollingState = js.native
  def scrollTo(position: Position): Unit = js.native
  def setPosition(position: Position): Unit = js.native
  def updateMetrics(): Unit = js.native
  def updateOptions(options: PartialScrollBoosterOptio): Unit = js.native
}

object ScrollBooster {
  @scala.inline
  def apply(
    destroy: () => Unit,
    getState: () => ScrollingState,
    scrollTo: Position => Unit,
    setPosition: Position => Unit,
    updateMetrics: () => Unit,
    updateOptions: PartialScrollBoosterOptio => Unit
  ): ScrollBooster = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getState = js.Any.fromFunction0(getState), scrollTo = js.Any.fromFunction1(scrollTo), setPosition = js.Any.fromFunction1(setPosition), updateMetrics = js.Any.fromFunction0(updateMetrics), updateOptions = js.Any.fromFunction1(updateOptions))
    __obj.asInstanceOf[ScrollBooster]
  }
  @scala.inline
  implicit class ScrollBoosterOps[Self <: ScrollBooster] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetState(value: () => ScrollingState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScrollTo(value: Position => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPosition(value: Position => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateMetrics(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMetrics")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdateOptions(value: PartialScrollBoosterOptio => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOptions")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

