package typingsSlinky.winrt.Windows.Storage

import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import typingsSlinky.winrt.Windows.Foundation.IClosable
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorageStreamTransaction extends IClosable {
  var stream: IRandomAccessStream = js.native
  def commitAsync(): IAsyncAction = js.native
}

object IStorageStreamTransaction {
  @scala.inline
  def apply(close: () => Unit, commitAsync: () => IAsyncAction, stream: IRandomAccessStream): IStorageStreamTransaction = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), commitAsync = js.Any.fromFunction0(commitAsync), stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStorageStreamTransaction]
  }
  @scala.inline
  implicit class IStorageStreamTransactionOps[Self <: IStorageStreamTransaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommitAsync(value: () => IAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStream(value: IRandomAccessStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

