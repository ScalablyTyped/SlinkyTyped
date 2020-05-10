package typingsSlinky.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 网络请求任务对象
  */
@js.native
trait RequestTask extends js.Object {
  //  中断请求任务
  def abort(): Unit = js.native
  //  取消监听 HTTP Response Header 事件
  def offHeadersReceived(callback: DataResponseCallback): Unit = js.native
  //  监听 HTTP Response Header 事件。会比请求完成事件更早
  def onHeadersReceived(callback: DataResponseCallback): Unit = js.native
}

object RequestTask {
  @scala.inline
  def apply(
    abort: () => Unit,
    offHeadersReceived: DataResponseCallback => Unit,
    onHeadersReceived: DataResponseCallback => Unit
  ): RequestTask = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), offHeadersReceived = js.Any.fromFunction1(offHeadersReceived), onHeadersReceived = js.Any.fromFunction1(onHeadersReceived))
    __obj.asInstanceOf[RequestTask]
  }
  @scala.inline
  implicit class RequestTaskOps[Self <: RequestTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbort(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOffHeadersReceived(value: DataResponseCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offHeadersReceived")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnHeadersReceived(value: DataResponseCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHeadersReceived")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

