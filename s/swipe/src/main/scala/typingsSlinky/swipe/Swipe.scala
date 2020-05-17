package typingsSlinky.swipe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Swipe extends js.Object {
  def attachEvents(): Unit = js.native
  def getNumSlides(): Double = js.native
  def getPos(): Double = js.native
  def kill(): Unit = js.native
  def next(): Unit = js.native
  def prev(): Unit = js.native
  def setup(): Unit = js.native
  def slide(index: Double, duration: Double): Unit = js.native
}

object Swipe {
  @scala.inline
  def apply(
    attachEvents: () => Unit,
    getNumSlides: () => Double,
    getPos: () => Double,
    kill: () => Unit,
    next: () => Unit,
    prev: () => Unit,
    setup: () => Unit,
    slide: (Double, Double) => Unit
  ): Swipe = {
    val __obj = js.Dynamic.literal(attachEvents = js.Any.fromFunction0(attachEvents), getNumSlides = js.Any.fromFunction0(getNumSlides), getPos = js.Any.fromFunction0(getPos), kill = js.Any.fromFunction0(kill), next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), setup = js.Any.fromFunction0(setup), slide = js.Any.fromFunction2(slide))
    __obj.asInstanceOf[Swipe]
  }
  @scala.inline
  implicit class SwipeOps[Self <: Swipe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachEvents(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachEvents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNumSlides(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNumSlides")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPos(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPos")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKill(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kill")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNext(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrev(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetup(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSlide(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

