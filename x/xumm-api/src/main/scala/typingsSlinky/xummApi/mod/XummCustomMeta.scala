package typingsSlinky.xummApi.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XummCustomMeta extends js.Object {
  var blob: js.UndefOr[StringDictionary[js.Any] | Null] = js.native
  var identifier: js.UndefOr[String | Null] = js.native
  var instruction: js.UndefOr[String | Null] = js.native
}

object XummCustomMeta {
  @scala.inline
  def apply(): XummCustomMeta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XummCustomMeta]
  }
  @scala.inline
  implicit class XummCustomMetaOps[Self <: XummCustomMeta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlob(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blob")(js.undefined)
        ret
    }
    @scala.inline
    def withBlobNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blob")(null)
        ret
    }
    @scala.inline
    def withIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifierNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(null)
        ret
    }
    @scala.inline
    def withInstruction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instruction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstruction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instruction")(js.undefined)
        ret
    }
    @scala.inline
    def withInstructionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instruction")(null)
        ret
    }
  }
  
}

