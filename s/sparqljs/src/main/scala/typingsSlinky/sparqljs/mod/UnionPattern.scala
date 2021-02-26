package typingsSlinky.sparqljs.mod

import typingsSlinky.sparqljs.sparqljsStrings.union
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnionPattern extends BlockPattern {
  
  var patterns: js.Array[Pattern] = js.native
  
  var `type`: union = js.native
}
object UnionPattern {
  
  @scala.inline
  def apply(patterns: js.Array[Pattern], `type`: union): UnionPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnionPattern]
  }
  
  @scala.inline
  implicit class UnionPatternMutableBuilder[Self <: UnionPattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPatterns(value: js.Array[Pattern]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternsVarargs(value: Pattern*): Self = StObject.set(x, "patterns", js.Array(value :_*))
    
    @scala.inline
    def setType(value: union): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
