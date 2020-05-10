package typingsSlinky.tensorflowTfjsCore.backendMod

import typingsSlinky.tensorflowTfjsCore.AnonUnreliable
import typingsSlinky.tensorflowTfjsCore.distTypesMod.BackendValues
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.tensorMod.DataId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TensorStorage extends js.Object {
  def disposeData(dataId: DataId): Unit = js.native
  def memory(): AnonUnreliable = js.native
  def move(dataId: DataId, values: BackendValues, shape: js.Array[Double], dtype: DataType): Unit = js.native
  /** Returns number of data ids currently in the storage. */
  def numDataIds(): Double = js.native
  def read(dataId: DataId): js.Promise[BackendValues] = js.native
  def readSync(dataId: DataId): BackendValues = js.native
  def write(values: BackendValues, shape: js.Array[Double], dtype: DataType): DataId = js.native
}

object TensorStorage {
  @scala.inline
  def apply(
    disposeData: DataId => Unit,
    memory: () => AnonUnreliable,
    move: (DataId, BackendValues, js.Array[Double], DataType) => Unit,
    numDataIds: () => Double,
    read: DataId => js.Promise[BackendValues],
    readSync: DataId => BackendValues,
    write: (BackendValues, js.Array[Double], DataType) => DataId
  ): TensorStorage = {
    val __obj = js.Dynamic.literal(disposeData = js.Any.fromFunction1(disposeData), memory = js.Any.fromFunction0(memory), move = js.Any.fromFunction4(move), numDataIds = js.Any.fromFunction0(numDataIds), read = js.Any.fromFunction1(read), readSync = js.Any.fromFunction1(readSync), write = js.Any.fromFunction3(write))
    __obj.asInstanceOf[TensorStorage]
  }
  @scala.inline
  implicit class TensorStorageOps[Self <: TensorStorage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisposeData(value: DataId => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposeData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMemory(value: () => AnonUnreliable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memory")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMove(value: (DataId, BackendValues, js.Array[Double], DataType) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withNumDataIds(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numDataIds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRead(value: DataId => js.Promise[BackendValues]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReadSync(value: DataId => BackendValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readSync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWrite(value: (BackendValues, js.Array[Double], DataType) => DataId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

