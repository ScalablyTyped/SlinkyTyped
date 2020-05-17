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
  - typingsSlinky.typedGraphql.mod.GraphQLList
  - typingsSlinky.typedGraphql.mod.GraphQLNonNull
*/
trait GraphQLOutputType extends js.Object

object GraphQLOutputType {
  @scala.inline
  implicit def apply(value: GraphQLEnumType): GraphQLOutputType = value.asInstanceOf[GraphQLOutputType]
  @scala.inline
  implicit def apply(value: GraphQLInterfaceType): GraphQLOutputType = value.asInstanceOf[GraphQLOutputType]
  @scala.inline
  implicit def apply(value: GraphQLList): GraphQLOutputType = value.asInstanceOf[GraphQLOutputType]
  @scala.inline
  implicit def apply(value: GraphQLNonNull): GraphQLOutputType = value.asInstanceOf[GraphQLOutputType]
  @scala.inline
  implicit def apply(value: GraphQLObjectType): GraphQLOutputType = value.asInstanceOf[GraphQLOutputType]
  @scala.inline
  implicit def apply(value: GraphQLScalarType): GraphQLOutputType = value.asInstanceOf[GraphQLOutputType]
  @scala.inline
  implicit def apply(value: GraphQLUnionType): GraphQLOutputType = value.asInstanceOf[GraphQLOutputType]
}

