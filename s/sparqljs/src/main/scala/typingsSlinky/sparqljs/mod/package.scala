package typingsSlinky.sparqljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.sparqljs.mod.OperationExpression
    - typingsSlinky.sparqljs.mod.FunctionCallExpression
    - typingsSlinky.sparqljs.mod.AggregateExpression
    - typingsSlinky.sparqljs.mod.BgpPattern
    - typingsSlinky.sparqljs.mod.GroupPattern
    - typingsSlinky.sparqljs.mod.Tuple
    - typingsSlinky.sparqljs.mod.Term
  */
  type Expression = typingsSlinky.sparqljs.mod._Expression | typingsSlinky.sparqljs.mod.Term
  type Term = java.lang.String with typingsSlinky.sparqljs.AnonTermBrand
  type ValuePatternRow = org.scalablytyped.runtime.StringDictionary[typingsSlinky.sparqljs.mod.Term]
  type Variable = typingsSlinky.sparqljs.mod.VariableExpression | typingsSlinky.sparqljs.mod.Term
}
