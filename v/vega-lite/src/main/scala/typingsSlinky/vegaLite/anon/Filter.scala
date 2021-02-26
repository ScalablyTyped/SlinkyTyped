package typingsSlinky.vegaLite.anon

import typingsSlinky.vegaLite.logicalMod.LogicalComposition
import typingsSlinky.vegaLite.srcPredicateMod.Predicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filter extends StObject {
  
  var filter: LogicalComposition[Predicate] = js.native
}
object Filter {
  
  @scala.inline
  def apply(filter: LogicalComposition[Predicate]): Filter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: LogicalComposition[Predicate]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
  }
}
