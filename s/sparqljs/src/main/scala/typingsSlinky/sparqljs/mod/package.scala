package typingsSlinky.sparqljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BlankTerm = typingsSlinky.rdfJs.mod.BlankNode
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.sparqljs.mod.OperationExpression
    - typingsSlinky.sparqljs.mod.FunctionCallExpression
    - typingsSlinky.sparqljs.mod.AggregateExpression
    - typingsSlinky.sparqljs.mod.BgpPattern
    - typingsSlinky.sparqljs.mod.GraphPattern
    - typingsSlinky.sparqljs.mod.GroupPattern
    - typingsSlinky.sparqljs.mod.Tuple
    - typingsSlinky.sparqljs.mod.Term
  */
  type Expression = typingsSlinky.sparqljs.mod._Expression | typingsSlinky.sparqljs.mod.Term
  
  type IriTerm = typingsSlinky.rdfJs.mod.NamedNode[java.lang.String]
  
  type LiteralTerm = typingsSlinky.rdfJs.mod.Literal
  
  type QuadTerm = typingsSlinky.rdfJs.mod.Quad
  
  type Term = typingsSlinky.sparqljs.mod.VariableTerm | typingsSlinky.sparqljs.mod.IriTerm | typingsSlinky.sparqljs.mod.LiteralTerm | typingsSlinky.sparqljs.mod.BlankTerm | typingsSlinky.sparqljs.mod.QuadTerm
  
  type ValuePatternRow = org.scalablytyped.runtime.StringDictionary[
    js.UndefOr[
      typingsSlinky.sparqljs.mod.IriTerm | typingsSlinky.sparqljs.mod.BlankTerm | typingsSlinky.sparqljs.mod.LiteralTerm
    ]
  ]
  
  type Variable = typingsSlinky.sparqljs.mod.VariableExpression | typingsSlinky.sparqljs.mod.VariableTerm
  
  type VariableTerm = typingsSlinky.rdfJs.mod.Variable
}
