package typingsSlinky.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sheet extends js.Object {
  /**
    * Sets the size information on a sheet. Note that if the sheet is a Worksheet,
    * only SheetSizeBehavior.AUTOMATIC is allowed since you can’t actually set a Worksheet to a fixed size.
    */
  def changeSizeAsync(options: SheetSizeOptions): js.Promise[SheetSizeOptions] = js.native
  /** Gets the index of the sheet within the published tabs. Note that hidden tabs are still counted in the ordering, as long as they are published. */
  def getIndex(): Double = js.native
  /** Gets a value indicating whether the sheet is the currently active sheet. */
  def getIsActive(): Boolean = js.native
  /**
    * Gets a value indicating whether the sheet is hidden in the UI.
    * Note that if the entire tab control is hidden, it does not affect the state of this flag.
    * This sheet may still report that it is visible even when the tabs control is hidden.
    */
  def getIsHidden(): Boolean = js.native
  /** Gets the name of the sheet. */
  def getName(): String = js.native
  /** Gets the type of the sheet. SheetType is an enum with the following values: WORKSHEET , DASHBOARD and STORY. */
  def getSheetType(): SheetType = js.native
  /** Gets the size information that the author specified when publishing the workbook. */
  def getSize(): SheetSizeOptions = js.native
  /** Gets the URL for this sheet. */
  def getUrl(): String = js.native
  /** Gets the Workbook to which this Sheet belongs. */
  def getWorkbook(): Workbook = js.native
}

object Sheet {
  @scala.inline
  def apply(
    changeSizeAsync: SheetSizeOptions => js.Promise[SheetSizeOptions],
    getIndex: () => Double,
    getIsActive: () => Boolean,
    getIsHidden: () => Boolean,
    getName: () => String,
    getSheetType: () => SheetType,
    getSize: () => SheetSizeOptions,
    getUrl: () => String,
    getWorkbook: () => Workbook
  ): Sheet = {
    val __obj = js.Dynamic.literal(changeSizeAsync = js.Any.fromFunction1(changeSizeAsync), getIndex = js.Any.fromFunction0(getIndex), getIsActive = js.Any.fromFunction0(getIsActive), getIsHidden = js.Any.fromFunction0(getIsHidden), getName = js.Any.fromFunction0(getName), getSheetType = js.Any.fromFunction0(getSheetType), getSize = js.Any.fromFunction0(getSize), getUrl = js.Any.fromFunction0(getUrl), getWorkbook = js.Any.fromFunction0(getWorkbook))
    __obj.asInstanceOf[Sheet]
  }
  @scala.inline
  implicit class SheetOps[Self <: Sheet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeSizeAsync(value: SheetSizeOptions => js.Promise[SheetSizeOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeSizeAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIsActive(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIsActive")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIsHidden(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIsHidden")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSheetType(value: () => SheetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSheetType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSize(value: () => SheetSizeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWorkbook(value: () => Workbook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWorkbook")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

