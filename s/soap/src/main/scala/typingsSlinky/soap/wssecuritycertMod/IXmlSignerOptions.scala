package typingsSlinky.soap.wssecuritycertMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXmlSignerOptions extends js.Object {
  var existingPrefixes: js.UndefOr[StringDictionary[String]] = js.native
}

object IXmlSignerOptions {
  @scala.inline
  def apply(): IXmlSignerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IXmlSignerOptions]
  }
  @scala.inline
  implicit class IXmlSignerOptionsOps[Self <: IXmlSignerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExistingPrefixes(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("existingPrefixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExistingPrefixes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("existingPrefixes")(js.undefined)
        ret
    }
  }
  
}

