package typingsSlinky.upngJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageTabs extends js.Object {
  var PLTE: js.UndefOr[js.Array[Double]] = js.native
  var acTL: js.UndefOr[ImageTabACTL] = js.native
  var bKGD: js.UndefOr[Double | js.Array[Double]] = js.native
  var cHRM: js.UndefOr[js.Array[Double]] = js.native
   // Depends on ctype
  var gAMA: js.UndefOr[Double] = js.native
  var hIST: js.UndefOr[js.Array[Double]] = js.native
  var iTXt: js.UndefOr[ImageTabText] = js.native
  var pHYs: js.UndefOr[js.Array[Double]] = js.native
  var sRGB: js.UndefOr[Double] = js.native
  var tEXt: js.UndefOr[ImageTabText] = js.native
  var tRNS: js.UndefOr[Double | js.Array[Double]] = js.native
}

object ImageTabs {
  @scala.inline
  def apply(): ImageTabs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageTabs]
  }
  @scala.inline
  implicit class ImageTabsOps[Self <: ImageTabs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPLTE(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PLTE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPLTE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PLTE")(js.undefined)
        ret
    }
    @scala.inline
    def withAcTL(value: ImageTabACTL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acTL")(js.undefined)
        ret
    }
    @scala.inline
    def withBKGD(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bKGD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBKGD: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bKGD")(js.undefined)
        ret
    }
    @scala.inline
    def withCHRM(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cHRM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCHRM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cHRM")(js.undefined)
        ret
    }
    @scala.inline
    def withGAMA(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gAMA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGAMA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gAMA")(js.undefined)
        ret
    }
    @scala.inline
    def withHIST(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hIST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHIST: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hIST")(js.undefined)
        ret
    }
    @scala.inline
    def withITXt(value: ImageTabText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iTXt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutITXt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iTXt")(js.undefined)
        ret
    }
    @scala.inline
    def withPHYs(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pHYs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPHYs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pHYs")(js.undefined)
        ret
    }
    @scala.inline
    def withSRGB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sRGB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSRGB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sRGB")(js.undefined)
        ret
    }
    @scala.inline
    def withTEXt(value: ImageTabText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tEXt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTEXt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tEXt")(js.undefined)
        ret
    }
    @scala.inline
    def withTRNS(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tRNS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTRNS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tRNS")(js.undefined)
        ret
    }
  }
  
}

