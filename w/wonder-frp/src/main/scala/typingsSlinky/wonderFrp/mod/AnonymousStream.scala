package typingsSlinky.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "AnonymousStream")
@js.native
class AnonymousStream protected ()
  extends typingsSlinky.wonderFrp.anonymousStreamMod.AnonymousStream {
  def this(subscribeFunc: js.Function) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "AnonymousStream")
@js.native
object AnonymousStream extends js.Object {
  def create(subscribeFunc: js.Function): typingsSlinky.wonderFrp.anonymousStreamMod.AnonymousStream = js.native
}

