package typingsSlinky.wordpressData.mod

import slinky.core.ReactComponentClass
import typingsSlinky.wordpressData.anon.Registry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/data", "withRegistry")
@js.native
object withRegistry extends js.Object {
  def apply[P](component: ReactComponentClass[P]): ReactComponentClass[P with Registry] = js.native
}

