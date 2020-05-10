package typingsSlinky.tensorflowTfjsCore.convUtilMod

import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.channelsFirst
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.channelsLast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Conv2DInfo extends js.Object {
  var batchSize: Double = js.native
  var dataFormat: channelsFirst | channelsLast = js.native
  var dilationHeight: Double = js.native
  var dilationWidth: Double = js.native
  var effectiveFilterHeight: Double = js.native
  var effectiveFilterWidth: Double = js.native
  var filterHeight: Double = js.native
  var filterShape: js.Tuple4[Double, Double, Double, Double] = js.native
  var filterWidth: Double = js.native
  var inChannels: Double = js.native
  var inHeight: Double = js.native
  var inShape: js.Tuple4[Double, Double, Double, Double] = js.native
  var inWidth: Double = js.native
  var outChannels: Double = js.native
  var outHeight: Double = js.native
  var outShape: js.Tuple4[Double, Double, Double, Double] = js.native
  var outWidth: Double = js.native
  var padInfo: PadInfo = js.native
  var strideHeight: Double = js.native
  var strideWidth: Double = js.native
}

object Conv2DInfo {
  @scala.inline
  def apply(
    batchSize: Double,
    dataFormat: channelsFirst | channelsLast,
    dilationHeight: Double,
    dilationWidth: Double,
    effectiveFilterHeight: Double,
    effectiveFilterWidth: Double,
    filterHeight: Double,
    filterShape: js.Tuple4[Double, Double, Double, Double],
    filterWidth: Double,
    inChannels: Double,
    inHeight: Double,
    inShape: js.Tuple4[Double, Double, Double, Double],
    inWidth: Double,
    outChannels: Double,
    outHeight: Double,
    outShape: js.Tuple4[Double, Double, Double, Double],
    outWidth: Double,
    padInfo: PadInfo,
    strideHeight: Double,
    strideWidth: Double
  ): Conv2DInfo = {
    val __obj = js.Dynamic.literal(batchSize = batchSize.asInstanceOf[js.Any], dataFormat = dataFormat.asInstanceOf[js.Any], dilationHeight = dilationHeight.asInstanceOf[js.Any], dilationWidth = dilationWidth.asInstanceOf[js.Any], effectiveFilterHeight = effectiveFilterHeight.asInstanceOf[js.Any], effectiveFilterWidth = effectiveFilterWidth.asInstanceOf[js.Any], filterHeight = filterHeight.asInstanceOf[js.Any], filterShape = filterShape.asInstanceOf[js.Any], filterWidth = filterWidth.asInstanceOf[js.Any], inChannels = inChannels.asInstanceOf[js.Any], inHeight = inHeight.asInstanceOf[js.Any], inShape = inShape.asInstanceOf[js.Any], inWidth = inWidth.asInstanceOf[js.Any], outChannels = outChannels.asInstanceOf[js.Any], outHeight = outHeight.asInstanceOf[js.Any], outShape = outShape.asInstanceOf[js.Any], outWidth = outWidth.asInstanceOf[js.Any], padInfo = padInfo.asInstanceOf[js.Any], strideHeight = strideHeight.asInstanceOf[js.Any], strideWidth = strideWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conv2DInfo]
  }
  @scala.inline
  implicit class Conv2DInfoOps[Self <: Conv2DInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataFormat(value: channelsFirst | channelsLast): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDilationHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dilationHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDilationWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dilationWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEffectiveFilterHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveFilterHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEffectiveFilterWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveFilterWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterShape(value: js.Tuple4[Double, Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInChannels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inChannels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInShape(value: js.Tuple4[Double, Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutChannels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outChannels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutShape(value: js.Tuple4[Double, Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPadInfo(value: PadInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrideHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strideHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrideWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strideWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

