package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeometryEditor extends ICustomizable {
  var geometry: IGeometry = js.native
  var state: IDataManager = js.native
  def startEditing(): Unit = js.native
  def stopEditing(): Unit = js.native
}

object IGeometryEditor {
  @scala.inline
  def apply(
    events: IEventManager,
    geometry: IGeometry,
    options: IOptionManager,
    startEditing: () => Unit,
    state: IDataManager,
    stopEditing: () => Unit
  ): IGeometryEditor = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], startEditing = js.Any.fromFunction0(startEditing), state = state.asInstanceOf[js.Any], stopEditing = js.Any.fromFunction0(stopEditing))
    __obj.asInstanceOf[IGeometryEditor]
  }
  @scala.inline
  implicit class IGeometryEditorOps[Self <: IGeometryEditor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeometry(value: IGeometry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartEditing(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startEditing")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withState(value: IDataManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStopEditing(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopEditing")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

