package typingsSlinky.atTensorflowTfjsDashData.distUtilTestUnderscoreUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FakeAnalyser extends js.Object {
  var fftSize: Double
  var smoothingTimeConstant: Double
  var x: js.Any
  def disconnect(): Unit
  def getFloatFrequencyData(data: scala.scalajs.js.typedarray.Float32Array): Unit
  def getFloatTimeDomainData(data: scala.scalajs.js.typedarray.Float32Array): Unit
}

object FakeAnalyser {
  @scala.inline
  def apply(
    disconnect: () => Unit,
    fftSize: Double,
    getFloatFrequencyData: scala.scalajs.js.typedarray.Float32Array => Unit,
    getFloatTimeDomainData: scala.scalajs.js.typedarray.Float32Array => Unit,
    smoothingTimeConstant: Double,
    x: js.Any
  ): FakeAnalyser = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), fftSize = fftSize.asInstanceOf[js.Any], getFloatFrequencyData = js.Any.fromFunction1(getFloatFrequencyData), getFloatTimeDomainData = js.Any.fromFunction1(getFloatTimeDomainData), smoothingTimeConstant = smoothingTimeConstant.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FakeAnalyser]
  }
}

