package typingsSlinky.showdown.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.showdown.anon.Codeblock
import typingsSlinky.showdown.anon.Format
import typingsSlinky.showdown.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConverterGlobals extends js.Object {
  var converter: js.UndefOr[Converter] = js.native
  var gDimensions: js.UndefOr[Height] = js.native
  var gHtmlBlocks: js.UndefOr[js.Array[String]] = js.native
  var gHtmlMdBlocks: js.UndefOr[js.Array[String]] = js.native
  var gHtmlSpans: js.UndefOr[js.Array[String]] = js.native
  var gListLevel: js.UndefOr[Double] = js.native
  var gTitles: js.UndefOr[StringDictionary[String]] = js.native
  var gUrls: js.UndefOr[StringDictionary[String]] = js.native
  var ghCodeBlocks: js.UndefOr[js.Array[Codeblock]] = js.native
  var hashLinkCounts: js.UndefOr[StringDictionary[Double]] = js.native
  var langExtensions: js.UndefOr[js.Array[ShowdownExtension]] = js.native
  var metadata: js.UndefOr[Format] = js.native
  var outputModifiers: js.UndefOr[js.Array[ShowdownExtension]] = js.native
}

object ConverterGlobals {
  @scala.inline
  def apply(): ConverterGlobals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConverterGlobals]
  }
  @scala.inline
  implicit class ConverterGlobalsOps[Self <: ConverterGlobals] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConverter(value: Converter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("converter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConverter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("converter")(js.undefined)
        ret
    }
    @scala.inline
    def withGDimensions(value: Height): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gDimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withGHtmlBlocks(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gHtmlBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGHtmlBlocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gHtmlBlocks")(js.undefined)
        ret
    }
    @scala.inline
    def withGHtmlMdBlocks(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gHtmlMdBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGHtmlMdBlocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gHtmlMdBlocks")(js.undefined)
        ret
    }
    @scala.inline
    def withGHtmlSpans(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gHtmlSpans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGHtmlSpans: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gHtmlSpans")(js.undefined)
        ret
    }
    @scala.inline
    def withGListLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gListLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGListLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gListLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withGTitles(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gTitles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGTitles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gTitles")(js.undefined)
        ret
    }
    @scala.inline
    def withGUrls(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gUrls")(js.undefined)
        ret
    }
    @scala.inline
    def withGhCodeBlocks(value: js.Array[Codeblock]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghCodeBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGhCodeBlocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghCodeBlocks")(js.undefined)
        ret
    }
    @scala.inline
    def withHashLinkCounts(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashLinkCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashLinkCounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashLinkCounts")(js.undefined)
        ret
    }
    @scala.inline
    def withLangExtensions(value: js.Array[ShowdownExtension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("langExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLangExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("langExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: Format): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputModifiers(value: js.Array[ShowdownExtension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputModifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputModifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputModifiers")(js.undefined)
        ret
    }
  }
  
}

