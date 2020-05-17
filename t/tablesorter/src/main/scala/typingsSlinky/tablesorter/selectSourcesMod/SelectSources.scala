package typingsSlinky.tablesorter.selectSourcesMod

import typingsSlinky.tablesorter.functionSelectSourceMod.FunctionSelectSource
import typingsSlinky.tablesorter.validSelectSourcesMod.ValidSelectSources
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tablesorter.functionSelectSourceMod.FunctionSelectSource[TElement]
  - typingsSlinky.tablesorter.validSelectSourcesMod.ValidSelectSources
*/
trait SelectSources[TElement] extends js.Object

object SelectSources {
  @scala.inline
  implicit def apply[TElement](value: FunctionSelectSource[TElement]): SelectSources[TElement] = value.asInstanceOf[SelectSources[TElement]]
  @scala.inline
  implicit def apply[TElement](value: ValidSelectSources): SelectSources[TElement] = value.asInstanceOf[SelectSources[TElement]]
}

