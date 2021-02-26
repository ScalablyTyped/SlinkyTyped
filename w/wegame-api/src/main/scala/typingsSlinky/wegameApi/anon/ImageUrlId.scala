package typingsSlinky.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageUrlId extends StObject {
  
  /**
    * 转发显示图片的链接，可以是网络图片路径或本地图片文件路径或相对代码包根目录的图片文件路径。显示图片长宽比是 5:4
    */
  var imageUrl: js.UndefOr[String] = js.native
  
  /**
    * 审核通过的图片 ID，详见 使用审核通过的转发图片（https://developers.weixin.qq.com/minigame/dev/guide/open-ability/sh
    * are/share.html#%E4%BD%BF%E7%94%A8%E5%AE%A1%E6%A0%B8%E9%80%9A%E8%BF%87%E7%9A%84%E8%BD%AC%E5%8F%91%E5%9B%BE%E7%89%87）
    */
  var imageUrlId: js.UndefOr[String] = js.native
  
  /**
    * 发送对象的 openId
    */
  var openId: String = js.native
  
  /**
    * 转发标题，不传则默认使用当前小游戏的昵称。
    */
  var title: js.UndefOr[String] = js.native
}
object ImageUrlId {
  
  @scala.inline
  def apply(openId: String): ImageUrlId = {
    val __obj = js.Dynamic.literal(openId = openId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageUrlId]
  }
  
  @scala.inline
  implicit class ImageUrlIdMutableBuilder[Self <: ImageUrlId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlId(value: String): Self = StObject.set(x, "imageUrlId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlIdUndefined: Self = StObject.set(x, "imageUrlId", js.undefined)
    
    @scala.inline
    def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    @scala.inline
    def setOpenId(value: String): Self = StObject.set(x, "openId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
