package typingsSlinky.wegameApi.wx.types

import typingsSlinky.wegameApi.anon.ErrMsg
import typingsSlinky.wegameApi.anon.Files
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReaddirParams extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  var dirPath: String = js.native
  
  var fail: js.UndefOr[js.Function1[/* res */ ErrMsg, Unit]] = js.native
  
  var success: js.UndefOr[js.Function1[/* res */ Files, Unit]] = js.native
}
object ReaddirParams {
  
  @scala.inline
  def apply(dirPath: String): ReaddirParams = {
    val __obj = js.Dynamic.literal(dirPath = dirPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaddirParams]
  }
  
  @scala.inline
  implicit class ReaddirParamsMutableBuilder[Self <: ReaddirParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setDirPath(value: String): Self = StObject.set(x, "dirPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFail(value: /* res */ ErrMsg => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ Files => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
