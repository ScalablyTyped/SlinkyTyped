package typingsSlinky.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextChangeRange extends StObject {
  
  var _newLength: js.Any = js.native
  
  var _span: js.Any = js.native
  
  def isUnchanged(): Boolean = js.native
  
  def newLength(): Double = js.native
  
  def newSpan(): TextSpan = js.native
  
  def span(): TextSpan = js.native
}
object TextChangeRange {
  
  @scala.inline
  def apply(
    _newLength: js.Any,
    _span: js.Any,
    isUnchanged: () => Boolean,
    newLength: () => Double,
    newSpan: () => TextSpan,
    span: () => TextSpan
  ): TextChangeRange = {
    val __obj = js.Dynamic.literal(_newLength = _newLength.asInstanceOf[js.Any], _span = _span.asInstanceOf[js.Any], isUnchanged = js.Any.fromFunction0(isUnchanged), newLength = js.Any.fromFunction0(newLength), newSpan = js.Any.fromFunction0(newSpan), span = js.Any.fromFunction0(span))
    __obj.asInstanceOf[TextChangeRange]
  }
  
  @scala.inline
  implicit class TextChangeRangeMutableBuilder[Self <: TextChangeRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsUnchanged(value: () => Boolean): Self = StObject.set(x, "isUnchanged", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewLength(value: () => Double): Self = StObject.set(x, "newLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSpan(value: () => TextSpan): Self = StObject.set(x, "newSpan", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSpan(value: () => TextSpan): Self = StObject.set(x, "span", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_newLength(value: js.Any): Self = StObject.set(x, "_newLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_span(value: js.Any): Self = StObject.set(x, "_span", value.asInstanceOf[js.Any])
  }
}
