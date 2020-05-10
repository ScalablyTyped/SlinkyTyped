package typingsSlinky.webpack

import typingsSlinky.webpack.mod.compilation.Chunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNewChunks extends js.Object {
  var newChunks: js.Array[Chunk] = js.native
  var oldChunk: Chunk = js.native
}

object AnonNewChunks {
  @scala.inline
  def apply(newChunks: js.Array[Chunk], oldChunk: Chunk): AnonNewChunks = {
    val __obj = js.Dynamic.literal(newChunks = newChunks.asInstanceOf[js.Any], oldChunk = oldChunk.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewChunks]
  }
  @scala.inline
  implicit class AnonNewChunksOps[Self <: AnonNewChunks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewChunks(value: js.Array[Chunk]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldChunk(value: Chunk): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldChunk")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

