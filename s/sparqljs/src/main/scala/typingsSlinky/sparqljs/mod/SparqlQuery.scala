package typingsSlinky.sparqljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sparqljs.mod.Query
  - typingsSlinky.sparqljs.mod.Update
*/
trait SparqlQuery extends js.Object

object SparqlQuery {
  @scala.inline
  implicit def apply(value: Query): SparqlQuery = value.asInstanceOf[SparqlQuery]
  @scala.inline
  implicit def apply(value: Update): SparqlQuery = value.asInstanceOf[SparqlQuery]
}

