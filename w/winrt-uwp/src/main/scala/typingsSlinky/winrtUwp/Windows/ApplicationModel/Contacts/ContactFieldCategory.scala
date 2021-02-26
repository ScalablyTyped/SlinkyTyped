package typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactFieldCategory extends StObject
/** Defines the categories that contact data can belong to. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactFieldCategory")
@js.native
object ContactFieldCategory extends StObject {
  
  /** The Home category. */
  @js.native
  sealed trait home extends ContactFieldCategory
  
  /** The Mobile category. */
  @js.native
  sealed trait mobile extends ContactFieldCategory
  
  /** The data doesn't belong to a category */
  @js.native
  sealed trait none extends ContactFieldCategory
  
  /** The Other category. */
  @js.native
  sealed trait other extends ContactFieldCategory
  
  /** The Work category. */
  @js.native
  sealed trait work extends ContactFieldCategory
}
