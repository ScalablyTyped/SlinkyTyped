package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBitMatrix extends js.Object {
  def release(): Unit = js.native
  def setValueAt(x: Double, y: Double, value: Boolean): Unit = js.native
  def valueAt(x: Double, y: Double): Boolean = js.native
}

object IBitMatrix {
  @scala.inline
  def apply(
    release: () => Unit,
    setValueAt: (Double, Double, Boolean) => Unit,
    valueAt: (Double, Double) => Boolean
  ): IBitMatrix = {
    val __obj = js.Dynamic.literal(release = js.Any.fromFunction0(release), setValueAt = js.Any.fromFunction3(setValueAt), valueAt = js.Any.fromFunction2(valueAt))
    __obj.asInstanceOf[IBitMatrix]
  }
  @scala.inline
  implicit class IBitMatrixOps[Self <: IBitMatrix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRelease(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetValueAt(value: (Double, Double, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValueAt")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withValueAt(value: (Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAt")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

