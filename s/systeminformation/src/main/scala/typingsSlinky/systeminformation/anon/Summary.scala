package typingsSlinky.systeminformation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Summary extends StObject {
  
  var summary: Count = js.native
}
object Summary {
  
  @scala.inline
  def apply(summary: Count): Summary = {
    val __obj = js.Dynamic.literal(summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Summary]
  }
  
  @scala.inline
  implicit class SummaryMutableBuilder[Self <: Summary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSummary(value: Count): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
  }
}
