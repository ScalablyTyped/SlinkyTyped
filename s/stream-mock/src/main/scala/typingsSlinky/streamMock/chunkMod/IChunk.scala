package typingsSlinky.streamMock.chunkMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChunk extends js.Object {
  var chunk: Buffer | String = js.native
  var encoding: BufferEncoding = js.native
}

object IChunk {
  @scala.inline
  def apply(chunk: Buffer | String, encoding: BufferEncoding): IChunk = {
    val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChunk]
  }
  @scala.inline
  implicit class IChunkOps[Self <: IChunk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChunk(value: Buffer | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncoding(value: BufferEncoding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

