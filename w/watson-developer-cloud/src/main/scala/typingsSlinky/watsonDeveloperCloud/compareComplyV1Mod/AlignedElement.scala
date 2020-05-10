package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** AlignedElement. */
@js.native
trait AlignedElement extends js.Object {
  /** Identifies two elements that semantically align between the compared documents. */
  var element_pair: js.UndefOr[js.Array[ElementPair]] = js.native
  /** Specifies whether the aligned element is identical. Elements are considered identical despite minor differences such as leading punctuation, end-of-sentence punctuation, whitespace, the presence or absence of definite or indefinite articles, and others. */
  var identical_text: js.UndefOr[Boolean] = js.native
  /** One or more hashed values that you can send to IBM to provide feedback or receive support. */
  var provenance_ids: js.UndefOr[js.Array[String]] = js.native
  /** Indicates that the elements aligned are contractual clauses of significance. */
  var significant_elements: js.UndefOr[Boolean] = js.native
}

object AlignedElement {
  @scala.inline
  def apply(): AlignedElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignedElement]
  }
  @scala.inline
  implicit class AlignedElementOps[Self <: AlignedElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElement_pair(value: js.Array[ElementPair]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element_pair")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement_pair: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element_pair")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentical_text(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identical_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentical_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identical_text")(js.undefined)
        ret
    }
    @scala.inline
    def withProvenance_ids(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provenance_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvenance_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provenance_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withSignificant_elements(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("significant_elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignificant_elements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("significant_elements")(js.undefined)
        ret
    }
  }
  
}

