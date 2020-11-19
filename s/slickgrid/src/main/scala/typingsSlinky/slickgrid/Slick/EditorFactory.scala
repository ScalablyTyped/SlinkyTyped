package typingsSlinky.slickgrid.Slick

import typingsSlinky.slickgrid.Slick.Editors.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorFactory extends js.Object {
  
  def getEditor[T](column: Column[T]): Editor[T] = js.native
}
object EditorFactory {
  
  @scala.inline
  def apply(getEditor: Column[js.Any] => Editor[js.Any]): EditorFactory = {
    val __obj = js.Dynamic.literal(getEditor = js.Any.fromFunction1(getEditor))
    __obj.asInstanceOf[EditorFactory]
  }
  
  @scala.inline
  implicit class EditorFactoryOps[Self <: EditorFactory] (val x: Self) extends AnyVal {
    
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
    def setGetEditor(value: Column[js.Any] => Editor[js.Any]): Self = this.set("getEditor", js.Any.fromFunction1(value))
  }
}
