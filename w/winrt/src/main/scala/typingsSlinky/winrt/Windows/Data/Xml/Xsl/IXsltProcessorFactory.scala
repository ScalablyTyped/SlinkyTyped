package typingsSlinky.winrt.Windows.Data.Xml.Xsl

import typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXsltProcessorFactory extends js.Object {
  def createInstance(document: XmlDocument): XsltProcessor = js.native
}

object IXsltProcessorFactory {
  @scala.inline
  def apply(createInstance: XmlDocument => XsltProcessor): IXsltProcessorFactory = {
    val __obj = js.Dynamic.literal(createInstance = js.Any.fromFunction1(createInstance))
    __obj.asInstanceOf[IXsltProcessorFactory]
  }
  @scala.inline
  implicit class IXsltProcessorFactoryOps[Self <: IXsltProcessorFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateInstance(value: XmlDocument => XsltProcessor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createInstance")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

