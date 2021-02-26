package typingsSlinky.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SourceApplication")
@js.native
class SourceApplication () extends StObject {
  
  /**
    * Read-only Square ID assigned to the application. Only used for `Product` type `EXTERNAL_API`.
    */
  var application_id: js.UndefOr[String] = js.native
  
  /**
    * Read-only display name assigned to the application (e.g. "Custom Application", "Square POS 4.74 for Android").
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Read-only `Product` type for the application. See [Product](#type-product) for possible values.
    */
  var product: js.UndefOr[ProductSourceType] = js.native
}
