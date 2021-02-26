package typingsSlinky.winrt.Windows.Networking.Connectivity

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILanIdentifierData extends StObject {
  
  var `type`: Double = js.native
  
  var value: IVectorView[Double] = js.native
}
object ILanIdentifierData {
  
  @scala.inline
  def apply(`type`: Double, value: IVectorView[Double]): ILanIdentifierData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanIdentifierData]
  }
  
  @scala.inline
  implicit class ILanIdentifierDataMutableBuilder[Self <: ILanIdentifierData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: IVectorView[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
