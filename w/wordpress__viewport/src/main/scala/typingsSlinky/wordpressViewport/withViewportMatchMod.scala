package typingsSlinky.wordpressViewport

import slinky.core.ReactComponentClass
import typingsSlinky.std.Omit
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withViewportMatchMod {
  
  /**
    * Higher-order component creator, creating a new component which renders with the given prop names,
    * where the value passed to the underlying component is the result of the query assigned as the
    * object's value.
    *
    * @param queries - Object of prop name to viewport query.
    *
    * @example
    *
    * ```jsx
    * function MyComponent( { isMobile } ) {
    *     return (
    *         <div>Currently: { isMobile ? 'Mobile' : 'Not Mobile' }</div>
    *     );
    * }
    *
    * MyComponent = withViewportMatch( { isMobile: '< small' } )( MyComponent );
    * ```
    */
  // prettier-ignore
  @JSImport("@wordpress/viewport/with-viewport-match", JSImport.Default)
  @js.native
  def default[T /* <: Record[String, String] */](queries: T): js.Function1[
    /* component */ ReactComponentClass[_], 
    ReactComponentClass[Omit[_, /* keyof T */ String]]
  ] = js.native
}
