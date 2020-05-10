package typingsSlinky.stardustUiReactComponentEventListener

import org.scalajs.dom.raw.Node
import slinky.core.facade.ReactRef
import typingsSlinky.propTypes.mod.Requireable
import typingsSlinky.propTypes.mod.Validator
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCapture extends js.Object {
  var capture: Requireable[Boolean] = js.native
  var listener: Validator[js.Function1[/* repeated */ _, _]] = js.native
  var targetRef: Validator[ReactRef[Node | Window_]] = js.native
  var `type`: Validator[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 91 */ js.Any
  ] = js.native
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
  @scala.inline
  implicit class AnonCaptureOps[Self <: AnonCapture] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapture(value: Requireable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListener(value: Validator[js.Function1[/* repeated */ _, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetRef(value: Validator[ReactRef[Node | Window_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(
      value: Validator[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 91 */ js.Any
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

