package typingsSlinky.siesta.Siesta.Test

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @mixin
  */
@js.native
trait IExtJSCore extends js.Object {
  def Ext(): js.Any = js.native
  def clickCQ(selector: String, root: js.Any, callback: js.Function): js.Any = js.native
  def clickComponentQuery(selector: String, root: js.Any, callback: js.Function): js.Any = js.native
  def compositeQuery(selector: String, root: js.Any, allowEmpty: Boolean): js.Array[HTMLElement] = js.native
  def cq(selector: String): js.Any = js.native
  def cq1(selector: String): js.Any = js.native
  def getExt(): js.Any = js.native
  def knownBugIn(frameworkVersion: String, fn: js.Function, reason: String): js.Any = js.native
  def requireOk(args: js.Any*): Unit = js.native
}

object IExtJSCore {
  @scala.inline
  def apply(
    Ext: () => js.Any,
    clickCQ: (String, js.Any, js.Function) => js.Any,
    clickComponentQuery: (String, js.Any, js.Function) => js.Any,
    compositeQuery: (String, js.Any, Boolean) => js.Array[HTMLElement],
    cq: String => js.Any,
    cq1: String => js.Any,
    getExt: () => js.Any,
    knownBugIn: (String, js.Function, String) => js.Any,
    requireOk: /* repeated */ js.Any => Unit
  ): IExtJSCore = {
    val __obj = js.Dynamic.literal(Ext = js.Any.fromFunction0(Ext), clickCQ = js.Any.fromFunction3(clickCQ), clickComponentQuery = js.Any.fromFunction3(clickComponentQuery), compositeQuery = js.Any.fromFunction3(compositeQuery), cq = js.Any.fromFunction1(cq), cq1 = js.Any.fromFunction1(cq1), getExt = js.Any.fromFunction0(getExt), knownBugIn = js.Any.fromFunction3(knownBugIn), requireOk = js.Any.fromFunction1(requireOk))
    __obj.asInstanceOf[IExtJSCore]
  }
  @scala.inline
  implicit class IExtJSCoreOps[Self <: IExtJSCore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExt(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClickCQ(value: (String, js.Any, js.Function) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickCQ")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withClickComponentQuery(value: (String, js.Any, js.Function) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickComponentQuery")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCompositeQuery(value: (String, js.Any, Boolean) => js.Array[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compositeQuery")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCq(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cq")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCq1(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cq1")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetExt(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExt")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKnownBugIn(value: (String, js.Function, String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knownBugIn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRequireOk(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireOk")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

