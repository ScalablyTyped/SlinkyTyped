package typingsSlinky.tabris.JSX

import typingsSlinky.tabris.AnonChildren
import typingsSlinky.tabris.AnonHref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntrinsicElements extends js.Object {
  var a: AnonHref = js.native
  var b: AnonChildren = js.native
  var big: AnonChildren = js.native
  var del: AnonChildren = js.native
  var i: AnonChildren = js.native
  var ins: AnonChildren = js.native
  var small: AnonChildren = js.native
  var span: AnonChildren = js.native
  var strong: AnonChildren = js.native
}

object IntrinsicElements {
  @scala.inline
  def apply(
    a: AnonHref,
    b: AnonChildren,
    big: AnonChildren,
    del: AnonChildren,
    i: AnonChildren,
    ins: AnonChildren,
    small: AnonChildren,
    span: AnonChildren,
    strong: AnonChildren
  ): IntrinsicElements = {
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
    def withA(value: AnonHref): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withB(value: AnonChildren): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBig(value: AnonChildren): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("big")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDel(value: AnonChildren): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("del")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withI(value: AnonChildren): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIns(value: AnonChildren): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmall(value: AnonChildren): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("small")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpan(value: AnonChildren): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("span")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrong(value: AnonChildren): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strong")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

