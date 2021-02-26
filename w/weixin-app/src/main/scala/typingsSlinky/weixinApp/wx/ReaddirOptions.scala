package typingsSlinky.weixinApp.wx

import typingsSlinky.weixinApp.anon.Files
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReaddirOptions
  extends BaseOptions[js.Any, js.Any] {
  
  var dirPath: String = js.native
  
  // 要读取的目录路径
  @JSName("success")
  var success_ReaddirOptions: js.UndefOr[js.Function1[/* res */ Files, Unit]] = js.native
}
object ReaddirOptions {
  
  @scala.inline
  def apply(dirPath: String): ReaddirOptions = {
    val __obj = js.Dynamic.literal(dirPath = dirPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaddirOptions]
  }
  
  @scala.inline
  implicit class ReaddirOptionsMutableBuilder[Self <: ReaddirOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirPath(value: String): Self = StObject.set(x, "dirPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ Files => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
