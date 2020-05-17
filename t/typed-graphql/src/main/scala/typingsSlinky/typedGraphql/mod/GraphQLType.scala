package typingsSlinky.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// type/definition.js
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typedGraphql.mod.GraphQLScalarType
  - typingsSlinky.typedGraphql.mod.GraphQLObjectType
  - typingsSlinky.typedGraphql.mod.GraphQLInterfaceType
  - typingsSlinky.typedGraphql.mod.GraphQLUnionType
  - typingsSlinky.typedGraphql.mod.GraphQLEnumType
  - typingsSlinky.typedGraphql.mod.GraphQLInputObjectType
  - typingsSlinky.typedGraphql.mod.GraphQLList
  - typingsSlinky.typedGraphql.mod.GraphQLNonNull
*/
trait GraphQLType extends js.Object

object GraphQLType {
  @scala.inline
  implicit def apply(value: GraphQLEnumType): GraphQLType = value.asInstanceOf[GraphQLType]
  @scala.inline
  implicit def apply(value: GraphQLInputObjectType): GraphQLType = value.asInstanceOf[GraphQLType]
  @scala.inline
  implicit def apply(value: GraphQLInterfaceType): GraphQLType = value.asInstanceOf[GraphQLType]
  @scala.inline
  implicit def apply(value: GraphQLList): GraphQLType = value.asInstanceOf[GraphQLType]
  @scala.inline
  implicit def apply(value: GraphQLNonNull): GraphQLType = value.asInstanceOf[GraphQLType]
  @scala.inline
  implicit def apply(value: GraphQLObjectType): GraphQLType = value.asInstanceOf[GraphQLType]
  @scala.inline
  implicit def apply(value: GraphQLScalarType): GraphQLType = value.asInstanceOf[GraphQLType]
  @scala.inline
  implicit def apply(value: GraphQLUnionType): GraphQLType = value.asInstanceOf[GraphQLType]
}

