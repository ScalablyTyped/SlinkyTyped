package typingsSlinky.stardustUiReactComponentEventListener

import org.scalajs.dom.raw.Node
import slinky.core.facade.ReactRef
import typingsSlinky.propTypes.mod.Requireable
import typingsSlinky.propTypes.mod.Validator
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCapture extends js.Object {
  var capture: Requireable[Boolean]
  var listener: Validator[js.Function1[/* repeated */ _, _]]
  var targetRef: Validator[ReactRef[Node | Window_]]
  var `type`: Validator[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 91 */ js.Any
  ]
}

object AnonCapture {
  @scala.inline
  def apply(
    capture: Requireable[Boolean],
    listener: Validator[js.Function1[/* repeated */ _, _]],
    targetRef: Validator[ReactRef[Node | Window_]],
    `type`: Validator[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 91 */ js.Any
    ]
  ): AnonCapture = {
    val __obj = js.Dynamic.literal(capture = capture.asInstanceOf[js.Any], listener = listener.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCapture]
  }
}

