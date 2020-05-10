package typingsSlinky.winrt.Windows.Graphics.Printing

import typingsSlinky.winrt.Windows.ApplicationModel.DataTransfer.DataPackagePropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPrintTask extends js.Object {
  var oncompleted: js.Any = js.native
  var onpreviewing: js.Any = js.native
  var onprogressing: js.Any = js.native
  var onsubmitting: js.Any = js.native
  var options: PrintTaskOptions = js.native
  var properties: DataPackagePropertySet = js.native
  var source: IPrintDocumentSource = js.native
}

object IPrintTask {
  @scala.inline
  def apply(
    oncompleted: js.Any,
    onpreviewing: js.Any,
    onprogressing: js.Any,
    onsubmitting: js.Any,
    options: PrintTaskOptions,
    properties: DataPackagePropertySet,
    source: IPrintDocumentSource
  ): IPrintTask = {
    val __obj = js.Dynamic.literal(oncompleted = oncompleted.asInstanceOf[js.Any], onpreviewing = onpreviewing.asInstanceOf[js.Any], onprogressing = onprogressing.asInstanceOf[js.Any], onsubmitting = onsubmitting.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintTask]
  }
  @scala.inline
  implicit class IPrintTaskOps[Self <: IPrintTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOncompleted(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnpreviewing(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpreviewing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnprogressing(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onprogressing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnsubmitting(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsubmitting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: PrintTaskOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: DataPackagePropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: IPrintDocumentSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

