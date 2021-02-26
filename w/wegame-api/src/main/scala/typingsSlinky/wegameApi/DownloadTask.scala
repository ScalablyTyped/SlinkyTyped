package typingsSlinky.wegameApi

import typingsSlinky.wegameApi.anon.Progress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadTask extends StObject {
  
  /**
    * 中断下载任务
    */
  def abort(): Unit = js.native
  
  /**
    * 监听下载进度变化事件
    * @param res.progress 下载进度百分比，值为0至100
    * @param res.totalBytesWritten 已经下载的数据长度，单位 Bytes
    * @param res.totalBytesExpectedToWrite 预期需要下载的数据总长度，单位 Bytes
    */
  def onProgressUpdate(callback: js.Function1[/* res */ Progress, Unit]): Unit = js.native
}
object DownloadTask {
  
  @scala.inline
  def apply(abort: () => Unit, onProgressUpdate: js.Function1[/* res */ Progress, Unit] => Unit): DownloadTask = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), onProgressUpdate = js.Any.fromFunction1(onProgressUpdate))
    __obj.asInstanceOf[DownloadTask]
  }
  
  @scala.inline
  implicit class DownloadTaskMutableBuilder[Self <: DownloadTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnProgressUpdate(value: js.Function1[/* res */ Progress, Unit] => Unit): Self = StObject.set(x, "onProgressUpdate", js.Any.fromFunction1(value))
  }
}
