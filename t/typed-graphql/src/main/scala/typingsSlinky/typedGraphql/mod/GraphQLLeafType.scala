package typingsSlinky.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typedGraphql.mod.GraphQLScalarType
  - typingsSlinky.typedGraphql.mod.GraphQLEnumType
*/
trait GraphQLLeafType extends js.Object

object GraphQLLeafType {
  @scala.inline
  implicit def apply(value: GraphQLEnumType): GraphQLLeafType = value.asInstanceOf[GraphQLLeafType]
  @scala.inline
  implicit def apply(value: GraphQLScalarType): GraphQLLeafType = value.asInstanceOf[GraphQLLeafType]
}

