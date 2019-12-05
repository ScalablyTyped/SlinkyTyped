package typingsSlinky.atTensorflowTfjsDashCore

import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.NCHW
import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.NHWC
import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.ceil
import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.floor
import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.round
import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.same_
import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.valid_
import typingsSlinky.atTensorflowTfjsDashCore.distOpsFusedUnderscoreUtilMod.Activation
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Activation[T /* <: Tensor3D | Tensor4D */] extends js.Object {
  var activation: js.UndefOr[Activation] = js.undefined
  var bias: js.UndefOr[Tensor[Rank] | TensorLike] = js.undefined
  var dataFormat: js.UndefOr[NHWC | NCHW] = js.undefined
  var dilations: js.UndefOr[(js.Tuple2[Double, Double]) | Double] = js.undefined
  var dimRoundingMode: js.UndefOr[floor | round | ceil] = js.undefined
  var filter: Tensor4D | TensorLike
  var pad: valid_ | same_ | Double
  var preluActivationWeights: js.UndefOr[Tensor[Rank]] = js.undefined
  var strides: (js.Tuple2[Double, Double]) | Double
  var x: T | TensorLike
}

object Anon_Activation {
  @scala.inline
  def apply[T /* <: Tensor3D | Tensor4D */](
    filter: Tensor4D | TensorLike,
    pad: valid_ | same_ | Double,
    strides: (js.Tuple2[Double, Double]) | Double,
    x: T | TensorLike,
    activation: Activation = null,
    bias: Tensor[Rank] | TensorLike = null,
    dataFormat: NHWC | NCHW = null,
    dilations: (js.Tuple2[Double, Double]) | Double = null,
    dimRoundingMode: floor | round | ceil = null,
    preluActivationWeights: Tensor[Rank] = null
  ): Anon_Activation[T] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    if (activation != null) __obj.updateDynamic("activation")(activation.asInstanceOf[js.Any])
    if (bias != null) __obj.updateDynamic("bias")(bias.asInstanceOf[js.Any])
    if (dataFormat != null) __obj.updateDynamic("dataFormat")(dataFormat.asInstanceOf[js.Any])
    if (dilations != null) __obj.updateDynamic("dilations")(dilations.asInstanceOf[js.Any])
    if (dimRoundingMode != null) __obj.updateDynamic("dimRoundingMode")(dimRoundingMode.asInstanceOf[js.Any])
    if (preluActivationWeights != null) __obj.updateDynamic("preluActivationWeights")(preluActivationWeights.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Activation[T]]
  }
}

