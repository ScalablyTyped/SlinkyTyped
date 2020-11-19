package typingsSlinky.tablesorter

import typingsSlinky.tablesorter.html5FormatterMod.Html5Formatter
import typingsSlinky.tablesorter.select2FormatterMod.Select2Formatter
import typingsSlinky.tablesorter.uiformatterMod.UIFormatter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tablesorter/Filtering/Formatter/FilterFormatter", JSImport.Namespace)
@js.native
object filterFormatterMod extends js.Object {
  
  @js.native
  trait FilterFormatter
    extends Html5Formatter
       with UIFormatter
       with Select2Formatter
}
