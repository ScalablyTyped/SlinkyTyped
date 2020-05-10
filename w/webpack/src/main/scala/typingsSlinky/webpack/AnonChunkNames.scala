package typingsSlinky.webpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChunkNames extends js.Object {
  var chunkNames: js.Array[String] = js.native
  var chunks: js.Array[Double | String] = js.native
  var emitted: Boolean = js.native
  var isOverSizeLimit: js.UndefOr[Boolean] = js.native
  var name: String = js.native
  var size: Double = js.native
}

object AnonChunkNames {
  @scala.inline
  def apply(
    chunkNames: js.Array[String],
    chunks: js.Array[Double | String],
    emitted: Boolean,
    name: String,
    size: Double
  ): AnonChunkNames = {
    val __obj = js.Dynamic.literal(chunkNames = chunkNames.asInstanceOf[js.Any], chunks = chunks.asInstanceOf[js.Any], emitted = emitted.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChunkNames]
  }
  @scala.inline
  implicit class AnonChunkNamesOps[Self <: AnonChunkNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChunkNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChunks(value: js.Array[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmitted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOverSizeLimit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOverSizeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOverSizeLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOverSizeLimit")(js.undefined)
        ret
    }
  }
  
}

