package typingsSlinky.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IXTemplate extends ITemplate {
  
  /** [Method] Appends the result of this template to the provided output array
    * @param values Object/Array The template values. See apply.
    * @param out Array The array to which output is pushed.
    * @param parent Object
    * @returns Array The given out array.
    */
  @JSName("applyOut")
  var applyOut_IXTemplate: js.UndefOr[
    js.Function3[
      /* values */ js.UndefOr[js.Any], 
      /* out */ js.UndefOr[Array], 
      /* parent */ js.UndefOr[js.Any], 
      Array
    ]
  ] = js.native
}
object IXTemplate {
  
  @scala.inline
  def apply(): IXTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IXTemplate]
  }
  
  @scala.inline
  implicit class IXTemplateOps[Self <: IXTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplyOut(
      value: (/* values */ js.UndefOr[js.Any], /* out */ js.UndefOr[Array], /* parent */ js.UndefOr[js.Any]) => Array
    ): Self = this.set("applyOut", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteApplyOut: Self = this.set("applyOut", js.undefined)
  }
}
