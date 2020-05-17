package typingsSlinky.webpack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChunkOverhead extends js.Object {
  var chunkOverhead: js.UndefOr[Double] = js.native
  var entryChunkMultiplicator: js.UndefOr[Double] = js.native
}

object ChunkOverhead {
  @scala.inline
  def apply(): ChunkOverhead = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChunkOverhead]
  }
  @scala.inline
  implicit class ChunkOverheadOps[Self <: ChunkOverhead] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChunkOverhead(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkOverhead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkOverhead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkOverhead")(js.undefined)
        ret
    }
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
  }
  
}

