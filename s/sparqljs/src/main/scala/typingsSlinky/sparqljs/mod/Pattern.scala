package typingsSlinky.sparqljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sparqljs.mod.BgpPattern
  - typingsSlinky.sparqljs.mod.BlockPattern
  - typingsSlinky.sparqljs.mod.GraphPattern
  - typingsSlinky.sparqljs.mod.ServicePattern
  - typingsSlinky.sparqljs.mod.FilterPattern
  - typingsSlinky.sparqljs.mod.BindPattern
  - typingsSlinky.sparqljs.mod.ValuesPattern
  - typingsSlinky.sparqljs.mod.SelectQuery
*/
trait Pattern extends js.Object

object Pattern {
  @scala.inline
  implicit def apply(value: BgpPattern): Pattern = value.asInstanceOf[Pattern]
  @scala.inline
  implicit def apply(value: BindPattern): Pattern = value.asInstanceOf[Pattern]
  @scala.inline
  implicit def apply(value: BlockPattern): Pattern = value.asInstanceOf[Pattern]
  @scala.inline
  implicit def apply(value: FilterPattern): Pattern = value.asInstanceOf[Pattern]
  @scala.inline
  implicit def apply(value: GraphPattern): Pattern = value.asInstanceOf[Pattern]
  @scala.inline
  implicit def apply(value: SelectQuery): Pattern = value.asInstanceOf[Pattern]
  @scala.inline
  implicit def apply(value: ServicePattern): Pattern = value.asInstanceOf[Pattern]
  @scala.inline
  implicit def apply(value: ValuesPattern): Pattern = value.asInstanceOf[Pattern]
}

