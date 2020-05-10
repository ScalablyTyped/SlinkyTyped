package typingsSlinky.winjs.WinJS.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a range of indexes or keys in an ISelection.
  **/
@js.native
trait ISelectionRange extends js.Object {
  //#region Properties
  /**
    * Gets or sets the index of the first item in the range.
    **/
  var firstIndex: Double = js.native
  /**
    * Gets or sets the key of the first item in the range.
    **/
  var firstKey: js.Any = js.native
  /**
    * Gets or sets the index of the last item in the range.
    **/
  var lastIndex: Double = js.native
  /**
    * Gets or sets of the key of the last item in the range.
    **/
  var lastKey: js.Any = js.native
}

object ISelectionRange {
  @scala.inline
  def apply(firstIndex: Double, firstKey: js.Any, lastIndex: Double, lastKey: js.Any): ISelectionRange = {
    val __obj = js.Dynamic.literal(firstIndex = firstIndex.asInstanceOf[js.Any], firstKey = firstKey.asInstanceOf[js.Any], lastIndex = lastIndex.asInstanceOf[js.Any], lastKey = lastKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectionRange]
  }
  @scala.inline
  implicit class ISelectionRangeOps[Self <: ISelectionRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

