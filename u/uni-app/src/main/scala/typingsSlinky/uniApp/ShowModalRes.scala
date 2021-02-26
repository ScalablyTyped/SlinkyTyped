package typingsSlinky.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowModalRes extends StObject {
  
  /**
    * 为 true 时，表示用户点击了取消
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /**
    * 为 true 时，表示用户点击了确定按钮
    */
  var confirm: js.UndefOr[Boolean] = js.native
}
object ShowModalRes {
  
  @scala.inline
  def apply(): ShowModalRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowModalRes]
  }
  
  @scala.inline
  implicit class ShowModalResMutableBuilder[Self <: ShowModalRes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setConfirm(value: Boolean): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
  }
}
