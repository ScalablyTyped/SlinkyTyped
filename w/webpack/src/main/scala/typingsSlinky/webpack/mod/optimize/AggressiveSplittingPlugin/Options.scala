package typingsSlinky.webpack.mod.optimize.AggressiveSplittingPlugin

import typingsSlinky.webpack.webpackNumbers.`0`
import typingsSlinky.webpack.webpackNumbers.`1`
import typingsSlinky.webpack.webpackNumbers.`30000`
import typingsSlinky.webpack.webpackNumbers.`50000`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var chunkOverhead: `0` = js.native
  var entryChunkMultiplicator: `1` = js.native
  /**
    * Size in byte.
    * maximum size prefered for each chunk.
    *
    * Default: 51200
    */
  var maxSize: `50000` = js.native
  /**
    * Size in byte.
    * Only chunks bigger than the specified minSize are stored in records.
    * This ensures the chunks fill up as your application grows,
    * instead of creating too many chunks for every change.
    *
    * Default: 30720
    */
  var minSize: `30000` = js.native
}

object Options {
  @scala.inline
  def apply(chunkOverhead: `0`, entryChunkMultiplicator: `1`, maxSize: `50000`, minSize: `30000`): Options = {
    val __obj = js.Dynamic.literal(chunkOverhead = chunkOverhead.asInstanceOf[js.Any], entryChunkMultiplicator = entryChunkMultiplicator.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChunkOverhead(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkOverhead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntryChunkMultiplicator(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryChunkMultiplicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxSize(value: `50000`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinSize(value: `30000`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

