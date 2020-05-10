package typingsSlinky.winrt.Windows.Storage.Compression

import typingsSlinky.winrt.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICompressorFactory extends js.Object {
  def createCompressor(underlyingStream: IOutputStream): Compressor = js.native
  def createCompressorEx(underlyingStream: IOutputStream, algorithm: CompressAlgorithm, blockSize: Double): Compressor = js.native
}

object ICompressorFactory {
  @scala.inline
  def apply(
    createCompressor: IOutputStream => Compressor,
    createCompressorEx: (IOutputStream, CompressAlgorithm, Double) => Compressor
  ): ICompressorFactory = {
    val __obj = js.Dynamic.literal(createCompressor = js.Any.fromFunction1(createCompressor), createCompressorEx = js.Any.fromFunction3(createCompressorEx))
    __obj.asInstanceOf[ICompressorFactory]
  }
  @scala.inline
  implicit class ICompressorFactoryOps[Self <: ICompressorFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateCompressor(value: IOutputStream => Compressor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCompressor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateCompressorEx(value: (IOutputStream, CompressAlgorithm, Double) => Compressor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCompressorEx")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

