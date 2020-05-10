package typingsSlinky.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StandardLine extends js.Object {
  def getEntityId(): Double = js.native
  def getId(): Double = js.native
  def getSubsidiaryId(): Double = js.native
  def getTaxAmount(): String = js.native
  def getTaxItemId(): Double = js.native
  def getTaxType(): String = js.native
  def getTaxableAmount(): String = js.native
  def isPosting(): Boolean = js.native
  def isTaxable(): Boolean = js.native
}

object StandardLine {
  @scala.inline
  def apply(
    getEntityId: () => Double,
    getId: () => Double,
    getSubsidiaryId: () => Double,
    getTaxAmount: () => String,
    getTaxItemId: () => Double,
    getTaxType: () => String,
    getTaxableAmount: () => String,
    isPosting: () => Boolean,
    isTaxable: () => Boolean
  ): StandardLine = {
    val __obj = js.Dynamic.literal(getEntityId = js.Any.fromFunction0(getEntityId), getId = js.Any.fromFunction0(getId), getSubsidiaryId = js.Any.fromFunction0(getSubsidiaryId), getTaxAmount = js.Any.fromFunction0(getTaxAmount), getTaxItemId = js.Any.fromFunction0(getTaxItemId), getTaxType = js.Any.fromFunction0(getTaxType), getTaxableAmount = js.Any.fromFunction0(getTaxableAmount), isPosting = js.Any.fromFunction0(isPosting), isTaxable = js.Any.fromFunction0(isTaxable))
    __obj.asInstanceOf[StandardLine]
  }
  @scala.inline
  implicit class StandardLineOps[Self <: StandardLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetEntityId(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEntityId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetId(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSubsidiaryId(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubsidiaryId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTaxAmount(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTaxAmount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTaxItemId(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTaxItemId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTaxType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTaxType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTaxableAmount(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTaxableAmount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsPosting(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPosting")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsTaxable(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTaxable")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

