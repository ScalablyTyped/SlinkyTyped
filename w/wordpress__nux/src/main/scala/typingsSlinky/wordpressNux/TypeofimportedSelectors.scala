package typingsSlinky.wordpressNux

import typingsSlinky.wordpressNux.selectorsMod.GuideInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofimportedSelectors extends js.Object {
  def areTipsEnabled(): Boolean = js.native
  def getAssociatedGuide(tipId: String): js.UndefOr[GuideInfo] = js.native
  def isTipVisible(tipId: String): Boolean = js.native
}

object TypeofimportedSelectors {
  @scala.inline
  def apply(
    areTipsEnabled: () => Boolean,
    getAssociatedGuide: String => js.UndefOr[GuideInfo],
    isTipVisible: String => Boolean
  ): TypeofimportedSelectors = {
    val __obj = js.Dynamic.literal(areTipsEnabled = js.Any.fromFunction0(areTipsEnabled), getAssociatedGuide = js.Any.fromFunction1(getAssociatedGuide), isTipVisible = js.Any.fromFunction1(isTipVisible))
    __obj.asInstanceOf[TypeofimportedSelectors]
  }
  @scala.inline
  implicit class TypeofimportedSelectorsOps[Self <: TypeofimportedSelectors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAreTipsEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areTipsEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAssociatedGuide(value: String => js.UndefOr[GuideInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAssociatedGuide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsTipVisible(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTipVisible")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

