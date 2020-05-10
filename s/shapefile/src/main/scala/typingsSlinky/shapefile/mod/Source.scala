package typingsSlinky.shapefile.mod

import typingsSlinky.shapefile.AnonDone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Source[RecordType] extends js.Object {
  var bbox: js.Array[Double] = js.native
  def cancel(): js.Promise[Unit] = js.native
  def read(): js.Promise[AnonDone[RecordType]] = js.native
}

object Source {
  @scala.inline
  def apply[RecordType](
    bbox: js.Array[Double],
    cancel: () => js.Promise[Unit],
    read: () => js.Promise[AnonDone[RecordType]]
  ): Source[RecordType] = {
    val __obj = js.Dynamic.literal(bbox = bbox.asInstanceOf[js.Any], cancel = js.Any.fromFunction0(cancel), read = js.Any.fromFunction0(read))
    __obj.asInstanceOf[Source[RecordType]]
  }
  @scala.inline
  implicit class SourceOps[Self[recordtype] <: Source[recordtype], RecordType] (val x: Self[RecordType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RecordType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RecordType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[RecordType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[RecordType] with Other]
    @scala.inline
    def withBbox(value: js.Array[Double]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancel(value: () => js.Promise[Unit]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRead(value: () => js.Promise[AnonDone[RecordType]]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

