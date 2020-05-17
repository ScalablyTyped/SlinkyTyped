package typingsSlinky.winrtUwp.Windows.Data.Text

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reverse-converts a Japanese string which is mix of phonetic and ideographic characters, to a string of phonetic characters. */
@js.native
trait TextReverseConversionGenerator extends js.Object {
  /** Determines if the language tag specified is available for reverse conversions, but is not installed on the user's device. */
  var languageAvailableButNotInstalled: Boolean = js.native
  /** Gets the language tag of the successfully created TextReverseConversionGenerator object. */
  var resolvedLanguage: String = js.native
  /**
    * Asynchronously reverse-converts a string which contains ideographic characters to a phonetic expression.
    * @param input The string containing ideographic characters to be reverse-converted.
    * @return An asynchronous operation to return the phonetic expression.
    */
  def convertBackAsync(input: String): IPromiseWithIAsyncOperation[String] = js.native
}

object TextReverseConversionGenerator {
  @scala.inline
  def apply(
    convertBackAsync: String => IPromiseWithIAsyncOperation[String],
    languageAvailableButNotInstalled: Boolean,
    resolvedLanguage: String
  ): TextReverseConversionGenerator = {
    val __obj = js.Dynamic.literal(convertBackAsync = js.Any.fromFunction1(convertBackAsync), languageAvailableButNotInstalled = languageAvailableButNotInstalled.asInstanceOf[js.Any], resolvedLanguage = resolvedLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextReverseConversionGenerator]
  }
  @scala.inline
  implicit class TextReverseConversionGeneratorOps[Self <: TextReverseConversionGenerator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConvertBackAsync(value: String => IPromiseWithIAsyncOperation[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertBackAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLanguageAvailableButNotInstalled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageAvailableButNotInstalled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolvedLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedLanguage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

