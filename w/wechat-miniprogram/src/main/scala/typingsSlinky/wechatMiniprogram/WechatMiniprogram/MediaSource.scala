package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.image
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 需要预览的资源列表 */
@js.native
trait MediaSource extends StObject {
  
  /** 视频的封面图片 */
  var poster: js.UndefOr[String] = js.native
  
  /** 资源的类型，默认为图片
    *
    * 可选值：
    * - 'image': 图片;
    * - 'video': 视频; */
  var `type`: js.UndefOr[image | video] = js.native
  
  /** 图片或视频的地址 */
  var url: String = js.native
}
object MediaSource {
  
  @scala.inline
  def apply(url: String): MediaSource = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSource]
  }
  
  @scala.inline
  implicit class MediaSourceMutableBuilder[Self <: MediaSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
    
    @scala.inline
    def setType(value: image | video): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
