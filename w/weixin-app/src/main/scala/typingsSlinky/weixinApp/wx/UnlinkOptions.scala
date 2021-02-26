package typingsSlinky.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnlinkOptions
  extends BaseOptions[js.Any, js.Any] {
  
  var filePath: String = js.native
}
object UnlinkOptions {
  
  @scala.inline
  def apply(filePath: String): UnlinkOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnlinkOptions]
  }
  
  @scala.inline
  implicit class UnlinkOptionsMutableBuilder[Self <: UnlinkOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
  }
}
