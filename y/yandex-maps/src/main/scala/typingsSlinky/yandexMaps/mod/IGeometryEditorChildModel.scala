package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeometryEditorChildModel extends IGeometryEditorModel {
  var editor: IGeometryEditor = js.native
  var geometry: IBaseGeometry = js.native
  def getParent(): IGeometryEditorModel = js.native
  def setPixels(pixels: js.Array[Double]): Unit = js.native
}

object IGeometryEditorChildModel {
  @scala.inline
  def apply(
    destroy: () => Unit,
    editor: IGeometryEditor,
    events: IEventManager,
    geometry: IBaseGeometry,
    getParent: () => IGeometryEditorModel,
    getPixels: () => js.Array[Double],
    setPixels: js.Array[Double] => Unit
  ): IGeometryEditorChildModel = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), editor = editor.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], getParent = js.Any.fromFunction0(getParent), getPixels = js.Any.fromFunction0(getPixels), setPixels = js.Any.fromFunction1(setPixels))
    __obj.asInstanceOf[IGeometryEditorChildModel]
  }
  @scala.inline
  implicit class IGeometryEditorChildModelOps[Self <: IGeometryEditorChildModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEditor(value: IGeometryEditor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeometry(value: IBaseGeometry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetParent(value: () => IGeometryEditorModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetPixels(value: js.Array[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPixels")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

