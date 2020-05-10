package typingsSlinky.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NonMaxSuppressionV5Attrs extends js.Object {
  var iouThreshold: Double = js.native
  var maxOutputSize: Double = js.native
  var scoreThreshold: Double = js.native
  var softNmsSigma: Double = js.native
}

object NonMaxSuppressionV5Attrs {
  @scala.inline
  def apply(iouThreshold: Double, maxOutputSize: Double, scoreThreshold: Double, softNmsSigma: Double): NonMaxSuppressionV5Attrs = {
    val __obj = js.Dynamic.literal(iouThreshold = iouThreshold.asInstanceOf[js.Any], maxOutputSize = maxOutputSize.asInstanceOf[js.Any], scoreThreshold = scoreThreshold.asInstanceOf[js.Any], softNmsSigma = softNmsSigma.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonMaxSuppressionV5Attrs]
  }
  @scala.inline
  implicit class NonMaxSuppressionV5AttrsOps[Self <: NonMaxSuppressionV5Attrs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIouThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iouThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxOutputSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOutputSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScoreThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoreThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoftNmsSigma(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softNmsSigma")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

