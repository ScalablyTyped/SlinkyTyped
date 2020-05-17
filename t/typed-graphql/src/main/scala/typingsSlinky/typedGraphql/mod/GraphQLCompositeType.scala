package typingsSlinky.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typedGraphql.mod.GraphQLObjectType
  - typingsSlinky.typedGraphql.mod.GraphQLInterfaceType
  - typingsSlinky.typedGraphql.mod.GraphQLUnionType
*/
trait GraphQLCompositeType extends js.Object

object GraphQLCompositeType {
  @scala.inline
  implicit def apply(value: GraphQLInterfaceType): GraphQLCompositeType = value.asInstanceOf[GraphQLCompositeType]
  @scala.inline
  implicit def apply(value: GraphQLObjectType): GraphQLCompositeType = value.asInstanceOf[GraphQLCompositeType]
  @scala.inline
  implicit def apply(value: GraphQLUnionType): GraphQLCompositeType = value.asInstanceOf[GraphQLCompositeType]
}

