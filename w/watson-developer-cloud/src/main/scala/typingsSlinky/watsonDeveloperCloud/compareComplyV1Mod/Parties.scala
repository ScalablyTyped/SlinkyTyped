package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A party and its corresponding role, including address and contact information if identified. */
@js.native
trait Parties extends StObject {
  
  /** List of the party's address or addresses. */
  var addresses: js.UndefOr[js.Array[Address]] = js.native
  
  /** List of the names and roles of contacts identified in the input document. */
  var contacts: js.UndefOr[js.Array[Contact]] = js.native
  
  /** A string that identifies the importance of the party. */
  var importance: js.UndefOr[String] = js.native
  
  /** A string identifying the party. */
  var party: js.UndefOr[String] = js.native
  
  /** A string identifying the party's role. */
  var role: js.UndefOr[String] = js.native
}
object Parties {
  
  @scala.inline
  def apply(): Parties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parties]
  }
  
  @scala.inline
  implicit class PartiesMutableBuilder[Self <: Parties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddresses(value: js.Array[Address]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    @scala.inline
    def setAddressesVarargs(value: Address*): Self = StObject.set(x, "addresses", js.Array(value :_*))
    
    @scala.inline
    def setContacts(value: js.Array[Contact]): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactsUndefined: Self = StObject.set(x, "contacts", js.undefined)
    
    @scala.inline
    def setContactsVarargs(value: Contact*): Self = StObject.set(x, "contacts", js.Array(value :_*))
    
    @scala.inline
    def setImportance(value: String): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportanceUndefined: Self = StObject.set(x, "importance", js.undefined)
    
    @scala.inline
    def setParty(value: String): Self = StObject.set(x, "party", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartyUndefined: Self = StObject.set(x, "party", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
