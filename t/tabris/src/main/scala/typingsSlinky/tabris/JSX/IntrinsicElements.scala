package typingsSlinky.tabris.JSX

import typingsSlinky.tabris.anon.Href
import typingsSlinky.tabris.anon.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntrinsicElements extends js.Object {
  var a: Href = js.native
  var b: `5` = js.native
  var big: `5` = js.native
  var del: `5` = js.native
  var i: `5` = js.native
  var ins: `5` = js.native
  var small: `5` = js.native
  var span: `5` = js.native
  var strong: `5` = js.native
}

object IntrinsicElements {
  @scala.inline
  def apply(a: Href, b: `5`, big: `5`, del: `5`, i: `5`, ins: `5`, small: `5`, span: `5`, strong: `5`): IntrinsicElements = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], big = big.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], ins = ins.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrinsicElements]
  }
  @scala.inline
  implicit class IntrinsicElementsOps[Self <: IntrinsicElements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withA(value: Href): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withB(value: `5`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBig(value: `5`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("big")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDel(value: `5`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("del")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withI(value: `5`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIns(value: `5`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmall(value: `5`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("small")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpan(value: `5`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("span")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrong(value: `5`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strong")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

