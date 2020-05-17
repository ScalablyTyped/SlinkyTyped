package typingsSlinky.shrinkRay.anon

import typingsSlinky.shrinkRay.shrinkRayNumbers.`-1`
import typingsSlinky.shrinkRay.shrinkRayNumbers.`0`
import typingsSlinky.shrinkRay.shrinkRayNumbers.`1`
import typingsSlinky.shrinkRay.shrinkRayNumbers.`2`
import typingsSlinky.shrinkRay.shrinkRayNumbers.`3`
import typingsSlinky.shrinkRay.shrinkRayNumbers.`4`
import typingsSlinky.shrinkRay.shrinkRayNumbers.`5`
import typingsSlinky.shrinkRay.shrinkRayNumbers.`6`
import typingsSlinky.shrinkRay.shrinkRayNumbers.`7`
import typingsSlinky.shrinkRay.shrinkRayNumbers.`8`
import typingsSlinky.shrinkRay.shrinkRayNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  flush ? :number,   finishFlush ? :number,   chunkSize ? :number,   windowBits ? :number,   strategy ? :number,   dictionary ? :any,   level  :-1 | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9,   memLevel  :1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9}> */
@js.native
trait PartialflushnumberfinishF extends js.Object {
  var chunkSize: js.UndefOr[Double] = js.native
  var dictionary: js.UndefOr[js.Any] = js.native
  var finishFlush: js.UndefOr[Double] = js.native
  var flush: js.UndefOr[Double] = js.native
  var level: js.UndefOr[`-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`] = js.native
  var memLevel: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`] = js.native
  var strategy: js.UndefOr[Double] = js.native
  var windowBits: js.UndefOr[Double] = js.native
}

object PartialflushnumberfinishF {
  @scala.inline
  def apply(): PartialflushnumberfinishF = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialflushnumberfinishF]
  }
  @scala.inline
  implicit class PartialflushnumberfinishFOps[Self <: PartialflushnumberfinishF] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChunkSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSize")(js.undefined)
        ret
    }
    @scala.inline
    def withDictionary(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDictionary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary")(js.undefined)
        ret
    }
    @scala.inline
    def withFinishFlush(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishFlush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinishFlush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishFlush")(js.undefined)
        ret
    }
    @scala.inline
    def withFlush(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: `-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withMemLevel(value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withStrategy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowBits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowBits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowBits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowBits")(js.undefined)
        ret
    }
  }
  
}

