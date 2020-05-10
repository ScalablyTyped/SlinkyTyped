package typingsSlinky.winrt.Windows.Data.Xml.Dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXmlDomImplementation extends js.Object {
  def hasFeature(feature: String, version: js.Any): Boolean = js.native
}

object IXmlDomImplementation {
  @scala.inline
  def apply(hasFeature: (String, js.Any) => Boolean): IXmlDomImplementation = {
    val __obj = js.Dynamic.literal(hasFeature = js.Any.fromFunction2(hasFeature))
    __obj.asInstanceOf[IXmlDomImplementation]
  }
  @scala.inline
  implicit class IXmlDomImplementationOps[Self <: IXmlDomImplementation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasFeature(value: (String, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasFeature")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

