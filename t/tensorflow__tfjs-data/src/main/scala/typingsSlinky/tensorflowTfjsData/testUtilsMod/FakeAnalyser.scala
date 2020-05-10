package typingsSlinky.tensorflowTfjsData.testUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FakeAnalyser extends js.Object {
  var fftSize: Double = js.native
  var smoothingTimeConstant: Double = js.native
  var x: js.Any = js.native
  def disconnect(): Unit = js.native
  def getFloatFrequencyData(data: js.typedarray.Float32Array): Unit = js.native
  def getFloatTimeDomainData(data: js.typedarray.Float32Array): Unit = js.native
}

object FakeAnalyser {
  @scala.inline
  def apply(
    disconnect: () => Unit,
    fftSize: Double,
    getFloatFrequencyData: js.typedarray.Float32Array => Unit,
    getFloatTimeDomainData: js.typedarray.Float32Array => Unit,
    smoothingTimeConstant: Double,
    x: js.Any
  ): FakeAnalyser = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), fftSize = fftSize.asInstanceOf[js.Any], getFloatFrequencyData = js.Any.fromFunction1(getFloatFrequencyData), getFloatTimeDomainData = js.Any.fromFunction1(getFloatTimeDomainData), smoothingTimeConstant = smoothingTimeConstant.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[FakeAnalyser]
  }
  @scala.inline
  implicit class FakeAnalyserOps[Self <: FakeAnalyser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisconnect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFftSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fftSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetFloatFrequencyData(value: js.typedarray.Float32Array => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFloatFrequencyData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFloatTimeDomainData(value: js.typedarray.Float32Array => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFloatTimeDomainData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSmoothingTimeConstant(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothingTimeConstant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

