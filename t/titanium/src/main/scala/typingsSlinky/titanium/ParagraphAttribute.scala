package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An abstract datatype for specifying an Paragraph style attribute.
  */
@js.native
trait ParagraphAttribute extends js.Object {
  /**
  	 * The text alignment of the receiver.
  	 */
  var alignment: js.UndefOr[Double] = js.native
  /**
  	 * A Boolean value indicating whether the system may tighten inter-character spacing
  	 * before truncating text.
  	 */
  var allowsDefaultTighteningForTruncation: js.UndefOr[Boolean] = js.native
  /**
  	 * The indentation of the first line of the receiver.
  	 */
  var firstLineHeadIndent: js.UndefOr[Double | java.lang.String] = js.native
  /**
  	 * The indentation of the lines of lines other than the first.
  	 */
  var headIndent: js.UndefOr[Double | java.lang.String] = js.native
  /**
  	 * The threshold of paragraph for hyphenation.
  	 */
  var hyphenationFactor: js.UndefOr[Double] = js.native
  /**
  	 * The mode that should be used to break lines in the receiver.
  	 */
  var lineBreakMode: js.UndefOr[Double] = js.native
  /**
  	 * The line height multiple.
  	 */
  var lineHeightMultiple: js.UndefOr[Double] = js.native
  /**
  	 * The distance in points between the bottom of one line fragment and the top of the next.
  	 */
  var lineSpacing: js.UndefOr[Double | java.lang.String] = js.native
  /**
  	 * The maximum line height of receiver.
  	 */
  var maximumLineHeight: js.UndefOr[Double | java.lang.String] = js.native
  /**
  	 * The minimum height of receiver.
  	 */
  var minimumLineHeight: js.UndefOr[Double | java.lang.String] = js.native
  /**
  	 * The space after the end of the paragraph.
  	 */
  var paragraphSpacingAfter: js.UndefOr[Double | java.lang.String] = js.native
  /**
  	 * The distance between the top of paragraph and the beginning of its text content.
  	 */
  var paragraphSpacingBefore: js.UndefOr[Double | java.lang.String] = js.native
  /**
  	 * The trailing indentation of the receiver.
  	 */
  var tailIndent: js.UndefOr[Double | java.lang.String] = js.native
}

object ParagraphAttribute {
  @scala.inline
  def apply(): ParagraphAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphAttribute]
  }
  @scala.inline
  implicit class ParagraphAttributeOps[Self <: ParagraphAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowsDefaultTighteningForTruncation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowsDefaultTighteningForTruncation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowsDefaultTighteningForTruncation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowsDefaultTighteningForTruncation")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstLineHeadIndent(value: Double | java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstLineHeadIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstLineHeadIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstLineHeadIndent")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadIndent(value: Double | java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headIndent")(js.undefined)
        ret
    }
    @scala.inline
    def withHyphenationFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyphenationFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHyphenationFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyphenationFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withLineBreakMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineBreakMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineBreakMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineBreakMode")(js.undefined)
        ret
    }
    @scala.inline
    def withLineHeightMultiple(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeightMultiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineHeightMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeightMultiple")(js.undefined)
        ret
    }
    @scala.inline
    def withLineSpacing(value: Double | java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumLineHeight(value: Double | java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumLineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumLineHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumLineHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumLineHeight(value: Double | java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumLineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumLineHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumLineHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withParagraphSpacingAfter(value: Double | java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphSpacingAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParagraphSpacingAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphSpacingAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withParagraphSpacingBefore(value: Double | java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphSpacingBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParagraphSpacingBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphSpacingBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withTailIndent(value: Double | java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tailIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTailIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tailIndent")(js.undefined)
        ret
    }
  }
  
}

