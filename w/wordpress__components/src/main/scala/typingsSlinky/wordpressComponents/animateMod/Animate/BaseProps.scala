package typingsSlinky.wordpressComponents.animateMod.Animate

import slinky.core.facade.ReactElement
import typingsSlinky.wordpressComponents.anon.ClassName
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.`slide-in`
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.appear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseProps extends js.Object {
  
  def children(props: ClassName): ReactElement = js.native
  
  var `type`: appear | `slide-in` = js.native
}
object BaseProps {
  
  @scala.inline
  def apply(children: ClassName => ReactElement, `type`: appear | `slide-in`): BaseProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProps]
  }
  
  @scala.inline
  implicit class BasePropsOps[Self <: BaseProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ClassName => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: appear | `slide-in`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
