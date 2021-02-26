package typingsSlinky.tern.anon

import typingsSlinky.tern.ternMod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait File extends StObject {
  
  var end: Double | Position = js.native
  
  var file: String = js.native
  
  var start: Double | Position = js.native
  
  var text: String = js.native
}
object File {
  
  @scala.inline
  def apply(end: Double | Position, file: String, start: Double | Position, text: String): File = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double | Position): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double | Position): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
