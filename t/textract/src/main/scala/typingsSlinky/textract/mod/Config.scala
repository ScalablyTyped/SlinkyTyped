package typingsSlinky.textract.mod

import typingsSlinky.node.childProcessMod.ExecException
import typingsSlinky.textract.AnonCmd
import typingsSlinky.textract.AnonCrop
import typingsSlinky.textract.AnonLang
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  /**
    * Doc extractor options for non OS X.
    * See `drawingtotext` manual for available options
    */
  var doc: js.UndefOr[extractorExecOpts] = js.native
  /**
    * DXF extractor options.
    * See `antiword` manual for available options
    */
  var dxf: js.UndefOr[extractorExecOpts] = js.native
  /**
    * Some extractors (dxf) use node's exec functionality.
    * This setting allows for providing config to exec execution.
    * One reason you might want to provide this config is if you are dealing with very large files.
    * You might want to increase the exec maxBuffer setting.
    */
  var exec: js.UndefOr[ExecException] = js.native
  /**
    * Images (png, jpg, gif) extractor options.
    * See `tesseract` manual for available options
    */
  var images: js.UndefOr[extractorExecOpts] = js.native
  /**
    * When extracting HTML, whether or not to include `alt` text with the extracted text.
    * @default false
    */
  var includeAltText: js.UndefOr[Boolean] = js.native
  /**
    * This is a proxy options object to the library textract uses for pdf extraction: pdf-text-extract.
    * Options include ownerPassword, userPassword if you are extracting text from password protected PDFs.
    * IMPORTANT: textract modifies the pdf-text-extract layout default so that, instead of layout: layout, it uses layout:raw.
    * It is not suggested you modify this without understanding what trouble that might get you in.
    * See [this GH issue](https://github.com/dbashford/textract/issues/75) for why textract overrides that library's default.
    */
  var pdftotextOptions: js.UndefOr[AnonCrop] = js.native
  /**
    * Pass this in as true and textract will not strip any line breaks.
    * @default false
    */
  var preserveLineBreaks: js.UndefOr[Boolean] = js.native
  /**
    * Some extractors, like PDF, insert line breaks at the end of every line, even if the middle of a sentence.
    * If this option is set to true, then any instances of a single line break are removed but multiple line breaks are preserved.
    * Check your output with this option, though, this doesn't preserve paragraphs unless there are multiple breaks.
    * @default false
    */
  var preserveOnlyMultipleLineBreaks: js.UndefOr[Boolean] = js.native
  /**
    * RTF extractor options.
    * See `unrtf` manual for available options
    */
  var rtf: js.UndefOr[extractorExecOpts] = js.native
  var tesseract: js.UndefOr[AnonLang | AnonCmd] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoc(value: extractorExecOpts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc")(js.undefined)
        ret
    }
    @scala.inline
    def withDxf(value: extractorExecOpts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dxf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDxf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dxf")(js.undefined)
        ret
    }
    @scala.inline
    def withExec(value: ExecException): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exec")(js.undefined)
        ret
    }
    @scala.inline
    def withImages(value: extractorExecOpts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeAltText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAltText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeAltText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAltText")(js.undefined)
        ret
    }
    @scala.inline
    def withPdftotextOptions(value: AnonCrop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdftotextOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPdftotextOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdftotextOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveLineBreaks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveLineBreaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveLineBreaks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveLineBreaks")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveOnlyMultipleLineBreaks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveOnlyMultipleLineBreaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveOnlyMultipleLineBreaks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveOnlyMultipleLineBreaks")(js.undefined)
        ret
    }
    @scala.inline
    def withRtf(value: extractorExecOpts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtf")(js.undefined)
        ret
    }
    @scala.inline
    def withTesseract(value: AnonLang | AnonCmd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tesseract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTesseract: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tesseract")(js.undefined)
        ret
    }
  }
  
}

