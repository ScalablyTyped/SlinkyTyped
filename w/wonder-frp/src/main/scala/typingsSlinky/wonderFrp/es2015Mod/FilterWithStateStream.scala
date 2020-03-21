package typingsSlinky.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "FilterWithStateStream")
@js.native
class FilterWithStateStream ()
  extends typingsSlinky.wonderFrp.streamFilterWithStateStreamMod.FilterWithStateStream

/* static members */
@JSImport("wonder-frp/dist/es2015", "FilterWithStateStream")
@js.native
object FilterWithStateStream extends js.Object {
  def create(
    source: typingsSlinky.wonderFrp.coreStreamMod.Stream,
    predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[Double], 
      /* source */ js.UndefOr[typingsSlinky.wonderFrp.coreStreamMod.Stream], 
      Boolean
    ],
    thisArg: js.Any
  ): typingsSlinky.wonderFrp.streamFilterWithStateStreamMod.FilterWithStateStream = js.native
}

