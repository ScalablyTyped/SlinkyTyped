package typingsSlinky.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "FilterStream")
@js.native
class FilterStream protected ()
  extends typingsSlinky.wonderFrp.streamFilterStreamMod.FilterStream {
  def this(
    source: typingsSlinky.wonderFrp.coreStreamMod.Stream,
    predicate: js.Function3[
        /* value */ js.Any, 
        /* index */ js.UndefOr[Double], 
        /* source */ js.UndefOr[typingsSlinky.wonderFrp.coreStreamMod.Stream], 
        Boolean
      ],
    thisArg: js.Any
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "FilterStream")
@js.native
object FilterStream extends js.Object {
  def create(
    source: typingsSlinky.wonderFrp.coreStreamMod.Stream,
    predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[Double], 
      /* source */ js.UndefOr[typingsSlinky.wonderFrp.coreStreamMod.Stream], 
      Boolean
    ],
    thisArg: js.Any
  ): typingsSlinky.wonderFrp.streamFilterStreamMod.FilterStream = js.native
}

