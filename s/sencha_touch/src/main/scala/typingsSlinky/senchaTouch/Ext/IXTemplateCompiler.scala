package typingsSlinky.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXTemplateCompiler extends IXTemplateParser {
  /** [Method] This method is called to process lt tpl case action gt
  		* @param action Object
  		*/
  @JSName("doCase")
  var doCase_IXTemplateCompiler: js.UndefOr[js.Function1[/* action */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] This method is called to process lt tpl elseif action gt
  		* @param action Object
  		* @param actions Object
  		*/
  @JSName("doElseIf")
  var doElseIf_IXTemplateCompiler: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] This method is called to process lt tpl gt
  		* @param type Object
  		* @param actions Object
  		*/
  @JSName("doEnd")
  var doEnd_IXTemplateCompiler: js.UndefOr[
    js.Function2[/* type */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] This method is called to process text
  		* @param text Object
  		*/
  @JSName("doEval")
  var doEval_IXTemplateCompiler: js.UndefOr[js.Function1[/* text */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] This method is called to process lt tpl exec action gt
  		* @param action Object
  		* @param actions Object
  		*/
  @JSName("doExec")
  var doExec_IXTemplateCompiler: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] This method is called to process expressions like  expr
  		* @param expr Object
  		*/
  @JSName("doExpr")
  var doExpr_IXTemplateCompiler: js.UndefOr[js.Function1[/* expr */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] This method is called to process lt tpl for action gt
  		* @param action Object
  		* @param actions Object
  		*/
  @JSName("doFor")
  var doFor_IXTemplateCompiler: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] This method is called to process lt tpl if action gt
  		* @param action Object
  		* @param actions Object
  		*/
  @JSName("doIf")
  var doIf_IXTemplateCompiler: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] This method is called to process lt tpl switch action gt
  		* @param action Object
  		*/
  @JSName("doSwitch")
  var doSwitch_IXTemplateCompiler: js.UndefOr[js.Function1[/* action */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] This method is called to process simple tags like tag
  		* @param tag Object
  		*/
  @JSName("doTag")
  var doTag_IXTemplateCompiler: js.UndefOr[js.Function1[/* tag */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] This method is called to process a piece of raw text from the tpl
  		* @param text Object
  		*/
  @JSName("doText")
  var doText_IXTemplateCompiler: js.UndefOr[js.Function1[/* text */ js.UndefOr[js.Any], Unit]] = js.native
}

object IXTemplateCompiler {
  @scala.inline
  def apply(): IXTemplateCompiler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IXTemplateCompiler]
  }
  @scala.inline
  implicit class IXTemplateCompilerOps[Self <: IXTemplateCompiler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoCase(value: /* action */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doCase")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDoCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doCase")(js.undefined)
        ret
    }
    @scala.inline
    def withDoElseIf(value: (/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doElseIf")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDoElseIf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doElseIf")(js.undefined)
        ret
    }
    @scala.inline
    def withDoEnd(value: (/* type */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDoEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withDoEval(value: /* text */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doEval")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDoEval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doEval")(js.undefined)
        ret
    }
    @scala.inline
    def withDoExec(value: (/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doExec")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDoExec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doExec")(js.undefined)
        ret
    }
    @scala.inline
    def withDoExpr(value: /* expr */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDoExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withDoFor(value: (/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doFor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDoFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doFor")(js.undefined)
        ret
    }
    @scala.inline
    def withDoIf(value: (/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doIf")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDoIf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doIf")(js.undefined)
        ret
    }
    @scala.inline
    def withDoSwitch(value: /* action */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doSwitch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDoSwitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doSwitch")(js.undefined)
        ret
    }
    @scala.inline
    def withDoTag(value: /* tag */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doTag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDoTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doTag")(js.undefined)
        ret
    }
    @scala.inline
    def withDoText(value: /* text */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDoText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doText")(js.undefined)
        ret
    }
  }
  
}

