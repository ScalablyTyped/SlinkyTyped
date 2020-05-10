package typingsSlinky.winjs.WinJS.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains items that were requested from an IListDataAdapter and provides some information about those items.
  **/
@js.native
trait IFetchResult[T] extends js.Object {
  //#region Properties
  /**
    * Gets or sets the index of the requested item in the IListDataAdapter object's data source.
    **/
  var absoluteIndex: Double = js.native
  /**
    * Gets or sets a value that indicates whether this IFetchResult contains the last items at the end of the IListDataAdapter object's data source.
    **/
  var atEnd: Boolean = js.native
  /**
    * Gets or sets a value that indicates whether this IFetchResult contains the first items at the beginning of the IListDataAdapter object's data source.
    **/
  var atStart: Boolean = js.native
  /**
    * Gets or sets the items returned by the fetch operation.
    **/
  var items: js.Array[T] = js.native
  /**
    * Gets or sets the location of the requested item within the items array.
    **/
  var offset: Double = js.native
  /**
    * Gets or sets the number of items in the IListDataAdapter object's underlying data source.
    **/
  var totalCount: Double = js.native
}

object IFetchResult {
  @scala.inline
  def apply[T](
    absoluteIndex: Double,
    atEnd: Boolean,
    atStart: Boolean,
    items: js.Array[T],
    offset: Double,
    totalCount: Double
  ): IFetchResult[T] = {
    val __obj = js.Dynamic.literal(absoluteIndex = absoluteIndex.asInstanceOf[js.Any], atEnd = atEnd.asInstanceOf[js.Any], atStart = atStart.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFetchResult[T]]
  }
  @scala.inline
  implicit class IFetchResultOps[Self[t] <: IFetchResult[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAbsoluteIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absoluteIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAtEnd(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAtStart(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalCount(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

