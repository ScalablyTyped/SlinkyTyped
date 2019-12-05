package typingsSlinky.tablesorter

import typingsSlinky.tablesorter.filteringFormatterHtml5FormatterMod.Html5Formatter
import typingsSlinky.tablesorter.filteringFormatterSelect2FormatterMod.Select2Formatter
import typingsSlinky.tablesorter.filteringFormatterUIFormatterMod.UIFormatter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/Filtering/Formatter/FilterFormatter", JSImport.Namespace)
@js.native
object filteringFormatterFilterFormatterMod extends js.Object {
  @js.native
  trait FilterFormatter
    extends Html5Formatter
       with UIFormatter
       with Select2Formatter
  
}

