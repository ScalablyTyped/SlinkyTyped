package typingsSlinky.webpack.mod.optimize.AggressiveMergingPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * When options.moveToParents is set, moving to an entry chunk is more expensive.
    * Defaults to 10, which means moving to an entry chunk is ten times more expensive than moving to a
    * normal chunk.
    */
  var entryChunkMultiplicator: js.UndefOr[Double] = js.native
  /**
    * A factor which defines the minimum required size reduction for chunk merging.
    * Defaults to 1.5 which means that the total size needs to be reduced by 50% for chunk merging.
    */
  var minSizeReduce: js.UndefOr[Double] = js.native
  /**
    * When set, modules that are not in both merged chunks are moved to all parents of the chunk.
    * Defaults to false.
    */
  var moveToParents: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntryChunkMultiplicator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryChunkMultiplicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntryChunkMultiplicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryChunkMultiplicator")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSizeReduce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSizeReduce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSizeReduce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSizeReduce")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveToParents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToParents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveToParents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToParents")(js.undefined)
        ret
    }
  }
  
}

