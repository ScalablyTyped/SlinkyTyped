package typingsSlinky.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomLine extends js.Object {
  def isBookSpecific(): Boolean = js.native
  def setAccountId(accountId: Double): Unit = js.native
  def setBookSpecific(bookSpecific: Boolean): Unit = js.native
  def setClassId(classId: Double): Unit = js.native
  def setCreditAmount(credit: String): Unit = js.native
  def setDebitAmount(debit: String): Unit = js.native
  def setDepartmentId(departmentId: Double): Unit = js.native
  def setLocationId(locationId: Double): Unit = js.native
  def setMemo(memo: String): Unit = js.native
}

object CustomLine {
  @scala.inline
  def apply(
    isBookSpecific: () => Boolean,
    setAccountId: Double => Unit,
    setBookSpecific: Boolean => Unit,
    setClassId: Double => Unit,
    setCreditAmount: String => Unit,
    setDebitAmount: String => Unit,
    setDepartmentId: Double => Unit,
    setLocationId: Double => Unit,
    setMemo: String => Unit
  ): CustomLine = {
    val __obj = js.Dynamic.literal(isBookSpecific = js.Any.fromFunction0(isBookSpecific), setAccountId = js.Any.fromFunction1(setAccountId), setBookSpecific = js.Any.fromFunction1(setBookSpecific), setClassId = js.Any.fromFunction1(setClassId), setCreditAmount = js.Any.fromFunction1(setCreditAmount), setDebitAmount = js.Any.fromFunction1(setDebitAmount), setDepartmentId = js.Any.fromFunction1(setDepartmentId), setLocationId = js.Any.fromFunction1(setLocationId), setMemo = js.Any.fromFunction1(setMemo))
    __obj.asInstanceOf[CustomLine]
  }
  @scala.inline
  implicit class CustomLineOps[Self <: CustomLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsBookSpecific(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBookSpecific")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetAccountId(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAccountId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetBookSpecific(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBookSpecific")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetClassId(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setClassId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetCreditAmount(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCreditAmount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDebitAmount(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDebitAmount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDepartmentId(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDepartmentId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLocationId(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLocationId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMemo(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMemo")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

