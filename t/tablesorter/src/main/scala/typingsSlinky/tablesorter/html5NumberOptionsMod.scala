package typingsSlinky.tablesorter

import typingsSlinky.tablesorter.comparableOptionsMod.ComparableOptions
import typingsSlinky.tablesorter.controlOptionsMod.ControlOptions
import typingsSlinky.tablesorter.defaultValueOptionsMod.DefaultValueOptions
import typingsSlinky.tablesorter.delayableOptionsMod.DelayableOptions
import typingsSlinky.tablesorter.intervalOptionsMod.IntervalOptions
import typingsSlinky.tablesorter.strictOptionsMod.StrictOptions
import typingsSlinky.tablesorter.testableOptionsMod.TestableOptions
import typingsSlinky.tablesorter.toggleableOptionsMod.ToggleableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object html5NumberOptionsMod {
  
  @js.native
  trait Html5NumberOptions
    extends IntervalOptions
       with ControlOptions
       with DefaultValueOptions[Double]
       with ComparableOptions
       with ToggleableOptions
       with DelayableOptions
       with StrictOptions
       with TestableOptions
  object Html5NumberOptions {
    
    @scala.inline
    def apply(): Html5NumberOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Html5NumberOptions]
    }
  }
}
