package typingsSlinky.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql", "GraphQLList")
@js.native
class GraphQLList protected ()
  extends GraphQLInputType
     with GraphQLNullableType
     with GraphQLOutputType
     with GraphQLType {
  def this(`type`: GraphQLType) = this()
  
  var ofType: GraphQLType = js.native
}
