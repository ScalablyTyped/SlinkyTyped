package typingsSlinky.wordpressComponents.mod

import slinky.core.ReactComponentClass
import typingsSlinky.std.Omit
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.debouncedSpeak
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.speak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/components", "withSpokenMessages")
@js.native
object withSpokenMessages extends js.Object {
  def apply[T /* <: ReactComponentClass[_] */](wrapped: T): ReactComponentClass[Omit[_, speak | debouncedSpeak]] = js.native
}

