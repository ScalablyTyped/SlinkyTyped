package typingsSlinky.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typedGraphql.mod.GraphQLScalarType
  - typingsSlinky.typedGraphql.mod.GraphQLObjectType
  - typingsSlinky.typedGraphql.mod.GraphQLInterfaceType
  - typingsSlinky.typedGraphql.mod.GraphQLUnionType
  - typingsSlinky.typedGraphql.mod.GraphQLEnumType
  - typingsSlinky.typedGraphql.mod.GraphQLInputObjectType
*/
trait GraphQLNamedType extends js.Object

object GraphQLNamedType {
  @scala.inline
  implicit def apply(value: GraphQLEnumType): GraphQLNamedType = value.asInstanceOf[GraphQLNamedType]
  @scala.inline
  implicit def apply(value: GraphQLInputObjectType): GraphQLNamedType = value.asInstanceOf[GraphQLNamedType]
  @scala.inline
  implicit def apply(value: GraphQLInterfaceType): GraphQLNamedType = value.asInstanceOf[GraphQLNamedType]
  @scala.inline
  implicit def apply(value: GraphQLObjectType): GraphQLNamedType = value.asInstanceOf[GraphQLNamedType]
  @scala.inline
  implicit def apply(value: GraphQLScalarType): GraphQLNamedType = value.asInstanceOf[GraphQLNamedType]
  @scala.inline
  implicit def apply(value: GraphQLUnionType): GraphQLNamedType = value.asInstanceOf[GraphQLNamedType]
}

