package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextInsertion extends StObject {
  
  /** The position in newText the caret should point to after the insertion. */
  var caretOffset: Double = js.native
  
  var newText: java.lang.String = js.native
}
object TextInsertion {
  
  @scala.inline
  def apply(caretOffset: Double, newText: java.lang.String): TextInsertion = {
    val __obj = js.Dynamic.literal(caretOffset = caretOffset.asInstanceOf[js.Any], newText = newText.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInsertion]
  }
  
  @scala.inline
  implicit class TextInsertionMutableBuilder[Self <: TextInsertion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaretOffset(value: Double): Self = StObject.set(x, "caretOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewText(value: java.lang.String): Self = StObject.set(x, "newText", value.asInstanceOf[js.Any])
  }
}
