package typingsSlinky.tablesorter

import typingsSlinky.tablesorter.anon.Max
import typingsSlinky.tablesorter.omitMod.Omit
import typingsSlinky.tablesorter.tablesorterStrings.max
import typingsSlinky.tablesorter.tablesorterStrings.min
import typingsSlinky.tablesorter.tablesorterStrings.step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/Filtering/Formatter/Options/UIOptionsBase", JSImport.Namespace)
@js.native
object uioptionsbaseMod extends js.Object {
  type UIOptionsBase[T /* <: Max */] = Omit[T, min | max | step]
}

