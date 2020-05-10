package typingsSlinky.semanticUiSticky.SemanticUI.Sticky.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default 'Sticky element must be inside a relative container'
    */
  var container: String = js.native
  /**
    * @default 'Sticky element is larger than its container, cannot create sticky.'
    */
  var elementSize: String = js.native
  /**
    * @default 'Context specified does not exist'
    */
  var invalidContext: String = js.native
  /**
    * @default 'The method you called is not defined.'
    */
  var method: String = js.native
  /**
    * @default 'Element is hidden, you must call refresh after element becomes visible'
    */
  var visible: String = js.native
}

object Impl {
  @scala.inline
  def apply(container: String, elementSize: String, invalidContext: String, method: String, visible: String): Impl = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], elementSize = elementSize.asInstanceOf[js.Any], invalidContext = invalidContext.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElementSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalidContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

