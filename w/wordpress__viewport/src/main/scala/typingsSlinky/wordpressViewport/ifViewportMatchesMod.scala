package typingsSlinky.wordpressViewport

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/viewport/if-viewport-matches", JSImport.Namespace)
@js.native
object ifViewportMatchesMod extends js.Object {
  
  /**
    * Higher-order component creator, creating a new component which renders if
    * the viewport query is satisfied.
    *
    * @param query - Viewport query.
    *
    * @example
    * ```jsx
    * function MyMobileComponent() {
    *     return <div>I'm only rendered on mobile viewports!</div>;
    * }
    *
    * MyMobileComponent = ifViewportMatches( '< small' )( MyMobileComponent );
    * ```
    */
  // prettier-ignore
  def default(query: String): js.Function1[/* component */ ReactComponentClass[_], ReactComponentClass[_]] = js.native
}
