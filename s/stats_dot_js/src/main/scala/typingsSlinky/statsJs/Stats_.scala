package typingsSlinky.statsJs

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.statsJs.Stats.Panel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stats_ extends js.Object {
  var REVISION: Double = js.native
  var dom: HTMLDivElement = js.native
  def addPanel(panel: Panel): Panel = js.native
  def begin(): Unit = js.native
  def end(): Double = js.native
  /**
    * @param value 0:fps, 1: ms, 2: mb, 3+: custom
    */
  def showPanel(value: Double): Unit = js.native
  def update(): Unit = js.native
}

object Stats_ {
  @scala.inline
  def apply(
    REVISION: Double,
    addPanel: Panel => Panel,
    begin: () => Unit,
    dom: HTMLDivElement,
    end: () => Double,
    showPanel: Double => Unit,
    update: () => Unit
  ): Stats_ = {
    val __obj = js.Dynamic.literal(REVISION = REVISION.asInstanceOf[js.Any], addPanel = js.Any.fromFunction1(addPanel), begin = js.Any.fromFunction0(begin), dom = dom.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), showPanel = js.Any.fromFunction1(showPanel), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Stats_]
  }
  @scala.inline
  implicit class Stats_Ops[Self <: Stats_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withREVISION(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("REVISION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddPanel(value: Panel => Panel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPanel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBegin(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDom(value: HTMLDivElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowPanel(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPanel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

