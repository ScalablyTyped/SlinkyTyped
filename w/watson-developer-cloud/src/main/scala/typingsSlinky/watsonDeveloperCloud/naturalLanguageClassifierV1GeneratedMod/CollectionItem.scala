package typingsSlinky.watsonDeveloperCloud.naturalLanguageClassifierV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Response from the classifier for a phrase in a collection. */
@js.native
trait CollectionItem extends js.Object {
  /** An array of up to ten class-confidence pairs sorted in descending order of confidence. */
  var classes: js.UndefOr[js.Array[ClassifiedClass]] = js.native
  /** The submitted phrase. The maximum length is 2048 characters. */
  var text: js.UndefOr[String] = js.native
  /** The class with the highest confidence. */
  var top_class: js.UndefOr[String] = js.native
}

object CollectionItem {
  @scala.inline
  def apply(): CollectionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionItem]
  }
  @scala.inline
  implicit class CollectionItemOps[Self <: CollectionItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClasses(value: js.Array[ClassifiedClass]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
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
    @scala.inline
    def withTop_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top_class")(js.undefined)
        ret
    }
  }
  
}

