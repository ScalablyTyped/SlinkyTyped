package typingsSlinky.wxServerSdk.mod

import typingsSlinky.wxServerSdk.anon.ErrMsg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TetTempFileURLSuccess extends StObject {
  
  var fileList: js.Array[ErrMsg] = js.native
}
object TetTempFileURLSuccess {
  
  @scala.inline
  def apply(fileList: js.Array[ErrMsg]): TetTempFileURLSuccess = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[TetTempFileURLSuccess]
  }
  
  @scala.inline
  implicit class TetTempFileURLSuccessMutableBuilder[Self <: TetTempFileURLSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileList(value: js.Array[ErrMsg]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileListVarargs(value: ErrMsg*): Self = StObject.set(x, "fileList", js.Array(value :_*))
  }
}
