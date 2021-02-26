package typingsSlinky.winrtUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the custom data for one of the following PlayReady-ND messages: Registration Challenge, Registration Response, License Fetch Challenge, or License Fetch Response. */
@js.native
trait NDCustomData extends StObject {
  
  /** Gets the custom data. */
  var customData: Double = js.native
  
  /** Gets the 16-byte type identifier for the custom data. */
  var customDataTypeID: Double = js.native
}
object NDCustomData {
  
  @scala.inline
  def apply(customData: Double, customDataTypeID: Double): NDCustomData = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], customDataTypeID = customDataTypeID.asInstanceOf[js.Any])
    __obj.asInstanceOf[NDCustomData]
  }
  
  @scala.inline
  implicit class NDCustomDataMutableBuilder[Self <: NDCustomData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomData(value: Double): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDataTypeID(value: Double): Self = StObject.set(x, "customDataTypeID", value.asInstanceOf[js.Any])
  }
}
