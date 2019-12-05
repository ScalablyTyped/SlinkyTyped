package typingsSlinky.atWordpressA11y

import typingsSlinky.atWordpressA11y.atWordpressA11yStrings.assertive
import typingsSlinky.atWordpressA11y.atWordpressA11yStrings.polite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/a11y", JSImport.Namespace)
@js.native
object atWordpressA11yMod extends js.Object {
  def setup(): Unit = js.native
  def speak(message: String): Unit = js.native
  @JSName("speak")
  def speak_assertive(message: String, ariaLive: assertive): Unit = js.native
  @JSName("speak")
  def speak_polite(message: String, ariaLive: polite): Unit = js.native
}

