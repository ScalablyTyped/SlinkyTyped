package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The leading sentences in a section or subsection of the input document. */
@js.native
trait LeadingSentence extends js.Object {
  /** An array of `location` objects that lists the locations of detected leading sentences. */
  var element_locations: js.UndefOr[js.Array[ElementLocations]] = js.native
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: js.UndefOr[Location] = js.native
  /** The text of the leading sentence. */
  var text: js.UndefOr[String] = js.native
}

object LeadingSentence {
  @scala.inline
  def apply(): LeadingSentence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeadingSentence]
  }
  @scala.inline
  implicit class LeadingSentenceOps[Self <: LeadingSentence] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElement_locations(value: js.Array[ElementLocations]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element_locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement_locations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element_locations")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

