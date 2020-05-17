package typingsSlinky.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typedGraphql.mod.GraphQLScalarType
  - typingsSlinky.typedGraphql.mod.GraphQLEnumType
  - typingsSlinky.typedGraphql.mod.GraphQLInputObjectType
  - typingsSlinky.typedGraphql.mod.GraphQLList
  - typingsSlinky.typedGraphql.mod.GraphQLNonNull
*/
trait GraphQLInputType extends js.Object

object GraphQLInputType {
  @scala.inline
  implicit def apply(value: GraphQLEnumType): GraphQLInputType = value.asInstanceOf[GraphQLInputType]
  @scala.inline
  implicit def apply(value: GraphQLInputObjectType): GraphQLInputType = value.asInstanceOf[GraphQLInputType]
  @scala.inline
  implicit def apply(value: GraphQLList): GraphQLInputType = value.asInstanceOf[GraphQLInputType]
  @scala.inline
  implicit def apply(value: GraphQLNonNull): GraphQLInputType = value.asInstanceOf[GraphQLInputType]
  @scala.inline
  implicit def apply(value: GraphQLScalarType): GraphQLInputType = value.asInstanceOf[GraphQLInputType]
}

