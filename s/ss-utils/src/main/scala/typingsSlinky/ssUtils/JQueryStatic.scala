package typingsSlinky.ssUtils

import typingsSlinky.ssUtils.ssutils.Static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends StObject {
  
  var ss: Static = js.native
}
object JQueryStatic {
  
  @scala.inline
  def apply(ss: Static): JQueryStatic = {
    val __obj = js.Dynamic.literal(ss = ss.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSs(value: Static): Self = StObject.set(x, "ss", value.asInstanceOf[js.Any])
  }
}
