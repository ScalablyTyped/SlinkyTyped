package typingsSlinky.uirouterAngularjs.viewScrollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIViewScrollProvider extends js.Object {
  /**
    * Uses standard anchorScroll behavior
    *
    * Reverts [[$uiViewScroll]] back to using the core [`$anchorScroll`](http://docs.angularjs.org/api/ng.$anchorScroll)
    * service for scrolling based on the url anchor.
    */
  def useAnchorScroll(): Unit = js.native
}

object UIViewScrollProvider {
  @scala.inline
  def apply(useAnchorScroll: () => Unit): UIViewScrollProvider = {
    val __obj = js.Dynamic.literal(useAnchorScroll = js.Any.fromFunction0(useAnchorScroll))
    __obj.asInstanceOf[UIViewScrollProvider]
  }
  @scala.inline
  implicit class UIViewScrollProviderOps[Self <: UIViewScrollProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUseAnchorScroll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAnchorScroll")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

