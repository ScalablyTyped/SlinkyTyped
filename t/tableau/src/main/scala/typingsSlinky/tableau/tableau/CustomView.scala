package typingsSlinky.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomView extends js.Object {
  /** Indicates whether the custom view is public or private. */
  def getAdvertised(): Boolean = js.native
  /** Gets or sets whether this is the default custom view. */
  def getDefault(): Boolean = js.native
  /** User-friendly name for the custom view */
  def getName(): String = js.native
  /** Gets the user that created the custom view. */
  def getOwnerName(): String = js.native
  /** Unique URL to load this view again. */
  def getUrl(): String = js.native
  /** Gets the Workbook to which this CustomView belongs. */
  def getWorkbook(): Workbook = js.native
  /** After saveAsync() is called, the result of the getUrl method is no longer blank. */
  def saveAsync(): js.Promise[CustomView] = js.native
  /** Indicates whether the custom view is public or private. */
  def setAdvertised(bool: Boolean): Boolean = js.native
  /** User-friendly name for the custom view */
  def setName(name: String): String = js.native
}

object CustomView {
  @scala.inline
  def apply(
    getAdvertised: () => Boolean,
    getDefault: () => Boolean,
    getName: () => String,
    getOwnerName: () => String,
    getUrl: () => String,
    getWorkbook: () => Workbook,
    saveAsync: () => js.Promise[CustomView],
    setAdvertised: Boolean => Boolean,
    setName: String => String
  ): CustomView = {
    val __obj = js.Dynamic.literal(getAdvertised = js.Any.fromFunction0(getAdvertised), getDefault = js.Any.fromFunction0(getDefault), getName = js.Any.fromFunction0(getName), getOwnerName = js.Any.fromFunction0(getOwnerName), getUrl = js.Any.fromFunction0(getUrl), getWorkbook = js.Any.fromFunction0(getWorkbook), saveAsync = js.Any.fromFunction0(saveAsync), setAdvertised = js.Any.fromFunction1(setAdvertised), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[CustomView]
  }
  @scala.inline
  implicit class CustomViewOps[Self <: CustomView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAdvertised(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAdvertised")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDefault(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOwnerName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOwnerName")(js.Any.fromFunction0(value))
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
    @scala.inline
    def withSaveAsync(value: () => js.Promise[CustomView]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetAdvertised(value: Boolean => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAdvertised")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetName(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setName")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

