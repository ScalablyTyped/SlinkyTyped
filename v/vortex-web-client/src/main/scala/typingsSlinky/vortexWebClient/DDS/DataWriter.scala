package typingsSlinky.vortexWebClient.DDS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataWriter extends js.Object {
  /**
  		 * Closes the DataWriter
  		 */
  def close(): Unit = js.native
  /**
  		 * Writes one or more samples.
  		 * @param ds - data sample
  		 */
  def write(ds: js.Any*): Unit = js.native
}

object DataWriter {
  @scala.inline
  def apply(close: () => Unit, write: /* repeated */ js.Any => Unit): DataWriter = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[DataWriter]
  }
  @scala.inline
  implicit class DataWriterOps[Self <: DataWriter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWrite(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

