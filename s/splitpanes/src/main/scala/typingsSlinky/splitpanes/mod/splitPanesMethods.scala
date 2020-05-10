package typingsSlinky.splitpanes.mod

import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait splitPanesMethods extends js.Object {
  def bindEvents(): Unit = js.native
  def calculatePanesSize(drag: js.Object): Boolean | Unit = js.native
  def doPushOtherPanes(sums: js.Object, dragPercentage: Double): js.Any = js.native
  def findNextExpandedPane(splitterIndex: Double): js.Object = js.native
  def findPrevExpandedPane(splitterIndex: Double): js.Object = js.native
  def getCurrentDragPercentage(drag: js.Object): Double = js.native
  def getCurrentMouseDrag(e: Event_): positionTypes = js.native
  def onMouseDown(e: Event_, splitterIndex: Double): Unit = js.native
  def onMouseMove(e: Event_): Unit = js.native
  def onMouseUp(): Unit = js.native
  def onSplitterClick(e: Event_, splitterIndex: Double): Unit = js.native
  def onSplitterDblClick(e: Event_, splitterIndex: Double): Unit = js.native
  def sumNextPanesSize(splitterIndex: Double): js.Object = js.native
  def sumPrevPanesSize(splitterIndex: Double): js.Object = js.native
}

object splitPanesMethods {
  @scala.inline
  def apply(
    bindEvents: () => Unit,
    calculatePanesSize: js.Object => Boolean | Unit,
    doPushOtherPanes: (js.Object, Double) => js.Any,
    findNextExpandedPane: Double => js.Object,
    findPrevExpandedPane: Double => js.Object,
    getCurrentDragPercentage: js.Object => Double,
    getCurrentMouseDrag: Event_ => positionTypes,
    onMouseDown: (Event_, Double) => Unit,
    onMouseMove: Event_ => Unit,
    onMouseUp: () => Unit,
    onSplitterClick: (Event_, Double) => Unit,
    onSplitterDblClick: (Event_, Double) => Unit,
    sumNextPanesSize: Double => js.Object,
    sumPrevPanesSize: Double => js.Object
  ): splitPanesMethods = {
    val __obj = js.Dynamic.literal(bindEvents = js.Any.fromFunction0(bindEvents), calculatePanesSize = js.Any.fromFunction1(calculatePanesSize), doPushOtherPanes = js.Any.fromFunction2(doPushOtherPanes), findNextExpandedPane = js.Any.fromFunction1(findNextExpandedPane), findPrevExpandedPane = js.Any.fromFunction1(findPrevExpandedPane), getCurrentDragPercentage = js.Any.fromFunction1(getCurrentDragPercentage), getCurrentMouseDrag = js.Any.fromFunction1(getCurrentMouseDrag), onMouseDown = js.Any.fromFunction2(onMouseDown), onMouseMove = js.Any.fromFunction1(onMouseMove), onMouseUp = js.Any.fromFunction0(onMouseUp), onSplitterClick = js.Any.fromFunction2(onSplitterClick), onSplitterDblClick = js.Any.fromFunction2(onSplitterDblClick), sumNextPanesSize = js.Any.fromFunction1(sumNextPanesSize), sumPrevPanesSize = js.Any.fromFunction1(sumPrevPanesSize))
    __obj.asInstanceOf[splitPanesMethods]
  }
  @scala.inline
  implicit class splitPanesMethodsOps[Self <: splitPanesMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindEvents(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindEvents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCalculatePanesSize(value: js.Object => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculatePanesSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDoPushOtherPanes(value: (js.Object, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doPushOtherPanes")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFindNextExpandedPane(value: Double => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findNextExpandedPane")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindPrevExpandedPane(value: Double => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findPrevExpandedPane")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCurrentDragPercentage(value: js.Object => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentDragPercentage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCurrentMouseDrag(value: Event_ => positionTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentMouseDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnMouseDown(value: (Event_, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnMouseMove(value: Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnMouseUp(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnSplitterClick(value: (Event_, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSplitterClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnSplitterDblClick(value: (Event_, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSplitterDblClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSumNextPanesSize(value: Double => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sumNextPanesSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSumPrevPanesSize(value: Double => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sumPrevPanesSize")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

