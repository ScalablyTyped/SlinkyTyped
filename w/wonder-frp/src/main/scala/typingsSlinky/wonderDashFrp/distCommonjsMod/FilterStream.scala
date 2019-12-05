package typingsSlinky.wonderDashFrp.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "FilterStream")
@js.native
class FilterStream protected ()
  extends typingsSlinky.wonderDashFrp.distCommonjsStreamFilterStreamMod.FilterStream {
  def this(
    source: typingsSlinky.wonderDashFrp.distCommonjsCoreStreamMod.Stream,
    predicate: js.Function3[
        /* value */ js.Any, 
        /* index */ js.UndefOr[Double], 
        /* source */ js.UndefOr[typingsSlinky.wonderDashFrp.distCommonjsCoreStreamMod.Stream], 
        Boolean
      ],
    thisArg: js.Any
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "FilterStream")
@js.native
object FilterStream extends js.Object {
  def create(
    source: typingsSlinky.wonderDashFrp.distCommonjsCoreStreamMod.Stream,
    predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[Double], 
      /* source */ js.UndefOr[typingsSlinky.wonderDashFrp.distCommonjsCoreStreamMod.Stream], 
      Boolean
    ],
    thisArg: js.Any
  ): typingsSlinky.wonderDashFrp.distCommonjsStreamFilterStreamMod.FilterStream = js.native
}

