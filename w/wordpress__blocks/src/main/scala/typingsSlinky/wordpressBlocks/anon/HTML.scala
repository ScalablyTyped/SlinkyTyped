package typingsSlinky.wordpressBlocks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTML extends StObject {
  
  var HTML: String = js.native
}
object HTML {
  
  @scala.inline
  def apply(HTML: String): HTML = {
    val __obj = js.Dynamic.literal(HTML = HTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTML]
  }
  
  @scala.inline
  implicit class HTMLMutableBuilder[Self <: HTML] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHTML(value: String): Self = StObject.set(x, "HTML", value.asInstanceOf[js.Any])
  }
}
