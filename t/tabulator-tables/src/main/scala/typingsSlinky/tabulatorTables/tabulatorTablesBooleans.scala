package typingsSlinky.tabulatorTables

import typingsSlinky.tabulatorTables.Tabulator.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object tabulatorTablesBooleans {
  @js.native
  sealed trait `false` extends js.Object
  
  @js.native
  sealed trait `true` extends Editor
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

