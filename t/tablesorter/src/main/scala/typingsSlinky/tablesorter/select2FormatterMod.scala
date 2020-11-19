package typingsSlinky.tablesorter

import typingsSlinky.tablesorter.mod.global.HTMLElement
import typingsSlinky.tablesorter.mod.global.JQuery
import typingsSlinky.tablesorter.select2OptionsMod.Select2Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tablesorter/Filtering/Formatter/Select2Formatter", JSImport.Namespace)
@js.native
object select2FormatterMod extends js.Object {
  
  @js.native
  trait Select2Formatter extends js.Object {
    
    /**
      * Creates a select2-control.
      *
      * @param cell
      * The jQuery-object of the cell the control is added to.
      *
      * @param index
      * The column-index of the cell the control is added to.
      *
      * @param options
      * The options for the control-creation.
      *
      * @return
      * The jQuery-object of the created control.
      */
    def select2(cell: JQuery[HTMLElement], index: Double): JQuery[HTMLElement] = js.native
    def select2(cell: JQuery[HTMLElement], index: Double, options: Select2Options): JQuery[HTMLElement] = js.native
  }
}
