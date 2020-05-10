package typingsSlinky.webcomponentsJs.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends js.Object {
  val shadowRoot: ShadowRoot | Null = js.native
  def createShadowRoot(): ShadowRoot = js.native
}

object Element {
  @scala.inline
  def apply(createShadowRoot: () => ShadowRoot): Element = {
    val __obj = js.Dynamic.literal(createShadowRoot = js.Any.fromFunction0(createShadowRoot))
    __obj.asInstanceOf[Element]
  }
  @scala.inline
  implicit class ElementOps[Self <: Element] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateShadowRoot(value: () => ShadowRoot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createShadowRoot")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShadowRoot(value: ShadowRoot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadowRootNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowRoot")(null)
        ret
    }
  }
  
}

