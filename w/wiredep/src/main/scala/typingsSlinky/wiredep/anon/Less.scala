package typingsSlinky.wiredep.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Less extends StObject {
  
  /**
    * @example:
    *  /@import\s['"](.+css)['"]/gi
    */
  var css: js.RegExp = js.native
  
  /**
    * @example:
    *  /@import\s['"](.+less)['"]/gi
    */
  var less: js.RegExp = js.native
}
object Less {
  
  @scala.inline
  def apply(css: js.RegExp, less: js.RegExp): Less = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], less = less.asInstanceOf[js.Any])
    __obj.asInstanceOf[Less]
  }
  
  @scala.inline
  implicit class LessMutableBuilder[Self <: Less] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCss(value: js.RegExp): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLess(value: js.RegExp): Self = StObject.set(x, "less", value.asInstanceOf[js.Any])
  }
}
