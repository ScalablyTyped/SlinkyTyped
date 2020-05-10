package typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails

import typingsSlinky.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPrintTaskOptionDetails extends js.Object {
  var onbeginvalidation: js.Any = js.native
  var onoptionchanged: js.Any = js.native
  var options: IMapView[String, IPrintOptionDetails] = js.native
  def createItemListOption(optionId: String, displayName: String): PrintCustomItemListOptionDetails = js.native
  def createTextOption(optionId: String, displayName: String): PrintCustomTextOptionDetails = js.native
}

object IPrintTaskOptionDetails {
  @scala.inline
  def apply(
    createItemListOption: (String, String) => PrintCustomItemListOptionDetails,
    createTextOption: (String, String) => PrintCustomTextOptionDetails,
    onbeginvalidation: js.Any,
    onoptionchanged: js.Any,
    options: IMapView[String, IPrintOptionDetails]
  ): IPrintTaskOptionDetails = {
    val __obj = js.Dynamic.literal(createItemListOption = js.Any.fromFunction2(createItemListOption), createTextOption = js.Any.fromFunction2(createTextOption), onbeginvalidation = onbeginvalidation.asInstanceOf[js.Any], onoptionchanged = onoptionchanged.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintTaskOptionDetails]
  }
  @scala.inline
  implicit class IPrintTaskOptionDetailsOps[Self <: IPrintTaskOptionDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateItemListOption(value: (String, String) => PrintCustomItemListOptionDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createItemListOption")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateTextOption(value: (String, String) => PrintCustomTextOptionDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTextOption")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnbeginvalidation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onbeginvalidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnoptionchanged(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onoptionchanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: IMapView[String, IPrintOptionDetails]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

