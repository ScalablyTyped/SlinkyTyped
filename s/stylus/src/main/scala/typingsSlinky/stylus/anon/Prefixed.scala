package typingsSlinky.stylus.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Prefixed extends StObject {
  
  var __type: String = js.native
  
  var column: Double = js.native
  
  var filename: String = js.native
  
  var lineno: Double = js.native
  
  var prefixed: Boolean = js.native
  
  var string: String = js.native
  
  var `val`: String = js.native
}
object Prefixed {
  
  @scala.inline
  def apply(
    __type: String,
    column: Double,
    filename: String,
    lineno: Double,
    prefixed: Boolean,
    string: String,
    `val`: String
  ): Prefixed = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], prefixed = prefixed.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prefixed]
  }
  
  @scala.inline
  implicit class PrefixedMutableBuilder[Self <: Prefixed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineno(value: Double): Self = StObject.set(x, "lineno", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixed(value: Boolean): Self = StObject.set(x, "prefixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__type(value: String): Self = StObject.set(x, "__type", value.asInstanceOf[js.Any])
  }
}
