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
  - typingsSlinky.typedGraphql.mod.GraphQLList
*/
trait GraphQLNullableType extends js.Object

object GraphQLNullableType {
  @scala.inline
  implicit def apply(value: GraphQLEnumType): GraphQLNullableType = value.asInstanceOf[GraphQLNullableType]
  @scala.inline
  implicit def apply(value: GraphQLInputObjectType): GraphQLNullableType = value.asInstanceOf[GraphQLNullableType]
  @scala.inline
  implicit def apply(value: GraphQLInterfaceType): GraphQLNullableType = value.asInstanceOf[GraphQLNullableType]
  @scala.inline
  implicit def apply(value: GraphQLList): GraphQLNullableType = value.asInstanceOf[GraphQLNullableType]
  @scala.inline
  implicit def apply(value: GraphQLObjectType): GraphQLNullableType = value.asInstanceOf[GraphQLNullableType]
  @scala.inline
  implicit def apply(value: GraphQLScalarType): GraphQLNullableType = value.asInstanceOf[GraphQLNullableType]
  @scala.inline
  implicit def apply(value: GraphQLUnionType): GraphQLNullableType = value.asInstanceOf[GraphQLNullableType]
}

