package typingsSlinky.winrt.Windows.Storage.Search

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorageQueryResultBase extends js.Object {
  var folder: StorageFolder = js.native
  var oncontentschanged: js.Any = js.native
  var onoptionschanged: js.Any = js.native
  def applyNewQueryOptions(newQueryOptions: QueryOptions): Unit = js.native
  def findStartIndexAsync(value: js.Any): IAsyncOperation[Double] = js.native
  def getCurrentQueryOptions(): QueryOptions = js.native
  def getItemCountAsync(): IAsyncOperation[Double] = js.native
}

object IStorageQueryResultBase {
  @scala.inline
  def apply(
    applyNewQueryOptions: QueryOptions => Unit,
    findStartIndexAsync: js.Any => IAsyncOperation[Double],
    folder: StorageFolder,
    getCurrentQueryOptions: () => QueryOptions,
    getItemCountAsync: () => IAsyncOperation[Double],
    oncontentschanged: js.Any,
    onoptionschanged: js.Any
  ): IStorageQueryResultBase = {
    val __obj = js.Dynamic.literal(applyNewQueryOptions = js.Any.fromFunction1(applyNewQueryOptions), findStartIndexAsync = js.Any.fromFunction1(findStartIndexAsync), folder = folder.asInstanceOf[js.Any], getCurrentQueryOptions = js.Any.fromFunction0(getCurrentQueryOptions), getItemCountAsync = js.Any.fromFunction0(getItemCountAsync), oncontentschanged = oncontentschanged.asInstanceOf[js.Any], onoptionschanged = onoptionschanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStorageQueryResultBase]
  }
  @scala.inline
  implicit class IStorageQueryResultBaseOps[Self <: IStorageQueryResultBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyNewQueryOptions(value: QueryOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyNewQueryOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindStartIndexAsync(value: js.Any => IAsyncOperation[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findStartIndexAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFolder(value: StorageFolder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCurrentQueryOptions(value: () => QueryOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentQueryOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetItemCountAsync(value: () => IAsyncOperation[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemCountAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOncontentschanged(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncontentschanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnoptionschanged(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onoptionschanged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

