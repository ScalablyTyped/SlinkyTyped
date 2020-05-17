package typingsSlinky.stormReactDiagrams.baseModelMod

import typingsSlinky.stormReactDiagrams.anon.BaseEventBaseModelBaseEnt
import typingsSlinky.stormReactDiagrams.baseEntityMod.BaseEntity
import typingsSlinky.stormReactDiagrams.baseEntityMod.BaseEvent
import typingsSlinky.stormReactDiagrams.baseEntityMod.BaseListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseModelListener
  extends BaseListener[js.Any] {
  var entityRemoved: js.UndefOr[
    js.Function1[/* event */ BaseEvent[BaseModel[BaseEntity[BaseListener[_]], this.type]], Unit]
  ] = js.native
  var selectionChanged: js.UndefOr[js.Function1[/* event */ BaseEventBaseModelBaseEnt, Unit]] = js.native
}

object BaseModelListener {
  @scala.inline
  def apply(): BaseModelListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseModelListener]
  }
  @scala.inline
  implicit class BaseModelListenerOps[Self <: BaseModelListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntityRemoved(value: /* event */ BaseEvent[BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityRemoved")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEntityRemoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityRemoved")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionChanged(value: /* event */ BaseEventBaseModelBaseEnt => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelectionChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionChanged")(js.undefined)
        ret
    }
  }
  
}

