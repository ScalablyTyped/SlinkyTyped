package typingsSlinky.xml2js.mod

import typingsSlinky.xml2js.AnonEncoding
import typingsSlinky.xml2js.AnonIndent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsV2 extends Options {
  var cdata: js.UndefOr[Boolean] = js.native
  var chunkSize: js.UndefOr[Double] = js.native
  var doctype: js.UndefOr[js.Any] = js.native
  var headless: js.UndefOr[Boolean] = js.native
  var preserveChildrenOrder: js.UndefOr[Boolean] = js.native
  var renderOpts: js.UndefOr[AnonIndent] = js.native
  var rootName: js.UndefOr[String] = js.native
  var xmldec: js.UndefOr[AnonEncoding] = js.native
}

object OptionsV2 {
  @scala.inline
  def apply(): OptionsV2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsV2]
  }
  @scala.inline
  implicit class OptionsV2Ops[Self <: OptionsV2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCdata(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCdata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdata")(js.undefined)
        ret
    }
    @scala.inline
    def withChunkSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSize")(js.undefined)
        ret
    }
    @scala.inline
    def withDoctype(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doctype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoctype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doctype")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headless")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveChildrenOrder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveChildrenOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveChildrenOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveChildrenOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderOpts(value: AnonIndent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderOpts")(js.undefined)
        ret
    }
    @scala.inline
    def withRootName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootName")(js.undefined)
        ret
    }
    @scala.inline
    def withXmldec(value: AnonEncoding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmldec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmldec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmldec")(js.undefined)
        ret
    }
  }
  
}

