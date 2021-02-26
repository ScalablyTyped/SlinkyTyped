package typingsSlinky.winrtUwp.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FindOptions extends StObject
/** Specifies the options to use when doing a text search. */
@JSGlobal("Windows.UI.Text.FindOptions")
@js.native
object FindOptions extends StObject {
  
  /** Match case; that is, a case-sensitive search. */
  @js.native
  sealed trait `case` extends FindOptions
  
  /** Use the default text search options; namely, use case- independent, arbitrary character boundaries. */
  @js.native
  sealed trait none extends FindOptions
  
  /** Match whole words. */
  @js.native
  sealed trait word extends FindOptions
}
