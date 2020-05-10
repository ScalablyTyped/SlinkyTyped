package typingsSlinky.winrtUwp.Windows.Foundation

import typingsSlinky.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports asynchronous actions and operations. IAsyncInfo is a base interface for IAsyncAction , IAsyncActionWithProgress<TProgress> , IAsyncOperation<TResult> and IAsyncOperationWithProgress<TResult,TProgress> , each of which support combinations of return type and progress for an asynchronous method. */
@js.native
trait IAsyncInfo extends js.Object {
  /** Gets a string that describes an error condition of the asynchronous operation. */
  var errorCode: WinRTError = js.native
  /** Gets the handle of the asynchronous operation. */
  var id: Double = js.native
  /** Gets a value that indicates the status of the asynchronous operation. */
  var status: AsyncStatus = js.native
  /** Cancels the asynchronous operation. */
  def cancel(): Unit = js.native
  /** Closes the asynchronous operation. */
  def close(): Unit = js.native
}

object IAsyncInfo {
  @scala.inline
  def apply(cancel: () => Unit, close: () => Unit, errorCode: WinRTError, id: Double, status: AsyncStatus): IAsyncInfo = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), close = js.Any.fromFunction0(close), errorCode = errorCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAsyncInfo]
  }
  @scala.inline
  implicit class IAsyncInfoOps[Self <: IAsyncInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withErrorCode(value: WinRTError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: AsyncStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

