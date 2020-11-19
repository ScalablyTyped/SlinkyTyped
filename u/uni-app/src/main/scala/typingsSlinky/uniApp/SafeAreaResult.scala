package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafeAreaResult extends js.Object {
  
  /**
    * 安全区域右下角纵坐标
    */
  var bottom: js.UndefOr[Double] = js.native
  
  /**
    * 安全区域的高度，单位逻辑像素
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * 安全区域左上角横坐标
    */
  var left: js.UndefOr[Double] = js.native
  
  /**
    * 安全区域右下角横坐标
    */
  var right: js.UndefOr[Double] = js.native
  
  /**
    * 安全区域左上角纵坐标
    */
  var top: js.UndefOr[Double] = js.native
  
  /**
    * 安全区域的宽度，单位逻辑像素
    */
  var width: js.UndefOr[Double] = js.native
}
object SafeAreaResult {
  
  @scala.inline
  def apply(): SafeAreaResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SafeAreaResult]
  }
  
  @scala.inline
  implicit class SafeAreaResultOps[Self <: SafeAreaResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
