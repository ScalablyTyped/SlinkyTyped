package typingsSlinky.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoreCursorFactory extends js.Object {
  def createCursor(`type`: CoreCursorType, id: Double): CoreCursor = js.native
}

object ICoreCursorFactory {
  @scala.inline
  def apply(createCursor: (CoreCursorType, Double) => CoreCursor): ICoreCursorFactory = {
    val __obj = js.Dynamic.literal(createCursor = js.Any.fromFunction2(createCursor))
    __obj.asInstanceOf[ICoreCursorFactory]
  }
  @scala.inline
  implicit class ICoreCursorFactoryOps[Self <: ICoreCursorFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateCursor(value: (CoreCursorType, Double) => CoreCursor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCursor")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

