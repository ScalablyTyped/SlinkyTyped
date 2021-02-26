package typingsSlinky.spectacle.anon

import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Plain extends StObject {
  
  var plain: Record[String, String] = js.native
  
  var styles: js.Array[Style] = js.native
}
object Plain {
  
  @scala.inline
  def apply(plain: Record[String, String], styles: js.Array[Style]): Plain = {
    val __obj = js.Dynamic.literal(plain = plain.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plain]
  }
  
  @scala.inline
  implicit class PlainMutableBuilder[Self <: Plain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlain(value: Record[String, String]): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyles(value: js.Array[Style]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesVarargs(value: Style*): Self = StObject.set(x, "styles", js.Array(value :_*))
  }
}
