package typingsSlinky.winrt.Windows.ApplicationModel.Search

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchPaneQueryLinguisticDetails extends js.Object {
  var queryTextAlternatives: IVectorView[String] = js.native
  var queryTextCompositionLength: Double = js.native
  var queryTextCompositionStart: Double = js.native
}

object ISearchPaneQueryLinguisticDetails {
  @scala.inline
  def apply(
    queryTextAlternatives: IVectorView[String],
    queryTextCompositionLength: Double,
    queryTextCompositionStart: Double
  ): ISearchPaneQueryLinguisticDetails = {
    val __obj = js.Dynamic.literal(queryTextAlternatives = queryTextAlternatives.asInstanceOf[js.Any], queryTextCompositionLength = queryTextCompositionLength.asInstanceOf[js.Any], queryTextCompositionStart = queryTextCompositionStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchPaneQueryLinguisticDetails]
  }
  @scala.inline
  implicit class ISearchPaneQueryLinguisticDetailsOps[Self <: ISearchPaneQueryLinguisticDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueryTextAlternatives(value: IVectorView[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryTextAlternatives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryTextCompositionLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryTextCompositionLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryTextCompositionStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryTextCompositionStart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

