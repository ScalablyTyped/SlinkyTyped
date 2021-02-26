package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Wiql extends StObject {
  
  /**
    * The text of the WIQL query
    */
  var query: String = js.native
}
object Wiql {
  
  @scala.inline
  def apply(query: String): Wiql = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wiql]
  }
  
  @scala.inline
  implicit class WiqlMutableBuilder[Self <: Wiql] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
