package typingsSlinky.weappApi.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//  end of wx namespace
@js.native
trait Page extends js.Object {
  
  /**
    * setData 函数用于将数据从逻辑层发送到视图层，
    * 同时改变对应的 this.data 的值。
    * 注意：
    *    1. 直接修改 this.data 无效，无法改变页面的状态，还会造成数据不一致。
    *    2. 单次设置的数据不能超过1024kB，请尽量避免一次设置过多的数据。
    */
  def setData(data: js.Any): Unit = js.native
}
@JSImport("weapp-api", "Page")
@js.native
object Page extends TopLevel[PageConstructor]
