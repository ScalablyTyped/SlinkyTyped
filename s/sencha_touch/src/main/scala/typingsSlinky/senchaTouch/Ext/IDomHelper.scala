package typingsSlinky.senchaTouch.Ext

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDomHelper extends js.Object {
  /** [Method] Creates new DOM element s and appends them to el
  		* @param el String/HTMLElement/Ext.Element The context element
  		* @param o Object/String The DOM object spec (and children) or raw HTML blob
  		* @param returnElement Boolean true to return a Ext.Element
  		* @returns HTMLElement/Ext.Element The new node
  		*/
  var append: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* o */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.native
  /** [Method] Applies a style specification to an element
  		* @param el String/HTMLElement The element to apply styles to
  		* @param styles String/Object/Function A style specification string e.g. 'width:100px', or object in the form {width:'100px'}, or a function which returns such a specification.
  		*/
  var applyStyles: js.UndefOr[js.Function2[/* el */ js.UndefOr[js.Any], /* styles */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Creates a new Ext Template from the DOM object spec
  		* @param o Object The DOM object spec (and children)
  		* @returns Ext.Template The new template
  		*/
  var createTemplate: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], ITemplate]] = js.native
  /** [Method] Converts the styles from the given object to text
  		* @param styles Object The object describing the styles.
  		* @param buffer String[] The output buffer.
  		* @returns String/String[] If buffer is passed, it is returned. Otherwise the style string is returned.
  		*/
  var generateStyles: js.UndefOr[js.Function2[/* styles */ js.UndefOr[js.Any], /* buffer */ js.UndefOr[Array], _]] = js.native
  /** [Method] Creates new DOM element s and inserts them after el
  		* @param el String/HTMLElement/Ext.Element The context element
  		* @param o Object The DOM object spec (and children)
  		* @param returnElement Boolean true to return a Ext.Element
  		* @returns HTMLElement/Ext.Element The new node
  		*/
  var insertAfter: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* o */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.native
  /** [Method] Creates new DOM element s and inserts them before el
  		* @param el String/HTMLElement/Ext.Element The context element
  		* @param o Object/String The DOM object spec (and children) or raw HTML blob
  		* @param returnElement Boolean true to return a Ext.Element
  		* @returns HTMLElement/Ext.Element The new node
  		*/
  var insertBefore: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* o */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.native
  /** [Method] Creates new DOM element s and inserts them as the first child of el
  		* @param el String/HTMLElement/Ext.Element The context element
  		* @param o Object/String The DOM object spec (and children) or raw HTML blob
  		* @param returnElement Boolean true to return a Ext.Element
  		* @returns HTMLElement/Ext.Element The new node
  		*/
  var insertFirst: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* o */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.native
  /** [Method] Inserts an HTML fragment into the DOM
  		* @param where String Where to insert the html in relation to el - beforeBegin, afterBegin, beforeEnd, afterEnd. For example take the following HTML: &lt;div&gt;Contents&lt;/div&gt; Using different where values inserts element to the following places:  beforeBegin: &lt;HERE&gt;&lt;div&gt;Contents&lt;/div&gt; afterBegin: &lt;div&gt;&lt;HERE&gt;Contents&lt;/div&gt; beforeEnd: &lt;div&gt;Contents&lt;HERE&gt;&lt;/div&gt; afterEnd: &lt;div&gt;Contents&lt;/div&gt;&lt;HERE&gt;
  		* @param el HTMLElement/TextNode The context element
  		* @param html String The HTML fragment
  		* @returns HTMLElement The new node
  		*/
  var insertHtml: js.UndefOr[
    js.Function3[
      /* where */ js.UndefOr[java.lang.String], 
      /* el */ js.UndefOr[js.Any], 
      /* html */ js.UndefOr[java.lang.String], 
      HTMLElement
    ]
  ] = js.native
  /** [Method] Returns the markup for the passed Element s config
  		* @param spec Object The DOM object spec (and children).
  		* @returns String
  		*/
  var markup: js.UndefOr[js.Function1[/* spec */ js.UndefOr[js.Any], java.lang.String]] = js.native
  /** [Method] Creates new DOM element s and overwrites the contents of el with them
  		* @param el String/HTMLElement/Ext.Element The context element
  		* @param o Object/String The DOM object spec (and children) or raw HTML blob
  		* @param returnElement Boolean true to return a Ext.Element
  		* @returns HTMLElement/Ext.Element The new node
  		*/
  var overwrite: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* o */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.native
}

object IDomHelper {
  @scala.inline
  def apply(): IDomHelper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDomHelper]
  }
  @scala.inline
  implicit class IDomHelperOps[Self <: IDomHelper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppend(
      value: (/* el */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAppend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyStyles(value: (/* el */ js.UndefOr[js.Any], /* styles */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyStyles")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutApplyStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTemplate(value: /* o */ js.UndefOr[js.Any] => ITemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTemplate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreateTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateStyles(value: (/* styles */ js.UndefOr[js.Any], /* buffer */ js.UndefOr[Array]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateStyles")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGenerateStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertAfter(
      value: (/* el */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAfter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutInsertAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertBefore(
      value: (/* el */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBefore")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutInsertBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertFirst(
      value: (/* el */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertFirst")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutInsertFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertHtml(
      value: (/* where */ js.UndefOr[java.lang.String], /* el */ js.UndefOr[js.Any], /* html */ js.UndefOr[java.lang.String]) => HTMLElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertHtml")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutInsertHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkup(value: /* spec */ js.UndefOr[js.Any] => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMarkup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markup")(js.undefined)
        ret
    }
    @scala.inline
    def withOverwrite(
      value: (/* el */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOverwrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(js.undefined)
        ret
    }
  }
  
}

