package typingsSlinky.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Location extends StObject {
  
  var _fileName: js.Any = js.native
  
  var _length: js.Any = js.native
  
  var _lineMap: js.Any = js.native
  
  var _start: js.Any = js.native
  
  def character(): Double = js.native
  
  def fileName(): String = js.native
  
  def length(): Double = js.native
  
  def line(): Double = js.native
  
  def lineMap(): LineMap = js.native
  
  def start(): Double = js.native
}
object Location {
  
  @scala.inline
  def apply(
    _fileName: js.Any,
    _length: js.Any,
    _lineMap: js.Any,
    _start: js.Any,
    character: () => Double,
    fileName: () => String,
    length: () => Double,
    line: () => Double,
    lineMap: () => LineMap,
    start: () => Double
  ): Location = {
    val __obj = js.Dynamic.literal(_fileName = _fileName.asInstanceOf[js.Any], _length = _length.asInstanceOf[js.Any], _lineMap = _lineMap.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], character = js.Any.fromFunction0(character), fileName = js.Any.fromFunction0(fileName), length = js.Any.fromFunction0(length), line = js.Any.fromFunction0(line), lineMap = js.Any.fromFunction0(lineMap), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[Location]
  }
  
  @scala.inline
  implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacter(value: () => Double): Self = StObject.set(x, "character", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFileName(value: () => String): Self = StObject.set(x, "fileName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLength(value: () => Double): Self = StObject.set(x, "length", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLine(value: () => Double): Self = StObject.set(x, "line", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLineMap(value: () => LineMap): Self = StObject.set(x, "lineMap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStart(value: () => Double): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_fileName(value: js.Any): Self = StObject.set(x, "_fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_length(value: js.Any): Self = StObject.set(x, "_length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_lineMap(value: js.Any): Self = StObject.set(x, "_lineMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_start(value: js.Any): Self = StObject.set(x, "_start", value.asInstanceOf[js.Any])
  }
}
