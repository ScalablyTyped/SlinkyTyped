package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EXTBlendMinmax extends StObject {
  
  val MAX_EXT: GLenum = js.native
  
  val MIN_EXT: GLenum = js.native
}
object EXTBlendMinmax {
  
  @scala.inline
  def apply(MAX_EXT: GLenum, MIN_EXT: GLenum): EXTBlendMinmax = {
    val __obj = js.Dynamic.literal(MAX_EXT = MAX_EXT.asInstanceOf[js.Any], MIN_EXT = MIN_EXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[EXTBlendMinmax]
  }
  
  @scala.inline
  implicit class EXTBlendMinmaxMutableBuilder[Self <: EXTBlendMinmax] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMAX_EXT(value: GLenum): Self = StObject.set(x, "MAX_EXT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMIN_EXT(value: GLenum): Self = StObject.set(x, "MIN_EXT", value.asInstanceOf[js.Any])
  }
}
