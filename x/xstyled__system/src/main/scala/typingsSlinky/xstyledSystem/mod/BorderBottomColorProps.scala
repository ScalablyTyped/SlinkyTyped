package typingsSlinky.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderBottomColorProps extends js.Object {
  
  val borderBottomColor: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderColorProperty */ _
    ]
  ] = js.native
}
object BorderBottomColorProps {
  
  @scala.inline
  def apply(): BorderBottomColorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderBottomColorProps]
  }
  
  @scala.inline
  implicit class BorderBottomColorPropsOps[Self <: BorderBottomColorProps] (val x: Self) extends AnyVal {
    
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
    def setBorderBottomColor(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderColorProperty */ _
        ]
    ): Self = this.set("borderBottomColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBottomColor: Self = this.set("borderBottomColor", js.undefined)
  }
}
