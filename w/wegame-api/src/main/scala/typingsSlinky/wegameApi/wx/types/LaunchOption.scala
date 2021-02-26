package typingsSlinky.wegameApi.wx.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// --启动参数
@js.native
trait LaunchOption extends StObject {
  
  /**
    * 当前小游戏是否被显示在聊天顶部
    */
  var isSticky: Boolean = js.native
  
  /**
    * 启动参数
    */
  var query: js.Any = js.native
  
  /**
    * 场景值
    */
  var scene: Double = js.native
  
  /**
    * 票据
    */
  var shareTicket: String = js.native
}
object LaunchOption {
  
  @scala.inline
  def apply(isSticky: Boolean, query: js.Any, scene: Double, shareTicket: String): LaunchOption = {
    val __obj = js.Dynamic.literal(isSticky = isSticky.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], shareTicket = shareTicket.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchOption]
  }
  
  @scala.inline
  implicit class LaunchOptionMutableBuilder[Self <: LaunchOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsSticky(value: Boolean): Self = StObject.set(x, "isSticky", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScene(value: Double): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareTicket(value: String): Self = StObject.set(x, "shareTicket", value.asInstanceOf[js.Any])
  }
}
