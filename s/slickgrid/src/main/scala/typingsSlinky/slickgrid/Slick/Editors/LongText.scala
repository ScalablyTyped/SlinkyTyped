package typingsSlinky.slickgrid.Slick.Editors

import org.scalajs.dom.raw.Event
import typingsSlinky.slickgrid.Slick.Position
import typingsSlinky.slickgrid.Slick.SlickData
import typingsSlinky.slickgrid.Slick.ValidateResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LongText[T /* <: SlickData */] extends Editor[T] {
  
  def cancel(): Unit = js.native
  
  def handleKeyDown(e: Event): Unit = js.native
  
  def hide(): Unit = js.native
  
  def position(position: Position): Unit = js.native
  
  def save(): Unit = js.native
  
  def show(): Unit = js.native
}
object LongText {
  
  @scala.inline
  def apply[T /* <: SlickData */](
    applyValue: (T, String) => Unit,
    cancel: () => Unit,
    destroy: () => Unit,
    focus: () => Unit,
    handleKeyDown: Event => Unit,
    hide: () => Unit,
    init: () => Unit,
    isValueChanged: () => Boolean,
    loadValue: T => Unit,
    position: Position => Unit,
    save: () => Unit,
    serializeValue: () => js.Any,
    show: () => Unit,
    validate: () => ValidateResults
  ): LongText[T] = {
    val __obj = js.Dynamic.literal(applyValue = js.Any.fromFunction2(applyValue), cancel = js.Any.fromFunction0(cancel), destroy = js.Any.fromFunction0(destroy), focus = js.Any.fromFunction0(focus), handleKeyDown = js.Any.fromFunction1(handleKeyDown), hide = js.Any.fromFunction0(hide), init = js.Any.fromFunction0(init), isValueChanged = js.Any.fromFunction0(isValueChanged), loadValue = js.Any.fromFunction1(loadValue), position = js.Any.fromFunction1(position), save = js.Any.fromFunction0(save), serializeValue = js.Any.fromFunction0(serializeValue), show = js.Any.fromFunction0(show), validate = js.Any.fromFunction0(validate))
    __obj.asInstanceOf[LongText[T]]
  }
  
  @scala.inline
  implicit class LongTextOps[Self <: LongText[_], T /* <: SlickData */] (val x: Self with LongText[T]) extends AnyVal {
    
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
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHandleKeyDown(value: Event => Unit): Self = this.set("handleKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPosition(value: Position => Unit): Self = this.set("position", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSave(value: () => Unit): Self = this.set("save", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
  }
}
