package typingsSlinky.weixinApp.wx

import typingsSlinky.weixinApp.anon.Env
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 云开发
// 文档：https://developers.weixin.qq.com/miniprogram/dev/wxcloud/basis/getting-started.html
@js.native
trait Cloud extends StObject {
  
  /**
    * 接受一个 name 参数，指定需引用的集合名称
    */
  def collection(name: String): js.Object = js.native
  
  /**
    * 接受一个可选对象参数 env：环境 ID，获取数据库的引用
    */
  def database(options: Env): js.Object = js.native
  
  /**
    * 初始化方法（全局只需一次）
    */
  def init(options: InitCloudOptions): Unit = js.native
}
object Cloud {
  
  @scala.inline
  def apply(collection: String => js.Object, database: Env => js.Object, init: InitCloudOptions => Unit): Cloud = {
    val __obj = js.Dynamic.literal(collection = js.Any.fromFunction1(collection), database = js.Any.fromFunction1(database), init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[Cloud]
  }
  
  @scala.inline
  implicit class CloudMutableBuilder[Self <: Cloud] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollection(value: String => js.Object): Self = StObject.set(x, "collection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDatabase(value: Env => js.Object): Self = StObject.set(x, "database", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInit(value: InitCloudOptions => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
  }
}
