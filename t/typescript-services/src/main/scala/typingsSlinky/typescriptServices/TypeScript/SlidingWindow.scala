package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlidingWindow extends js.Object {
  var _pinCount: js.Any = js.native
  var currentRelativeItemIndex: Double = js.native
  var defaultValue: js.Any = js.native
  var firstPinnedAbsoluteIndex: js.Any = js.native
  var source: js.Any = js.native
  var sourceLength: js.Any = js.native
  var window: js.Array[_] = js.native
  var windowAbsoluteStartIndex: Double = js.native
  var windowCount: Double = js.native
  def absoluteIndex(): Double = js.native
  /* private */ def addMoreItemsToWindow(argument: js.Any): js.Any = js.native
  def currentItem(argument: js.Any): js.Any = js.native
  def disgardAllItemsFromCurrentIndexOnwards(): Unit = js.native
  def getAndPinAbsoluteIndex(): Double = js.native
  def isAtEndOfSource(): Boolean = js.native
  def moveToNextItem(): Unit = js.native
  def peekItemN(n: Double): js.Any = js.native
  def pinCount(): Double = js.native
  def releaseAndUnpinAbsoluteIndex(absoluteIndex: Double): Unit = js.native
  def rewindToPinnedIndex(absoluteIndex: Double): Unit = js.native
  def setAbsoluteIndex(absoluteIndex: Double): Unit = js.native
  /* private */ def tryShiftOrGrowWindow(): js.Any = js.native
  /* private */ def windowAbsoluteEndIndex(): js.Any = js.native
}

object SlidingWindow {
  @scala.inline
  def apply(
    _pinCount: js.Any,
    absoluteIndex: () => Double,
    addMoreItemsToWindow: js.Any => js.Any,
    currentItem: js.Any => js.Any,
    currentRelativeItemIndex: Double,
    defaultValue: js.Any,
    disgardAllItemsFromCurrentIndexOnwards: () => Unit,
    firstPinnedAbsoluteIndex: js.Any,
    getAndPinAbsoluteIndex: () => Double,
    isAtEndOfSource: () => Boolean,
    moveToNextItem: () => Unit,
    peekItemN: Double => js.Any,
    pinCount: () => Double,
    releaseAndUnpinAbsoluteIndex: Double => Unit,
    rewindToPinnedIndex: Double => Unit,
    setAbsoluteIndex: Double => Unit,
    source: js.Any,
    sourceLength: js.Any,
    tryShiftOrGrowWindow: () => js.Any,
    window: js.Array[_],
    windowAbsoluteEndIndex: () => js.Any,
    windowAbsoluteStartIndex: Double,
    windowCount: Double
  ): SlidingWindow = {
    val __obj = js.Dynamic.literal(_pinCount = _pinCount.asInstanceOf[js.Any], absoluteIndex = js.Any.fromFunction0(absoluteIndex), addMoreItemsToWindow = js.Any.fromFunction1(addMoreItemsToWindow), currentItem = js.Any.fromFunction1(currentItem), currentRelativeItemIndex = currentRelativeItemIndex.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], disgardAllItemsFromCurrentIndexOnwards = js.Any.fromFunction0(disgardAllItemsFromCurrentIndexOnwards), firstPinnedAbsoluteIndex = firstPinnedAbsoluteIndex.asInstanceOf[js.Any], getAndPinAbsoluteIndex = js.Any.fromFunction0(getAndPinAbsoluteIndex), isAtEndOfSource = js.Any.fromFunction0(isAtEndOfSource), moveToNextItem = js.Any.fromFunction0(moveToNextItem), peekItemN = js.Any.fromFunction1(peekItemN), pinCount = js.Any.fromFunction0(pinCount), releaseAndUnpinAbsoluteIndex = js.Any.fromFunction1(releaseAndUnpinAbsoluteIndex), rewindToPinnedIndex = js.Any.fromFunction1(rewindToPinnedIndex), setAbsoluteIndex = js.Any.fromFunction1(setAbsoluteIndex), source = source.asInstanceOf[js.Any], sourceLength = sourceLength.asInstanceOf[js.Any], tryShiftOrGrowWindow = js.Any.fromFunction0(tryShiftOrGrowWindow), window = window.asInstanceOf[js.Any], windowAbsoluteEndIndex = js.Any.fromFunction0(windowAbsoluteEndIndex), windowAbsoluteStartIndex = windowAbsoluteStartIndex.asInstanceOf[js.Any], windowCount = windowCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlidingWindow]
  }
  @scala.inline
  implicit class SlidingWindowOps[Self <: SlidingWindow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_pinCount(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_pinCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbsoluteIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absoluteIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAddMoreItemsToWindow(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMoreItemsToWindow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCurrentItem(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCurrentRelativeItemIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRelativeItemIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisgardAllItemsFromCurrentIndexOnwards(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disgardAllItemsFromCurrentIndexOnwards")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFirstPinnedAbsoluteIndex(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPinnedAbsoluteIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAndPinAbsoluteIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAndPinAbsoluteIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsAtEndOfSource(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAtEndOfSource")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMoveToNextItem(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToNextItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPeekItemN(value: Double => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peekItemN")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPinCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReleaseAndUnpinAbsoluteIndex(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseAndUnpinAbsoluteIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRewindToPinnedIndex(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewindToPinnedIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAbsoluteIndex(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAbsoluteIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceLength(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTryShiftOrGrowWindow(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryShiftOrGrowWindow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWindow(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowAbsoluteEndIndex(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowAbsoluteEndIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWindowAbsoluteStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowAbsoluteStartIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

