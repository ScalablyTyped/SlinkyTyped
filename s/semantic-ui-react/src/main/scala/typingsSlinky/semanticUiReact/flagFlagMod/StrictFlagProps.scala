package typingsSlinky.semanticUiReact.flagFlagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictFlagProps extends js.Object {
  
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  
  /** Flag name, can use the two digit country code, the full name, or a common alias. */
  var name: FlagNameValues = js.native
}
object StrictFlagProps {
  
  @scala.inline
  def apply(name: FlagNameValues): StrictFlagProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictFlagProps]
  }
  
  @scala.inline
  implicit class StrictFlagPropsOps[Self <: StrictFlagProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: FlagNameValues): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
  }
}
