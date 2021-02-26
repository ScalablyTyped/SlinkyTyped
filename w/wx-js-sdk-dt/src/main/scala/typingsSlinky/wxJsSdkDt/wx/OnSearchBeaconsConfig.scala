package typingsSlinky.wxJsSdkDt.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnSearchBeaconsConfig extends WxBaseRequestConfig {
  
  @JSName("complete")
  def complete_MOnSearchBeaconsConfig(argv: js.Any): Unit = js.native
}
object OnSearchBeaconsConfig {
  
  @scala.inline
  def apply(complete: js.Any => Unit): OnSearchBeaconsConfig = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
    __obj.asInstanceOf[OnSearchBeaconsConfig]
  }
  
  @scala.inline
  implicit class OnSearchBeaconsConfigMutableBuilder[Self <: OnSearchBeaconsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: js.Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
  }
}
