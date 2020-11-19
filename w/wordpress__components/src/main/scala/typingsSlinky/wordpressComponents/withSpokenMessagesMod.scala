package typingsSlinky.wordpressComponents

import slinky.core.ReactComponentClass
import typingsSlinky.std.Omit
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.debouncedSpeak
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.speak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/components/higher-order/with-spoken-messages", JSImport.Namespace)
@js.native
object withSpokenMessagesMod extends js.Object {
  
  def default[T /* <: ReactComponentClass[_] */](wrapped: T): ReactComponentClass[Omit[_, speak | debouncedSpeak]] = js.native
}
