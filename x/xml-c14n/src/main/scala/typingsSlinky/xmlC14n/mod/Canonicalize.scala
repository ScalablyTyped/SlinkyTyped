package typingsSlinky.xmlC14n.mod

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Canonicalize extends js.Object {
  def _processInner(node: Node): String = js.native
  def canonicalise(node: Node, cb: canonicaliseCb): Unit = js.native
  def name(): String = js.native
}

object Canonicalize {
  @scala.inline
  def apply(_processInner: Node => String, canonicalise: (Node, canonicaliseCb) => Unit, name: () => String): Canonicalize = {
    val __obj = js.Dynamic.literal(_processInner = js.Any.fromFunction1(_processInner), canonicalise = js.Any.fromFunction2(canonicalise), name = js.Any.fromFunction0(name))
    __obj.asInstanceOf[Canonicalize]
  }
  @scala.inline
  implicit class CanonicalizeOps[Self <: Canonicalize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_processInner(value: Node => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_processInner")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCanonicalise(value: (Node, canonicaliseCb) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canonicalise")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

