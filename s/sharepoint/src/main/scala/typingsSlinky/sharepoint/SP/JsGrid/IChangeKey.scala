package typingsSlinky.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait IChangeKey extends js.Object {
  def CompareTo(changeKey: IChangeKey): Double = js.native
  def GetVersionNumber(): Double = js.native
  def Release(): Unit = js.native
  def Reserve(): Unit = js.native
}

object IChangeKey {
  @scala.inline
  def apply(
    CompareTo: IChangeKey => Double,
    GetVersionNumber: () => Double,
    Release: () => Unit,
    Reserve: () => Unit
  ): IChangeKey = {
    val __obj = js.Dynamic.literal(CompareTo = js.Any.fromFunction1(CompareTo), GetVersionNumber = js.Any.fromFunction0(GetVersionNumber), Release = js.Any.fromFunction0(Release), Reserve = js.Any.fromFunction0(Reserve))
    __obj.asInstanceOf[IChangeKey]
  }
  @scala.inline
  implicit class IChangeKeyOps[Self <: IChangeKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompareTo(value: IChangeKey => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompareTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetVersionNumber(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetVersionNumber")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRelease(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Release")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReserve(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reserve")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

