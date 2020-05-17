package typingsSlinky.winrtUwp.Windows.Data.Text

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A segmenter class that is able to segment provided text into words. */
@js.native
trait WordsSegmenter extends js.Object {
  /** Gets the language of the rules used by this WordsSegmenter object. */
  var resolvedLanguage: String = js.native
  /**
    * Determines and returns the word which contains or follows a specified index into the provided text.
    * @param text Provided text from which the word is to be returned.
    * @param startIndex A zero-based index into text. It must be less than the length of text.
    * @return A WordSegment that represents the word.
    */
  def getTokenAt(text: String, startIndex: Double): WordSegment = js.native
  /**
    * Determines and returns all of the words in the provided text.
    * @param text Provided text containing words to be returned.
    * @return A collection of WordSegment objects that represent the words.
    */
  def getTokens(text: String): IVectorView[WordSegment] = js.native
  /**
    * Calls the provided handler with two iterators that iterate through the words prior to and following a given index into the provided text.
    * @param text Provided text containing words to be returned.
    * @param startIndex A zero-based index into text. It must be less than the length of text.
    * @param handler The function that receives the iterators.
    */
  def tokenize(text: String, startIndex: Double, handler: WordSegmentsTokenizingHandler): Unit = js.native
}

object WordsSegmenter {
  @scala.inline
  def apply(
    getTokenAt: (String, Double) => WordSegment,
    getTokens: String => IVectorView[WordSegment],
    resolvedLanguage: String,
    tokenize: (String, Double, WordSegmentsTokenizingHandler) => Unit
  ): WordsSegmenter = {
    val __obj = js.Dynamic.literal(getTokenAt = js.Any.fromFunction2(getTokenAt), getTokens = js.Any.fromFunction1(getTokens), resolvedLanguage = resolvedLanguage.asInstanceOf[js.Any], tokenize = js.Any.fromFunction3(tokenize))
    __obj.asInstanceOf[WordsSegmenter]
  }
  @scala.inline
  implicit class WordsSegmenterOps[Self <: WordsSegmenter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetTokenAt(value: (String, Double) => WordSegment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTokenAt")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetTokens(value: String => IVectorView[WordSegment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTokens")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResolvedLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokenize(value: (String, Double, WordSegmentsTokenizingHandler) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenize")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

