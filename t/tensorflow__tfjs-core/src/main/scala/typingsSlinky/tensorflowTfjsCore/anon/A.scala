package typingsSlinky.tensorflowTfjsCore.anon

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait A[T /* <: Tensor[Rank] */] extends js.Object {
  var a: T | TensorLike = js.native
  var activation: js.UndefOr[typingsSlinky.tensorflowTfjsCore.fusedUtilMod.Activation] = js.native
  var b: T | TensorLike = js.native
  var bias: js.UndefOr[Tensor[Rank] | TensorLike] = js.native
  var preluActivationWeights: js.UndefOr[Tensor[Rank]] = js.native
  var transposeA: js.UndefOr[Boolean] = js.native
  var transposeB: js.UndefOr[Boolean] = js.native
}

object A {
  @scala.inline
  def apply[T](a: T | TensorLike, b: T | TensorLike): A[T] = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any])
    __obj.asInstanceOf[A[T]]
  }
  @scala.inline
  implicit class AOps[Self[t] <: A[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAInt32Array(value: js.typedarray.Int32Array): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAFloat32Array(value: js.typedarray.Float32Array): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAUint8Array(value: js.typedarray.Uint8Array): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withA(value: T | TensorLike): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBInt32Array(value: js.typedarray.Int32Array): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBFloat32Array(value: js.typedarray.Float32Array): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBUint8Array(value: js.typedarray.Uint8Array): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withB(value: T | TensorLike): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivation(value: typingsSlinky.tensorflowTfjsCore.fusedUtilMod.Activation): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivation: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activation")(js.undefined)
        ret
    }
    @scala.inline
    def withBiasInt32Array(value: js.typedarray.Int32Array): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBiasFloat32Array(value: js.typedarray.Float32Array): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBiasUint8Array(value: js.typedarray.Uint8Array): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBias(value: Tensor[Rank] | TensorLike): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBias: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bias")(js.undefined)
        ret
    }
    @scala.inline
    def withPreluActivationWeights(value: Tensor[Rank]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preluActivationWeights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreluActivationWeights: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preluActivationWeights")(js.undefined)
        ret
    }
    @scala.inline
    def withTransposeA(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transposeA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransposeA: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transposeA")(js.undefined)
        ret
    }
    @scala.inline
    def withTransposeB(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transposeB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransposeB: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transposeB")(js.undefined)
        ret
    }
  }
  
}

