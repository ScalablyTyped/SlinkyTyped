package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EachMember extends StObject {
  
  var eachMember: scala.Double = js.native
  
  var noDelivery: scala.Double = js.native
  
  var none: scala.Double = js.native
  
  var notSet: scala.Double = js.native
  
  var preferredEmailAddress: scala.Double = js.native
}
object EachMember {
  
  @scala.inline
  def apply(
    eachMember: scala.Double,
    noDelivery: scala.Double,
    none: scala.Double,
    notSet: scala.Double,
    preferredEmailAddress: scala.Double
  ): EachMember = {
    val __obj = js.Dynamic.literal(eachMember = eachMember.asInstanceOf[js.Any], noDelivery = noDelivery.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], notSet = notSet.asInstanceOf[js.Any], preferredEmailAddress = preferredEmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[EachMember]
  }
  
  @scala.inline
  implicit class EachMemberMutableBuilder[Self <: EachMember] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEachMember(value: scala.Double): Self = StObject.set(x, "eachMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDelivery(value: scala.Double): Self = StObject.set(x, "noDelivery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotSet(value: scala.Double): Self = StObject.set(x, "notSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredEmailAddress(value: scala.Double): Self = StObject.set(x, "preferredEmailAddress", value.asInstanceOf[js.Any])
  }
}
