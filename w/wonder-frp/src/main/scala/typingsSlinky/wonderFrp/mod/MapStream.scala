package typingsSlinky.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MapStream")
@js.native
class MapStream protected ()
  extends typingsSlinky.wonderFrp.mapStreamMod.MapStream {
  def this(source: typingsSlinky.wonderFrp.streamMod.Stream, selector: js.Function) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "MapStream")
@js.native
object MapStream extends js.Object {
  def create(source: typingsSlinky.wonderFrp.streamMod.Stream, selector: js.Function): typingsSlinky.wonderFrp.mapStreamMod.MapStream = js.native
}

