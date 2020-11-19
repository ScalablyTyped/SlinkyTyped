package typingsSlinky.winrtUwp.global.Windows.Globalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides read-only lists of character groupings. */
@JSGlobal("Windows.Globalization.Collation")
@js.native
object Collation extends js.Object {
  
  /** A container for character group information. Characters are grouped in an index that enables an application to determine where the grouping boundaries are. */
  @js.native
  abstract class CharacterGrouping ()
    extends typingsSlinky.winrtUwp.Windows.Globalization.Collation.CharacterGrouping
  
  /** Contains the set of character groups and the functionality to get the label for any given string. */
  @js.native
  /** Create a CharacterGroupings object for the default collation. */
  class CharacterGroupings ()
    extends typingsSlinky.winrtUwp.Windows.Globalization.Collation.CharacterGroupings
}
