package typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts

import typingsSlinky.winrtUwp.Windows.Data.Text.TextSegment
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details about why search results matched the query parameters. */
@js.native
trait ContactMatchReason extends js.Object {
  /** Gets the contact field type that matched the search, such as name, phone number, email address and so on. */
  var field: ContactMatchReasonKind = js.native
  /** Gets a list of matching TextSegment objects which tells you what to highlight in your view as the result of a contact search. */
  var segments: IVectorView[TextSegment] = js.native
  /** Gets the matching text result from a contact search. */
  var text: String = js.native
}

object ContactMatchReason {
  @scala.inline
  def apply(field: ContactMatchReasonKind, segments: IVectorView[TextSegment], text: String): ContactMatchReason = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactMatchReason]
  }
  @scala.inline
  implicit class ContactMatchReasonOps[Self <: ContactMatchReason] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: ContactMatchReasonKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSegments(value: IVectorView[TextSegment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

