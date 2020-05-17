package typingsSlinky.wonderJs.viewMod

import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.wonderJs.anon.Y
import typingsSlinky.wonderJs.mainDataMod.ContextConfigData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IView extends js.Object {
  var dom: js.Any = js.native
  var height: Double = js.native
  var offset: Y = js.native
  var styleHeight: String = js.native
  var styleWidth: String = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def getContext(contextConfig: ContextConfigData): WebGLRenderingContext = js.native
  def initCanvas(): Unit = js.native
}

object IView {
  @scala.inline
  def apply(
    dom: js.Any,
    getContext: ContextConfigData => WebGLRenderingContext,
    height: Double,
    initCanvas: () => Unit,
    offset: Y,
    styleHeight: String,
    styleWidth: String,
    width: Double,
    x: Double,
    y: Double
  ): IView = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], getContext = js.Any.fromFunction1(getContext), height = height.asInstanceOf[js.Any], initCanvas = js.Any.fromFunction0(initCanvas), offset = offset.asInstanceOf[js.Any], styleHeight = styleHeight.asInstanceOf[js.Any], styleWidth = styleWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IView]
  }
  @scala.inline
  implicit class IViewOps[Self <: IView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDom(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetContext(value: ContextConfigData => WebGLRenderingContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitCanvas(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initCanvas")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOffset(value: Y): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyleHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyleWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

