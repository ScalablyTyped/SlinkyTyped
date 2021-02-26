package typingsSlinky.wepy.anon

import typingsSlinky.wepy.pageMod.PageConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pages extends StObject {
  
  var pages: js.Array[String] = js.native
  
  var window: PageConfig = js.native
}
object Pages {
  
  @scala.inline
  def apply(pages: js.Array[String], window: PageConfig): Pages = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pages]
  }
  
  @scala.inline
  implicit class PagesMutableBuilder[Self <: Pages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPages(value: js.Array[String]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesVarargs(value: String*): Self = StObject.set(x, "pages", js.Array(value :_*))
    
    @scala.inline
    def setWindow(value: PageConfig): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
  }
}
