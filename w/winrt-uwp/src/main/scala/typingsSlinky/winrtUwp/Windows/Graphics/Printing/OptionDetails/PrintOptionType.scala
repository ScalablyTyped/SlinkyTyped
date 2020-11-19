package typingsSlinky.winrtUwp.Windows.Graphics.Printing.OptionDetails

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintOptionType extends js.Object
/** Specifies the print task option types. */
@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintOptionType")
@js.native
object PrintOptionType extends js.Object {
  
  /** A type of option that is a list of items. */
  @js.native
  sealed trait itemList extends PrintOptionType
  
  /** A type of option that is numerical. */
  @js.native
  sealed trait number extends PrintOptionType
  
  /** A type of option that is a string or some text. */
  @js.native
  sealed trait text extends PrintOptionType
  
  /** Unknown option type. */
  @js.native
  sealed trait unknown extends PrintOptionType
}
