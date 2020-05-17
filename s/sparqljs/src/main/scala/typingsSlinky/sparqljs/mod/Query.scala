package typingsSlinky.sparqljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sparqljs.mod.SelectQuery
  - typingsSlinky.sparqljs.mod.ConstructQuery
  - typingsSlinky.sparqljs.mod.AskQuery
  - typingsSlinky.sparqljs.mod.DescribeQuery
*/
trait Query extends SparqlQuery

object Query {
  @scala.inline
  implicit def apply(value: AskQuery): Query = value.asInstanceOf[Query]
  @scala.inline
  implicit def apply(value: ConstructQuery): Query = value.asInstanceOf[Query]
  @scala.inline
  implicit def apply(value: DescribeQuery): Query = value.asInstanceOf[Query]
  @scala.inline
  implicit def apply(value: SelectQuery): Query = value.asInstanceOf[Query]
}

