package typingsSlinky.tensorflowTfjs.mod

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs", "signal")
@js.native
object signal extends js.Object {
  
  def frame(signal: Tensor[R1], frameLength: Double, frameStep: Double): Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def frame(
    signal: Tensor[R1],
    frameLength: Double,
    frameStep: Double,
    padEnd: js.UndefOr[scala.Nothing],
    padValue: Double
  ): Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def frame(signal: Tensor[R1], frameLength: Double, frameStep: Double, padEnd: Boolean): Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def frame(signal: Tensor[R1], frameLength: Double, frameStep: Double, padEnd: Boolean, padValue: Double): Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  
  def hammingWindow(windowLength: Double): Tensor[R1] = js.native
  
  def hannWindow(windowLength: Double): Tensor[R1] = js.native
  
  def stft(signal: Tensor[R1], frameLength: Double, frameStep: Double): Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def stft(
    signal: Tensor[R1],
    frameLength: Double,
    frameStep: Double,
    fftLength: js.UndefOr[scala.Nothing],
    windowFn: js.Function1[/* length */ Double, Tensor[R1]]
  ): Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def stft(signal: Tensor[R1], frameLength: Double, frameStep: Double, fftLength: Double): Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def stft(
    signal: Tensor[R1],
    frameLength: Double,
    frameStep: Double,
    fftLength: Double,
    windowFn: js.Function1[/* length */ Double, Tensor[R1]]
  ): Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
}
