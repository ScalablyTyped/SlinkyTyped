package typingsSlinky.vortexWebClient.DDS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataReader extends js.Object {
  /**
  		 * Attaches the  listener `l` to this data reader and returns
  		 * the id associated to the listener.
  		 * @param l - listener code
  		 * @returns listener handle
  		 */
  def addListener(l: js.Function1[/* msg */ js.Any, Unit]): Double = js.native
  /**
  		 * closes the DataReader
  		 */
  def close(): Unit = js.native
  /**
  		 * removes a listener from this data reader.
  		 * @param idx - listener id
  		 */
  def removeListener(idx: Double): Unit = js.native
  def resetStats(): Unit = js.native
}

object DataReader {
  @scala.inline
  def apply(
    addListener: js.Function1[/* msg */ js.Any, Unit] => Double,
    close: () => Unit,
    removeListener: Double => Unit,
    resetStats: () => Unit
  ): DataReader = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), close = js.Any.fromFunction0(close), removeListener = js.Any.fromFunction1(removeListener), resetStats = js.Any.fromFunction0(resetStats))
    __obj.asInstanceOf[DataReader]
  }
  @scala.inline
  implicit class DataReaderOps[Self <: DataReader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddListener(value: js.Function1[/* msg */ js.Any, Unit] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveListener(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResetStats(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetStats")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

