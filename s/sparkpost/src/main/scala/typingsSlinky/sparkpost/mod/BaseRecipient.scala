package typingsSlinky.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseRecipient extends js.Object {
  /** Key/value pairs associated with a recipient. */
  var metadata: js.UndefOr[js.Any] = js.native
  /** SparkPost Enterprise API only. Email to use for envelope FROM. */
  var return_path: js.UndefOr[String] = js.native
  /** Key/value pairs associated with a recipient that are provided to the substitution engine. */
  var substitution_data: js.UndefOr[js.Any] = js.native
  /** Array of text labels associated with a recipient. */
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object BaseRecipient {
  @scala.inline
  def apply(): BaseRecipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseRecipient]
  }
  @scala.inline
  implicit class BaseRecipientOps[Self <: BaseRecipient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetadata(value: js.Any): Self = {
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
    def withReturn_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn_path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_path")(js.undefined)
        ret
    }
    @scala.inline
    def withSubstitution_data(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substitution_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubstitution_data: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substitution_data")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

