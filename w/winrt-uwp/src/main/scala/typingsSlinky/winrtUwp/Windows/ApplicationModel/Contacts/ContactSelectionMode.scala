package typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactSelectionMode extends StObject
/** Specifies whether you want to request an entire contact, or only specific fields. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactSelectionMode")
@js.native
object ContactSelectionMode extends StObject {
  
  /** Specifies that you want to select the entire contact. */
  @js.native
  sealed trait contacts extends ContactSelectionMode
  
  /** Specifies that you want to select only certain fields. */
  @js.native
  sealed trait fields extends ContactSelectionMode
}
