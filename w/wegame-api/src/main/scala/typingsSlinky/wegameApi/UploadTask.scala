package typingsSlinky.wegameApi

import typingsSlinky.wegameApi.anon.TotalBytesExpectedToSend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadTask extends js.Object {
  /**
    * 中断上传任务
    */
  def abort(): Unit = js.native
  /**
    * 监听上传进度变化事件
    * @param callback.res.progress 上传进度百分比
    * @param callback.res.totalBytesSent 已经上传的数据长度，单位 Bytes
    * @param callback.res.totalBytesExpectedToSend 预期需要上传的数据总长度，单位 Bytes
    */
  def onProgressUpdate(callback: js.Function1[/* res */ TotalBytesExpectedToSend, Unit]): Unit = js.native
}

object UploadTask {
  @scala.inline
  def apply(
    abort: () => Unit,
    onProgressUpdate: js.Function1[/* res */ TotalBytesExpectedToSend, Unit] => Unit
  ): UploadTask = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), onProgressUpdate = js.Any.fromFunction1(onProgressUpdate))
    __obj.asInstanceOf[UploadTask]
  }
  @scala.inline
  implicit class UploadTaskOps[Self <: UploadTask] (val x: Self) extends AnyVal {
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
    def withOnProgressUpdate(value: js.Function1[/* res */ TotalBytesExpectedToSend, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgressUpdate")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

