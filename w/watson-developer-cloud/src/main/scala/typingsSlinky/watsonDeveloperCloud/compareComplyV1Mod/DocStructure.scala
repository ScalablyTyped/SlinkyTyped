package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The structure of the input document. */
@js.native
trait DocStructure extends js.Object {
  /** An array containing one object per section or subsection, in parallel with the `section_titles` array, that details the leading sentences in the corresponding section or subsection. */
  var leading_sentences: js.UndefOr[js.Array[LeadingSentence]] = js.native
  /** An array containing one object per section or subsection identified in the input document. */
  var section_titles: js.UndefOr[js.Array[SectionTitles]] = js.native
}

object DocStructure {
  @scala.inline
  def apply(): DocStructure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocStructure]
  }
  @scala.inline
  implicit class DocStructureOps[Self <: DocStructure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeading_sentences(value: js.Array[LeadingSentence]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leading_sentences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeading_sentences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leading_sentences")(js.undefined)
        ret
    }
    @scala.inline
    def withSection_titles(value: js.Array[SectionTitles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("section_titles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSection_titles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("section_titles")(js.undefined)
        ret
    }
  }
  
}

