package typingsSlinky.vueDashScrollto

import typingsSlinky.vueDashScrollto.vueDashScrolltoMod.ElementDescriptor
import typingsSlinky.vueDashScrollto.vueDashScrolltoMod.ScrollOptions
import typingsSlinky.vueDashScrollto.vueDashScrolltoMod.ScrollToFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ScrollTo extends js.Object {
  @JSName("scrollTo")
  var scrollTo_Original: ScrollToFunction = js.native
  @JSName("setDefaults")
  var setDefaults_Original: ScrollToFunction = js.native
  def scrollTo(element: ElementDescriptor): js.Function0[Unit] = js.native
  def scrollTo(element: ElementDescriptor, duration: Double): js.Function0[Unit] = js.native
  def scrollTo(element: ElementDescriptor, duration: Double, options: ScrollOptions): js.Function0[Unit] = js.native
  def scrollTo(element: ElementDescriptor, options: ScrollOptions): js.Function0[Unit] = js.native
  def scrollTo(options: ScrollOptions): js.Function0[Unit] = js.native
  def setDefaults(element: ElementDescriptor): js.Function0[Unit] = js.native
  def setDefaults(element: ElementDescriptor, duration: Double): js.Function0[Unit] = js.native
  def setDefaults(element: ElementDescriptor, duration: Double, options: ScrollOptions): js.Function0[Unit] = js.native
  def setDefaults(element: ElementDescriptor, options: ScrollOptions): js.Function0[Unit] = js.native
  def setDefaults(options: ScrollOptions): js.Function0[Unit] = js.native
}

