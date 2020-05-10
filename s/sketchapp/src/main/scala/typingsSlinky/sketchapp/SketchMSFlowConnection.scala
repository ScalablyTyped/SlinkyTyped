package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.sketchappStrings.back
import typingsSlinky.sketchapp.sketchappStrings.immutableFlowConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSFlowConnection extends js.Object {
  var _class: immutableFlowConnection = js.native
  var animationType: Double = js.native
  var destinationArtboardID: js.UndefOr[String | back] = js.native
}

object SketchMSFlowConnection {
  @scala.inline
  def apply(_class: immutableFlowConnection, animationType: Double): SketchMSFlowConnection = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], animationType = animationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSFlowConnection]
  }
  @scala.inline
  implicit class SketchMSFlowConnectionOps[Self <: SketchMSFlowConnection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_class(value: immutableFlowConnection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationArtboardID(value: String | back): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationArtboardID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationArtboardID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationArtboardID")(js.undefined)
        ret
    }
  }
  
}

