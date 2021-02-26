package typingsSlinky.typeorm.anon

import typingsSlinky.typeorm.typeormStrings.and
import typingsSlinky.typeorm.typeormStrings.or
import typingsSlinky.typeorm.typeormStrings.simple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Condition extends StObject {
  
  var condition: String = js.native
  
  var `type`: simple | and | or = js.native
}
object Condition {
  
  @scala.inline
  def apply(condition: String, `type`: simple | and | or): Condition = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
  
  @scala.inline
  implicit class ConditionMutableBuilder[Self <: Condition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: simple | and | or): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
