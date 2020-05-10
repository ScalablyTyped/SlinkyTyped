package typingsSlinky.webscopeioReactTextareaAutocomplete.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextareaState[TItem] extends js.Object {
  var actualToken: String = js.native
  var component: js.UndefOr[ReactComponentClass[ItemComponentProps[TItem]]] = js.native
  var currentTrigger: js.UndefOr[String] = js.native
  var data: js.UndefOr[js.Array[TItem]] = js.native
  var dataLoading: Boolean = js.native
  var left: js.UndefOr[Double] = js.native
  var selectionEnd: Double = js.native
  var selectionStart: Double = js.native
  var top: js.UndefOr[Double] = js.native
  var value: String = js.native
}

object TextareaState {
  @scala.inline
  def apply[TItem](
    actualToken: String,
    dataLoading: Boolean,
    selectionEnd: Double,
    selectionStart: Double,
    value: String
  ): TextareaState[TItem] = {
    val __obj = js.Dynamic.literal(actualToken = actualToken.asInstanceOf[js.Any], dataLoading = dataLoading.asInstanceOf[js.Any], selectionEnd = selectionEnd.asInstanceOf[js.Any], selectionStart = selectionStart.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextareaState[TItem]]
  }
  @scala.inline
  implicit class TextareaStateOps[Self[titem] <: TextareaState[titem], TItem] (val x: Self[TItem]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TItem] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TItem]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TItem] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TItem] with Other]
    @scala.inline
    def withActualToken(value: String): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataLoading(value: Boolean): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionEnd(value: Double): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionStart(value: Double): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponent(value: ReactComponentClass[ItemComponentProps[TItem]]): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentTrigger(value: String): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTrigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentTrigger: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTrigger")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[TItem]): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: Double): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
  }
  
}

