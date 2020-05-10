package typingsSlinky.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITemplate extends IBase {
  /** [Method] Applies the supplied values to the template and appends the new node s to the specified el
  		* @param el String/HTMLElement/Ext.Element The context element.
  		* @param values Object/Array The template values. See applyTemplate for details.
  		* @param returnElement Boolean true to return an Ext.Element.
  		* @returns HTMLElement/Ext.Element The new node or Element.
  		*/
  var append: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* values */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.native
  /** [Method] Returns an HTML fragment of this template with the specified values applied
  		* @param values Object/Array The template values. Can be an array if your params are numeric:  var tpl = new Ext.Template('Name: {0}, Age: {1}'); tpl.apply(['John', 25]); or an object:  var tpl = new Ext.Template('Name: {name}, Age: {age}'); tpl.apply({name: 'John', age: 25});
  		* @returns String The HTML fragment.
  		*/
  @JSName("apply")
  var apply: js.UndefOr[js.Function1[/* values */ js.UndefOr[js.Any], java.lang.String]] = js.native
  /** [Method] Appends the result of this template to the provided output array
  		* @param values Object/Array The template values. See apply.
  		* @param out Array The array to which output is pushed.
  		* @returns Array The given out array.
  		*/
  var applyOut: js.UndefOr[
    js.Function2[/* values */ js.UndefOr[js.Any], /* out */ js.UndefOr[Array], Array]
  ] = js.native
  /** [Method] Alias for apply
  		* @param values Object/Array The template values. Can be an array if your params are numeric:  var tpl = new Ext.Template('Name: {0}, Age: {1}'); tpl.apply(['John', 25]); or an object:  var tpl = new Ext.Template('Name: {name}, Age: {age}'); tpl.apply({name: 'John', age: 25});
  		* @returns String The HTML fragment.
  		*/
  var applyTemplate: js.UndefOr[js.Function1[/* values */ js.UndefOr[js.Any], java.lang.String]] = js.native
  /** [Method] Compiles the template into an internal function eliminating the RegEx overhead
  		* @returns Ext.Template this
  		*/
  var compile: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Config Option] (Boolean) */
  var compiled: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var disableFormats: js.UndefOr[Boolean] = js.native
  /** [Method] Applies the supplied values to the template and inserts the new node s after el
  		* @param el String/HTMLElement/Ext.Element The context element.
  		* @param values Object/Array The template values. See applyTemplate for details.
  		* @param returnElement Boolean true to return a Ext.Element.
  		* @returns HTMLElement/Ext.Element The new node or Element.
  		*/
  var insertAfter: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* values */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.native
  /** [Method] Applies the supplied values to the template and inserts the new node s before el
  		* @param el String/HTMLElement/Ext.Element The context element.
  		* @param values Object/Array The template values. See applyTemplate for details.
  		* @param returnElement Boolean true to return an Ext.Element.
  		* @returns HTMLElement/Ext.Element The new node or Element
  		*/
  var insertBefore: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* values */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.native
  /** [Method] Applies the supplied values to the template and inserts the new node s as the first child of el
  		* @param el String/HTMLElement/Ext.Element The context element.
  		* @param values Object/Array The template values. See applyTemplate for details.
  		* @param returnElement Boolean true to return a Ext.Element.
  		* @returns HTMLElement/Ext.Element The new node or Element.
  		*/
  var insertFirst: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* values */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.native
  /** [Property] (Boolean) */
  var isTemplate: js.UndefOr[Boolean] = js.native
  /** [Method] Applies the supplied values to the template and overwrites the content of el with the new node s
  		* @param el String/HTMLElement/Ext.Element The context element.
  		* @param values Object/Array The template values. See applyTemplate for details.
  		* @param returnElement Boolean true to return a Ext.Element.
  		* @returns HTMLElement/Ext.Element The new node or Element.
  		*/
  var overwrite: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* values */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.native
  /** [Method] Sets the HTML used as the template and optionally compiles it
  		* @param html String
  		* @param compile Boolean true to compile the template.
  		* @returns Ext.Template this
  		*/
  var set: js.UndefOr[
    js.Function2[
      /* html */ js.UndefOr[java.lang.String], 
      /* compile */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.native
}

object ITemplate {
  @scala.inline
  def apply(): ITemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITemplate]
  }
  @scala.inline
  implicit class ITemplateOps[Self <: ITemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppend(
      value: (/* el */ js.UndefOr[js.Any], /* values */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => _
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
    def withApply(value: /* values */ js.UndefOr[js.Any] => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutApply: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyOut(value: (/* values */ js.UndefOr[js.Any], /* out */ js.UndefOr[Array]) => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyOut")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutApplyOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyOut")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyTemplate(value: /* values */ js.UndefOr[js.Any] => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyTemplate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutApplyTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withCompile(value: () => ITemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCompile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compile")(js.undefined)
        ret
    }
    @scala.inline
    def withCompiled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompiled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiled")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableFormats(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertAfter(
      value: (/* el */ js.UndefOr[js.Any], /* values */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => _
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
      value: (/* el */ js.UndefOr[js.Any], /* values */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => _
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
      value: (/* el */ js.UndefOr[js.Any], /* values */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => _
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
    def withIsTemplate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withOverwrite(
      value: (/* el */ js.UndefOr[js.Any], /* values */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => _
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
    @scala.inline
    def withSet(value: (/* html */ js.UndefOr[java.lang.String], /* compile */ js.UndefOr[Boolean]) => ITemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.undefined)
        ret
    }
  }
  
}

