package typingsSlinky.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Story extends Sheet {
  /** Activates the next story point if there is one. If the current story point is the last one, then is stays active. */
  def activateNextStoryPointAsync(): js.Promise[StoryPoint] = js.native
  /** Activates the previous story point if there is one. If the current story point is the first one, then it stays active. */
  def activatePreviousStoryPointAsync(): js.Promise[StoryPoint] = js.native
  /**
    * Activates the story point at the specified index and returns a promise of the activated StoryPoint.
    * Throws a tableau.ErrorCode.INDEX_OUT_OF_RANGE error if the index is less than zero or greater than or equal to the number of story points in the array.
    */
  def activateStoryPointAsync(index: Double): js.Promise[StoryPoint] = js.native
  /** Gets the currently active story point. */
  def getActiveStoryPoint(): StoryPoint = js.native
  /**
    * Gets an array (not a collection) of StoryPointInfo objects.
    * Note that this is not a collection, since we don’t have a unique string key for a story point.
    * We only need ordinal access to the story points (by index).
    */
  def getStoryPointsInfo(): js.Array[StoryPointInfo] = js.native
  /**
    * Reverts the story point at the specified index and returns a promise of the reverted StoryPoint.
    * Throws a tableau.ErrorCode.INDEX_OUT_OF_RANGE error if the index is less than zero or greater than or equal to the number of story points in the array.
    */
  def revertStoryPointAsync(index: Double): js.Promise[StoryPoint] = js.native
}

object Story {
  @scala.inline
  def apply(
    activateNextStoryPointAsync: () => js.Promise[StoryPoint],
    activatePreviousStoryPointAsync: () => js.Promise[StoryPoint],
    activateStoryPointAsync: Double => js.Promise[StoryPoint],
    changeSizeAsync: SheetSizeOptions => js.Promise[SheetSizeOptions],
    getActiveStoryPoint: () => StoryPoint,
    getIndex: () => Double,
    getIsActive: () => Boolean,
    getIsHidden: () => Boolean,
    getName: () => String,
    getSheetType: () => SheetType,
    getSize: () => SheetSizeOptions,
    getStoryPointsInfo: () => js.Array[StoryPointInfo],
    getUrl: () => String,
    getWorkbook: () => Workbook,
    revertStoryPointAsync: Double => js.Promise[StoryPoint]
  ): Story = {
    val __obj = js.Dynamic.literal(activateNextStoryPointAsync = js.Any.fromFunction0(activateNextStoryPointAsync), activatePreviousStoryPointAsync = js.Any.fromFunction0(activatePreviousStoryPointAsync), activateStoryPointAsync = js.Any.fromFunction1(activateStoryPointAsync), changeSizeAsync = js.Any.fromFunction1(changeSizeAsync), getActiveStoryPoint = js.Any.fromFunction0(getActiveStoryPoint), getIndex = js.Any.fromFunction0(getIndex), getIsActive = js.Any.fromFunction0(getIsActive), getIsHidden = js.Any.fromFunction0(getIsHidden), getName = js.Any.fromFunction0(getName), getSheetType = js.Any.fromFunction0(getSheetType), getSize = js.Any.fromFunction0(getSize), getStoryPointsInfo = js.Any.fromFunction0(getStoryPointsInfo), getUrl = js.Any.fromFunction0(getUrl), getWorkbook = js.Any.fromFunction0(getWorkbook), revertStoryPointAsync = js.Any.fromFunction1(revertStoryPointAsync))
    __obj.asInstanceOf[Story]
  }
  @scala.inline
  implicit class StoryOps[Self <: Story] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivateNextStoryPointAsync(value: () => js.Promise[StoryPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activateNextStoryPointAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withActivatePreviousStoryPointAsync(value: () => js.Promise[StoryPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activatePreviousStoryPointAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withActivateStoryPointAsync(value: Double => js.Promise[StoryPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activateStoryPointAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetActiveStoryPoint(value: () => StoryPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveStoryPoint")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStoryPointsInfo(value: () => js.Array[StoryPointInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStoryPointsInfo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRevertStoryPointAsync(value: Double => js.Promise[StoryPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revertStoryPointAsync")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

