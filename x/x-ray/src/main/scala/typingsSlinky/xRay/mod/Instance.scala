package typingsSlinky.xRay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance
  extends typingsSlinky.xRayCrawler.mod.Instance {
  def apply(selector: Selector): InstanceInvocation = js.native
  def apply(source: String, context: String, selector: Selector): InstanceInvocation = js.native
  def apply(source: String, selector: Selector): InstanceInvocation = js.native
}

