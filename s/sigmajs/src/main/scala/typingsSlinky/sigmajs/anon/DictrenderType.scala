package typingsSlinky.sigmajs.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sigmajs.SigmaJs.Edge
import typingsSlinky.sigmajs.SigmaJs.SVGEdgeLabels
import typingsSlinky.sigmajs.SigmaJs.SVGObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictrenderType extends /* renderType */ StringDictionary[SVGObject[Edge] | SVGEdgeLabels] {
  var labels: SVGEdgeLabels = js.native
}

object DictrenderType {
  @scala.inline
  def apply(labels: SVGEdgeLabels): DictrenderType = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictrenderType]
  }
  @scala.inline
  implicit class DictrenderTypeOps[Self <: DictrenderType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabels(value: SVGEdgeLabels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

