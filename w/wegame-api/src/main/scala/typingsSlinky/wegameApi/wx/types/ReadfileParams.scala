package typingsSlinky.wegameApi.wx.types

import typingsSlinky.wegameApi.anon.ErrMsg
import typingsSlinky.wegameApi.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadfileParams extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  var encoding: js.UndefOr[FileContentEncoding] = js.native
  
  var fail: js.UndefOr[js.Function1[/* res */ ErrMsg, Unit]] = js.native
  
  var filePath: String = js.native
  
  var success: js.UndefOr[js.Function1[/* res */ `0`, Unit]] = js.native
}
object ReadfileParams {
  
  @scala.inline
  def apply(filePath: String): ReadfileParams = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadfileParams]
  }
  
  @scala.inline
  implicit class ReadfileParamsMutableBuilder[Self <: ReadfileParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setEncoding(value: FileContentEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ ErrMsg => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ `0` => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
