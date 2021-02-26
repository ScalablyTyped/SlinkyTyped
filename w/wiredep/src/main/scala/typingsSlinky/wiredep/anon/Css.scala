package typingsSlinky.wiredep.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Css extends StObject {
  
  /**
    * @example:
    *  /-\s(.+css)/gi
    */
  var css: js.RegExp = js.native
  
  /**
    * @example:
    *  /-\s(.+js)/gi
    */
  @JSName("js")
  var js_ : js.RegExp = js.native
}
object Css {
  
  @scala.inline
  def apply(css: js.RegExp, js_ : js.RegExp): Css = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any])
    __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Css]
  }
  
  @scala.inline
  implicit class CssMutableBuilder[Self <: Css] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCss(value: js.RegExp): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJs_(value: js.RegExp): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
  }
}
