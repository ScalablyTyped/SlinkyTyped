package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputFile extends StObject {
  
  var name: java.lang.String = js.native
  
  var text: java.lang.String = js.native
  
  var writeByteOrderMark: Boolean = js.native
}
object OutputFile {
  
  @scala.inline
  def apply(name: java.lang.String, text: java.lang.String, writeByteOrderMark: Boolean): OutputFile = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], writeByteOrderMark = writeByteOrderMark.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputFile]
  }
  
  @scala.inline
  implicit class OutputFileMutableBuilder[Self <: OutputFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: java.lang.String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteByteOrderMark(value: Boolean): Self = StObject.set(x, "writeByteOrderMark", value.asInstanceOf[js.Any])
  }
}
