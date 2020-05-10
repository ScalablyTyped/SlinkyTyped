package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIntersectionObserverOptions extends js.Object {
  /**
    * 初始的相交比例
    */
  var initialRatio: js.UndefOr[Double] = js.native
  /**
    * 是否同时观测多个参照节点（而非一个）
    */
  var selectAll: js.UndefOr[Boolean] = js.native
  /**
    * 所有阈值
    */
  var thresholds: js.UndefOr[js.Array[_]] = js.native
}

object CreateIntersectionObserverOptions {
  @scala.inline
  def apply(): CreateIntersectionObserverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIntersectionObserverOptions]
  }
  @scala.inline
  implicit class CreateIntersectionObserverOptionsOps[Self <: CreateIntersectionObserverOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAll")(js.undefined)
        ret
    }
    @scala.inline
    def withThresholds(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thresholds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThresholds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thresholds")(js.undefined)
        ret
    }
  }
  
}

