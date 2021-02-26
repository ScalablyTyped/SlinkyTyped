package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaContainer extends StObject {
  
  /** [MediaContainer.addTrack([MediaTrack](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-processing/MediaTrack.html) track)](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-processing/MediaContainer.addTrack.html)
    *
    * 将音频或视频轨道添加到容器
    *
    * 最低基础库： `2.9.0` */
  def addTrack(
    /** [MediaTrack](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-processing/MediaTrack.html)
    *
    * 要添加的音频或视频轨道 */
  track: MediaTrack
  ): Unit = js.native
  
  /** [MediaContainer.destroy()](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-processing/MediaContainer.destroy.html)
    *
    * 将容器销毁，释放资源
    *
    * 最低基础库： `2.9.0` */
  def destroy(): Unit = js.native
  
  /** [MediaContainer.export()](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-processing/MediaContainer.export.html)
    *
    * 将容器内的轨道合并并导出视频文件
    *
    * 最低基础库： `2.9.0` */
  def export(): Unit = js.native
  
  /** [MediaContainer.extractDataSource(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-processing/MediaContainer.extractDataSource.html)
    *
    * 将传入的视频源分离轨道。不会自动将轨道添加到待合成的容器里。
    *
    * 最低基础库： `2.9.0` */
  def extractDataSource(option: ExtractDataSourceOption): Unit = js.native
  
  /** [MediaContainer.removeTrack([MediaTrack](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-processing/MediaTrack.html) track)](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-processing/MediaContainer.removeTrack.html)
    *
    * 将音频或视频轨道从容器中移除
    *
    * 最低基础库： `2.9.0` */
  def removeTrack(
    /** [MediaTrack](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-processing/MediaTrack.html)
    *
    * 要移除的音频或视频轨道 */
  track: MediaTrack
  ): Unit = js.native
}
object MediaContainer {
  
  @scala.inline
  def apply(
    addTrack: MediaTrack => Unit,
    destroy: () => Unit,
    export: () => Unit,
    extractDataSource: ExtractDataSourceOption => Unit,
    removeTrack: MediaTrack => Unit
  ): MediaContainer = {
    val __obj = js.Dynamic.literal(addTrack = js.Any.fromFunction1(addTrack), destroy = js.Any.fromFunction0(destroy), export = js.Any.fromFunction0(export), extractDataSource = js.Any.fromFunction1(extractDataSource), removeTrack = js.Any.fromFunction1(removeTrack))
    __obj.asInstanceOf[MediaContainer]
  }
  
  @scala.inline
  implicit class MediaContainerMutableBuilder[Self <: MediaContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddTrack(value: MediaTrack => Unit): Self = StObject.set(x, "addTrack", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExport(value: () => Unit): Self = StObject.set(x, "export", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExtractDataSource(value: ExtractDataSourceOption => Unit): Self = StObject.set(x, "extractDataSource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveTrack(value: MediaTrack => Unit): Self = StObject.set(x, "removeTrack", js.Any.fromFunction1(value))
  }
}
