package typingsSlinky.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "MapStream")
@js.native
class MapStream protected ()
  extends typingsSlinky.wonderFrp.streamMapStreamMod.MapStream {
  def this(source: typingsSlinky.wonderFrp.coreStreamMod.Stream, selector: js.Function) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "MapStream")
@js.native
object MapStream extends js.Object {
  def create(source: typingsSlinky.wonderFrp.coreStreamMod.Stream, selector: js.Function): typingsSlinky.wonderFrp.streamMapStreamMod.MapStream = js.native
}

