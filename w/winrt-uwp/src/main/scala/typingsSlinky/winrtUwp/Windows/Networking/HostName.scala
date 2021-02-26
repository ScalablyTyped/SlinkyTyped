package typingsSlinky.winrtUwp.Windows.Networking

import typingsSlinky.winrtUwp.Windows.Networking.Connectivity.IPInformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a hostname or an IP address. */
@js.native
trait HostName extends StObject {
  
  /** Gets the canonical name for the HostName object. */
  var canonicalName: String = js.native
  
  /** Gets the display name for the HostName object. */
  var displayName: String = js.native
  
  /** Gets the IPInformation object for a local IP address assigned to a HostName object. */
  var ipInformation: IPInformation = js.native
  
  /**
    * Determines whether the specified HostName object has an equivalent value to the current HostName object.
    * @param hostName A HostName object that is compared with the current HostName.
    * @return A Boolean value that indicates whether the specified HostName object is equal to the current HostName object.
    */
  def isEqual(hostName: HostName): Boolean = js.native
  
  /** Gets the original string used to construct the HostName object. */
  var rawName: String = js.native
  
  /** Gets the HostNameType of the HostName object. */
  var `type`: HostNameType = js.native
}
object HostName {
  
  @scala.inline
  def apply(
    canonicalName: String,
    displayName: String,
    ipInformation: IPInformation,
    isEqual: HostName => Boolean,
    rawName: String,
    `type`: HostNameType
  ): HostName = {
    val __obj = js.Dynamic.literal(canonicalName = canonicalName.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], ipInformation = ipInformation.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual), rawName = rawName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostName]
  }
  
  @scala.inline
  implicit class HostNameMutableBuilder[Self <: HostName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanonicalName(value: String): Self = StObject.set(x, "canonicalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpInformation(value: IPInformation): Self = StObject.set(x, "ipInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEqual(value: HostName => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRawName(value: String): Self = StObject.set(x, "rawName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: HostNameType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
