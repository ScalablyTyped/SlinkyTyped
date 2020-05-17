package typingsSlinky.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagingAbility extends js.Object {
  def getPage(): Double = js.native
  def getPager(): js.Any = js.native
  def setPage(page: Double): Unit = js.native
}

object PagingAbility {
  @scala.inline
  def apply(getPage: () => Double, getPager: () => js.Any, setPage: Double => Unit): PagingAbility = {
    val __obj = js.Dynamic.literal(getPage = js.Any.fromFunction0(getPage), getPager = js.Any.fromFunction0(getPager), setPage = js.Any.fromFunction1(setPage))
    __obj.asInstanceOf[PagingAbility]
  }
  @scala.inline
  implicit class PagingAbilityOps[Self <: PagingAbility] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetPage(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPager(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPager")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetPage(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPage")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

