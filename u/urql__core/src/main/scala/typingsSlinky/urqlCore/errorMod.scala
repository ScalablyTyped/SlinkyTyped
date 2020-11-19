package typingsSlinky.urqlCore

import typingsSlinky.graphql.mod.GraphQLError
import typingsSlinky.std.Error
import typingsSlinky.urqlCore.anon.NetworkError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@urql/core/dist/types/utils/error", JSImport.Namespace)
@js.native
object errorMod extends js.Object {
  
  @js.native
  class CombinedError protected () extends Error {
    def this(hasNetworkErrorGraphQLErrorsResponse: NetworkError) = this()
    
    var graphQLErrors: js.Array[GraphQLError] = js.native
    
    var networkError: js.UndefOr[js.Error] = js.native
    
    var response: js.UndefOr[js.Any] = js.native
  }
}
