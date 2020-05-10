package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFft extends js.Object {
  def fft(x: Tensor[Rank]): Tensor[Rank] = js.native
  def ifft(x: Tensor[Rank]): Tensor[Rank] = js.native
  def irfft(x: Tensor[Rank]): Tensor[Rank] = js.native
  def rfft(x: Tensor[Rank]): Tensor[Rank] = js.native
}

object AnonFft {
  @scala.inline
  def apply(
    fft: Tensor[Rank] => Tensor[Rank],
    ifft: Tensor[Rank] => Tensor[Rank],
    irfft: Tensor[Rank] => Tensor[Rank],
    rfft: Tensor[Rank] => Tensor[Rank]
  ): AnonFft = {
    val __obj = js.Dynamic.literal(fft = js.Any.fromFunction1(fft), ifft = js.Any.fromFunction1(ifft), irfft = js.Any.fromFunction1(irfft), rfft = js.Any.fromFunction1(rfft))
    __obj.asInstanceOf[AnonFft]
  }
  @scala.inline
  implicit class AnonFftOps[Self <: AnonFft] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFft(value: Tensor[Rank] => Tensor[Rank]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIfft(value: Tensor[Rank] => Tensor[Rank]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIrfft(value: Tensor[Rank] => Tensor[Rank]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("irfft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRfft(value: Tensor[Rank] => Tensor[Rank]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rfft")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

