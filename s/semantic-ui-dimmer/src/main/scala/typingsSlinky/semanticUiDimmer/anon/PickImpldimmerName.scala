package typingsSlinky.semanticUiDimmer.anon

import typingsSlinky.semanticUiDimmer.semanticUiDimmerBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.DimmerSettings._Impl, 'dimmerName'> */
@js.native
trait PickImpldimmerName extends StObject {
  
  var dimmerName: `false` | String = js.native
}
object PickImpldimmerName {
  
  @scala.inline
  def apply(dimmerName: `false` | String): PickImpldimmerName = {
    val __obj = js.Dynamic.literal(dimmerName = dimmerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldimmerName]
  }
  
  @scala.inline
  implicit class PickImpldimmerNameMutableBuilder[Self <: PickImpldimmerName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimmerName(value: `false` | String): Self = StObject.set(x, "dimmerName", value.asInstanceOf[js.Any])
  }
}
