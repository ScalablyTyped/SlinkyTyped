package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceMapRange extends TextRange {
  
  var source: js.UndefOr[SourceMapSource] = js.native
}
object SourceMapRange {
  
  @scala.inline
  def apply(end: Double, pos: Double): SourceMapRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMapRange]
  }
  
  @scala.inline
  implicit class SourceMapRangeMutableBuilder[Self <: SourceMapRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: SourceMapSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
