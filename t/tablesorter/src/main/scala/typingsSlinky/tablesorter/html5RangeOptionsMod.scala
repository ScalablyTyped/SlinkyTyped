package typingsSlinky.tablesorter

import typingsSlinky.tablesorter.comparableOptionsMod.ComparableOptions
import typingsSlinky.tablesorter.controlOptionsMod.ControlOptions
import typingsSlinky.tablesorter.defaultValueOptionsMod.DefaultValueOptions
import typingsSlinky.tablesorter.delayableOptionsMod.DelayableOptions
import typingsSlinky.tablesorter.previewableOptionsMod.PreviewableOptions
import typingsSlinky.tablesorter.rangeOptionsMod.RangeOptions
import typingsSlinky.tablesorter.strictOptionsMod.StrictOptions
import typingsSlinky.tablesorter.testableOptionsMod.TestableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object html5RangeOptionsMod {
  
  @js.native
  trait Html5RangeOptions
    extends RangeOptions
       with ControlOptions
       with DefaultValueOptions[Double]
       with ComparableOptions
       with StrictOptions
       with PreviewableOptions
       with DelayableOptions
       with TestableOptions
  object Html5RangeOptions {
    
    @scala.inline
    def apply(): Html5RangeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Html5RangeOptions]
    }
  }
}
